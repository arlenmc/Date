
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/8/22
 * Description: Represent a date including its month, day, and year
 * Help from: Ben Alfaro (suggestion to use constructor chaining)
 * 
 * notes:
 * -isValid() had only been checking final date of month.. used less than =
 * -no year 0 for isValid()(?)
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
        this.leapYear = this.isLeapYear();
        // adjust February in Months to 29 days if leap year
        if (this.leapYear) this.month.setFeb();
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
            this.month = this.month.increment();
        }
        else
        {
                this.day++;
        }
    }
    public boolean equals(Date date)
    {
        if((this.day == date.day) && (this.month == date.month) 
                && (this.year == date.year))
        {
            return true;
        }
        return false;
    }
    public boolean isValid()
    {
        // month guaranteed valid due to Months enum
        // leap year day within month
        if (!(leapYear) && this.month == Months.FEBRUARY) return false;
        // day within month
        if (!(this.day <= this.month.getDays() && (this.day > 0))) return false;
        if (this.year == 0) return false;
        return true;
    }
    public int countDays()
    {
        
    }
    public boolean isLeapYear()
    {
        if (this.year % 4 == 0)
        {
            // non-century leap year
            if (!(this.year % 100 == 0)) return true;   
            else if (this.year % 100 == 0)    
            {
                // century  leap year 
                if (this.year % 400 == 0) return true;
                else
                    return false;
            }
        }
        return false;
    }
    public String toString()
    {
        return month + " " + day + ", " + year;
    }
}
