package Abstract;

class Foundation {
 private int var1 = 1;         // private
 int var2 = 2;                 // default
 protected int var3 = 3;       // protected
 public int var4 = 4;          // public
}

public class Abstract2 {
 public static void main(String[] args) {
     Foundation obj = new Foundation();

     // System.out.println(obj.var1); // ❌ private - not accessible
     // System.out.println(obj.var2); // ❌ default - not accessible from different package
     // System.out.println(obj.var3); // ❌ protected - not accessible from non-subclass outside package
     System.out.println(obj.var4);    // ✅ public - accessible
 }
}

