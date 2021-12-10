import java.util.*;

class Publication {
    String title;
    int copies, price;

    void saleCopy() {
    }
}

class Book {
    String title, author;
    int copies, price;

    void saleCopy() {
        price = 250;
        System.out.println("Total Sale: " + copies + price);
    }

    void orderCopies() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Copies:   ");
        copies = in.nextInt();
        in.close();
    }
}

class Magazine {
    String title;
    int copies, price;

    void saleCopy() {
    }

    void orderQty() {
    }

    void currentIssue() {
    }

    void receiveIssue() {
    }
}

public class OOPS_2 {
    public static void main(String args[]) {
        Book b = new Book();
        b.orderCopies();
        b.saleCopy();
    }
}