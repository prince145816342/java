//claculating hypotanous of trianle 
class triangle{
double perpendicular;
double base ;

 //defining method 
    double largestside(){
	return perpendicular*perpendicular + base* base;
    }
}
class triangledemo{
public static void main(String args[]){
triangle p = new triangle();
p.perpendicular= 23.5;
p.base = 34.6;
System.out.println("hypotanous:" + p.largestside());
}
}
