
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/16/22
 *
 * Description:
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
        
        // System.out.println("1999");
        Date jan15_1999 = new Date(15, Months.JANUARY, 1999);
        // System.out.println("Jan 15, 1999 is a Friday: " + jan15_1999.dayOfWeek());
        WrongDate wjan15_1999 = new WrongDate(15, WrongMonths.JANUARY, 1999);
        // System.out.println("Jan 15, 1999 is a Friday: " + wjan15_1999.dayOfWeek());
        // System.out.println("");
        
        Date feb15_1999 = new Date(15, Months.FEBRUARY, 1999);
        // System.out.println("Feb 15, 1999 is a Monday: " + feb15_1999.dayOfWeek());
        WrongDate wfeb15_1999 = new WrongDate(15, WrongMonths.FEBRUARY, 1999);
        // System.out.println("Feb 15, 1999 is a Monday: " + wfeb15_1999.dayOfWeek());
        // System.out.println("");
        
        Date may15_1999 = new Date(15, Months.MAY, 1999);
        // System.out.println("May 15, 1999 is a Saturday: " + may15_1999.dayOfWeek());
        WrongDate wmay15_1999 = new WrongDate(15, WrongMonths.MAY, 1999);
        // System.out.println("May 15, 1999 is a Saturday: " + wmay15_1999.dayOfWeek());
        // System.out.println("");
        
        // 2000 
        
        System.out.println("2000");
        Date jan15_2000 = new Date(15, Months.JANUARY, 2000);
        // System.out.println("Jan 15, 2000 is a Saturday: " + jan15_2000.dayOfWeek());
        WrongDate wjan15_2000 = new WrongDate(15, WrongMonths.JANUARY, 2000);
        // System.out.println("Jan 15, 2000 is a Saturday: " + wjan15_2000.dayOfWeek());
        //System.out.println("");
        
        Date jan31_2000 = new Date(31, Months.JANUARY, 2000);
        // System.out.println("Jan 31, 2000 is a Monday: " + jan31_2000.dayOfWeek());
        WrongDate wjan31_2000 = new WrongDate(31, WrongMonths.JANUARY, 2000);
        // System.out.println("Jan 31, 2000 is a Monday: " + wjan31_2000.dayOfWeek());
        // System.out.println("");
        
        Date feb1_2000 = new Date(1, Months.FEBRUARY, 2000);
        // System.out.println("Feb 1, 2000 is a Tuesday: " + feb1_2000.dayOfWeek());
        WrongDate wfeb1_2000 = new WrongDate(1, WrongMonths.FEBRUARY, 2000);
        // System.out.println("Feb 1, 2000 is a Tuesday: " + wfeb1_2000.dayOfWeek());
        // System.out.println("");
        
        Date may15_2000 = new Date(15, Months.MAY, 2000);
        System.out.println("May 15, 2000 is a Monday: " + may15_2000.dayOfWeek());
        WrongDate wmay15_2000 = new WrongDate(15, WrongMonths.MAY, 2000);
        System.out.println("May 15, 2000 is a Monday: " + wmay15_2000.dayOfWeek());
        System.out.println("");
        
        Date may16_2000 = new Date(16, Months.MAY, 2000);
        System.out.println("May 16, 2000 is a Tuesday: " + may16_2000.dayOfWeek());
        WrongDate wmay16_2000 = new WrongDate(16, WrongMonths.MAY, 2000);
        System.out.println("May 16, 2000 is a Tuesday: " + wmay16_2000.dayOfWeek());
        System.out.println("");
        
        // 2001
        
        System.out.println("2001");
        Date jan15_2001 = new Date(15, Months.JANUARY, 2001);
        //System.out.println("Jan 15, 2001 is a Monday: " + jan15_2001.dayOfWeek());
        WrongDate wjan15_2001 = new WrongDate(15, WrongMonths.JANUARY, 2001);
        //System.out.println("Jan 15, 2001 is a Monday: " + wjan15_2001.dayOfWeek());
        //System.out.println("");
        
        Date jan31_2001 = new Date(31, Months.JANUARY, 2001);
        // System.out.println("Jan 31, 2001 is a Wednesday: " + jan31_2001.dayOfWeek());
        WrongDate wjan31_2001 = new WrongDate(31, WrongMonths.JANUARY, 2001);
        // System.out.println("Jan 31, 2001 is a Wednesday: " + wjan31_2001.dayOfWeek());
        // System.out.println("");
        
        Date feb1_2001 = new Date(1, Months.FEBRUARY, 2001);
        // System.out.println("Feb 1, 2001 is a Thursday: " + feb1_2001.dayOfWeek());
        WrongDate wfeb1_2001 = new WrongDate(1, WrongMonths.FEBRUARY, 2001);
        // System.out.println("Feb 1, 2001 is a Thursday: " + wfeb1_2001.dayOfWeek());
        // System.out.println("");
        
        Date may15_2001 = new Date(15, Months.MAY, 2001);
        System.out.println("May 15, 2001 is a Tuesday: " + may15_2001.dayOfWeek());
        WrongDate wmay15_2001 = new WrongDate(15, WrongMonths.MAY, 2001);
        System.out.println("May 15, 2001 is a Tuesday: " + wmay15_2001.dayOfWeek());
        System.out.println("");
        
        Date may16_2001 = new Date(16, Months.MAY, 2001);
        System.out.println("May 16, 2001 is a Wednesday: " + may16_2001.dayOfWeek());
        WrongDate wmay16_2001 = new WrongDate(16, WrongMonths.MAY, 2001);
        System.out.println("May 16, 2001 is a Wednesday: " + wmay16_2001.dayOfWeek());
        System.out.println("");
        
        // 2002
        
        System.out.println("2002");
        Date jan15_2002 = new Date(15, Months.JANUARY, 2002);
        // System.out.println("Jan 15, 2002 is a Tuesday: " + jan15_2002.dayOfWeek());
        WrongDate wjan15_2002 = new WrongDate(15, WrongMonths.JANUARY, 2002);
        // System.out.println("Jan 15, 2002 is a Tuesday: " + wjan15_2002.dayOfWeek());
        // System.out.println("");
        
        Date feb1_2002 = new Date(1, Months.FEBRUARY, 2002);
        // System.out.println("Feb 1, 2002 is a Friday: " + feb1_2002.dayOfWeek());
        WrongDate wfeb1_2002 = new WrongDate(1, WrongMonths.FEBRUARY, 2002);
        // System.out.println("Feb 1, 2002 is a Friday: " + wfeb1_2002.dayOfWeek());
        // System.out.println("");
        
        Date may15_2002 = new Date(15, Months.MAY, 2002);
        System.out.println("May 15, 2002 is a Wednesday: " + may15_2002.dayOfWeek());
        WrongDate wmay15_2002 = new WrongDate(15, WrongMonths.MAY, 2002);
        System.out.println("May 15, 2002 is a Wednesday: " + wmay15_2002.dayOfWeek());
        System.out.println("");
        
        Date may16_2002 = new Date(16, Months.MAY, 2002);
        System.out.println("May 16, 2002 is a Thursday: " + may16_2002.dayOfWeek());
        WrongDate wmay16_2002 = new WrongDate(16, WrongMonths.MAY, 2002);
        System.out.println("May 16, 2002 is a Thursday: " + wmay16_2002.dayOfWeek());
        System.out.println("");
        
        
    } // end of main
}
