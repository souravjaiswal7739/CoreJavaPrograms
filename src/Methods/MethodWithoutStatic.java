package Methods;

public class MethodWithoutStatic {
    public static void main(String[] args) {
        MethodWithoutStatic obj=new MethodWithoutStatic();
        obj.greeting();

    }
    public void greeting(){
        System.out.println("good morning");
    }
}
