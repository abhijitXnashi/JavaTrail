import java.util.Scanner; // Import the Scanner class

class Multiply {
  public static void main(String[] args) {
    int x, y, mult;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input

    mult= x*y;  
    System.out.println("Result is: " + mult);
  }
} 