package listenerDemo;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class ReportListener implements IReporter{
  @Test
  public void f() {
  }

public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	for(ISuite su:suites) {//for all suits
		  Map<String, ISuiteResult>result=su.getResults();
				  for (ISuiteResult sr : result.values()) {//for each test in the suite
			            ITestContext tc = sr.getTestContext();//getting all the results
			            System.out.println("Passed tests for suite "+ tc.getPassedTests().getAllResults().size());
			        System.out.println("Number of Failed tests"+tc.getFailedTests().getAllMethods().size());
			         System.out.println("Number of skipped tests"+  tc.getSkippedTests().getAllResults().size());
			            		//tc.getPassedTests().getAllResults().size());
		
			
		}
	}
}
}
