package application;

import java.awt.Desktop.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class DiscountController {
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField discount;
	
	@FXML
	private  TextField labelone;
	
	double final_price = 0;
	
	
	public double discount_output (float p1, float d1) {

        double s = 100 - d1;
	    double amount = (s * p1)/100;
 
		return amount;	
	}

	public void calculateDiscount(ActionEvent ae)
	{
		if(price.getText().trim().isEmpty() ||  discount.getText().trim().isEmpty()) {
			Alert noinput=new Alert(AlertType.NONE);
			noinput.setContentText("Please enter price and discount");
			noinput.setAlertType(AlertType.ERROR);
			noinput.show();
		}
		else
		{
			float p1=Float.parseFloat(price.getText());
			float d1=Float.parseFloat(discount.getText());
			
			 final_price = discount_output(p1, d1);
			 			 
			 labelone.setText(" "+final_price+" ");
		}
	}
	
}
