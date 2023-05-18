package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
H-tree fractal described as follows: 1. Begin with a letter H. The three lines of the H are of the same
* length, as shown in Figure a.
* 2. The letter H (in its sans-serif form, H) has four endpoints. Draw an H centered at each of the
* four endpoints to an H-tree of order 1, as shown in Figure b. These H’s are half the size of the
* H that contains the four endpoints.
* 3. Repeat step 2 to create a H-tree of order 2, 3, ..., and so on,
 */
public class Homework01Answer  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HTreeFractalPane hTreePane = new HTreeFractalPane();
        hTreePane.draw();

        BorderPane pane = new BorderPane(hTreePane);

        TextField tfOder = new TextField();
        tfOder.setPrefColumnCount(3);
        tfOder.setAlignment(Pos.BASELINE_RIGHT);
        tfOder.setText("0");


        tfOder.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                try {
                    hTreePane.setOrder(Integer.parseInt(tfOder.getText()));

                } catch (NumberFormatException ex) {
                    hTreePane.setOrder(0);
                    tfOder.setText("0");
                }

                hTreePane.draw();
            }
        });

        Label lblOrder = new Label("Enter an Order: ");
        HBox hBox = new HBox(10, lblOrder, tfOder);
        hBox.setAlignment(Pos.BASELINE_CENTER);
        pane.setBottom(hBox);
        hBox.setPadding(new Insets(10));

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("H Tree Fractal");
        primaryStage.show();
        hTreePane.requestFocus();


    }

    public class HTreeFractalPane extends Pane {

        double lastSize;
        int order = 0;
        double w;
        double h;

        HTreeFractalPane() {
            w = 600;
            h = 600;
            lastSize = Math.min(w, h) * 0.4;
            setMinSize(w, h);
            draw();
        }

        public void draw() {

            getChildren().clear();
            double x = w * 0.30;
            double y = h * 0.70;
            draw(x, y, order, lastSize);
        }

        private void draw(double x, double y, int order, double lastSize) {

            Line l1 = new Line(x, y, x, y - lastSize);
            Line l2 = new Line(x + lastSize, y, x + lastSize, y - lastSize);
            Line l3 = new Line(x, y - (lastSize / 2), x + lastSize, y - (lastSize / 2));
            getChildren().addAll(l1, l2, l3);

            if (order > 0) {
                double halfSize = lastSize / 2;
                double offset = halfSize / 2;
                // top left , top right H
                draw(l1.getStartX() - offset, l1.getEndY() + halfSize / 2, order - 1, halfSize);
                draw(l2.getStartX() - offset, l1.getEndY() + halfSize / 2, order - 1, halfSize);
                // bottom left, bottom right H
                draw(l1.getEndX() - offset, l1.getStartY() + halfSize / 2, order - 1, halfSize);
                draw(l2.getEndX() - offset, l1.getStartY() + halfSize / 2, order - 1, halfSize);
            }
        }


        public void setOrder(int order) {
            this.order = order;
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}