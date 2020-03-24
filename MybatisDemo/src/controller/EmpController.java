package controller;


import domain.Emp;
import service.EmpService;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class EmpController extends HttpServlet {
    private EmpService service = new EmpService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Emp emp = service.selectOne(7521);
        System.out.println(emp);
    }
}
