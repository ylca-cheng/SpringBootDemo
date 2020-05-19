package com.cheng.demo;

import com.cheng.demo.controller.ServletTest;
import com.cheng.demo.filter.TimeFilter;
import com.cheng.demo.listener.ListenerTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

@SpringBootApplication
public class SpringBootDemoApplication implements ServletContextInitializer{

    /**
     * 第三种注册自定义 Servlet、Filter 和 Listener的方式
     *  实现ServletContextInitializer接口
     * @param servletContext
     * @throws ServletException
     */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 配置 Servlet
		servletContext.addServlet("servletTest",new ServletTest()).addMapping("/servletTest");
		// 配置过滤器
		servletContext.addFilter("timeFilter",new TimeFilter()).addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
		// 配置监听器
		servletContext.addListener(new ListenerTest());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
