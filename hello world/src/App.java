public class App {
    public static void main(String[] args) throws Exception {
        second1(args);
    }
    
    private static void second1(String[] args) throws Exception {
        
        int a = 5;
        int b = 0;
        //puint c = 3/
       try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException j)
        {
            j.printStackTrace();
            System.out.println("\n");
            System.out.println(j.toString());
        }
    }
}
