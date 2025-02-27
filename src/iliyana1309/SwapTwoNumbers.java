package iliyana1309;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("b = " + b);
        System.out.println("a = " + a);


    }
}
