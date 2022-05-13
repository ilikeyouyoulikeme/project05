/* 王其康版权所有
 */
package com.wqk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service;
import java.io.IOException;

/**
 * @author wangqikang
 * @version 1.0
 */
@WebFilter("/demo06.do")
public class Demo6 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("gh");
    }
}
