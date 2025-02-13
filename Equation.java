package sajaasfour;
//saja asfour
//1210737
//Lab sec7
import java.util.Scanner;
class Equation {
	
	public static boolean isBalanced (int id) {
		int n=1;
		int sumeven=0,sumodd=0;
		int count=0;
		int temp=-1;
		n=id%10;
		while(id>0) {
			
			if(n%2==0)
				sumeven+=n;
			else
				sumodd+=n;
			id/=10;
			 temp=n;
			 n=id%10;
			if(n==temp)
				count++;
		}
		if(sumodd==sumeven &&count==0)
			return true;
		else
			return false;
	}
	public static double solveEquation() {
		   Scanner in=new Scanner(System.in);
		   System.out.println("Enter The value of a:");
		   double a=in.nextInt();
		   System.out.println("Enter The value of b:");
		   double b=in.nextInt();
		   System.out.println("Enter The value of c:");
		   double c=in.nextInt();
		   System.out.println("Enter The value of x:");
		   double x=in.nextInt();
		double result=(a*(Math.pow(x, 2)))+(b*x)+c;
		return result;
		
	}
	public static void findEquationRoots (double a,double b,double c) {
		double x,root1,root2;
		x=(Math.pow(b, 2))-(4*a*c);
		if(x>0.0) {
			root1=((-b)+Math.sqrt(x))/(2*a);
			root2=((-b)-Math.sqrt(x))/(2*a);
			System.out.println(" equation Has Two real Value(roots)\nValue1= " +root1+ "\nValue2= " +root2);
		}
		else if(x==0.0) {
			root1=(-b)/(2*a);
			System.out.println(" equation Has One real Value(root) =" +root1);
		}
		else
			System.out.println(" equation Has No real Value(root)");
	}
	public static void combineEquations(double a1,double a2,double b1,double b2,double c1,double c2) {
		double suma=a1+a2;
		double sumb=b1+b2;
		double sumc=c1+c2;
		if(suma==0&&sumb==0&&sumc==0)
			System.out.println("The Resulting Equation Is : 0");
		else {
		if(suma==0 &&sumb!=0&&sumc!=0) {
			if(sumc>0)
				System.out.println("The Resulting Equation Is : "+sumb+"X+"+sumc);
			else if(sumc<0)
				System.out.println("The Resulting Equation Is : "+sumb+"X"+sumc);
		}
		else if(suma!=0 &&sumb!=0&&sumc!=0) {
			if(sumb<0 &&sumc>0)
				System.out.println("The Resulting Equation Is : "+suma+"X2"+sumb+"X+"+sumc);
			else if(sumb>0&&sumc<0)
				System.out.println("The Resulting Equation Is : "+suma+"X2+"+sumb+"X"+sumc);
			else if(sumb>0&&sumc>0)
				System.out.println("The Resulting Equation Is : "+suma+"X2+"+sumb+"X+"+sumc);
			else if(sumb<0&&sumc<0)
				System.out.println("The Resulting Equation Is : "+suma+"X2"+sumb+"X"+sumc);
		}
		else if(suma!=0&&sumb==0&&sumc!=0) {
			if(sumc>0)
				System.out.println("The Resulting Equation Is : "+suma+"X2+"+sumc);
			if(sumc<0)
				System.out.println("The Resulting Equation Is : "+suma+"X2"+sumc);
		}
		else if(suma==0&&sumb==0&&sumc!=0) {
			System.out.println("The Resulting Equation Is : " +sumc);
		}
		else if(suma==0&&sumb!=0&&sumc==0) {
			System.out.println("The Resulting Equation Is : " +sumb+"X");
		}
		else if(suma!=0&&sumb==0&&sumc==0) {
			System.out.println("The Resulting Equation Is : " +suma+"X2");
		}
		else if(suma!=0&&sumb!=0&&sumc==0) {
			if(sumb>0)
				System.out.println("The Resulting Equation Is : "+suma+"X2+"+sumb+"X");
			else 
				System.out.println("The Resulting Equation Is : "+suma+"X2"+sumb+"X");
		}
		}
	}
	}
