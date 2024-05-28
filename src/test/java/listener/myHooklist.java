package listener;

import org.testng.annotations.Test;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class myHooklist implements IHookable {
	public void run(IHookCallBack callBack, ITestResult testResult) {

	Object[] parameterValues = callBack.getParameters();
//	System.out.println(parameterValues[0]);
	if (parameterValues[0].equals(1)) {
	System.out.println("Skip the required parameter"+parameterValues[0]);
	} else {
	callBack.runTestMethod(testResult);
	}
}
}
