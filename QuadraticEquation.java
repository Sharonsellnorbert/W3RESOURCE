/**************************************************************************************************************
 * File        : QuadraticEquation.java
 * Description : To find the solution of Quadratic Equations 
 * Author      : Sharon Sell Norbert
 * Date        : 27/09/2023
 ****************************************************************************************************************/
import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String[]args){
		double Coefficient1,Coefficient2,Coefficient3,Determinant,Root1,Root2;
		System.out.println("Enter The Coefficients");
		Scanner sc=new Scanner(System.in);
		Coefficient1=sc.nextDouble();
		Coefficient2=sc.nextDouble();
		Coefficient3=sc.nextDouble();
		Determinant=(Coefficient2*Coefficient2)-(4*Coefficient1*Coefficient3);
		if(Determinant==0) {
			Root1=(-Coefficient2)/(2*Coefficient1);
			System.out.println("The Roots are"+Root1+"and"+Root1);
		}
		else if(Determinant>0) {
			Root1=(-Coefficient2+Math.pow(Determinant,0.5))/(2*Coefficient1);
			Root2=(-Coefficient2-Math.pow(Determinant,0.5))/(2*Coefficient1);
			System.out.println("The Roots are"+Root1+"and"+Root2);
		}
		else {
			System.out.println("The Roots are Imaginary");
		}
		
	}

}
