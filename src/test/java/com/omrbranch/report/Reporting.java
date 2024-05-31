package com.omrbranch.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
	public static void generateReports(String json) throws FileNotFoundException, IOException {
		File file = new File(getProjectPath()+getPropertyValue("reportPath"));
		Configuration configuration = new Configuration(file, "Omr Hotel Booking Automation ");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("OS", "WIN 11");
		configuration.addClassifications("Name", "Srinivasu A");
		configuration.addClassifications("Trainer", "Velmurugan Sir");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(json);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
	}



}
