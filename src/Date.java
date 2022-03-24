
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/16/22- updated with fix on 3/23/22
 * Description: Represent a date including its month, day, and year
 * Help from: 
 * - Ben Alfaro (suggestion to use constructor chaining),
 * - website (+ general research about the Gregorian calendar and 
 * perpetual calendars:  https://cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
 *  - used web for ideas and facts such as 'the calendar has a 400 year cycle
 */
public class Date {
    private int day;
    private Months month;
    private int year;
    private boolean leapYear;
    private static final String daysOfWeek[] = {"Saturday","Sunday","Monday",
        "Tuesday","Wednesday","Thursday", "Friday"};
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
        // set leap year to true or false given the method
        this.leapYear = this.isLeapYear();
        // adjust February in Months to 29 days if leap year
        if (this.leapYear) this.month.setLeap();
        if (!this.leapYear) this.month.undoLeap();
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
    public int compareTo(Date date)
    {
        return this.countDays() - date.countDays();
    }
    public String dayOfWeek()
    {
        int totalDays = this.countDays();
        int dayNum = totalDays % 7;
        return daysOfWeek[dayNum];
        
    }
    public boolean isValid()
    {
        // month guaranteed valid due to Months enum
        // leap year day within month
        if (!(leapYear) && this.month == Months.FEBRUARY 
                && this.day == 29) return false;
        // day within month
        if (!((this.day <= this.month.getDays()) && (this.day > 0))) return false;
        if (this.year == 0) return false;
        return true;
    }
    // calculate # of days between given date and fictitious date January 1, 0000
    public int countDays()
    {
        int totalDays;
        double dYear = this.year;
        int monthNum = this.month.getNum();
        int leapDays = (int) Math.ceil(dYear/4);
        int centuries = (int) Math.ceil(dYear/100);
        int leapCenturies = (int) Math.ceil(dYear/400);
        // calculate days from 1/1/0000 to 1/1/year
        totalDays = this.year * 365 + leapDays - centuries + leapCenturies;
        
        for (Months m = Months.JANUARY; m.getNum() < monthNum; m = m.increment())
        {
            if (m == Months.FEBRUARY && this.isLeapYear()) m.setLeap();
            totalDays += m.getDays();
        }
        totalDays += (this.day - 1);
        return totalDays;
    }
    public boolean isLeapYear()
    {
        if (this.year % 4 == 0)
        {
            // non-century leap year
            if (!(this.year % 100 == 0)) return true;   
            else if (this.year % 100 == 0)    
            {
                // century leap year 
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
