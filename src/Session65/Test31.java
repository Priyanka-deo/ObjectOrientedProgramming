package Session65;

public class Test31 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccNo("ABC123");
        acc.setAccHolderName("Durga");
        acc.setAccType("Saving");
        acc.setBalance(25000);
        Employee2 emp = new Employee2();
        emp.setEno(111);
        emp.setEname("Durga");
        emp.setEaddr("Hyd");
        emp.setEsal(15000);
        emp.setAccount(acc);
        emp.getEmpDetail();




    }
}