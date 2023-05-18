package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Homework01 extends Application{
	
	@Override
	public void start(Stage stage) throws Exception { 
	BorderPane root = new BorderPane();
	Scene scene = new Scene(root,400,400);
	stage.setTitle("H-Tree Fractal");
	stage.setScene(scene);
	stage.show();
	root.setPadding(new Insets(20, 0, 20, 20));
	//create textfield, label, and button
	TextField levelOfTree = new TextField();
	Label levelOfTreeLabel = new Label("Enter an order");
	Button treeUpdaterButton= new Button("Display");
	levelOfTree.setMaxWidth(Double.MAX_VALUE);
	levelOfTreeLabel.setMaxWidth(Double.MAX_VALUE);
	//create HBox for the textfield, label, and button and place at the bottom
	HBox hb = new HBox();
	hb.setSpacing(10);
	hb.setPadding(new Insets(0, 20, 10, 20)); 
	hb.getChildren().addAll(levelOfTreeLabel, levelOfTree, treeUpdaterButton);
	root.setBottom(hb);
	//when the button is pressed
	treeUpdaterButton.setOnAction(e -> {
	try {
	//get the text input value
	int n=Integer.parseInt(levelOfTree.getText());
	//make a fractal tree with n amount of levels
	drawFractalHTree(root, 100, n, 200, 200);
	} 
	//error handling
	catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}
	});
	}
	public static int drawFractalHTree(BorderPane bp, int sideLength, int n, int centerX, int centerY) {
		//base case
		if (n == 0)
		{
			//draw the 0th level H
			Line l1 = new Line(centerX-(sideLength/2), centerY, centerX, centerY);
			Line l2 = new Line(centerX, centerY, centerX+(sideLength/2), centerY);
		    Line l3 = new Line(centerX+(sideLength/2), centerY-(sideLength/2), centerX+(sideLength/2), centerY+(sideLength/2));
		    Line l4 = new Line(centerX-(sideLength/2), centerY-(sideLength/2), centerX-(sideLength/2), centerY+(sideLength/2));
		    bp.getChildren().addAll(l1, l2, l3, l4);
		    return 0;
		}
		//every other case
		else
		{
			//draw the H
			Line l1 = new Line(centerX-(sideLength/2), centerY, centerX, centerY);
			Line l2 = new Line(centerX, centerY, centerX+(sideLength/2), centerY);
		    Line l3 = new Line(centerX+(sideLength/2), centerY-(sideLength/2), centerX+(sideLength/2), centerY+(sideLength/2));
		    Line l4 = new Line(centerX-(sideLength/2), centerY-(sideLength/2), centerX-(sideLength/2), centerY+(sideLength/2));
		    bp.getChildren().addAll(l1, l2, l3, l4);
		    //recursion that releases n, divides the sidelength in half, and draws the smaller h's for each corner of bigger h's
			return n+drawFractalHTree(bp,sideLength/2, n-1, centerX+sideLength/2, centerY-sideLength/2)+drawFractalHTree(bp,sideLength/2, n-1, centerX-sideLength/2, centerY-sideLength/2)+drawFractalHTree(bp,sideLength/2, n-1, centerX-sideLength/2, centerY+sideLength/2)+drawFractalHTree(bp,sideLength/2, n-1, centerX+sideLength/2, centerY+sideLength/2);
			}
}
	public static void main(String[] args) {
	 //TODO Auto-generated method stub
	Application.launch(args);
	}
}
