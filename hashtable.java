import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//哈希表的使用
public class hashtable {
    public static Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
    //integer：整形
    public static void main(String[] args) 
    {
        
        int[] nums = new int[]{3,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println("哈希表：" + hashtable);
    }
    //最简单明了的方法，类似冒泡排序寻找
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
    //使用哈希表，减低算法复杂度
    public static int[] twoSum(int[] nums, int target){
        
        
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) //检查hashmap中是否有指定的key对应的映射关系
            //比如第一次，9-2=7，就是contansKey(7)就是检查是否key对应的值为7(即7是否在hashmap中)
            {
                return new int[]{hashtable.get(target - nums[i]), i};
                //返回一个数组，数组的元素就是i和找到的值(7)所对应的key，key就是元素所在的数组位置
            }
            hashtable.put(nums[i], i);// 往找不到就添加元素
        }
        return new int[0];
    }
}
/*
map.get() (hashtable)的过程
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