package Inheritance.Inheritance2.classOverride;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("Apple");
        NewPhone np = new NewPhone();
        np.call("Huawei");
    }
}
