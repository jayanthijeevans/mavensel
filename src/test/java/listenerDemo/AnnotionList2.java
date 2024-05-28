package listenerDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class AnnotionList2 implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if(testMethod.getName().equals("first")) {
			annotation.setPriority(3);
		}
		
	}
  
}
