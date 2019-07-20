package com.imufe.ws.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.imufe.ws.pojo.Category;
import com.imufe.ws.pojo.User;
import com.imufe.ws.service.CategoryService;
import com.imufe.ws.service.UserService;
import com.imufe.ws.service.impl.CategoryServiceImpl;
import com.imufe.ws.service.impl.UserServiceImpl;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
	    request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
	    response.getWriter().print("sadsadsasadasdsa");
		//request.setCharacterEncoding("UTF-8");//防止乱码   请求乱码处理
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//获取输入的验证码
		String code=request.getParameter("checkCode");
		String checkCode=(String)request.getSession().getAttribute("checkCode");
	    System.out.println("取到信息");
		System.out.println(username);//控制台打印
		System.out.println(password);//控制台打印
	    System.out.println(code);
	    System.out.println(checkCode);
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		UserService userServive=new UserServiceImpl(); 
		User dbUser=userServive.findByUsernameAndPassword(user);
				
		String errorMsg="";
		
		if(dbUser!=null && checkCode.equalsIgnoreCase(code)) {
	         System.out.println("登陆成功");
			//登录成功
			HttpSession session=request.getSession();
			session.setAttribute("user", dbUser);
			
			//获取category集合
			CategoryService categoryService=new CategoryServiceImpl();
			List<Category> list =categoryService.findAll();
			session.setAttribute("list", list);
			
			Cookie cookie=new Cookie("JSESSIONID", session.getId());
			cookie.setMaxAge(60);
			response.addCookie(cookie);

			response.sendRedirect("category.jsp");
			
		}else {
			//登录失败
	        System.out.println("登陆失败");
			errorMsg="用户名或密码错误";
			request.setAttribute("msg", errorMsg);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
//		.1response.getWriter().print(username);//页面输出用户名0
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
