package sample;

public class WhileSample {

    public static void main(String[] args) {
        var num = 2;
        
        while (num <= 1024) {
            System.out.println(num);
            num = num * 2;
        }
    }

}