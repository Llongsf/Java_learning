import java.io.*;
public class I_O
{
    public static void main(String[] args) throws Exception 
    {
        //System.in 能够完成控制台输入
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//用BufferedReader创建br对象，能够读取输入流
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}