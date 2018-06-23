package fa.ass1.controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@WebServlet("/AddFresher.html")
public class AddFresher extends Server {

    private String code;
    private String id;
    private String fullName;
    private String department;
    private String university;
    private String allQuizPoint;
    private String mockPoint;
    private String trainerComment;

    @Override
    public void sendResponse(HttpServletResponse resp) {
        // resq is a object json
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("AddFresher.jsp").forward(req, resp);

    }

    private void setParams() {
        // jsonObject=>code, id

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getParameterFromRequest(req);

        String query = " insert into fresher (code, id, fullName, department, university, allQuizPoint, mockPoint, trainerComment)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, code);
            preparedStatement.setString(2, id);
            preparedStatement.setString(3, fullName);
            preparedStatement.setString(4, department);
            preparedStatement.setString(5, university);
            preparedStatement.setString(6, allQuizPoint);
            preparedStatement.setString(7, mockPoint);
            preparedStatement.setString(8, trainerComment);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        sendResponse(resp);
    }

    @Override
    public void getParameterFromRequest(HttpServletRequest req) {
       

       // setParams();
        System.out.println(req.getCharacterEncoding());
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fullName = req.getParameter("fullName");

        System.out.println(req.getCharacterEncoding());
        System.out.println(fullName);
        code= req.getParameter("code");
        id= req.getParameter("id");
        department= req.getParameter("department");
        university= req.getParameter("university");
        allQuizPoint= req.getParameter("quizPoint");
        mockPoint= req.getParameter("mockPoint");
        trainerComment= req.getParameter("comment");
    }

}
