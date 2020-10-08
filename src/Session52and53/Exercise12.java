package Session52and53;

public class Exercise12 {
    Exercise12()
    {
        this(10);
        System.out.println("A-con");
    }
   // Exercise12(int i)
    {
        //this(10);
        System.out.println("A-int-param-con");
    }
    Exercise12(float f)
    {
        System.out.println("A-float-param-con");
        //this(234.345);
    }
    Exercise12(double d)
    {
        System.out.println("A-double-param-con");

    }
}
class Test13
{
    public static void main(String[] args) {

    }
}