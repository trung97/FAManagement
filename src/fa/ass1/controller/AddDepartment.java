package fa.ass1.controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddDepartment.html")
public class AddDepartment extends Server {
    private String code;
    private String shortName;
    private String fullName;
   

    @Override
    public void sendResponse(HttpServletResponse resp) {
          //resq is a object json
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("AddDepartment.jsp").forward(req, resp);
        getParameterFromRequest(req);

        String query = " insert into department (code,fullName,shortName)"
                + " values (?, ?, ?)";
        
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, code);
            preparedStatement.setString(2, fullName);
            preparedStatement.setString(3, shortName);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        sendResponse(resp);
    }

    private void setParams() {
        //jsonObject=>code, id
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void getParameterFromRequest(HttpServletRequest req) {
        // StringBuffer in = new StringBuffer();
        // String line = null;
        // JSONParser parser = new JSONParser();
        //
        // try {
        // BufferedReader reader = req.getReader();
        // while ((line = reader.readLine()) != null) {
        // in.append(line);
        // }
        // jsonObject = (JSONObject) parser.parse(in.toString());
        //
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        setParams();
    }

}
