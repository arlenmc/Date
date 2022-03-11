
/**
 *
 * @author Macie McKitrick
 * Description: Manages month names, order, and number of days in each month.
 * February is set to 28 days by default, but setLeapYear change it to 29.
 * 
 * However, setLeapYear does not check on what the year is- that is (should be?)
 * done outside of the enum, as it is unrelated to the months themselves.
 * 
 * The benefit of setLeapYear is that it prevents any month besides February
 * from having its number of days changed at all, and it prevents February from
 * being set to a number of days other than 28 or 29.
 
 * -------------------------------------------------------------
 * notes/ train of thought
 * can't figure out how best to incorporate February
 * except to do boolean instead of integer- 
 * MESSY: true= 30/28 for feb, false= 31/29 for feb
 * 
 * # days is dependent on year for feb.. do we bring year into the enum??
 * set (leap)year method?
 * feb gets its own constructor! with an additional parameter- this seems ok
 */
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
    // number of days in the month
    private int days;
    // leap year flag for February
    private boolean isLeap;
    // constructor
    Months(int days)
    {
        this.days = days;
    }
    /* February constructor- manage variable number of days in the month
    default for isLeap is false- set to true later when year is known (in Date)
    isLeap necessary to protect from month's days being set directly
    February constructor necessary to eliminate unnecessary leap year info
    */
    Months(int days, boolean isLeap)
    {
        this.isLeap = isLeap;
        this.days = days;
    }
    public void setLeapYear()
    {
        this.isLeap = true;
        if(isLeap) this.days = 29;
    }
    public int getDays()
    {
        return this.days;
    }
    // override to print month names with first letter capitalized
    public String toString()
    {
        // name() gets string of enum
        String str = name();
        // specify capital and lowercase with substrings
        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return str;        
    }
}
