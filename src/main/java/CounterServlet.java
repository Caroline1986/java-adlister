import jdk.internal.org.objectweb.asm.tree.InsnList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@WebServlet(name = "ShowStudentServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;
    private Object prompt;
    private Scanner scanner;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter += 1;
        response.setContentType("text/html");
        response.getWriter().println("<h1>You visitor number " + counter + ".</h1>");
        PrintWriter out = response.getWriter();

        String reset = request.getParameter("reset");
        out.println("Yay or Nay?" + reset);

        String yesNo = request.getParameter("yesNo" + counter);

        String userInput = this.scanner.next();
        out.println(userInput.trim().equalsIgnoreCase("yay") || userInput.trim().toLowerCase().equals("y"));

    }
}
