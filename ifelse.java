
public class ifelse {

    public static void main(String[] args) {
        int value = 67;
        
        if(value>90) {//Condition 1 false
            System.out.println("You are very Agile child ");
        }
        else if(value>70 && value <90) {//false && true
            System.out.println("You Value is enough, but you must fix again ");
        }else {
            System.out.println("Your Value is bad, you must study dillegently again");
        }
    }
}
