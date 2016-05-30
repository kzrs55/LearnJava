package ThinkInJava.Five;

/**
 * Created by zjutK on 16/5/30.
 */

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void fi(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.fi(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class CupBoard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    CupBoard() {
        System.out.println("Cupboard()");
        bowl4.fi(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new CupBoard();
        System.out.println("Creating new Cupboard() in main");
        new CupBoard();
        table.f2(1);
        cupBoard.f3(1);
    }
    static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();
}
