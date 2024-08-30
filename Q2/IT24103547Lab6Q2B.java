import java.util.Scanner;

public class IT24103547Lab6Q2B {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
int[] numbers=new int[10];

System.out.println("Please enter 10 numbers:");
for (int count = 0; count<numbers.length; count++){
System.out.print("Enter number" +(count+1)+":");
numbers[count] = scanner.nextInt();
}

System.out.println("The numbers you entered are:");
for(int number : numbers){
System.out.print(number + " ");
}

scanner.close();
}
}