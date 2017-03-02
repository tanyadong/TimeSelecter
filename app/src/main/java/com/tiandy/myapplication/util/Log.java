package com.tiandy.myapplication.util;

import android.app.Application;


public class Log  extends Application{

	@Override
	public void onCreate() {
		super.onCreate();
		CrashHandler crashHandler  = CrashHandler.getInstance();
		crashHandler.init(getApplicationContext());
	}


}
