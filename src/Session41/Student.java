package Session41;

public class Student {
    String sid = "222";
    String sname ="Priyaka";
    String squal = "BCA";
    String saddr = "Nagpur";
    public void display_Stu_Details()
    {
        System.out.println("Student Details");
        System.out.println("-----------------");
        System.out.println("Student Id               :"+sid);
        System.out.println("Student Name             :"+sname);
        System.out.println("Student Qualification    :"+squal);
        System.out.println("Student Address          :"+saddr);
    }
}
class Test2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.display_Stu_Details();
    }
}
