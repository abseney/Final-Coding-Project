package app.controller;

import app.StudentCalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;

public class LoanCalcViewController implements Initializable   {

	private StudentCalc SC = null;
	
	@FXML
	private TextField LoanAmount;

	@FXML
	private TextFeild AnnualInterestRate;
	
	@FXML
	private TextFeild TermOfLoanInYears
	
	@FXML
	private TextFeild FirstPaymentDate;
	
	@FXML
	private TextFeild PaymentFrequency;
	
	@FXML
	private TextFeild Compound Period;
	
	@FXML
	private TextFeild Payment Type;
	
	@FXML
	private TextFeild Rounding;
	
	@FXML
	private Label lblTotalPayments;
	
	@FXML
	private DatePicker PaymentStartDate;
	
	public StudentCalc getMainApp() 
	{
		return mainApp;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setMainApp(StudentCalc sc) {
		this.SC = sc;
	}
	
	@FXML
	public void btnClear(ActionEvent event)
	{
		System.out.println("Clear pressed");
		LoanAmount.setText("");
		AnnualInterestRate.setText("");
		TermOfLoanInYears.setText("");
		FirstPaymentDate.setText("");
		PaymentFrequency.setText("");
		CompoundPeriod.setText("");
		PaymentType.setText("");
		Rounding.setText("");
		1b1tTotalPayments.setText("");
		
	}
	
	@FXML
	private void btnCalcLoan(ActionEvent event) {

		System.out.println("Amount: " + LoanAmount.getText());
		double dLoanAmount = Double.parseDouble(LoanAmount.getText());
		System.out.println("Amount: " + dLoanAmount);	
		
		lblTotalPayemnts.setText("123");
		
		LocalDate localDate = PaymentStartDate.getValue();
	 
		System.out.println(localDate);
	}
}
