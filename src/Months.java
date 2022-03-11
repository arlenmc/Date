
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/8/22
 * Description: 
 * Enum of months in a year that manages the number of days in each month.
 * 
 * February is set to 28 days by default, but setDays changes it to 29.
 * However, setDays does not check what the year is
 * it's assumed that setDays is called when the year is known to be a leap year
 * (ie. the Date class has determined that given date is a leap year)
 * 
 * setDays (with the help of setLeapYear) prevents any month besides February 
 * from having its number of days changed at all, 
 * and prevents February from being set to a number other than 28 or 29. 
 
 * -------------------------------------------------------------
 * notes/ train of thought
 * can't figure out how best to incorporate February
 * except to do boolean instead of integer- 
 * MESSY: true= 30/28 for feb, false= 31/29 for feb
 * 
 * # days is dependent on year for feb.. do we bring year into the enum??
 * set (leap)year method?
 * feb gets its own constructor! with an additional parameter- this seems ok
 * 
 * setLeapYear method is kinda ugly- maybe a wrapper class for boolean would 
 * solve? some way to designate null?- using Wrapper works,
 *  but maybe not much nicer than if statement checking for February
 */
// citation: unit 10, slide 13
public enum Months {
    JANUARY(31), 
    FEBRUARY(28, false), 
    MARCH(31), 
    APRIL(30), 
    MAY(31), 
    JUNE(30), 
    JULY(31), 
    AUGUST(31), 
    SEPTEMBER(30), 
    OCTOBER(31),
    NOVEMBER(30), 
    DECEMBER(31);
    // number associated with month
    private int num;
    // number of days in the month
    private int days;
    // leap year flag for February
    private Boolean isLeap;
    // general constructor
    Months(int days)
    {
        this.days = days;
    }
    // February constructor
    Months(int days, Boolean isLeap)
    {
        this.isLeap = isLeap;
        this.days = days;
    }
    public int getDays()
    {
        return this.days;
    }
    public void setDays()
    {
        if (!(this.isLeap == null))
        {
            this.setLeapYear();
            if(isLeap) this.days = 29;
        }
    }
    private void setLeapYear()
    {
        this.isLeap = true;
    }
    // override to print month names with first letter capitalized
    public String toString()
    {
        // name() gets String of enum
        String str = name();
        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return str;        
    }
}
