import java.util.ArrayList;
import java.util.Scanner;

public class IT24103547Lab6Q3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Integer> numbers = new ArrayList<>();
int number;

System.out.println("Enter positive integers (terminate input with -99):");

while (true) {
System.out.print("Enter a number: ");
try {
number = Integer.parseInt(scanner.nextLine());

if (number == -99) {
break;
} else if (number > 0) {
numbers.add(number);
} else {
System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
}
} catch (NumberFormatException e) {
System.out.println("Invalid input. Please enter a valid integer.");
}
}

if (numbers.size() > 0) {
double rms = calculateRMS(numbers);
System.out.printf("Root Mean Square of "+number+"is "+rms);
} else {
System.out.println("No valid numbers entered.");
}
}

private static double calculateRMS(ArrayList<Integer> numbers) {
double sumOfSquares = 0;
for (int num : numbers) {
sumOfSquares += num * num;
}
return Math.sqrt(sumOfSquares / numbers.size());
}
}