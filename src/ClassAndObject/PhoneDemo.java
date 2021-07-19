package ClassAndObject;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "Xiaomi";
        p.price = 2999;
        System.out.println(p.price + " " + p.brand);
        p.call();
        p.sendMessage();
    }
}

