package fa.ass1.gui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fa.ass1.controller.Server;

@WebServlet("/Display.html")
public abstract class DisplayData extends Server{
    protected int numRow;
    protected int numCol;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Display.jsp").forward(req, resp);
    }
}
