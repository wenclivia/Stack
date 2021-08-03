public class Change {
    private int num;
    private int target;
    StackTest stacktest = new StackTest(10000000);

    public Change(int num, int target) {
        this.num = this.num;
        this.target = this.target;
    }

    public void changNUm(int num, int target) {
        if (num == 0) {
            System.out.println(0);
        } else {
            while (num != 0) {
                stacktest.push(num % target);
                num /= target;
            }
            while (!stacktest.isEmpty()) {
                if (stacktest.peek() == 10) {
                    System.out.print("A");
                    int a = stacktest.pop();
                } else if (stacktest.peek() == 11) {
                    System.out.print("B");
                    int a = stacktest.pop();
                } else if (stacktest.peek() == 12) {
                    System.out.print("C");
                    int a = stacktest.pop();
                } else if (stacktest.peek() == 13) {
                    System.out.print("D");
                    int a = stacktest.pop();
                } else if (stacktest.peek() == 14) {
                    System.out.print("E");
                    int a = stacktest.pop();
                } else if (stacktest.peek() == 15) {
                    System.out.print("F");
                    int a = stacktest.pop();
                } else {
                    System.out.print(stacktest.pop());
                }
            }
        }
    }
}

