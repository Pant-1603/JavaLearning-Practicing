import java.util.Scanner;

public class GradeAssigner {
	public static void main(String[] args) {
		System.out.print("Enter your marks: ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your Grade is:");
		int marks = scanner.nextInt();

		if (marks >= 90 && marks <= 100) {
			System.out.println("A+ Grade");
		}

		else if (marks >= 70 && marks <= 89) {
			System.out.print("B+ Grade");
		}

		else if (marks >= 60 && marks <= 69) {
			System.out.print("First Division");
		}

		else if (marks >= 33 && marks <= 59) {
			System.out.print("Just Pass");
		}

		else if (marks >= 0 && marks <= 32) {
			System.out.println("Fail");
		}

		else {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
}
