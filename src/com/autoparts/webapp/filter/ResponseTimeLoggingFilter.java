package com.autoparts.webapp.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autoparts.util.Timer;

public class ResponseTimeLoggingFilter implements Filter {
    private static final Logger logger = LoggerFactory
            .getLogger(ResponseTimeLoggingFilter.class);

    public void doFilter(final ServletRequest request,
                         final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        try {
            Timer timer = Timer.getTimer();
            timer.start();
            chain.doFilter(request, response);
            timer.stop();
            double time = timer.getElapsedMilliseconds();
            logger.info("Reponse completed in: {} ms to target page {}", time,
                    ((HttpServletRequest) request).getRequestURI());
            System.out.println("Reponse completed in: " + time + " ms - "
                    + ((HttpServletRequest) request).getRequestURI());
        } catch (Exception e) {
            System.out.println("ResponseTimeLoggingFilter exception");
            e.printStackTrace();
        }

    }

    @Override
    public void init(final FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }
}

