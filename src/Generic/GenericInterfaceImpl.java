package Generic;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{
    @Override
    public void show(T t) {
        System.out.println(t);

    }
}
