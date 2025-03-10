package If_else_learn;

public class Learningifelse {
    public static void main(String[] args) {
        // boolean isMale = true;
        boolean isMale = false;
        String name = "bob";
        System.out.println("beforeif");
        if (isMale) {
            System.out.println("Mr " + name);
        } else {
            System.out.println("name not found");
        }
        System.out.println("afterif");
    }
}
