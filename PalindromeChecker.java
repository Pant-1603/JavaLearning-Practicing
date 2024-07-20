import java.util.Scanner;
public class PalindromeChecker {
  public static void main (String[]args)
  {
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter a number: ");
	int num = scanner.nextInt ();
	int originalNum = num;
	int reverse = 0;

	for (int temp = num; temp != 0; temp /= 10)
	  {
		int digit = temp % 10;
		  reverse = reverse * 10 + digit;
	  }

	if (originalNum == reverse)
	  {
		System.out.println ("It's a Palindrome number");
	  }

	else
	  {
		System.out.println ("It's not a Palindrome number");
	  }

	scanner.close ();
  }
}
