
/**
 *
 * @author Macie McKitrick
 * test countDays + dayOfWeek methods specifically
 * 
 * looking at 2000/2001- a month must be instantiated in February for the leap
 * day to be counted - the leap setting must also be undone
 *  -because the enum months are not objects- there are not multiple Februaries
 * 
 * Observations:
 * 
 * Years such as 1999 are not a problem because they are not a leap year, 
 * and a leap year does not precede them.
 * 
 * All dates in some century leap year will be correct only in January, otherwise
 * they are behind by 1 day
 * Once a date in February is created, all days are correct (the leap day had
 * to be activated)
 * 
 * However, the year following the century leap year is then ahead 1 day in
 * each month besides January. The leap year has not been switched off.
 * 
 * 
 */
public class DateDayDriver {
    public static void main(String[] args) 
    {
        // 1999
        
        Date jan15_1600 = new Date(15, Months.JANUARY, 1600);
        System.out.println("Jan 15, 1600 is a Saturday: " + jan15_1600.dayOfWeek());
        
        Date feb15_1600 = new Date(15, Months.FEBRUARY, 1600);
        System.out.println("Feb 15, 1600 is a Tuesday: " + feb15_1600.dayOfWeek());
        
        Date may15_1600 = new Date(15, Months.MAY, 1600);
        System.out.println("May 15, 1600 is a Monday: " + may15_1600.dayOfWeek());
        System.out.println("");

        // 1999
        
        Date jan15_1999 = new Date(15, Months.JANUARY, 1999);
        System.out.println("Jan 15, 1999 is a Friday: " + jan15_1999.dayOfWeek());
        
        Date feb15_1999 = new Date(15, Months.FEBRUARY, 1999);
        System.out.println("Feb 15, 1999 is a Monday: " + feb15_1999.dayOfWeek());
        
        Date may15_1999 = new Date(15, Months.MAY, 1999);
        System.out.println("May 15, 1999 is a Saturday: " + may15_1999.dayOfWeek());
        System.out.println("");
        
        // 2000 
        
        Date jan15_2000 = new Date(15, Months.JANUARY, 2000);
        System.out.println("Jan 15, 2000 is a Saturday: " + jan15_2000.dayOfWeek());
        
        Date jan31_2000 = new Date(31, Months.JANUARY, 2000);
        System.out.println("Jan 31, 2000 is a Monday: " + jan31_2000.dayOfWeek());
        
        // initializing a february date fixes days in 2000, (which were behind by one day)
        // but sets days after Jan in 2001 ahead by 1
        Date feb1_2000 = new Date(1, Months.FEBRUARY, 2000);
        System.out.println("Feb 1, 2000 is a Tuesday: " + feb1_2000.dayOfWeek());
        
        // was previously behind by 1 day
        Date may15_2000 = new Date(15, Months.MAY, 2000);
        System.out.println("May 15, 2000 is a Monday: " + may15_2000.dayOfWeek());
        
        // was previously behind by 1 day
        Date may16_2000 = new Date(16, Months.MAY, 2000);
        System.out.println("May 16, 2000 is a Tuesday: " + may16_2000.dayOfWeek());
        System.out.println("");
        
        // 2001
        
        Date jan15_2001 = new Date(15, Months.JANUARY, 2001);
        System.out.println("Jan 15, 2001 is a Monday: " + jan15_2001.dayOfWeek());
        
        Date jan31_2001 = new Date(31, Months.JANUARY, 2001);
        System.out.println("Jan 31, 2001 is a Wednesday: " + jan31_2001.dayOfWeek());
        
        Date feb1_2001 = new Date(1, Months.FEBRUARY, 2001);
        System.out.println("Feb 1, 2001 is a Thursday: " + feb1_2001.dayOfWeek());
        
        Date may15_2001 = new Date(15, Months.MAY, 2001);
        System.out.println("May 15, 2001 is a Tuesday: " + may15_2001.dayOfWeek());
        
        Date may16_2001 = new Date(16, Months.MAY, 2001);
        System.out.println("May 16, 2001 is a Wednesday: " + may16_2001.dayOfWeek());
        System.out.println("");
        
        // 2002
        
        Date jan15_2002 = new Date(15, Months.JANUARY, 2002);
        System.out.println("Jan 15, 2002 is a Tuesday: " + jan15_2002.dayOfWeek());
        
        // feb is correct here, somehow
        Date feb1_2002 = new Date(1, Months.FEBRUARY, 2002);
        System.out.println("Feb 1, 2002 is a Friday: " + feb1_2002.dayOfWeek());
        
        // ahead by 1 day
        Date may15_2002 = new Date(15, Months.MAY, 2002);
        System.out.println("May 15, 2002 is a Wednesday: " + may15_2002.dayOfWeek());
        
        // ahead by 1 day
        Date may16_2002 = new Date(16, Months.MAY, 2002);
        System.out.println("May 16, 2002 is a Thursday: " + may16_2002.dayOfWeek());
        System.out.println("");
        
        // after fixing leap year settings in Months and Date, so that it
        // can be undone..
        // only Feb 1, 2001 is a Tuesday: Thursday remains
        //      Reason for this? Feb 1, 2001 is actually a Thursday- test was typo/mistake
        
    } // end of main
}
