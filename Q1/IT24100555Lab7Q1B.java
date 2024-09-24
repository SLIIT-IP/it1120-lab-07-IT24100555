import java.util.Scanner;

 public class IT24100555Lab7Q1B {
       public static void main(String[] args){
        Scanner input=new Scanner(System.in);
 
           int student=1;
 
                  while(student<=3) {
                          System.out.println("Student "+ student);
	                      System.out.print("Enter marks : ");
	                         int subject_1=input.nextInt();
	                         int subject_2=input.nextInt();
	                         int subject_3=input.nextInt();
	                         int subject_4=input.nextInt();
							  double average=(subject_1+subject_2+subject_3+subject_4)/4;
 
 
                          System.out.println("Average is : "+average);
 
                             if (average>=75 && average<=100) {
                                System.out.println("Overall Grade is : Distinction");
	                              }
	                         else if(average>= 50&& average<= 74) {
                                 System.out.println("Overall Grade is : Credit");	 
                                  }
	                         else if (average >= 0 && average < 50) {
                                 System.out.println("Grade: Fail");
                                  }
							 else {
								 System.out.println("Invalid marks entered.");
							      }
								  
	                    student++;
						System.out.println();
                    }
            input.close();
          }
  }		  
      					