public class weeek3 {
    public static void main(String[] args) {
        //REVERSE OF THE STRING
        String original = "Hello World";
        
        StringBuilder reversed = new StringBuilder(original);
        
        reversed.reverse();
        
        System.out.println("Reversed String: " + reversed.toString());

        //VOWELS AND CONSONETS
        String inputString = "Hello World";

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
        String palen_String = "India";

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
              
        String word_count = "Hello World";
        System.out.println("The given String is: " + word_count);
     
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
        String a="VIT-AP";
        String b="University";
        String string_concatenation= a +" "+ b;
        System.out.println("String Concatenate:"+string_concatenation);

        //STRING COMPARE
        String string_1="Banglore";
        String string_2="Hyderbad";
        if (string_1.equals(string_2)){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }
    }
}
