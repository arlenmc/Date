
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
        Months.MAY.setFeb(); // build successful
        
        //what happened to May?
        daysInMay = Months.MAY.getDays();
        System.out.println("Days in May after setLeapYear: " + daysInMay);
        System.out.println("");
        
        // setLeapYear with February
        int daysInFeb = Months.FEBRUARY.getDays();
        System.out.println("Days in " + Months.FEBRUARY + 
                " (before setting leap year): " + daysInFeb);
        
        Months.FEBRUARY.setFeb();
        daysInFeb = Months.FEBRUARY.getDays();
        System.out.println("Days in " + Months.FEBRUARY 
                + " after setLeapYear: " + daysInFeb);
        System.out.println("");
        
        // setLeapYear with February again
        Months.FEBRUARY.setFeb();
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
        
        // test toString/Date object creation- shouldn't have to format month- already done by enum toString
        year = 1997;
        month = Months.DECEMBER;
        day = 26;
        Date birthday = new Date(day, month, year);
        System.out.println("Birthday is: " + birthday); 
        // test isLeapYear method from Date Class
        System.out.println("Birthday was during a leap year: " + birthday.isLeapYear());
        System.out.println("");
        
        // test toString/Date object creation with February
        month = Months.FEBRUARY;
        day = 14;
        Date valentinesDay = new Date(day, month, year);
        System.out.println("Valentine's Day was: " + valentinesDay); 
        System.out.println("Valentine's Day was during a leap year: " + birthday.isLeapYear());
        System.out.println("");
        
        // test toString/Date object creation without year
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
        System.out.println("");
        */
        //1st test limit 
        
        // test Months numToMonth- GOOD
        int mNum1 = 0;
        int mNum2 = 1;
        int mNum3 = 3;
        int mNum4 = 11;
        int mNum5 = 12;
        int mNum6 = 13;
                
        Months testMonth;
        testMonth = Months.numToMonth(mNum1);
        System.out.println("should be null: " + testMonth);
        
        testMonth = Months.numToMonth(mNum2);
        System.out.println("should be Jan: " + testMonth);
        
        testMonth = Months.numToMonth(mNum3);
        System.out.println("should be March: " + testMonth);
        
        testMonth = Months.numToMonth(mNum4);
        System.out.println("should be Nov: " + testMonth);
        
        testMonth = Months.numToMonth(mNum5);
        System.out.println("should be Dec: " + testMonth);
        
        testMonth = Months.numToMonth(mNum6);
        System.out.println("should be null: " + testMonth);
        System.out.println("");
        
        // test Months increment
        Months startMonth = Months.JANUARY;
        System.out.println("month is Jan: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is Feb: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is March: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is April: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is May: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is June: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is July: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is August: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is September: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is October: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is November: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is December: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is January: " + startMonth);
        
        startMonth = startMonth.increment();
        System.out.println("month is February: " + startMonth);
        System.out.println("");
      
        // test Date Advance - good
        Date regular = new Date();
        Date newMonth = new Date(31, Months.MARCH);
        Date newYear = new Date(31, Months.DECEMBER);
        regular.advance();
        System.out.println("Should be Jan 2 2000: " + regular);
        newMonth.advance();
        System.out.println("Should be April 1 2000: " + newMonth);
        newYear.advance();
        System.out.println("Should be Jan 1 2001: " + newYear);
        
    } // end of main method
} // end of driver class
