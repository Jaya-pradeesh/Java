import java.text.NumberFormat;
import java.util.*;

public class currency {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        NumberFormat chinaformat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat indiaformat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String china = indiaformat.format(payment);
        System.out.println(china);
    }
}