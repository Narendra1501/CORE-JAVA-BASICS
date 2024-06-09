package javabasicsday23;

public class GenericClass<T> {
    private T obj;
    
    public void set(T obj) {
        this.obj = obj;
    }
    
    public T Tget() {
        return obj;
    }
}