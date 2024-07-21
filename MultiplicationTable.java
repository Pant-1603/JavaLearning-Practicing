import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);

System.out.print("Enter a number: ");

int num= scanner.nextInt();

System.out.println("Multiplication table of " + num + " is: ");

int i= 1;

while(i<=10) {
    System.out.println(num + " * " + i + " = " + (num*i));
    i++;
}
scanner.close();
}

}
