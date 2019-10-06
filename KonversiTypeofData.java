
public class KonversiTypeofData {

    public static void main(String[] args) {
        
        String number = "120";
        String value = "200";
        
        int number2 = Integer.valueOf(number);
        Double value2 = Double.parseDouble(value);
        
        System.out.println(number2+80);
        System.out.println(value2+40);
        
    }
}
