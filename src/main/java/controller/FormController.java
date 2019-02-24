package controller;
import config.Database;
import dao.UserDao;
import domain.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/users/form")
public class FormController extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd =  req.getRequestDispatcher("/WEB-INF/form.jsp");
        rd.forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");

        User user= new User(firstName, lastName, email);
        UserDao userDao= new UserDao(new Database());
        try {
            userDao.save(user);
        }catch (SQLException e){
            e.printStackTrace();
        }
        resp.sendRedirect("/users");

    }
}
