class Manei
{
    private int money = 50;
    private String action = "v";
    private String name = "me";
    public static void mani()
    {
      
    }

    //set
    public int setmoney(int money1)
    {
      this.money = money1;
      if (money!=50)
      {
        System.out.println("no 50,gun!");
      }
      return money;
    }
    public String setaction(String action1){
      this.action = action1;
      return action;
    }
    public String setname(String name1){
      this.name = name1;
      return name;
    }
    
    //get
    public int getmoney(){
        return money;
    }
    public String getaction(){
      return action;
    }
    public String getname(){
      return name;
    }

}
public class Test {
  public static void main(String[] args) 
  {
    Manei ma = new Manei();
    ma.setmoney(50);
    ma.setaction("v");
    ma.setname("me");
    System.out.println("肯德基疯狂星期四" + ma.getaction() + ma.getname() + ma.getmoney());
  }
}
