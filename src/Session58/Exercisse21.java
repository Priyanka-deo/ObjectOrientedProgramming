package Session58;

public class Exercisse21 {
    Exercisse21()
    {
        System.out.println("A-Con");
    }
    static {
        System.out.println("SB-A");
    }
    int m1(){
        System.out.println("m1-A");
        return 10;
    }
    {
        System.out.println("IB-A");
    }
    static int m2(){
        System.out.println("m2-A");
        return 20;
    }
    static int i = m2();
    int j = m1();
}

class Client21 {
    public static void main(String[] args) {


        Exercisse21 ex1 = new Exercisse21();
        Exercisse21 ex2 = new Exercisse21();
    }
}