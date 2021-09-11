package javaproject;



	
        
  

        import java.util.Scanner;

        public class newsquare {

            public static void main(String[] args) {
              
                Scanner reader = new Scanner(System.in);
               
                System.out.print("Enter Number: ");         
                double number = reader.nextDouble();
         
        	double result;
         
        	double squareRoot = number / 2;
         
        	do {
        		result = squareRoot;
        		squareRoot = (result + (number / result)) / 2;
        	} while ((result - squareRoot) != 0);
         
        	System.out.println("Reult:"+squareRoot);
            }   
        
    

	}

