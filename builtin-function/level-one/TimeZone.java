// 1. Problem 1: Time Zones and ZonedDateTime Write a program that displays the current

import java.time.ZoneId;  // Importing ZoneId class to handle different time zones
import java.time.ZonedDateTime;  // Importing ZonedDateTime to work with time zones

public class TimeZone {
    public static void main(String[] args) {
        // Getting current time in GMT
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        
        // Getting current time in Indian Standard Time (IST)
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        
        // Getting current time in Pacific Standard Time (PST)
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        
        // Printing time in different time zones
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}




// time in different time zones:
// ➢ GMT (Greenwich Mean Time)
// ➢ IST (Indian Standard Time)
// ➢ PST (Pacific Standard Time)
// Hint: Use ZonedDateTime and ZoneId to work with different time zones.