package listener;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
public class myinvocationListener implements IAnnotationTransformer{
	int counter=3;

	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod)
	{
	if (testMethod.getName().equals("finv")) {
	System.out.println("Changing invocation for the following method: " + testMethod.getName());
	testAnnotation.setInvocationCount(counter);

	

	}
  
	}
}
