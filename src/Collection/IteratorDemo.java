package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // this class is mean to iterate a Collection
        Collection<String> collection = new ArrayList<>();
        collection.add("Ian Yang");
        collection.add("Hello");

        Iterator<String> iterator = collection.iterator();
        /*
        public Iterator<E> iterator() {
            return new Itr();

        private class Itr implements Iterator<E> {
            ...
        }
         */
        String temp = iterator.next();
        // if the element is out of range, error NoSuchElementException will rise
        boolean has_next = iterator.hasNext();

        if (has_next) {
            System.out.println(temp);
        }

        // a better way to do it with loop

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

    }
}
