package fa.ass1.gui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayFresher.html")
public class DisplayFresher extends DisplayData{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("DisplayFresher.jsp").forward(req, resp);
    }
    @Override
    public void sendResponse(HttpServletResponse resp) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getParameterFromRequest(HttpServletRequest req) {
        // TODO Auto-generated method stub
        
    }

}
