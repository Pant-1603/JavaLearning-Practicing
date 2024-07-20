import java.util.Scanner;

public class Main {
public static void main (String[]args) {

Scanner scanner= new Scanner(System.in);
System.out.print("Enter your consumed Electricity units: ");

int units= scanner.nextInt();
    if(units>=1 && units<=100) {
        System.out.println("Total Electricity Bill is: Rs." + (units*2));
    }
    
    else if(units>=101 && units<=200) {
        System.out.println("Total Electricity Bill is: Rs." + (100*2 +(units-100)*3));
    }
    
    else if(units>=201 && units<=300) {
        System.out.println("Total Electricity Bill is: Rs." + (100*2 + 100*2 + (units-200) *5));
    }
    
    else if(units>=301 && units<=400) {
        System.out.println("Total Electricity Bill is: Rs." + (100*2 + 100*2 + 100*2 +(units-300) * 7));
    }
    
    else if (units>=400) {
        System.out.println("Total Electricity Bill is: Rs." + (100*2 +100*2 +100*2 +100*2 +(units-400)*10));
    }
    scanner.close();
}
}
