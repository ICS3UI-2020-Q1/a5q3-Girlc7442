import java.util.Scanner;

/**
 * Takes the user number and factorials it
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //accumulator to keep track of the total
    int accumulator = 1;

    //asks the user for an integer to factorial
    System.out.println("Please enter an integer to calculate the factorial of");
    int userNumber = input.nextInt();

    for(int i = 1; i <= userNumber; i++){
      //loop action: multiplies the accumulator with i
      accumulator = accumulator * i; 
    }
    
    //prints the user number as a factorial to the screen
    System.out.println(userNumber + "! = " + accumulator);
  }
}