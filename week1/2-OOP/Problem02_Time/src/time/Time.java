package time;

import java.util.Calendar;

public class Time {
    private int day;
    private int month;
    private int year;
    private int hours;
    private int minutes;  
    private int seconds;
    
    public Time(int day, int month, int year, int hours, int minutes, int seconds) {           
        setMonth(month);
        setYear(year);
        setDay(day);
        setHours(hours);
        setMinutes(minutes); 
        setSeconds(seconds);
    }

    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        checkDay(day);
        
        this.day = day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("Month has to be between 1 and 12");
        }
        
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours have to be between 0 and 23");
        }
        
        this.hours = hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes have to be between 0 and 59");
        }
        
        this.minutes = minutes;
    }
    
    public int getSeconds() {
        return this.seconds;
    }
    
    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds have to be between 0 and 59");
        }
        
        this.seconds = seconds;
    }   
    
    public static Time now() {
        Calendar calendar = Calendar.getInstance();
        
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        
        return new Time(day, month, year, hours, minutes, seconds);
    }
    
    @Override
    public String toString() {
        String output = String.format("%02d:%02d:%02d %02d.%02d.%d",
                this.getHours(),
                this.getMinutes(), 
                this.getSeconds(), 
                this.getDay(),
                this.getMonth(),
                this.getYear());
        
        return output;
    }

    private void checkDay(int day) {
        if ((day < 0 || day > 31) ||
        (day == 31 && 
        (this.getMonth() == 2 || 
        this.getMonth() == 4 ||
        this.getMonth() == 6 ||
        this.getMonth() == 9 || 
        this.getMonth() == 11)) ||
        (day == 29 && this.getMonth() == 2 && !(isYearLeap(this.getYear())))) {
            throw new IllegalArgumentException("Invalid day");
        }
    }
    
    private boolean isYearLeap(int year) {
        if (year % 4 != 0) {
            return false;
        }
        
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}