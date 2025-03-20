package collection.generic.ex5;

public class Box<T> {

    private T val;

    public void set(T val) {
        this.val = val;
    }

    public T get(){
        return val;
    }
}
