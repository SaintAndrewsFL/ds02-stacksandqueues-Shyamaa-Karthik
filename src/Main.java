public class Main {
    public static void main(String[] args) {
        StackLL<String> stackLL = new StackLL<>();

        for(int i = 0; i < 10; i++) {
            stackLL.push(""+i);
        }

    }
}