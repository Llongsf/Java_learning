import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {   
        System.out.println("Please input total number:");
        Scanner leng = new Scanner(System.in);

        int length1 = leng.nextInt();
        System.out.println("Please input numbers:");
        Scanner i = new Scanner(System.in);

        int total = 0;
        int count = 0;
        for (int j = 0; j < length1 ;j++)
        {
            int int1 = i.nextInt();
            total +=int1;
            count +=1;
        
        }
        if(count != 0)
        {
            System.out.println("平均数是:" + (double)total/length1);
        }
        
        leng.close();
        i.close();
    }
}
