public class TimeConverter {
    public static int ConvertHoursToMinutes(int hours) {
        if(hours < 0) {
            return -1;
        }
        int noOfMinutes = hours * 60;
       // your task : complete this method
        return noOfMinutes;
    }
    public static int ConvertDaysToMinutes(int days) {
        if(days < 0) {
            return -1;
        }
        int noOfMinutes = days * 24 * 60;
        // your task: complete this method
        return noOfMinutes;
        }
    }



