import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {

    public void init() throws ServletException {
        System.out.println("init() called - servlet initialized...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        System.out.println("service() called - handling request");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Hello from lifecycle...</h2>");
    }

    public void destroy(){
        System.out.println("jestry() called -servlet if destroyed....");
    }
}