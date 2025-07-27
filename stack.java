import java.util.*;
public class  stackclass{
    public class stack{
      static   ArrayList <Integer> list= new Arrayklist<>();
       public static boolean isEmpty(){
         return list.size() == 0;
       }
       public static void push( int data){
        list.add();

       }
       public  static int pop(){
        if (isempty){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;


       }
       public static int peek(){
        if (isempty){
            return -1;
        }
        return (list.size()-1);

       }

       }


    }
    
        public static void main(String [] args){
            stack s = new stack();
            s.push(3);
            s.push(4);
            s.push(9);
        while (!s.isEmpty){
            System.out.println(s.pop());
            s.peek();
        }

        }
    



