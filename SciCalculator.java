

import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {
        // Creating Variables
        int z = 1;
        int c = 0;
        double Average;
        double x, y;
        double sum = 0;
        System.out.println("Current Result: 0.0");
        System.out.println(" ");
        Scanner menu = new Scanner(System.in);
            // While Switch variable does not equal 0, the program will loop.
        while (z != 0) {
            if (z >= 1 && z <=6) {
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                // Printing out the calculator menu
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
            }
            System.out.println(" ");
            System.out.print("Enter Menu Selection: ");
            // Using switch with variable z to accept user input for menu
            z = (int)menu.nextDouble();
            switch (z) {
                case 0:
                    c++;
                    System.out.println(" ");
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    break;
                case 1:
                    c++;
                    // Writing case one to add the user inputted operands
                    System.out.print("Enter first operand: ");
                    x = menu.nextDouble();
                    System.out.print("Enter second operand: ");
                    y = menu.nextDouble();
                    System.out.println(" ");
                    System.out.println("Current Result: " + (x + y));
                    sum = sum + (x + y);
                    System.out.println(" ");
                    break;
                // Writing case two to subtract the user inputted operands
                case 2:
                    c++;
                    System.out.print("Enter first operand: ");
                    x = menu.nextDouble();
                    System.out.print("Enter second operand: ");
                    y = menu.nextDouble();
                    System.out.println(" ");
                    System.out.println("Current Result: " + (x - y));
                    sum = sum + (x - y);
                    // End Case 2
                    System.out.println(" ");
                    break;
                case 3:
                    c++;
                    System.out.print("Enter first operand: ");
                    x = menu.nextDouble();
                    System.out.print("Enter second operand: ");
                    y = menu.nextDouble();
                    System.out.println(" ");
                    // Writing case 3 to multiply the user inputted operands
                    System.out.println("Current Result: " + (x * y));
                    sum = sum + (x * y);
                    System.out.println(" ");
                    break;
                case 4:
                    c++;
                    System.out.print("Enter first operand: ");
                    x = menu.nextDouble();
                    System.out.print("Enter second operand: ");
                    // Writing case 3 to multiply the user inputted operands
                    y = menu.nextDouble();
                    System.out.println(" ");
                    System.out.println("Current Result: " + (x / y));
                    sum = sum + (x / y);
                    System.out.println(" ");
                    break;
                case 5:
                    c++;
                    System.out.print("Enter first operand: ");
                    // Writing case 5 to turn the user inputted operands into an exponent with a base
                    x = menu.nextDouble();
                    System.out.print("Enter second operand: ");
                    y = menu.nextDouble();
                    System.out.println(" ");
                    System.out.println("Current Result: " + Math.pow(x, y));
                    sum = sum + (Math.pow(x, y));
                    System.out.println(" ");
                    break;
                case 6:
                    // Writing case 6 to turn the operands into a logarithmic equation
                    c++;
                    System.out.print("Enter first operand: ");
                    x = menu.nextDouble();
                    System.out.print("Enter second operand: ");
                    y = menu.nextDouble();
                    System.out.println(" ");
                    System.out.println("Current Result: " + (Math.log(y) / Math.log(x)));
                    sum = sum + (Math.log(y) / Math.log(x));
                    System.out.println(" ");
                    //Writing Case 7 for average of calculations, # of calculations, and sum of calculations
                    break;
                case 7:
                    if (c >= 1) {
                        System.out.println(" ");
                        System.out.println("Sum of calculations: " + sum);
                        System.out.println("Number of calculations: " + c);
                        Average = Math.round((sum / c) * 100.00) / 100.00;
                        System.out.println("Average of calculations: " + Average);
                        System.out.println(" ");
                    }
                    // if/else statement depends on whether there has been a calculation prior to case 7
            else
                        {
                    System.out.println(" ");
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println(" ");
                }
                  break;
                    // Create Default for invalid inputs
            default:
                    System.out.println(" ");
                    System.out.println("Error: Invalid selection!");
                    System.out.println(" ");
                    break;


            }
        }

    }
}
