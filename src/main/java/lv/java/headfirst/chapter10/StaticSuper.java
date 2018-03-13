package lv.java.headfirst.chapter10;

class StaticSuper {

    static {
        System.out.println("Родительский статический блок");
    }

    StaticSuper(){
        System.out.println("Родительский конструктор");
    }
}