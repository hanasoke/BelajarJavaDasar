
public class Logic {

    
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true; 
        
        System.out.println("oparator AND");
        boolean result = a && b;
        boolean result1 = a && d;
        boolean result2 = c && a;
        boolean result3 = b && d;
        
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        
        System.out.println("oparator OR");
        boolean orresult = a || b;
        boolean orresult1 = a || d;
        boolean orresult2 = b || d;
        boolean orresult3 = b || c;
        
        System.out.println(orresult);
        System.out.println(orresult1);
        System.out.println(orresult2);
        System.out.println(orresult3);
        
        System.out.println("Number");
        boolean e = 20>10 && 30==30;
        
        System.out.println(e);
    }
    
}
