package com.ui.listeners;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;

public class MyRetryAnalyzer implements IRetryAnalyzer
{
	//private static final int MAX_NUMBER_OF_ATTEMPS=Integer.parseInt(PropertiesUtil.readProperty(Env.QA,"MAX_NUMBER_OF_ATTEMPS"));
	private static int currentAttempt=1;
	
	private static final int MAX_NUMBER_OF_ATTEMPS=JSONUtility.readJSON(Env.QA).getMAX_NUMBER_OF_ATTEMPS();

	@Override
	public boolean retry(ITestResult result) {
		if(currentAttempt<=MAX_NUMBER_OF_ATTEMPS)
		{
			currentAttempt++;
			return true;
		}
		return false;
	}
	

}
