package LAB;
 
	import java.util.Scanner;

		public class gymhesaplama {
		
			public static void main(String[] args) {
			 Scanner inputTool = new Scanner(System.in);
			 double cost;
			 cost = 100;
			 
			 // 18-25 yaş aarası indirim %25
			 
			 System.out.println("gym geliş saatini yazınız(17.50 formatında)");
			 double geliszaman = inputTool.nextDouble();
			 System.out.println("yaşınızı giriniz");
			 double age = inputTool.nextDouble();
			 
			 if(geliszaman>=09.00 && geliszaman<=12.00) {
				 cost = cost* 0.90;
				 }else {
					 cost = cost;
				 }
			 if(age<=25 && age>=18){
				 cost = cost*0.75;
			 }else {
				 cost = cost;
			 }
			 System.out.println("cost"+cost);
			 inputTool.close();
			 
			 }
	}