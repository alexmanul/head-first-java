package lv.java.headfirst.chapter10;

public class StaticTests extends StaticSuper {
    private static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("Статический блок " + rand);
    }

    private StaticTests() {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Внутри метода main");
        StaticTests st = new StaticTests();
    }
}