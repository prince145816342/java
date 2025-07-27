interface printable{
public void print();
}
interface showable{
public void show();
}
class A8 implements printable,showable{
public void print(){
System.out.println("hello");
}
public void show(){
System.out.println("print");
}
}
public class test{
public static void main(String [] args){
A8 obj = new A8();
obj.show();
obj.print();
}
}