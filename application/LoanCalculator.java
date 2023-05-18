package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application{
	//create textfields for all values (input and outputs)
	private TextField annualInterestRateText = new TextField();
	private TextField numberOfYearsText = new TextField();
	private TextField loanAmountText = new TextField();
	private TextField monthlyPaymentText = new TextField();
	private TextField totalPaymentText = new TextField();
	//add the bottom right button
	private Button addB = new Button("Calculator");
	@Override
	public void start(Stage stage) throws Exception {
	// TODO Auto-generated method stub
	//make a gridPane
	GridPane gp = new GridPane();
	gp.setHgap(5);
	gp.setVgap(5);
	//create new label, add the textField, repeated for all
	gp.add(new Label("Annual Interest Rate:"), 0, 0);
	gp.add(annualInterestRateText, 1, 0);
	gp.add(new Label("Number of Years"), 0, 1);
	gp.add(numberOfYearsText, 1, 1);
	gp.add(new Label("Loan amount"), 0, 2);
	gp.add(loanAmountText, 1, 2);
	gp.add(new Label("Monthly payment"), 0, 3);
	gp.add(monthlyPaymentText, 1, 3);
	gp.add(new Label("Total payment"), 0, 4);
	gp.add(totalPaymentText, 1, 4);
	//add button
	gp.add(addB, 3, 5);
	//formatting
	gp.setAlignment(Pos.CENTER);
	//when the button is clicked, do the add method or catch exception
	addB.setOnAction(e -> {
	try {
	add();
	} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}
	});
	//create the scene with the size and title
	Scene scene = new Scene(gp, 800, 200);
	stage.setTitle("Simple calculator");
	stage.setScene(scene);
	stage.show();
	}
	//method to calculate monthly payment and total payment
	private void add() throws Exception{
	//get the 3 needed values and assign them to variables
	double annualInterestRate = Double.parseDouble(annualInterestRateText.getText());
	double numberOfYears = Double.parseDouble(numberOfYearsText.getText());
	double loanAmount = Double.parseDouble(loanAmountText.getText());
	//get monthly interest rate
	double monthlyInterestRate= annualInterestRate/1200;
	//get monthly payment
	double monthlyPayment = (loanAmount*(monthlyInterestRate*(Math.pow((1+monthlyInterestRate), numberOfYears*12)))/((Math.pow((1+monthlyInterestRate), numberOfYears*12))-1));
	//get the total payment
	double totalPayment=(monthlyPayment*numberOfYears*12);
	//round total payment to nearest hundredth
	totalPayment=Math.round(totalPayment*100);
	//round total payment to nearest hundredth
	totalPayment=totalPayment/100;
	//round monthly payment to nearest hundredth
	monthlyPayment=Math.round(monthlyPayment*100);
	//round monthly payment to nearest hundredth
	monthlyPayment=monthlyPayment/100;
	//display calculated values on button click
	monthlyPaymentText.setText(Double.toString((monthlyPayment)));
	totalPaymentText.setText(Double.toString(totalPayment));
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Application.launch(args);
	}
}