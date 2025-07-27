class raint{
    String name;
    int id;
    int year;

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYear(){
        return year;
    }
    public void setName(String newName,String oldName){
        name=newName;
        name=oldName;
    }
    public void setId(int newid,int oldId){
        id = newid;
        id=oldId;
    }
    public void setYear(int NewYear,int oldYear){
        year = NewYear;
        year = oldYear;

    }
    public class rr {
        public static void main(String[] args){
            raint o = new raint();
            o.setName("rakhi","rohit");
            o.setId(1234,4563);
            o.setYear(2024,2025);
            System.out.println("name:-"+" "+ o.getName());
            System.out.println("id:-"+" "+ o.getId());
            System.out.println("year:-"+" "+ o.getYear());
        }
    }
}