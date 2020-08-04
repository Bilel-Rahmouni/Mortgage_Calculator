package Mortgage_Calculator;
import java.util.*;
import java.math.*;
import java.text.*;
public class Mortgage_Calculator {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); 

 System.out.print("Please enter the amount of the loan: ");
 int P = sc.nextInt();
 System.out.println("Principal: "+P);
 System.out.print("Please enter the annual interest: ");
 Float r = sc.nextFloat();
 System.out.println("The annual interest: "+r);
 System.out.print("Please enter the periode of payment: ");
 int n = sc.nextInt();
 System.out.println("The periode of payment: "+n);
 // the Mortage formule: M = (P*r*((1+r)(Pow n)))/((1+r)(Pow n) -1)
 r=r/100/12;
 n = n*12;
 Double x=Math.pow((r+1), n);
 Double y=Math.pow((1+r), n);
 Double M =(P*r*x)/(y-1);
 String result =NumberFormat.getCurrencyInstance().format(M);
 System.out.print("Your Mortgage is: "+result);
 
	}

}
