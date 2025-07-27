class student18 implements Cloneable{
int rollNo;


student18 (int rollNo){
this.rollNo=rollNo;

}
public Object clone()throws CloneNotSupportedException{
return super.clone();
}
public static void main(String [] args){
try
{
student18 obj = new student18( 123);
student18 pk = (student18)obj.clone();
student18 rh= (student18)obj.clone();
System.out.println("obj.rollNo");
obj.rollNo();

}catch (CloneNotSupportedException c ){}
}
}