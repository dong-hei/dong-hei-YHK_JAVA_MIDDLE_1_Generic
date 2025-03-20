package collection.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object obj = GenericMethod.objMethod(i);

        // 타입 인자 (Type Arg) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer IntegerVal = GenericMethod.<Integer>numMethod(15);
        Double doubleVal = GenericMethod.<Double>numMethod(16.12);
        
        //컴파일러가 추론할수 있어서 생략 가능
        Integer result1 = GenericMethod.genericMethod(i);
        Integer IntegerVal1 = GenericMethod.numMethod(15);
        Double doubleVal1 = GenericMethod.numMethod(16.12);
    }
}
