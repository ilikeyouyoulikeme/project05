/* 王其康版权所有
 */
package com.wqk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangqikang
 * @version 1.0
 */
@WebFilter("/demo05.do")
public class Demo05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ef");
        req.getRequestDispatcher("succ.html;").forward(req,resp);

    }
}
