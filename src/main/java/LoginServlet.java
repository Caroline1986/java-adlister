//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
////        request.getRequestDispatcher("/login.jsp").forward(request, response);
////    }
//        HttpSession session = request.getSession();
//
//        request.setAttribute("error", session.getAttribute("error"));
//        request.getRequestDispatcher("/login.jsp").forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
//            IOException, ServletException {
////        if (request.getMethod().equalsIgnoreCase("post")) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        boolean validAttempt = username.equals("admin") && password.equals("password");
////            if (username.equals("admin") && password.equals("password")) {
//        HttpSession session = request.getSession();
//        if (validAttempt) {
//            session.setAttribute("isAdmin", true);
//            response.sendRedirect("/profile");
//        } else {
//            session.setAttribute("loginError", "Invalid");
//            response.sendRedirect("/login");
//        }
//    }
//}
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}