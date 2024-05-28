package listener;

import org.testng.IExecutionListener;
import org.testng.annotations.Test;

public class MyExectionListener implements IExecutionListener {
	public void onExecutionFinish() {
	long endTime= System.currentTimeMillis();
	System.out.println("Inform all the suite have finished execution at"+ endTime);

	}

	public void onExecutionStart() {
	long startTime= System.currentTimeMillis();
	System.out.println("Inform all the suite have started execution at"+ startTime);

	}
}
