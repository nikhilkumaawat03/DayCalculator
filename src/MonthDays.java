import java.util.*;
class MonthDays {
	private String month;
	private int year,date;

	public MonthDays() {
		System.out.println("");
	}
	static private int date_offset,year_offset,month_offset,century_offset;
       public MonthDays(String month,int year){
    	   this.month = month;
    	   this.year = year;
    	   month = month.toLowerCase();
    	   String months_name[] = {
    			   "january","february","march","april","may","june","july","august","september","october","november","december"
    	   };
    	   int months_no[] = {
    			   31,28,31,30,31,30,31,31,30,31,30,31
    	   };
    	   int months_offsets[] = {
    			  0,3,3,6,1,4,6,2,5,0,3,5 
    	   };
    	   for(int i=0;i<months_name.length;++i){
    		   if(month.equals(months_name[i])){
    			   System.out.println("Month is:"+month);
    			   month_offset = months_offsets[i];

    			   LeapYearCheck lyc1 = new LeapYearCheck();   			   
    			   if((lyc1.LeapYearCheck(year)==true)&&i==1)
    			   System.out.println("Number of days in month: 29");
    			   else
    				   System.out.println("Number of days in month: "+months_no[i]);
    				   break;
    		   }
    		   
    	   }
       }
	public void day(int date,int year,String month){
    	   this.date = date;
    	   System.out.println(date);
    	   this.year= year;
    	   System.out.println(year);
    	   date_offset = date%7;
      	 year_offset = ((year%100)+(year%100)/4)%7;
      	 System.out.println("Year off set is:"+year_offset);
      	 LeapYearCheck lyc = new LeapYearCheck();
      	 if(lyc.LeapYearCheck(year)==true&&(month=="january"||month=="february"))
      	 year_offset--;
      	 int temp = (year/100)%4;
      	 temp = year/100+(4-temp);
      	 temp = temp-1;
      	// if(year%100==0){
      		 century_offset = (temp-(year/100))*2;
      		 century_offset = century_offset%7;
      		 System.out.println("Century off set is:"+century_offset);
      	// }
      	 String week_days[] = {
      			 "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satuarday"
      	 };
      	 System.out.println("month offset is:"+month_offset);
      	 System.out.println("Century offset is: "+century_offset);
      	 System.out.println("Day off set is: "+date_offset);
      	 int final_day = (century_offset+year_offset+month_offset+date_offset)%7;
      	 System.out.println("Total is :"+(century_offset+year_offset+month_offset+date_offset));
      	 System.out.println(week_days[final_day]);
       }
}
