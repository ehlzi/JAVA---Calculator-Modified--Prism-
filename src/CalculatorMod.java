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
    double num1, num2, answer, lensPower, lensDecentration, prismPower, fPD, sPD, tPD, lensPower1, lensPower2, prismPower1, prismPower2, totalPower;

    int choice;
    int prismChoice;

    int operator;

    //Scanner Input Initialization
    Scanner UserInput = new Scanner(System.in);

    //Prompts
    System.out.println("---------------------------------- \n"
                    + "Welcome to  Elzie's Math and Prism Calculator \n"
                    + "----------------------------------");

	System.out.println("\n" + "1. Basic Calculator \n" + "2. Prism Calculator \n");

    System.out.println("Which function would you like to start off with? \n");
    System.out.println("(Type '1' or '2')" + "\n");
    
    //LOGIC
    choice = UserInput.nextInt();

    switch (choice) {

        case 1 :

            while (true) {

                System.out.println();
                System.out.println("Welcome to the basic calculator!");
                System.out.println("\n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n" + "4. Division \n" + "5. Restart Program\n" + "6. Close Program \n");
                operator = UserInput.nextInt();
      
                switch (operator) {

                    case 1 :

                    System.out.println();

                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + answer + "\n");
                    
                    break;
      
                    case 2 :

                    System.out.println();

                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + answer + "\n");
                    
                    break;
      
                    case 3 :
                            
                    System.out.println();

                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + answer + "\n");
                    
                    break;
      
                    case 4 :

                    System.out.println();
      
                    System.out.println("First Number: ");
                    num1 = UserInput.nextDouble();
      
                    System.out.println("Second Number: ");
                    num2 = UserInput.nextDouble();
      
                    answer = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + answer + "\n");
                    
                    break;
    
                    case 5 :
                            
                    main(args);

                    case 6 :
                    
                    System.exit(0);

                    default :
    
                    System.out.println("\n" + "Please select the correct operator - +, -, *, or /" + "\n");
                    
                    break;

                    }

            }

        case 2 :

        while (true) {

            System.out.println("\n"+ "Welcome to the prism Calculator!" + "\n" + "Are we calculating a new Prism or correcting? \n");
            System.out.println("\n" + "1. New Prism \n" + "2. Correcting Old Prism \n" + "3. Restart Program \n" + "4. Exit Program" + "\n");
            prismChoice = UserInput.nextInt();

            switch (prismChoice) {

                case 1:

                System.out.println("Please insert the power of the lens (F): ");
                lensPower = UserInput.nextInt();

                System.out.println("Please insert the decentration of the lens (dec - mm): ");
                lensDecentration = UserInput.nextInt();

                prismPower = (lensPower * lensDecentration) / 10;
                System.out.println("\n" + "The result is " + prismPower + "\n");
                
                break;

                case 2:

                System.out.println("\n" + "Please insert the first PD (largest number): ");
                fPD = UserInput.nextDouble();

                System.out.println("\n" + "Please insert the second PD (smallest number): ");
                sPD = UserInput.nextDouble();
                
                tPD = (fPD - sPD)/2;

                System.out.println("\n" + "Please insert the power of the first lens: ");
                lensPower1 = UserInput.nextDouble();

                System.out.println("\n" + "Please insert the power of the second lens: ");
                lensPower2 = UserInput.nextDouble();

                prismPower1 = (lensPower1 * tPD) / 10;

                prismPower2 = (lensPower2 * tPD) / 10;

                totalPower = prismPower1 + prismPower2;

                System.out.println("\n" + "The total power would be :" + totalPower + "\n");
                
                break;

                case 3 :

                main(args);

                case 4 :

                System.out.println();
                System.exit(0);

                }

            }

        case 3 :

        System.out.println("\n" + "I don't understand.. Please try again!" + "\n");
        main(args);
    
        }

    UserInput.close();
    
    }

}
