
/**
 *
 * @author Macie McKitrick
 * the Date class that was originally turned in, which outputs some incorrect
 * values, due to the original Months enum methods 
 */
public class WrongDate {
    private int day;
    private Months month;
    private int year;
    private boolean leapYear;
    private static final String daysOfWeek[] = {"Saturday","Sunday","Monday",
        "Tuesday","Wednesday","Thursday", "Friday"};
    WrongDate()
    {
        this(1, Months.JANUARY, 2000);
    }
    WrongDate(int day)
    {
        this(day, Months.JANUARY, 2000);
    }
    WrongDate(int day, Months month)
    {
        this(day, month, 2000);
    }
    WrongDate(int day, Months month, int year)
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
        // calculate days from 1/1/0000 to 1/1/year-1
        totalDays = this.year * 365 + leapDays - centuries + leapCenturies;
        // add days after Jan 1 thru given day
        for (Months m = Months.JANUARY; m.getNum() < monthNum; m = m.increment())
        {
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
    

