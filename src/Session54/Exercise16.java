package Session54;

public class Exercise16 {
    static int i = 10;
    int j = 20;
    void m1()
    {
        //static int k = 30; static variable can not be local variable.
    }
}
class Test18
{
    public static void main(String[] args) {
        Exercise16 ex =new Exercise16();
        Exercise16 ex1 = null;
        System.out.println(ex1.j);//null pointer exception
        System.out.println(ex1.i);//not getting null pointer exception in static variable
    }
}
