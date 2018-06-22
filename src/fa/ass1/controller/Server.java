package fa.ass1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.mysql.jdbc.Connection;

import fa.ass1.db.DatabaseManagement;

public abstract class Server extends HttpServlet {
    ///////get set for jsonObject
    public JSONObject jsonObject=null;
    public Connection con=DatabaseManagement.getConnection();
    
    public abstract void sendResponse(HttpServletResponse resp);
    
    public abstract void getParameterFromRequest(HttpServletRequest req);
    
}
