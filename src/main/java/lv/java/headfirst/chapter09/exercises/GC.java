package lv.java.headfirst.chapter09.exercises;

public class GC {

    private static GC doStuff() {

        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();
        gc1 = gc4;
    }

    private static void doStuff2(GC copyGC) {

        GC localGC;
    }
}
