package application;

import java.awt.Desktop.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class BMIController {

	
	@FXML
	private TextField height;
	
	@FXML
	private TextField weight;
	
	@FXML
	private  TextField labelone;
	
	@FXML
	private TextField labeltwo;
	@FXML
	private  TextField labelthree;
	@FXML
	private  TextField labelfour;

	float finalBMI = 0;
	//private BMIController bmi = new BMIController();
	
	
	public float BMI_output (float w1, float h1) {
	      return (float) (w1 / Math.pow(h1 / 100.0, 2.0));
	}
	public String category(float bmi)
	{
		String cat = null;
		if(bmi <= 16.0){
			cat = "Underweight";
		}
		else if(bmi >= 18.0 && bmi < 25.0) {
			cat = "Normal";
		} 
		else if(bmi >= 25.0) {
			cat="Overweight";
		}
		return cat;
	}

	public void calculateBMI(ActionEvent ae)
	{
		if(weight.getText().trim().isEmpty() ||  height.getText().trim().isEmpty())
			
		{
			Alert noinput=new Alert(AlertType.NONE);
			noinput.setContentText("Please enter height in cm and weight in kg");
			noinput.setAlertType(AlertType.ERROR);
			noinput.show();
		}
		else
		{
			float height1=Float.parseFloat(height.getText());
			float weight1=Float.parseFloat(weight.getText());
			
			 finalBMI = BMI_output(weight1, height1);
			 
			 String category = category(finalBMI);
			 
			 labelone.setText(" "+finalBMI+" "+category);
			 labeltwo.setText("18.5");
			 labelthree.setText("16.0");
			 labelfour.setText("25.0-40.0");
			 labeltwo.setText(" "+labeltwo.getText());
			 labelthree.setText(" "+labelthree.getText());
			 labelfour.setText(" "+labelfour.getText());
		}
	}
	
}
