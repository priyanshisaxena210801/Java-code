import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class dob {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String datesince ="1970-01-01";
        System.out.println("enter the date from which you want to calculate the number of days\t ");
        String dateafter=s.nextLine();
        LocalDate datesince1=LocalDate.parse(datesince);
        LocalDate dateafter1=LocalDate.parse(dateafter);
        long noofdaysbetween=ChronoUnit.DAYS.between(datesince1,dateafter1);
        System.out.println(noofdaysbetween);
        
    }
    
}
