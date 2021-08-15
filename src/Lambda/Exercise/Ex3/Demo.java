package Lambda.Exercise.Ex3;

public class Demo {
    public static void main(String[] args) {
        useAddable((x, y) -> {
            return  x + y;
        });
    }

    private static void useAddable(Addable addable) {
        int sum = addable.add(3,4);
        System.out.println(sum);

    }
}
