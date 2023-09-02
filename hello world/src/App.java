/* 
package com.sun.naming
*/
public class App {
    public static void main(String[] args) throws Exception {
        int x2 = 2;
        int x3 = 3;
        char x4 =99;
        String o = "ooo";
        String o2 = "eee";
        String o3 = o + o2;
        System.out.println(o3 + "\n");
        System.out.println(x2 + x3 + x4);
        System.out.println("" + x2 + x3 + x4);

        System.out.println(o.concat(o2));
        second1(args);
    }

    public static void second1(String[] args) throws Exception {
        System.out.println(Math.abs(-66.6));
        System.out.println(Math.random());
    }
}
