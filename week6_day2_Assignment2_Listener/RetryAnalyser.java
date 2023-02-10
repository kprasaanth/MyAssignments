package week6_day2_Assignment2_Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{
	int count =0;
	public boolean retry(ITestResult result) {
		if(count <2) {
			count++;
			return true;
		}
		return false;
	}
	
	

}
