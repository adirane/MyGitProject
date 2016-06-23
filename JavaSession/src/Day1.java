import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
      
		int a,b,sum,diff,product;
		
		System.out.println("Enter first Integer");
		Scanner s=new Scanner(System.in);

		a=s.nextInt();

		System.out.println("Enter second Integer");
		b=s.nextInt();

		sum=a+b;
		diff=a-b;
		product=a*b;
		
		System.out.println("The sum of " +a+ " and " +b+ " is " +sum);
		System.out.println("The difference between " +a+ " and " +b+ " is " +diff);
		System.out.println("The product of " +a+ " and " +b+ " is " +product);

		
	}

}
