

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation .WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvenNumberServlet
 */
@WebServlet("/EvenNumberServlet")
public class EvenNumberServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public EvenNumberServlet() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw;
        response.setContentType("text/html");
        pw=response.getWriter();

        int start=Integer.parseInt(request.getParameter("start"));
        int end=Integer.parseInt(request.getParameter("end"));

        if(start<end) {
            for(int index=start;index<=end;index++) {
                if(index%2==0) {
                    pw.println("<br>"+index);
                }
            }
        }
        else {
            pw.println("Start Value should be lesser than end value");
        }

    }

}
