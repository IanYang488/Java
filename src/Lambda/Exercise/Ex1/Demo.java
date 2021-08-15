package Lambda.Exercise.Ex1;

public class Demo  {
    public static void main(String[] args) {
        Eatable eatable = new EatableImpl();
    }

    private static void useEatable(Eatable e) {
       e.eat();

        // anonymous inside class
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        });

        // lambda function
        // using lambda function, there should be one interface with only one abstract method
         useEatable(()->
             System.out.println("eat2")
         );
}


}
