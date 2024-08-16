/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 */


public class TimeConversion {

    private static String printTimeConversion ( String s ) {
        String period = s.substring(s.length() - 2);  // extract AM and PM part
        int hour = Integer.parseInt(s.substring(0,2)); // Extract first to element in thi string that is hours

        if(period.equals("AM")){
            if( hour == 12){
                hour = 0;  //midnight time
            }
        } else if( period != ("PM")){
            if(hour != 12){
                hour += 12; //convert 12 hour to 24 hour format using 12 addition
            }
        }
        String newPeriod = String.format("%02d", hour);

        return newPeriod + s.substring(2,s.length() - 2);
    }

    public static void main ( String[] args ) {
        String s = "12:01:00AM";
        System.out.println(printTimeConversion(s));
    }


}
