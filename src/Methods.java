public class Methods {
    static void print2table() {
        for (int i=1; i<=10; i++) {
            int ans = 2*i;
            System.out.println(ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("Sum: " + (x+y));
    }

    static int add(int p, int q) {
        int sum = p+q;
        return sum;
    }
    public static void main(String [] args) {
      int result =  add(10,20);
        System.out.println("Result: " + result);
        printSum(5,10);
        System.out.println("Table of 2");
//        print2table();
        System.out.println("Bye");
        return;
    }
}
