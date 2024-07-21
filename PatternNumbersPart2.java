public class PatternNumbersPart2 {
public static void main(String[] args) {
//Outer loop for printing rows

for(int i=5; i>=1; i--) {
//Inner loop for printing columns
    for(int j=1; j<=i; j++) {
        System.out.print(j);
    }
    
    System.out.println();
}
}
}
