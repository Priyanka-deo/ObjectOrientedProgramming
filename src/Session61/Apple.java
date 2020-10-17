package Session61;

enum Apple {
    A(500), B(300), C(100);
    int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Client29 {
    public static void main(String[] args) {
        System.out.println("A- Grade Apple Price   :" + Apple.A.getPrice());
        System.out.println("B- Grade Apple Price   :" + Apple.B.getPrice());
        System.out.println("C- Grade Apple Price   :" + Apple.C.getPrice());

    }
}
