package com.imufe.ws.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.imufe.ws.controller.UserCheck;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class CheckUsername
 */
@WebServlet("/CheckUsername")
public class CheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.print("Hello Ajax");
        // response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        // response.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        // response.getWriter().write("用户名为："+name+" 密码为："+password);
        UserCheck user = new UserCheck();
        user.setUsername(name);
        user.setPassword(password);
        JSONObject json = JSONObject.fromObject(user);
        String jsonStr = json.toString();
        // response.getWriter().wait();
        //testJson();
    }

    // @Test
    public void testJson() {
        UserCheck user = new UserCheck();
        user.setUsername("guanyu");
        user.setPassword("666");

        
        UserCheck user1=new UserCheck(); user1.setUsername("zhangfei");
        user1.setPassword("888"); UserCheck[]us=new UserCheck[2]; us[0]=user;
        us[1]=user1;
          
        JSONArray json=JSONArray.fromObject(us);
         

        //JSONObject json = JSONObject.fromObject(user);
        String jsonStr = json.toString();
        System.out.println(jsonStr);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
