import java.util.Scanner;

public class Scannerdemo{
public static void main (String args[]){
Scanner p = new Scanner(System.in);
System.out.println("enter the first no");

int num1,num2;
num1= p.nextInt();
System.out.println("enter the second no");
num2= p.nextInt();

System.out.println("p",num1,num2);
}
}