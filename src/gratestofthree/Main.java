package gratestofthree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("gratest of three number is : " +a);
		else if(b>a&&b>c)
			System.out.println("gratest of three number is : " +b);
		else
			System.out.println("gratest of three number is : " +c);

	}

}
