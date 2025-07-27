public class Ram{
	int x= 5;
	public static void main(String[] args){
		Ram myobj=new Ram();
		Ram myobj2=new Ram();
		myobj2.x=25;
		System.out.println(myobj.x);
		System.out.println(myobj2.x);
	}
}


