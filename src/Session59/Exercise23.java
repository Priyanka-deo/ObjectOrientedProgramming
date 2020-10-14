package Session59;

public class Exercise23 {
    static
    {
        System.out.println("Class Loading.... ");
    }
    Exercise23(){
        System.out.println("Object Creating");
    }

}
class Client23{
    public static void main(String[] args)throws Exception {
        Class c = Class.forName("Session 59.Exercise23");
        Object obj = c.newInstance();
    }
}

