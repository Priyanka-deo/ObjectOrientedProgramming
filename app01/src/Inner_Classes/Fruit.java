package Inner_Classes;

public class Fruit {

    class Apple{

        void m1(){
            System.out.println("m1-B");
        }
    }
    class Greenapple  extends Apple{
        void m2()
        {
            System.out.println("m2-C");
        }
    }
}
class Test29{
    public static void main(String[] args) {
        Fruit.Apple fa = new Fruit().new Apple();
        fa.m1();
       // fa.m2();  if declare only super class reference variable  access only  super class member.
        Fruit.Greenapple fg = new Fruit().new Greenapple();
        fg.m1();
        fg.m2();
    }


}
