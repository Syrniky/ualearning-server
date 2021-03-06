package com.vntu.marenko.ualearning.server.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
public class HeadersFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader(
                "Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, PATCH, DELETE");
        httpServletResponse.setHeader(
                "Access-Control-Allow-Origin", "*");
        chain.doFilter(request, response);
    }
}
