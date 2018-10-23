package base;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
static ExtentReports reports;
	static	Date endDateTime;
	static String dateEndInString;
	
	public static ExtentReports getReporter(){
		if(reports == null) {

			endDateTime = new Date();
			DateFormat shortDf = DateFormat.getDateTimeInstance(3, 3);
			String currentDate = shortDf.format(endDateTime).toString().replace("/", "_");
			currentDate = currentDate.toString().replace(" ", "_");
			currentDate = currentDate.toString().replace(":", "_");
			dateEndInString = "" + currentDate;

			reports = new ExtentReports("Reports/ExecutionReports/TestReport"+dateEndInString+".html" , Boolean.valueOf(true));
			reports.addSystemInfo("Idexcel.com", "QA Enviroment");
			reports.addSystemInfo("Author ", "CYNC Automation QA");
			reports.loadConfig(new File("Reports/ExtentConfig.xml"));
	}
		return reports;

}
}