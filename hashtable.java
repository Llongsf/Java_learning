import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//哈希表的使用
public class hashtable {
    public static void main(String[] args)
    {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    //最简单明了的方法
    // public static int[] twoSum(int[] nums, int target) {
    //     for (int i = 0 ;i < nums.length ;i++)
    //     {
    //         for(int j = i+1 ;j < nums.length ;j++)
    //         {
    //             if (nums[i]+nums[j] == target)
    //             {   
    //                 int[] b = new int[]{i,j};
    //                 return b;
    //             }
    //         }
    //     }
    //}
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        System.out.println(hashtable);
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) 
            {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
/*
map.get()的过程
1. map.get(key). 首先计算key的hash。
2. 根据hash&(length-1)定位到Node数组中的一个下标。如果该下标的元素(也就是链表/红黑树的第
一个元素)中 key的hash的key本身 都和传入的key相同，则证明找到了元素，直接返回即可。
3.如果第一个元素不是要找的，如果第一个元素的类型是TreeNode，则按照红黑树的查找方法查找
元素，如果不是则证明是链表，按照next指针找下去，直到找到或者到达队尾。 
*/

/*
containsKey() 方法检查 hashMap 中是否存在指定的 key 对应的映射关系。
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // 创建一个 HashMap
        HashMap<Integer, String> sites = new HashMap<>();

        // 往 HashMap 添加一些元素
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        System.out.println("sites HashMap: " + sites);

        //检查 key 为 1 是否存在
        if(sites.containsKey(1)) {
            System.out.println("key 为 1 存在于 sites 中");
        }

    }
}
输出结果：
sites HashMap: {1=Google, 2=Runoob, 3=Taobao}
key 为 1 存在于 sites 中

 */