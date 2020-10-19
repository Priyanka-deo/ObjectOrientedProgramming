package Session61;

enum Book {

    A(100, 50), B(200, 700), C(300, 100);
    int no_Of_Pages;
    int cost;

    Book(int no_Of_Pages, int cost) {
        this.no_Of_Pages = no_Of_Pages;
        this.cost = cost;

    }

    public int getNo_Of_Pages() {
        return no_Of_Pages;
    }

    public int getCost() {
        return cost;
    }
}

class Client30 {
    public static void main(String[] args) {
        System.out.println("noOfPage\tCost");
        System.out.println("------------------");
        System.out.println(Book.A.getNo_Of_Pages() + "\t\t" + Book.A.getCost());
        System.out.println(Book.B.getNo_Of_Pages() + "\t\t" + Book.B.getCost());
        System.out.println(Book.C.getNo_Of_Pages() + "\t\t" + Book.C.getCost());
    }
}

