package listenerDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class AnnList implements IAnnotationTransformer{

	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod) {
		if(testMethod.getName().equals("first")) {
		testAnnotation.setPriority(4);
		}
			
	}

}
