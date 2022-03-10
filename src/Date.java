
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/8/22
 * Description: Represent a date including its month, day, and year
 * Help from: Ben Alfaro (suggestion to use constructor chaining)
 */
public class Date {
    private int day;
    private int month;
    private int year;
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
    }
    
}
