package day31;

public class test {
    public test() {
        System.out.println("A");
    }
public test(int a){this(2.5);

    System.out.println("B");
    }
    public test(double c){
        this();
        System.out.println("c");

    }

    public static void main(String[] args) {
        test obj=new test(100);
    }
}
