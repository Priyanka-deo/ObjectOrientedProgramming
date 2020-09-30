package Session41;

public class Employee {
    String eid = "E- 111";
    String ename = "Priyanka";
    String eaddr = "Nagpur";
    float esal = 25000.0f;
    String emobile = "91- 9988776655";
    public void display_Emp_Details(){
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Employee Id            :"+eid);
        System.out.println("Employee Name          :"+ename);
        System.out.println("Employee Address       :"+eaddr);
        System.out.println("Employee Salary        :"+esal);
        System.out.println("Employee Mobile        :"+emobile);
    }
}
class Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display_Emp_Details();
    }
}
