
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/23/22
 * Description:
 * the Months enum that was originally turned in, which outputs some incorrect
 * values, due to only allowing leapYear to be turned to true, and not 
 * turned back to false
 */
public enum WrongMonths {
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
    private static final WrongMonths[] WrongMonthsArray = WrongMonths.values();
    // general constructor
    WrongMonths(int num, int days)
    {
        this.num = num;
        this.days = days;
    }
    // February constructor
    WrongMonths(int num, int days, Boolean isLeap)
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
    public void setFeb()
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
    // "reverse" .ordinal() using the month number
    // reference: Savitch p. 396 - use of values method and for-each loop
    public static WrongMonths numToMonth(int number)
    {
        for(WrongMonths m : WrongMonthsArray)
        {
            if (m.num == number) return m;
        }
        return null;
    }
    // "increment" month constant- return next consecutive constant
    public WrongMonths increment ()
    {
        if (!(WrongMonths.this == WrongMonths.DECEMBER))
        {
            int nextNum = WrongMonths.this.ordinal() + 2;
            return (WrongMonths.this.numToMonth(nextNum));
        }
        else
        {
            return WrongMonths.JANUARY;
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
    

