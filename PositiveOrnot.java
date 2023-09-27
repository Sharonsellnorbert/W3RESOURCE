/**************************************************************************************************************
 * File        : PositiveOrnot.java
 * Description : To Find Whether a Number Is Positive or Not
 * Author      : Sharon Sell Norbert
 * Date        : 27/09/2023
 ****************************************************************************************************************/
import java.util.Scanner;
public class PositiveOrnot {
	public static void main(String[]args) {
		int Number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		Number=sc.nextInt();
		if(Number==0) {
			System.out.println("The Number is Zero");
		}
		else {
			if(Number>0) {
				System.out.println("The Number is positive");
			}
			else {
				System.out.println("The Number is Negative");
			}
		}
		
		
		
	}
	

}
