package Methods;

public class ArgumentsAndParameters {
    public static void main(String[] args) {
        int sum = sumTwoNumber(5, 7);  //arguments
        System.out.println(sum);

    }

    public static int sumTwoNumber(int a, int b) {  //parameters
        int sum = a + b;
        return sum;
    }
}
