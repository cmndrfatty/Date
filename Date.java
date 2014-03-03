//start class
public class Date 
	{
	private int Month;
	private int Day;
	private int Year;
	
	//constructor
	
public Date( int MonthParameter, int DayParameter, int YearParameter )
{
	Month = MonthParameter;
	Day = DayParameter;
	Year = YearParameter;
}//end constructor

//set methods

void setMonth( int MonthParameter )
{
	Month = MonthParameter;
}

void setDay( int DayParameter )
{
	Day = DayParameter;
}
void setYear( int YearParameter)
{
	Year = YearParameter;	
}//end set methods

//get methods
int getMonth()
{
	return Month;
}
int getDay()
{
	return Day;
}
int getYear()
{
	return Year;
	}//end get methods

//display method
public void displayDate()
{
System.out.printf( "%d/%d/%d", getMonth(), getDay(), getYear() );
	} // end method displayDate
}//end class
