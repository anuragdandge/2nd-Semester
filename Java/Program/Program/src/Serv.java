import java.io.IOException;
import java.io.PrintWriter;

public class Serv extends HttpServlet {

  private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      out.println("./api works. Try ./api/getMessage");
   }

}