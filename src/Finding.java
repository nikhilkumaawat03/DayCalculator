import java.util.*;
class Finding {
      private int year;
      private int date;
      private String month;
      boolean result;
      public Finding(String month, int year, int date){
    	  this.year = year;
    	  this.date = date;
    	  this.month = month;
    		 LeapYearCheck lyc = new LeapYearCheck();
    		 result = lyc.LeapYearCheck(year);
    		 if(result==true){
    			 System.out.println("Given year is an leap year");
    			 System.out.println("Number of days in leap year 366");
    		 }
    		 else{
    			 System.out.println("Given year is not an leap year");
    			 System.out.println("Number of days in year is 365");
    		 }
    	  if(month!=null){
    		  MonthDays md = new MonthDays(month,year);
    	  }
    	  if(date!=0){
    		  if(date>=31){
    			  System.out.println("Enter Valid Date");
    		  }
    		  else{
    			  System.out.println("Date is: "+date);
    			  MonthDays md1 = new MonthDays();
    			  md1.day(date, year, month);
    		  }
    	  }
    	  
         
      }
}
