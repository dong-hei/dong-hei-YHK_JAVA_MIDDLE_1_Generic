package collection.generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T; // T는 런타임에 Object가 되기 때문에 컴파일 오류
        return false;
    }

    public void create(){
//        return new T(); // T는 Object가 되기때문에 new T가 된다 즉 컴파일 오류
    }
}
