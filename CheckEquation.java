package sajaasfour;
//saja asfour
//1210737
//Labsec7
import java.util.Scanner;

public class CheckEquation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The First Name");
		String name=in.next();
		System.out.println("Enter The ID Number or -1 To End The Program");
		int id=in.nextInt();
		if(id==-1)
			System.exit(0);
		while(id!=-1) {
			
		boolean is=Equation.isBalanced(id);
		
		while(is==false  ) {
			System.out.println("EROR This ID Number Is INVALID Number");
			System.out.println("Reenter The ID Number OR -1 To End The program");
			id=in.nextInt();
			is=Equation.isBalanced(id);
			}
		int op=0;
		if(is==true) {
			
		do {
		System.out.println( name +" Enter Number you want to do:");
		System.out.println("1-Solve any quadratic equation ");
		System.out.println("2-Find the root values of any given quadratic equation ");
		System.out.println("3-Combine any two quadratic equations with the same x value(s) into one equation ");
		System.out.println("4-Exit menu\n");
		op=in.nextInt();
		switch(op) {
		case 1:
			   System.out.println("The soloution is: "+(Equation.solveEquation()));
			   break;
		case 2:
			   System.out.println("Enter The value of a:");
		      double a=in.nextInt();
		       System.out.println("Enter The value of b:");
		      double b=in.nextInt();
		       System.out.println("Enter The value of c:");
		      double c=in.nextInt();
		       Equation.findEquationRoots(a, b, c);
		       break;
		case 3:
			System.out.println("Enter The value of a in equation 1:");
		    double  a1=in.nextInt();
		    System.out.println("Enter The value of a in equation 2:");
		    double  a2=in.nextInt();
		    System.out.println("Enter The value of b in equation 1:");
		    double  b1=in.nextInt();
		    System.out.println("Enter The value of b in equation 2:");
		    double  b2=in.nextInt();
		    System.out.println("Enter The value of c in equation 1:");
		    double  c1=in.nextInt();
		    System.out.println("Enter The value of c in equation 2:");
		    double  c2=in.nextInt();
		    Equation.combineEquations(a1, a2, b1, b2, c1, c2);
		    break;
		case 4:	System.out.println("Enter The First Name");
		name=in.next();
		System.out.println("Enter The ID Number or -1 to end the program");
		id=in.nextInt();
		if(id==-1)
			System.exit(0);
			break;
		default:
			System.out.println("INVALID CHOICE");
		}
		   }while(op!=4);
		}
		
		
	}
in.close();
}}
