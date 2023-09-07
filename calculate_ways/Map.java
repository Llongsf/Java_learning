import java.util.Arrays;
public class Map {
    // Static 方法
    static void myStaticMethod() {
        int[] a = {1,5,6,4,2,3};
                
        int key1;
        for (int i = 2; i < a.length; i++) 
        {
            key1 = a[i];
            int j = i - 1;
            while (j > 0 && a[j] > key1)
            {   
                // int t = a[j+1];
                a[j+1] = a[j];//将前面的元素提到前面去，最后排完剩下的就是key
                // a[j] = t;
                j = j -1;
            }
            a[j+1] = key1;
        }
        System.out.println(Arrays.toString(a) + " end");
        System.out.println("Static methods can be called without creating objects\n");
    }
  
    // Public 方法
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
  
    // Main 方法
    public static void main(String[] args) {
      myStaticMethod(); // 调用静态方法
      // myPublicMethod(); 这会编译一个错误
  
      Map myObj = new Map(); // 创建一个 MyClass 的对象
      myObj.myPublicMethod(); // 调用对象的公共方法
    }
  }