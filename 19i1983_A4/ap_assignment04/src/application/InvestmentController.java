package application;

import java.awt.Desktop.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class InvestmentController {

	
	@FXML
	private TextField FVI;
	
	@FXML
	private TextField IVI;
	
	@FXML
	private  TextField COI;
	
	@FXML
	private TextField labelone;
	
	float final_ROI = 0;
		
	
	public float ROI_output (float FVI1, float IVI1, float COI1) {
	      
		float amount = ((FVI1 - IVI1)/COI1) * 100;
		return amount;
	}

	public void calculateROI(ActionEvent ae)
	{
		if(FVI.getText().trim().isEmpty() ||  IVI.getText().trim().isEmpty() || COI.getText().trim().isEmpty())
			
		{
			Alert noinput=new Alert(AlertType.NONE);
			noinput.setContentText("Please enter values correctly");
			noinput.setAlertType(AlertType.ERROR);
			noinput.show();
		}
		else
		{
			float FVI1=Float.parseFloat(FVI.getText());
			float IVI1=Float.parseFloat(IVI.getText());
			float COI1=Float.parseFloat(COI.getText());
			
			 final_ROI = ROI_output(FVI1, IVI1, COI1);
			 
			 labelone.setText(" "+final_ROI+" ");
		}
	}
	
}
