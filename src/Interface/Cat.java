package Interface;

public class Cat implements Jumping {  //relationship with class and interface:
    //    ---> class implements interface
    @Override
    public void jump() {
        System.out.println("Cat can jump");

    }
}
