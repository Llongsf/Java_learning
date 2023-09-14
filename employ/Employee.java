package employ;

/* 文件名 : Employee.java */
public class Employee {
   private String name;
   private String address;
   private int number;
   
   public Employee(String name, String address, int number) {
      System.out.println("Employee 构造函数1");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void mailCheck() {
      System.out.println("邮寄支票给： " + this.name
       + " " + this.address);
   }

   //主动调用toString函数
   // public String toString() {
   //    return name + " " + address + " " + number;
   // }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String newAddress) {
      address = newAddress;
   }
   public int getNumber() {
     return number;
   }
}