package JuyangBai.Java;

/*
Output the date in multiple formats:
    MM/DD/YYYY
    June 14, 1992
    DDD YYYY

Overloaded constructors
1.  input: three integer values
    output: MM/DD/YYYY

2.  input: a string and two integers
    output: June 14, 1992

3.  input: two integer values
           first:  the day number in the year
           second: year
 */

public class Date {

    private static final int[] nonLeapDaysPerMonth =
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final int[] LeapDaysPerMonth =
            { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final String[] months =
            { "", "January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December" };

    private int day;
    private int month;
    private int year;
    private int dayNum;



    /*
        Constructors
     */
    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            for(int i = 0; i < month; i++)
            {
                this.dayNum += LeapDaysPerMonth[i];
            }
        } else {
            for(int i = 0; i < month; i++)
            {
                this.dayNum += nonLeapDaysPerMonth[i];
            }
        }
        this.dayNum += this.day;
    }

    public Date(String month, int day, int year)
    {
        for(int i = 0; i <= 12; i++)
        {
            if(month.equals(months[i]))
            {
                this.month = i;
            }
        }
        this.day = day;
        this.year = year;
        if (year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) {
            for(int i = 0; i < this.month; i++)
            {
                this.dayNum += nonLeapDaysPerMonth[i];
            }
        } else {
            for(int i = 0; i < this.month; i++)
            {
                this.dayNum += LeapDaysPerMonth[i];
            }
        }
        this.dayNum += this.day;
    }

    public Date(int dayNum, int year)
    {
        this.dayNum = dayNum;
        month = 1;
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            while(dayNum > LeapDaysPerMonth[month])
            {
                dayNum -= LeapDaysPerMonth[month];
                month++;
            }
        }
        else
        {
            while(dayNum > nonLeapDaysPerMonth[month])
            {
                dayNum -= nonLeapDaysPerMonth[month];
                month++;
            }
        }
        this.month = month;
        this.day = dayNum;
        this.year = year;
    }


    /*
           Output Methods
     */
    public String toForm1()
    {
        return String.format("%02d/%02d/%04d",this.month,this.day,this.year);
    }

    public String toForm2()
    {
        return String.format("%s %02d, %04d",months[this.month], this.day, this.year);
    }

    public String toForm3()
    {
        return String.format("%03d %04d", this.dayNum, this.year);
    }
}
