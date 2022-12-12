package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listener {
	public class Listner implements ITestListener{
		
		@Override
		public void onTestSuccess(ITestResult result)
		
		{       String methodname = result.getName();
			Reporter.log("TC "+methodname+" is completed successfuly",true);
			Reporter.log("TC is completed successfully",true);
		}
		@Override
		
		public void onTestFailure(ITestResult result) 
		{
			Reporter.log("TC "+result.getName()+"is failed",true);
		}
		
	    @Override
		
		public void onTestSkipped(ITestResult result) 
		{
	    	Reporter.log("TC"+result.getName()+"is Skipped",true);
	    	
		}
	}
}
