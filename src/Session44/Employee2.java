package Session44;

public class Employee2 {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    public void setEno(int empNo) {
        eno = empNo;
    }

    public void setEname(String empName) {
        ename = empName;
    }

    public void setEsal(float empSal) {
        esal = empSal;
    }

    public void setEaddr(String empAddr) {
        eaddr = empAddr;
    }

    public int getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public float getEsal() {
        return esal;
    }

    public String getEaddr() {
        return eaddr;
    }
}

class Test7 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        emp.setEno(111);
        emp.setEname("Priyanka");
        emp.setEsal(5000.0f);
        emp.setEaddr("Nagpur");
        System.out.println("Employee Details");
        System.out.println("-----------------------------");
        System.out.println("Employee Number       :" + emp.getEno());
        System.out.println("Employee Name         :" + emp.getEname());
        System.out.println("Empolyee Salary       :" + emp.getEsal());
        System.out.println("Employee Address      :" + emp.getEaddr());


    }
}











