package listener;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class Replisten2 implements IReporter{
  public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		for(ISuite su:suites) {
			System.out.println("Name of the suite is :"+ su.getName());
			Map<String, ISuiteResult> res = su.getResults();
			for(ISuiteResult tr:res.values()) {
				
				System.out.println(tr.getTestContext().getFailedTests());
			}
			
		}
	}


}
