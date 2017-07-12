import java.time.*;
import java.lang.*;
import java.util.*;
 
 interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    
    //ZonedDateTime getZonedDateTime(String zoneString);
  /*  static ZoneId getZoneId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
    }*/
}

 
 /*
  * Implementation of all Methods of Interface
  */
 public class SimpleTimeClient implements TimeClient {
	    
	    private LocalDateTime dateAndTime;
	    
	    public SimpleTimeClient() {
	        dateAndTime = LocalDateTime.now();
	    }
	    
	    
	    
	    public void setTime(int hour, int minute, int second) {
	        LocalDate currentDate = LocalDate.from(dateAndTime);
	        LocalTime timeToSet = LocalTime.of(hour, minute, second);
	        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	    }
	    
	    
	    
	    
	    public void setDate(int day, int month, int year) {
	        LocalDate dateToSet = LocalDate.of(day, month, year);
	        LocalTime currentTime = LocalTime.from(dateAndTime);
	        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	    }
	    
	    
	    
	    public void setDateAndTime(int day, int month, int year,
	                               int hour, int minute, int second) {
	        LocalDate dateToSet = LocalDate.of(day, month, year);
	        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
	        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	    }
	    
	    
	    
	    public LocalDateTime getLocalDateTime() {
	        return dateAndTime;
	    }
	    
	    
	    
	    public String toString() {
	        return dateAndTime.toString();
	    }
	    
	    public static void main(String... args) {
	        TimeClient myTimeClient = new SimpleTimeClient();
	        System.out.println(myTimeClient.toString());
	        /*
	        System.out.println("Time in California: " +
	                myTimeClient.getZonedDateTime("California").toString());*/
	    }
	}
