package collection.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        //생성 시점의 T의 타입이 결정된다.
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        integerGenericBox.set(10);
//        integerGenericBox.set("문자"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerGenericBox.get(); // Integer 타입 변환 (캐스팅 불필요)
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.set("와-우");
//        stringGenericBox.set(123); // String 타입만 허용
        String string = stringGenericBox.get();
        System.out.println("string = " + string);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> db = new GenericBox<>();
        db.set(12.5);
        Double d = db.get();
        System.out.println("Double = " + d);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능 (항상 선언하는 부분에는 있어야함)
        GenericBox<Integer> ib2 = new GenericBox<>();
    }
}
