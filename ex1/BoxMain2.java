package collection.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer i = (Integer) integerBox.get();
        System.out.println("integerBox = " + i);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("stringBox = " + str);

        //잘못된 타입의 인수 전달
        integerBox.set("문자 인수");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
