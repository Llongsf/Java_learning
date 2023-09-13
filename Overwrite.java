class Animal{
    public void move(){
       System.out.println("动物可以移动");
    }
 }
  
 class Dog extends Animal{
    public void move(){
       super.move(); // super:应用父类的方法
       System.out.println("狗可以跑和走");
    }
    public int move(int n){
        System.out.println("第" + n +"只狗");
        return  n;
    }
 }
  
 public class Overwrite{
    public static void main(String args[])
    {
        Animal a = new Animal();//Animal对象
        Animal b = new Dog(); // Dog 对象
        Dog c = new Dog();
        a.move();
        b.move(); //执行 Dog类的方法

        int d = (c.move(2));
        System.out.println("d:" + d);
    }
 }