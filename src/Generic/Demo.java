package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
//    public static void main(String[] args) {
//        Collection c = new ArrayList();
//
//        c.add("Hello");
//        c.add("World");
//        c.add("Java");
//
//        // iterator
//        Iterator it = c.iterator();
//        while (it.hasNext()) {
//            // Object obj = it.hasNext();
//            // System.out.println(obj);
//            String s = (String)it.next(); // ClassCastException
//            System.out.println(s);
//        }
//    }

    // now using generic to avoid the exception
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        // add elements
        c.add("Hello");
        c.add("World");
        c.add("Java");

        Iterator<String> it = c.iterator();
        System.out.println(it.next()); // generic avoids force transformation


    }
}
