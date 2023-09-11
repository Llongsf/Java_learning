public class Static_b
{
    public static int maxx()
    {
        System.out.println("maxx");
        return 1;
    }
    int maxx2()
    {
        System.out.println("maxx2");
        return 2;
    }
    public static void main(String[] args)
    {
        Static_b p = new Static_b();
        int b = p.maxx2();//非静态方法就需要实例化对象
        int a = maxx();//静态方法可以直接调用，不需要实例化对象
        System.out.println(a);
        System.out.println(b);
    }
    

}