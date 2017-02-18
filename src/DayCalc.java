import java.util.*;
class DayCalc {
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	System.out.println("Instructions:\n");
    	System.out.println("1.Maximum year is upto 9999");
    	System.out.println("2.First enter year then month then date\n");
    	System.out.println("3.There should be space in between year,month and date");
    	String info = in.nextLine();
    	String arr[] = new String[3];
    	int i=0;
    	StringTokenizer st = new StringTokenizer(info);
    	while(st.hasMoreTokens()){
    		arr[i] = st.nextToken();
    		i++;
    	}
    	i--;
    	Integer year = new Integer(arr[0]);
    	//System.out.println("Given year is:"+year);
    	String month = arr[1];
        Integer date=0;
    	if(i==2){
    	date = new Integer(arr[2]);
    	//System.out.println("Given Date is:"+date);
    	}
    	if(year==0){
    		System.exit(0);
    	}
		Finding f = new Finding(month,year,date);
    }
}
