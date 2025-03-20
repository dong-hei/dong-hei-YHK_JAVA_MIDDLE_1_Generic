package collection.generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Obj print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("collection.generic print : " + obj);
        return obj;
    }

    public static <T extends Number> T numMethod(T t) {
        System.out.println("bound print : " + t);
        return t;
    }
}
