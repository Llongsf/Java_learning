import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        second1(args);
    }

    public static void second1(String[] args) throws Exception {
        System.out.println(Math.abs(-66.6));
        System.out.println(Math.random());
        int a = 5;
        int b = 0;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException j)
        {
            j.printStackTrace();
        }
    }
}
