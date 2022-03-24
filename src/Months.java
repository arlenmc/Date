
import java.util.Arrays;
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/16/22
 * 
 * updated on 3/23/22
 * -eliminated setLeapYear() and setFeb() methods
 * -added setLeap() and undoLeap() methods
 * 
 * Description: 
 * Enum of months in a year that manages the number of days in each month.
 * 
 * February is set to 28 days by default, but setFeb changes it to 29.
 * it's assumed that setFeb is called when the year is known to be a leap year
 * (ie. the Date class has determined that given date is a leap year)
 * 
 * However! For the purpose of the Date class, undoLeap had to be added
 * So far, it only seemed to affect dayOfWeek/ countDays methods
 */
// reference: unit 10, slide 13
public enum Months {
    JANUARY(1, 31), 
    FEBRUARY(2, 28, false), 
    MARCH(3, 31), 
    APRIL(4, 30), 
    MAY(5, 31), 
    JUNE(6, 30), 
    JULY(7, 31), 
    AUGUST(8, 31), 
    SEPTEMBER(9, 30), 
    OCTOBER(10, 31),
    NOVEMBER(11, 30), 
    DECEMBER(12, 31);
    // number associated with month
    private final int num;
    // number of days in the month
    private int days;
    // leap year flag for February
    private Boolean isLeap;
    // reference: Savitch p. 396
    private static final Months[] monthsArray = Months.values();
    // general constructor
    Months(int num, int days)
    {
        this.num = num;
        this.days = days;
    }
    // February constructor
    Months(int num, int days, Boolean isLeap)
    {
        this.num = num;
        this.days = days;
        this.isLeap = isLeap;
    }
    public int getNum()
    {
        return this.num;
    }
    public int getDays()
    {
        return this.days;
    }
    public void setLeap()
    {
        if (!(this.isLeap == null))
        {
            this.isLeap = true;
            this.days = 29;
        }
    }
    public void undoLeap()
    {
        if (!(this.isLeap == null))
        {
            this.isLeap = false;
            this.days = 28;
        }
    }
    // "reverse" .ordinal() using the month number
    // reference: Savitch p. 396 - use of values method and for-each loop
    public static Months numToMonth(int number)
    {
        for(Months m : monthsArray)
        {
            if (m.num == number) return m;
        }
        return null;
    }
    // "increment" month constant- return next consecutive constant
    public Months increment ()
    {
        if (!(Months.this == Months.DECEMBER))
        {
            int nextNum = Months.this.ordinal() + 2;
            return (Months.this.numToMonth(nextNum));
        }
        else
        {
            return Months.JANUARY;
        }
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
