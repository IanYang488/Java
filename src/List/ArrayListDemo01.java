package List;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
//        same as ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");

        //add an element at particular location

        arrayList.add(1, "list");
        //but if the location index is out of range, ErrorWarning will be risen: IndexOutOfBoundsException


        //output
        System.out.println("arrayList: " + arrayList);
    }
}
