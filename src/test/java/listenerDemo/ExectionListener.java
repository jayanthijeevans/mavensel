package listenerDemo;

import org.testng.IExecutionListener;
import org.testng.annotations.Test;

public class ExectionListener implements IExecutionListener{
	public static Long starttime, endtime, duration;
  public void onExecutionStart() {
		// TODO Auto-generated method stub
	  endtime=System.currentTimeMillis();
	 // duration=endtime-starttime;
	  
		System.out.println("This is an action performed before suite, duration of suite: "+endtime);
	}

	public void onExecutionFinish() {
		starttime=System.currentTimeMillis();
		System.out.println("This is an action performed After suite"+starttime);
		// TODO Auto-generated method stub
		//IExecutionListener.super.onExecutionFinish();
	}


  
}
