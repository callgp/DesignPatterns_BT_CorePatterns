package com.gp.patterns.interceptingfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class UserAgentFilter
 */
//@WebFilter("/userAgentFilter")
@WebFilter("/*")
public class UserAgentFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserAgentFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		
		String userAgentHeader = ((HttpServletRequest)request).getHeader("user-agent");
		System.out.println("user agent value is"+userAgentHeader);
		
		if(userAgentHeader.contains("Chrome")){
		// pass the request along the filter chain
		chain.doFilter(request, response);
		} else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("BadBrowser.jsp");
			dispatcher.forward(request,response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
