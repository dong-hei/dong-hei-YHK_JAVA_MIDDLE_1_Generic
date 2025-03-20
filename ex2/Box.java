package collection.generic.ex2;

public class Box<T> {
    private T val;

    public void set(T val) {
        this.val = val;
    }

    public T get(){
        return val;
    }
}
