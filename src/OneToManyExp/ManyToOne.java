package OneToManyExp;

import Entities.Branch;
import Entities.Student;

public class ManyToOne {
    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setBid("B-111");
        branch.setBname("CS");


        Student std1 = new Student("S-111","AAA","Hyd",branch);
        Student std2 = new Student("S-222","BBB","Hyd",branch);
        Student std3 = new Student("S-333","CCC","Hyd",branch);
        Student std4 = new Student("S-444","DDD","Hyd",branch);

        std1.getStudentDetails();
        std2.getStudentDetails();
        std3.getStudentDetails();
        std4.getStudentDetails();

    }
}
