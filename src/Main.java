public class Main {
    public static void main(String[] args) {
        int integer = 123;
        if (integer < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //commit master
        int temp = 0;
        temp = temp + 1;
        temp += 1;
        temp++;
        System.out.println("temp = " + temp);
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Hello world!");
    }
}