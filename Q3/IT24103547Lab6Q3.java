import java.util.Scanner;

public class IT24103547Lab6Q3 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
double sumOfSquares = 0;
int count = 0;
int number;
        
System.out.println("Enter positive integers (Terminate input with -99):");
        
while (true) {
System.out.print("Enter a number: ");
number = scanner.nextInt();
            
if (number == -99) {
break;
}
            
if (number < 0) {
System.out.println("Invalid input: Please enter a positive integer or -99 to terminate");
continue;
}
            
sumOfSquares += number * number;
count++;
}
        
if (count == 0) {
System.out.println("No valid numbers entered.");
} else {
        
double rms = Math.sqrt(sumOfSquares / count);
System.out.println("The Root Mean Square (RMS) is: " + rms);
}
        
scanner.close();
}
}
