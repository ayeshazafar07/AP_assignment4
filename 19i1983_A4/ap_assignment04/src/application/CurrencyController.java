package application;

import java.awt.Desktop.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CurrencyController {

	
	@FXML
	private TextField amount;
	
	private  TextField labelone;
	
	double final_amount = 0;
		
	
	public double amount_output (float a1) {
		double am = a1/176.47; 
		return am;
	}

	public void converter(ActionEvent ae)
	{
		if(amount.getText().trim().isEmpty())
			
		{
			Alert noinput=new Alert(AlertType.NONE);
			noinput.setContentText("Please enter amount in pkr");
			noinput.setAlertType(AlertType.ERROR);
			noinput.show();
		}
		else
		{
			float a1=Float.parseFloat(amount.getText());
			
			 final_amount = amount_output(a1);
			 
			 labelone.setText(" "+final_amount+" ");
		}
	}
	
}
