import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/AtmSearchServlet"})
public class AtmSearchServlet extends HttpServlet {
  
 
	private DBUtils dbUtils;
    
	public AtmSearchServlet() {    
        dbUtils = new DBUtils();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);
 
        System.out.println("*** doGet() ***"+request.getParameter("zipcode") + " state: "+request.getParameter("state")+ " city: "+request.getParameter("city"));
        
        String strCity = request.getParameter("city");
        String strState = request.getParameter("state");
        String strZip = request.getParameter("zipcode");
        
        String errorString = null;
        List<ATMLocations> list = null;
        try {
            list = dbUtils.queryATMLocations(conn,  strCity, strState, strZip);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        // Store info in request attribute, before forward to views
        request.setAttribute("errorString", errorString);
        request.setAttribute("atmLocations", list);
                 
        // Forward to /WEB-INF/views/atmLocationsView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/atmLocationsView.jsp");
        dispatcher.forward(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    
   
    
}
