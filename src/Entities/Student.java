package Entities;

public class Student {
    private String sid;
    private String sname;
    private String saddr;
   public Branch branch;
    public Student(String sid,String sname,String saddr,Branch branch)
    {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
        this.branch = branch;

        }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public String getBranch(String Branch) {

        return  Branch;
    }

    public void setBranch(String branch) {
      //  this.Branch = branch;
    }
    public void getStudentDetails(){
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Student Id         :"+sid);
        System.out.println("Student Name       :"+sname);
        System.out.println("Student Address    :"+saddr);
        System.out.println("Student Branch Id  :"+branch.getBid());
        System.out.println("Student Branch Name:"+branch.getBname());
        System.out.println();

    }
}
