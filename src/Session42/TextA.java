package Session42;

class TextA{
    void add(int i,int j){
        System.out.println(i+j);
    }
}
class Example
{
    public static void main(String[] args) {
        TextA textA = new TextA();
        textA.add(10,20);
    }
}
