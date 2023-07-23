import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Assign_6_1 extends HttpServlet{
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{

response.setContentType("text/html");
PrintWriter out = response.getWriter();
LocalDateTime currentDateTime = LocalDateTime.now();
out.println("<html>");
out.println("<head>");
out.println("<title>WELCOME</title></head>");
out.println("<body style='background-color:aquamarine;'>");
out.println("<h1>Welcome to the page</h1>");
out.println("<p>Current Date and Time:"+ currentDateTime + "</p>");
out.println("</body></html>");
}
}