package color;
enum Color 
{
    red,green,blue,alpha;

    // private Color()
    // {
    //     System.out.println("call for:" + this.toString());
    // }
    public void colorinfo()
    {
        System.out.println("\nnihao color");
    }

}
public class Acolor
{
    public static void main(String[] args)
    {
        Color[] cc = Color.values();
        System.out.println("cc ");
        
        for(Color c : cc)
        {
            System.out.println(c + "序号为：" + c.ordinal());
        }
        
    }
}
// enum Color 
// { 
//     RED, GREEN, BLUE; 
//   
//     // 构造函数
//     private Color() 
//     { 
//         System.out.println("Constructor called for : " + this.toString()); 
//     } 
//   
//     public void colorInfo() 
//     { 
//         System.out.println("Universal Color"); 
//     } 
// } 
//   
// public class Test 
// {     
//     // 输出
//     public static void main(String[] args) 
//     { 
//         Color c1 = Color.RED; 
//         System.out.println(c1); 
//         c1.colorInfo(); 
//     } 
// }
