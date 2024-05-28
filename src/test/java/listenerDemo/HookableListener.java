package listenerDemo;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class HookableListener implements IHookable{

	public void run(IHookCallBack callBack, ITestResult testResult) {
		
		Object[] dpl=callBack.getParameters();
		if(dpl[0].equals(2)) {
			System.out.println("2 is skipped");
		}else {
			callBack.runTestMethod(testResult);
		}
		
			
	}
 
}
