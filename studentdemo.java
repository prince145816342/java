import java.util.Scanner;
class student{

String name;
int registrationno;
 int classid;
}
class studentdemo{
public static void main(String args[]){
Scanner object = new  Scanner(System.in);
System.out.println("enter the name of the first student");
String name = object.nextLine();
System.out.println("enter the registation no");
int registrationno= object.nextInt();
System.out.println("enter the class Id ");
int classid = object.nextInt();

}
}


