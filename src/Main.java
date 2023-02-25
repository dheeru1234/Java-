import  pack2.Student;
public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRollno(3);
        s1.setName("Dharmendra");
        System.out.println("Student Name : "+s1.getName()+", "+"Student Rollno : "+s1.getRollno());
    }
}