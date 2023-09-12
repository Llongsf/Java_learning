//静态修饰词用于方法
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
        Abbb abab = new Abbb();
        abab.mm();
    }
    

}
abstract class  AbabClass extends Static_b//抽象类
{
    public abstract void mm();//抽象方法,自己不能有具体实现，其实现要由其子类进行定义提供
}
class Abbb extends AbabClass
{
    public void mm()//定义抽象方法
    {
        System.out.println("nihao");
    }
}