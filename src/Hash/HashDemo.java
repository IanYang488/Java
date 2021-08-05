package Hash;


//hashSet: It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee
// that the order will remain constant over time. This class permits the null element.
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Ian Yang", 20);
        int hash = s1.hashCode();
        System.out.println(hash);
        // String override hashCode() method
    }
}
