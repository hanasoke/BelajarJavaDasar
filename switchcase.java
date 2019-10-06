
public class switchcase {

    public static void main(String[] args) {
        
        char grade = 'B';
        
        switch(grade) {
            case 'A':
                System.out.println("Your value ekselent, You sumo komlot");
                break;
            case 'B':
                System.out.println("Your value has been good, but must be increased");
                break;
            case 'C':
                System.out.println("Your value not enough, need study again");
                break;
            default:
                System.out.println("You Fail,must be study again");
        }
    }
    
}
