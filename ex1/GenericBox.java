package collection.generic.ex1;

public class GenericBox<T> {
    private T val;

    public void set(T val) {
        this.val = val;
    }

    public T get(){
        return val;
    }
}
