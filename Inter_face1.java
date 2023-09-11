import java.io.*;
//接口
interface NameOf_Interface
{
    public int eat();
    public void diao();
}
class  Inter_face1 implements NameOf_Interface
{
    public int eat()
    {
        System.out.println("eat dongxi");
        return 1;
    }
    public void diao()
    {
        System.out.println("diaonima");
    }
    public static void main(String[] args)
    {
        Inter_face1 im = new Inter_face1();
        im.diao();
        im.eat();
        
    }
    
}