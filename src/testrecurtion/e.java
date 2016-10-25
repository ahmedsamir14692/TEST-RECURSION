
package testrecurtion;

public class e {
     public static void rec(int val)
    {
      
       if(val>0) // base case
           rec(val-1);
      System.out.println(val);
    } 
     public static void dec(int val)
    {
      System.out.println(val);
       if(val>0) // base case
           dec(val-1);
      
    }
     
    public static void draw(int val)
    {
//        if (val==0)
//            return;
        for(int i=0;i<val;i++)
        { System.out.print("@ ");}  
        System.out.println("#"); // مع اللي قبلها في نفس السطر بس اللي جاي بعدها في سطر جديد
        if(val>0)
                    draw(val-1);
                      System.out.println("ahmed" + val);
    }
}
