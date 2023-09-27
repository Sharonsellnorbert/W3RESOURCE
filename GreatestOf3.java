
/**************************************************************************************************************
 * File        : GretestOf3.java
 * Description : To find greatest of 3
 * Author      : Sharon Sell Norbert
 * Date        : 27/09/2023
 ****************************************************************************************************************/
import java.util.Scanner;
public class GreatestOf3 {
	public static void main(String[]args) {
		int Number1,Number2,Number3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Numbers");
		Number1=sc.nextInt();
		Number2=sc.nextInt();
		Number3=sc.nextInt();
		if(Number1==Number2&&Number2==Number3) {
			System.out.println("The Numbers are Equal");
		}
		else {
			if(Number1>Number2&&Number1>Number3) {
				System.out.println(Number1+" is the Greatest");
			}
			else if(Number2>Number1&&Number2>Number3) {
				System.out.println(Number2+" is the Greatest");
		}
			else if(Number3>Number1&&Number3>Number2) {
				System.out.println(Number3+" is the Greatest");
			}
	}
		
}
}