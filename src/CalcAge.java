
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CalcAge {
	public int howOld(int year,int month,int day) {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DAY_OF_MONTH,day);

		SimpleDateFormat sdf=new SimpleDateFormat("yyyymmdd");

		int now =Integer.parseInt(sdf.format(new Date()));
		int birth=Integer.parseInt(sdf.format(cal.getTime()));

		return (int)((now-birth)/10000);
	}
}
