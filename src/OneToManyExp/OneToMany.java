package OneToManyExp;

import Employee123.Employee32;
import Entities.Department;

public class OneToMany {
    public static void main(String[] args) {
        Employee32 E1 = new Employee32("E - 111", "AAA", "Hyd");
        Employee32 E2 = new Employee32("E - 222", "BBB", "Hyd");
        Employee32 E3 = new Employee32("E - 333", "CCC", "Hyd");
        Employee32[] emps = new Employee32[3];
        emps[0] = E1;
        emps[1] = E2;
        emps[2] = E3;
        Department dept = new Department("D - 111", "Admin", emps);
        dept.getDepartmentDetails();

    }
}
