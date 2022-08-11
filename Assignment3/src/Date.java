
public class Date {
private String month; 
private int day;
private int year;

public Date() {
this.month="January";
this.day=1;
this.year=1000;
}

public Date(String month,int day, int year) {
setDate(month,day,year);
}
public Date(int month, int day, int year) {
setDate(month,day,year);
}

public Date(int year) {
setDate(1,1,year);
}

public Date(Date aDate) {
if(aDate==null) {
System.out.println("Invalid date object");
}

else {
this.month=aDate.month;
this.day=aDate.day;
this.year=aDate.year;
}
}

public void setMonth(String month) {
if(monthOK(month))
this.month=month;

else
System.out.println("Invalid month");
}

public void setMonth(int month) {
if(monthOK(month))
this.month=monthString(month);

else
System.out.println("Invalid month");
}

public void setDay(int day) {
if(dayOK(day))
this.day=day;

else
System.out.println("Invalid day");
}

public void setYear(int year) {
if(yearOK(year))
this.year=year;

else
System.out.println("Invalid year");
}

public String getMonth() {
return month;
}

public int getDay() {
return day;
}

public int getYear() {
return year;
}

public boolean monthOK(String month) {
if(month.equals("January")||month.equals("February")||
month.equals("March")
||month.equals("April")||month.equals("May")||
month.equals("June")
||month.equals("July")||month.equals("August")|| 
month.equals("September")
||month.equals("October")||month.equals("November")||
month.equals("December"))
return true;

else
return false;
}

public boolean monthOK(int month) {
if(month>=1 && month<=12) {
return true;
}

else
return false;
}

public boolean dayOK(int day) {
if(day>=1 && day<=31)
return true;

else
return false;
}

public boolean yearOK(int year) {
if(year>=1000 && year<=9999)
return true;

else 
return false;
}

public boolean dateOK(String month, int day, int year) {
if(monthOK(month) && dayOK(day) && yearOK(year))
return true;

else
return false;
}

public boolean dateOK(int month, int day, int year) {
if(monthOK(month) && dayOK(day) && yearOK(year))
return true;

else
return false;
}

public void setDate(String month, int day, int year) {
if(dateOK(month,day,year)==true) {
this.month=month;
this.day=day;
this.year=year;
}

else
System.out.println("Error setting the date");
}

public void setDate(int month, int day, int year) {
if(dateOK(month,day,year)){
this.month=monthString(month);
this.day=day;
this.year=year;
}

else
System.out.println("Invalid date");
}

public String monthString(int month) {
switch(month) {
case 1:
return "January";
case 2:
return "February";
case 3:
return "March";
case 4:
return "April";
case 5:
return "May";
case 6:
return "June";
case 7:
return "July";
case 8:
return "August";
case 9: 
return "September";
case 10:
return "October";
case 11:
return "November";
case 12:
return "December";
default:
return "Error";
}
}

public String toString() {
return (getMonth()+" "+getDay()+", "+getYear());
}

public boolean equals(Date otherDate) {
if(this.month.equals(otherDate.month) && this.day==otherDate.day && 
this.year==otherDate.year)
return true;

else
return false;
}
}