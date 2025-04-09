import java.text.*;
import java.util.*;

public class q08_DateManipulator {
    public static void main(String[] args) throws Exception {
        String strDate = "2024-04-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);

        String formatted = sdf.format(date);
        System.out.println("Converted Date: " + formatted);

        Date date2 = sdf.parse("2024-04-10");
        long diff = date2.getTime() - date.getTime();
        long daysBetween = diff / (1000 * 60 * 60 * 24);

        System.out.println("Days between: " + daysBetween);
    }
}
