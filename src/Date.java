
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/8/22
 * Description: Represent a date including its month, day, and year
 * Help from: Ben Alfaro (suggestion to use constructor chaining)
 * 
 * -if time: implements enums
 */
public class Date {
    private int day;
    private int month;
    private int year;
    //experimental- these are properties of a date so should be determined with it-
    //helps prevent creating nonexistent date/keeping things straight
    // PREVENT CREATING DATE THAT DOES NOT EXIST- this is handled by isValid method
    // buuut! class params I created will help
    
    // months with 31 days: January, March, May, July, August, October, December
                            // 1,3,5,7,8,10,12
    // months with 30 days: September, April, June, and November
                            // 9, 4, 6, 11
    // February varies: 28 when not leap year; 29 when leap year
                            // 2
    // use enum to manage month name, order, and days in month
    private int daysInMonth;
    private boolean leapYear;
    Date()
    {
        this(1, 1, 2000);
    }
    Date(int day)
    {
        this(day, 1, 2000);
    }
    Date(int day, int month)
    {
        this(day, month, 2000);
    }
    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.leapYear = this.year % 4 == 0;
        if (this.month)
    }
    // advance date by one day
    public void advance()
    {
        this.day++;
    }
    public String toString()
    {
        
    }
}
