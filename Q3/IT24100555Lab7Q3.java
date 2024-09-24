import java.util.Scanner;

  public class IT24100555Lab7Q3 {
      public static void main(String[] args){
       Scanner input=new Scanner(System.in);
 
        int customer=1;
 
        while( customer<=5){
		   System.out.println( "Customer "+ customer);
		   System.out.print("Enter total bill amount: ");
		    double total_amount=input.nextDouble();
			
			System.out.print("Enter the mode of payment(c for cash,o for other): ");
			char paymentMode=input.next().charAt(0);
			
			if(paymentMode=='C' ||  paymentMode=='c') {
			  double discount=total_amount * 0.05;
			  total_amount-= discount;
			  System.out.println("Discount is : "+ discount);
			  System.out.println("Amount to be paid: "+total_amount);
			}
			else if(paymentMode=='O' ||  paymentMode=='o') {
			  System.out.println("No discount applicable");
			  System.out.println("Amount to be paid: "+ total_amount);
			}
			else {
			  System.out.println("Payment mode is Not Valid");
			}
			System.out.println();
		   customer++;
			
		}
        input.close();
		
	}
 }	