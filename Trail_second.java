import java.util.Scanner;
public class Trail_second{
public static void main(String args[]){
  int sub;//declare variable to find subtraction
Scanner scan=new Scanner(System.in);

System.out.print("Enter the value to num1: ");
int num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
int num2=scan.nextInt();
sub=num1-num2;
System.out.print("subtraction of "+num1+"-"+num2+" :"+sub);

}

}