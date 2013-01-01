package com.autoparts.webapp.filter;

import java.io.IOException;
import javax.faces.application.ViewExpiredException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.autoparts.webapp.exceptions.SiteRuntimeException;

public class ExceptionFilter implements Filter {
    private static final String REQUEST_KEY = "EXCEPTION_FILTER_KEY";

    public void init(final FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    public void doFilter(final ServletRequest request,
                         final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        try {
            chain.doFilter(request, response);
        } catch (ServletException e) {
            System.out.println("-------------E444xceptionFilter ServletException ---------------");
            e.printStackTrace();
//			System.out.println("-------------ExceptionFilter Throwable ---------------");
//			e.printStackTrace();
//			if (ExceptionUtils.getRootCause(e) instanceof ViewExpiredException) {
//				System.out.println("-------------ViewExpiredException ---------------");
//				HttpServletRequest req = (HttpServletRequest) request;
//				RequestDispatcher dispatcher = req.getRequestDispatcher("");
//				dispatcher.forward(request, response);
//			} else {
//				request.setAttribute(REQUEST_KEY, e);
//				throw new SiteRuntimeException(e);
//			}
        }
    }
}

