public class weeek3 {
    public static void main(String[] args) {
        //REVERSE OF THE STRING
        String original = "Hello World";
        
        StringBuilder reversed = new StringBuilder(original);
        
        reversed.reverse();
        
        System.out.println("Reversed String: " + reversed.toString());
