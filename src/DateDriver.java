
/**
 *
 * @author Macie McKitrick
 * Program Assignment #3: Dates
 * 3/8/22
 * Description: test Date class constructors and methods
 */
public class DateDriver {
    public static void main(String[] args) 
    {
        /*
        // test Months enum..
        String printOctober = Months.OCTOBER.toString();
        System.out.println("toString case override: " + printOctober);
        System.out.println("");
        // print all months and default number of days in enum
        for (Months m : Months.values())
        {
            int days = m.getDays();
            System.out.println(m + " has " + days + " days");
        }
        System.out.println("");
        // test getDays
        int daysInMay = Months.MAY.getDays();
        System.out.println("Days in May (before setting leap year): " + daysInMay);
        
        // what happens if you try setLeapYear on month other than feb?
        Months.MAY.setDays(); // build successful
        
        //what happened to May?
        daysInMay = Months.MAY.getDays();
        System.out.println("Days in May after setLeapYear: " + daysInMay);
        System.out.println("");
        
        // setLeapYear with February
        int daysInFeb = Months.FEBRUARY.getDays();
        System.out.println("Days in " + Months.FEBRUARY + 
                " (before setting leap year): " + daysInFeb);
        
        Months.FEBRUARY.setDays();
        daysInFeb = Months.FEBRUARY.getDays();
        System.out.println("Days in " + Months.FEBRUARY 
                + " after setLeapYear: " + daysInFeb);
        System.out.println("");
        
        // setLeapYear with February again
        Months.FEBRUARY.setDays();
        daysInFeb = Months.FEBRUARY.getDays();
        System.out.println("Days in " + Months.FEBRUARY 
                + " after setLeapYear 2nd time: " + daysInFeb);
        System.out.println("");
        
        // test Date object creation
        int year;
        Months month;
        int day;
        // how to get user string of month to enum 
        String strMonth = "December";
        // would compile but errors when run- "December"
        // try setting user string to uppercase before valueOf() method
        strMonth = strMonth.toUpperCase();
        Months decConstant= Months.valueOf(strMonth);
        
        System.out.println("Enum constant for " + strMonth + " is: "
                + decConstant);
        
        // test toString/object creation- shouldn't have to format month- already done by enum toString
        year = 1997;
        month = Months.DECEMBER;
        day = 26;
        Date birthday = new Date(day, month, year);
        System.out.println("Birthday is: " + birthday); 
        System.out.println("Birthday was during a leap year: " + birthday.isLeapYear());
        System.out.println("");
        // test toString/object creation with February
        month = Months.FEBRUARY;
        day = 14;
        Date valentinesDay = new Date(day, month, year);
        System.out.println("Valentine's Day was: " + valentinesDay); 
        System.out.println("Valentine's Day was during a leap year: " + birthday.isLeapYear());
        System.out.println("");
        
        // test without year
        Date day1 = new Date(day, Months.FEBRUARY);
        System.out.println("No year specified: "+ day1);
        // test without year and month
        Date day2 = new Date(day);
        System.out.println("No year or month specified: "+ day2);
        // test without year, month, and day
        Date day3 = new Date();
        System.out.println("No year, month, or day specified: "+ day3);
        System.out.println("");
        
        // test invalid feb date- it will still print- isValid will cover this
        Date day4 = new Date(30, month, year);
        System.out.println(day4);
        */ 
        //limit printing
        
    } // end of main method
} // end of driver class
