import java.util.Scanner;
public class rever {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //REVERSEING THE STRING
        System.out.println("Enter The String To Reverse:");
        String original = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(original);
        
        reversed.reverse();
        
        System.out.println("Reversed String: " + reversed.toString());

        //VOVELS AND CONSONENTS
        System.out.print("Enter a string To Find Vovels : ");
        String inputString = scanner.nextLine();

        System.out.println("Vowels in the string:");

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                System.out.print(ch + " ");
            }
        }
        System.out.println(" ");

        //CHECK PALINDRONE:
        System.out.print("Enter a string To Check wheather It Is Palindrone Or Not: ");
        String palen_String = scanner.nextLine();

        StringBuilder palendromereversed = new StringBuilder(palen_String);
        
        palendromereversed.reverse();
        
        System.out.println("Reversed String: " + palendromereversed.toString());

        if (palen_String.equals(palendromereversed.toString()) ) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        //REMOVE DUPLICATE
        
        
        //WORD COUNT
        System.out.println("Enter The String To Count Words: ");
        String word_count = scanner.nextLine();
     
        int total = 1;
    
        int i = 0; 
     
        while (i < word_count.length()) { 
         
           if ((word_count.charAt(i) == ' ') && (word_count.charAt(i + 1) != ' '))  {
              total++; 
           }
           i++; 
        } 
      
        System.out.println("Number of words in the given string: " +  total);

        //STRING CONCATENATE:
        System.out.println("Enter First Sting To Concatenate");
        String a=scanner.nextLine();
        System.out.println("Enter Secound Sting To Concatenate");
        String b=scanner.nextLine();
        String string_concatenation= a +" "+ b;
        System.out.println("String Concatenate:"+string_concatenation);

        //STRING COMPARE
        System.out.println("Enter The First String To Compare");
        String string_1=scanner.nextLine();
        System.out.println("Enter The Secound String To Compare");
        String string_2=scanner.nextLine();
        if (string_1.equals(string_2)){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }   

        scanner.close();
    }
}
