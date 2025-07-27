package stackImplementation;

public class stackArrayImplemantation{

int top ;
int capacity;
int[] stack;
stackArrayImplemantation(){

top =-1;
capacity = 10;
stack = new int[capacity];
}

public boolean isEmpty()
{
return top ==-1;
}
public boolean isFull()
{
return top == capacity -1;
}
public int push(int data)
{
if (isFull()){
System.out.println("stack is full");
}
return stack[++top ] = data;
}
public int pop()
{
if (isEmpty()){
System.out.println("stack is empty");
}
return stack[top--];
}
public int peek(){

return stack[top];
}

public static void main(String [] args){
stackArrayImplemantation st = new stackArrayImplemantation();
st.push(34);
st.push(24);
st.push(354);
st.push(374);

System.out.println(st.isEmpty());
System.out.println(st.isFull());


System.out.println(st.capacity);


System.out.println(st.peek());
System.out.println(st.pop());
}

}







