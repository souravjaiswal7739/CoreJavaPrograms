package ForLoop;

public class BreakAndContinue {
    //jumping out of a loop(break)
    //skipping out of a loop(continue)
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 10; i++) {
            if (i == 3)
                continue;
            if (i == 5)
                break;

        }
        System.out.println(i);
    }

}
