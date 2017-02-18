class LeapYearCheck {
	private int year=0;
       public boolean LeapYearCheck(int year){
    	   if(year%4!=0||year%400!=0){
    		   return false;
 		  }
 		  else{
 			  return true;
 		  }
       }
}
