package com.javalec.ex.lec08;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletL implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextInitialized");
	}

}
