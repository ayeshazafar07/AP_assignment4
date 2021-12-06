package application;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AgeController {
	
	@FXML
	private DatePicker picker;
	
	@FXML
	private TextField two;
	
	@FXML
	private TextField three;
	
	@FXML
	private TextField four;
	
	@FXML
	private TextField five;
	@FXML
	private TextField six;
	
	
	public int agecalculator(int years,int months,int days) {
	     LocalDate today=LocalDate.now();	
	     LocalDate birthdate=LocalDate.of(years,months,days);
		 int age=Period.between(birthdate,today).getYears();
		 return age;
		}
		public int monthcalculator(int years,int months,int days) {
		     LocalDate today=LocalDate.now();	
		     LocalDate birthdate=LocalDate.of(years,months,days);
			 int age=Period.between(birthdate,today).getYears();
			 int monthage=Period.between(birthdate,today).getMonths();
			 int total=(monthage+age)*12;
			 return total;
			}
		public int dayscalculator(int years,int months,int days) {

			LocalDate dateBefore = LocalDate.of(years, months, days);
			LocalDate today=LocalDate.now();	
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, today);
			 int weeks=(int) (noOfDaysBetween/7);
			 return weeks;
			}
	
	
	public void calculatingage(ActionEvent ae ) 
	{
		
		LocalDate today=picker.getValue();	
        int day=today.getDayOfMonth();
        int month=today.getMonthValue();
        int year=today.getYear();
			
       
        
        int years=agecalculator(year, month, day);
        int months=monthcalculator(year, month, day);
        int days=dayscalculator(year, month, day);
        
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        
			two.setText(strDate);
			two.setText(two.getText());
			String str=String.valueOf(years);
			three.setText(str);
			three.setText(three.getText());
			four.setText(str);
			four.setText(four.getText());
			String str1=String.valueOf(months);
			five.setText(str1);
			five.setText(five.getText());
			String str2=String.valueOf(days);
			six.setText(str2);
			six.setText(six.getText());
			
}
}