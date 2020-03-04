package org.hexa;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class JvmReport {
	public static void generateJvmReport(String jsonfile) {
		File loc=new File(System.getProperty("user.dir")+"src\\test\\resources\\Reporting");
		Configuration con= new Configuration(loc,"https://adactin.com/HotelApp/");
		con.addClassifications("os","windows 7");
		con.addClassifications("Browsername","chrome" );
		con.addClassifications("version", "80");
		con.addClassifications("sprint", "20");
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add("jsonfile");
		ReportBuilder builder =new ReportBuilder(jsonFiles,con);
		builder.generateReports();

	}
	
}
