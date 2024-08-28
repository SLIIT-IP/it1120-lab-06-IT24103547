import java.util.Scanner;
public class IT24103547Lab6Q1{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the number:");
double number =  scanner.nextDouble();

double squareValue = number*number;
double sqrtValue = Math.sqrt((number));


System.out.println("The square of "+number+" is "+squareValue);
System.out.println("The square root of "+number+" is "+sqrtValue);

scanner.close();
}
}
