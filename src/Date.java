
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/8/22
 * Description: Represent a date including its month, day, and year
 * Help from: Ben Alfaro (suggestion to use constructor chaining)
 * 
 * notes:
 * 
 */
public class Date {
    private int day;
    private Months month;
    private int year;
    private boolean leapYear;
    Date()
    {
        this(1, Months.JANUARY, 2000);
    }
    Date(int day)
    {
        this(day, Months.JANUARY, 2000);
    }
    Date(int day, Months month)
    {
        this(day, month, 2000);
    }
    Date(int day, Months month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.leapYear = (this.year % 4 == 0);
        // adjust February to 29 days if leap year
        if (this.leapYear) this.month.setDays();
    }
    // advance date by one day
    public void advance()
    {
        // new year
        if ((this.day == 31) && (this.month == Months.DECEMBER))
        {
            this.day = 1;
            this.month = Months.JANUARY;
            this.year++;
        }
        // new month
        else if (this.day == this.month.getDays())
        {
            this.day = 1;
            // "increment" the month enum
            int monthNum = this.month.getNum();
            monthNum++;
            this.month.findName(monthNum);
            
        }
        else
        {
                this.day++;
        }
    }
    public String toString()
    {
        return month + " " + day + ", " + year;
    }
    public boolean isLeapYear()
    {
        return this.leapYear;
    }
}
