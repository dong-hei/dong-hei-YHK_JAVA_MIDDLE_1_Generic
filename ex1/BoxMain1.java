package collection.generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox intBox = new IntegerBox();
        intBox.set(10);
        Integer i = intBox.get();
        System.out.println("intBox = " + i);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String s = stringBox.get();
        System.out.println("stringBox = " + s);
    }
}
