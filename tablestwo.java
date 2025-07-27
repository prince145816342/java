import java.util.Scanner;

public class tablestwo{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the table number:");
		int num1= scanner.nextInt();

		System.out.println("Enter Number Of Steps:");
		int num2=scanner.nextInt();

		int i=1;

		while (i<=num2) {
			System.out.println(num1+"X"+i+"="+num1*i);
			i++;
		}

	}
}