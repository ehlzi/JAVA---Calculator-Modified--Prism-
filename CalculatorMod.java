import java.util.Scanner;

//Create Class Structure
//Declare Inputs
//Build the User Input method
//Declare output value where output value is stored
//Build Switch Statement for determing the output value based on num1, num2, and operator combination
//Display the output


class Main {
  
public static void main(String[] args) {

    //Variables
    //doubles for numbers with deciaml points
    double num1, num2, answer;

    char choice;
    char operator;

    //Scanner Input Initialization
    Scanner UserInput = new Scanner(System.in);

    System.out.println("---------------------------------- \n" + "Welcome to  Elzie's Logic Based (Basic - Modified) Calculator \n" + "----------------------------------");
	System.out.println("The basic calculator has no UI and supports basic mathematical fuctions like: \n" + "\n" + "1. Addition (+) \n" + "2. Subtraction (-) \n" + "3. Multiplication (* OR x) \n" + "4. Division (/) \n");

    //LOGIC
    System.out.println("Type 'Go' to begin, or 'Close' to exit the program." + "\n");
    choice = UserInput.next().charAt(0);

    switch (choice) {

        case 'G' :

            while (true) {

                System.out.println();
                System.out.println("Operator (or type Restart to restart and Close to exit program): ");
                operator = UserInput.next().charAt(0);
      
                switch (operator) {
                  
                    case '+' :
      
                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + answer);
                    break;
      
                    case '-' :
      
                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + answer);
                    break;
      
                    case '*' :
      
                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + answer);
                    break;
      
                    case '/' :
      
                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + answer);
                    break;
    
                    case 'C' :
            
                    System.out.println();
                    System.exit(0);
    
                    default :
    
                    System.out.println("Please select the correct operator - +, -, *, or /" + "\n");
                    break;
              
                }
    
            }
        
        case 'C' :
            
        System.out.println("Bye" + "\n");
        System.exit(0);

        case 'A', 'B', 'D', 'E', 'F', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' :

        System.out.println("\n" + "I don't understand.. Please try again!" + "\n");
        main(args);
    
    }

    UserInput.close();

  }

}