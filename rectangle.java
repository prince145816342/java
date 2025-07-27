class rectangle{
	int length;
	int width;
//defining method 
	int perimeter(){
		return 2*(length+width);
	}
	int area(){
		return length*width;
	}
}
class rectangledemo{
public static void main(String args[]){
rectangle o = new rectangle();
o.length = 5;
o.width = 10;
System.out.println("perimeter:-"+ o.perimeter());
System.out.println("area:-"+o.area());
}
}

	
	
