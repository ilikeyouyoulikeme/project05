/* 王其康版权所有
 */
package com.wqk;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author wangqikang
 * @version 1.0
 */
@WebFilter("*.do")
public class FilterTest implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ab");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("cd");
    }

    public void destroy() {

    }
}
