import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number= scanner.nextInt();
        
        if(number<0) {
            System.out.println("Error: Factorial is'nt defined for negative numbers.");
        }
        
        else {
            int factorial= 1;
    
    
    for(int i=2; i<=number; i++) {
        factorial*= i;
    }
    
    System.out.println("Factorial of " + number + " is or are " + factorial);
    scanner.close();
}


} 
}
