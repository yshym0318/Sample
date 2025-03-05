package sample;

public class FizzBuzz {

    public static void main(String[] args) {
        // 1~100
       for (int i = 1; i <= 100; i++) {
           // 3で割り切れるかつ5で割り切れる
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           }
           // 3で割り切れる
           else if (i % 3 == 0) {
               System.out.println("Fizz");
           }
           // 5で割り切れる
           else if (i % 5 == 0) {
               System.out.println("Buzz");
           }
           else {
               System.out.println(i);
           }
       }

    }

}
