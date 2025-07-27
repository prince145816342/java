class studentRecord {
    String name;
    int age;
    String grade;
    int rollNumber;
    int marks;


    studentRecord(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public void setGrade(String a) {
        grade = a;

    }

    public void setMarks(int b) {

        marks = b;

    }

    public void details() {
        System.out.println("name:-" + " " + name + "age:-" + " " + age + "roll number:-" + " " + rollNumber + "grade:-" + " " + grade + " " + "marks:-" + " " + marks);
    }
}

    public class Main {
        public static void main(String[] args) {
            studentRecord p = new studentRecord("rajesh", 25, 1);
            studentRecord q = new studentRecord("qadir", 26, 2);
            studentRecord r = new studentRecord("rajiv", 27, 3);
            studentRecord s = new studentRecord("sunita", 18, 4);
            studentRecord t = new studentRecord("taniya", 28, 5);
            p.setGrade("A");
            p.setMarks(2345);
            q.setGrade("b");
            q.setMarks(89909);
            r.setGrade("c");
            r.setMarks(44993049);
            s.setGrade("d");
            s.setMarks(334939);
            t.setGrade("e");
            t.setMarks(93);

        }
    }
