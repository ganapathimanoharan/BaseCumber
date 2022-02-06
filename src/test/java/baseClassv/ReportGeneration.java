package baseClassv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	
	public static void generateJVMReports(String json) {

		File file =new File ("C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target");
		Configuration configuration = new Configuration(file, "AdactinPage");
		
		configuration.addClassifications("platform", "win-7");
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Browser Version", "93.098");
		configuration.addClassifications("Sprint no", "25");
		configuration.addClassifications("Environment", "QA Environment");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
		
	}

}
