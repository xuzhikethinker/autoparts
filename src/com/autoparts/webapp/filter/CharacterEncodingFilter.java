package com.autoparts.webapp.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * User: Administrator
 * Date: 13-1-3
 * Time: 下午11:39
 * To change this template use File | Settings | File Templates.
 */
public class CharacterEncodingFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {

    }


}

