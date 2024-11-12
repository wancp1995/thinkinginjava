package com.example.demo.filter;



import jakarta.servlet.*;

import java.io.IOException;
import java.util.Date;

public class ConsumerTimerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("timer Filter begin");
        long start = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);
        long end = new Date().getTime();
        System.out.println("hello, timer Filter end, cost time: " + (end - start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
