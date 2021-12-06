package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;

public class CalculatorController implements Initializable {
	
	@FXML
    private TextField txt_result;
    String op ="";
    long number1;
    long number2;
    
    Stage stage;
    Scene scene;
    Parent root;

	@FXML
	public void SwitchtoDiscout(ActionEvent ae) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Discount.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void SwitchtoBMI(ActionEvent ae) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("BMI.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void SwitchtoAge(ActionEvent ae) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Age.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void SwitchtoCurrencyConverter(ActionEvent ae) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Currency.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}


	@FXML
	public void SwitchtoInvestment(ActionEvent ae) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Investment.fxml"));
		stage=(Stage)((Node)ae.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
      //  btnAdd.setOnAction(e -> Add());
        //btnSubtract.setOnAction(e -> Subtract());
      //  btnMultiply.setOnAction(e -> Multiply());
      //  btnDivide.setOnAction(e -> Divide());
     //   btnEquals.setOnAction(e -> Equals());
    
    }

    public float calculate (long n1, long n2, String op){
        
        switch (op){
        
            case "+" : 
            	return (n1 + n2);
            case "-" : 
            	return (n1 - n2);
            case "*" : 
            	return (n1 * n2);
            case "/" : 
                if (n2 == 0){
                	return 0;
                }
                return (n1/n2);  
        }
		return 0;
    }
    
    public void Number (ActionEvent ae){
        String no = ((Button)ae.getSource()).getText();
        txt_result.setText(txt_result.getText()+no);
    }
    
    public void Operation (ActionEvent ae){
    
        String operation = ((Button)ae.getSource()).getText();
        if (!operation.equals("=")){      
            if(!op.equals("")){
                return;
            }
            op = operation;
            number1 = Long.parseLong(txt_result.getText());
            txt_result.setText("");
        }else {       
            if(op.equals("")){
                return;
            }
            number2 = Long.parseLong(txt_result.getText());
            float res = calculate(number1, number2, op);
            txt_result.setText(res+" ");
            op="";
        }
    }  
    
}