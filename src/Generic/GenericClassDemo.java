package Generic;


public class GenericClassDemo extends Generic {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("Ian Yang");
//        System.out.println(s.getName());
//
//        Teacher t = new Teacher();
//        t.setAge(20);
//        System.out.println(t.getAge() + "years old");


//        Generic<String> g = new Generic<String>();
//        g.show("IAN YANG");
//        Generic<Integer> g2 = new Generic<Integer>();
//        g2.show(2);

        Generic g = new Generic();
        g.show(30);
        g.show("IAN YANG");
        g.show(0.2);
    }

}
