public interface I {
    int x = 10;
    void m1();
    void m2();
    void m3();
}
    class A implements I{
      public void m1()
      {
         System.out.println("m1-A");
     }
     public void m2()
     {
         System.out.println("m2-A");
     }
     public void m3()
     {
         System.out.println("m3-A");
     }
}
class Test1{
    public static void main(String[] args) {
        I i = new A();
        i.m1();
        i.m2();
        i.m3();
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
    }
}