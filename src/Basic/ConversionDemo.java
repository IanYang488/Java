package Basic;

//This is a demo for type conversion
public class ConversionDemo {
    public static void main(String[] args) {
        //auto conversion
        double d = 10;
        System.out.println(d);

        //auto, another example
        byte b = 10;
        short a = b;
        //Waring: tupe 'char' is not compatible with byte/short

        //forced conversion
        int k = (int)88.88;
        System.out.println(k);
    }
}
