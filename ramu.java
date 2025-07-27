import java.util.Scanner;
public class ramu{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println(" enter the reversed sting:- ");
    String a = scanner.nextLine();
    StringBuilder reversed = new StringBuilder(a);
    reversed.reverse();
    System.out.println("reversed string :- "   +  reversed.toString());
    System.out.println("enter the name :- " );
    String inputString = scanner.nextLine();
    System.out.println("vowel of the string");
    for(int i = 0; i < inputString.length(); i++ ){
        char ch = .charAt(i);
        
    System.out.println("enter the name again");
    String c = scanner.nextLine();
    StringBuilder palendromereversed  = new StringBuilder(c);
    palendromereversed.reverse();
    System.out.println("reversed string :- "+ palendromereversed.toString());
    if (c.equals(palindromereversed.toString())){

    
    System.out. println("the given string is palindrom ");
    }
    else {
        System.out.println("the given string is not palindrome ");
    }


        }
    }
    
    }

