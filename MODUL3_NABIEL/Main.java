import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  /**
 * @param args
 */
public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        //Menu
        System.out.println ("\n========== Menu Program ===========");
        System.out.println ("\n======= Calculation Program =======");
        System.out.println ("1. Square");
        System.out.println ("2. Circle");
        System.out.println ("3. Trapezoid");
        System.out.println ("0. Exit");
        System.out.print ("Select menu: ");
        int choice = scanner.nextInt();

        switch (choice) {

          //If Press 1
          case 1:
            //Calulation Variables
            System.out.print ("\nEnter the length of the side of the square: ");
            //Calling Calculation Getter & Setter
            double sides = scanner.nextDouble();
            calculation.setSquare(sides, sides);
            calculation.run();
            System.out.println ("\nThe Result of the Calculation is " + calculation.getSquare());
            break;

          //If Press 2
          case 2:
            //Calulation Variables
            System.out.print ("\nEnter the radius of the circle: ");
            //Calling Calculation Getter & Setter
            double cradius = scanner.nextDouble();
            double sides = scanner.nextDouble();
            calculation.setCircle(cradius, sides);
            calculation.run();
            System.out.println ("\nThe Result of the Calculation is " + calculation.getCircle());
            break;

          //If Press 3
          case 3:
            //Calulation Variables
            System.out.print ("\nEnter the upper side of the trapezoid: ");
            final double a = scanner.nextDouble();
            System.out.print ("Insert the side of the base of the trapezoid: ");
            double b = scanner.nextDouble();
            System.out.print ("Enter the height of the trapezoid: ");
            //Calling Calculation Getter & Setter
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t, sides);
            calculation.run();
            System.out.println ("\nThe calculation result: " + calculation.getTrapezoid());
            break;
          
          //Exiting Program
          case 0:
            System.out.println ("\nThank you for using this service");
            break;

          //If Number is outside of Menu
          default:
            System.out.println ("\nThis option is currently not available");
            continue;
        }
        repeat = false;
      
      //Exceptions (if code block error)
      } catch (InputMismatchException e) {
        System.out.println ("\n=============== !ERROR! ==================");
        System.out.println ("\n======= !Input nust be an Integer! =======");
        System.out.println ("\n=============== !ERROR! ==================");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}