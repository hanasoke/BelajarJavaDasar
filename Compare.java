
public class Compare {


    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int c = 12;
        int d = 31;
        
        boolean result = a == b; //same
        boolean outcome = a != b; //no same
        boolean isgreaterthan = a > b;//is greater than
        boolean islessthan = c < d;//is less than
        boolean isgreaterthanorequal = b >= d;//is greater than or equal
        boolean islessthanorequal = d <= a;//is less than or equal
        
        
        System.out.println(result);
        System.out.println(outcome);
        System.out.println(isgreaterthan);
        System.out.println(islessthan);
        System.out.println(isgreaterthanorequal);
        System.out.println(islessthanorequal);
    }
    
}
