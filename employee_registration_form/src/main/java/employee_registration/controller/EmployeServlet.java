package employee_registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee_registration.dao.EmployeeDao;
import employee_registration.model.Employee;


@WebServlet("/register")
public class EmployeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private EmployeeDao employeDao =new EmployeeDao();
    public EmployeServlet() {
    	super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	response.getWriter().append("Served at: ").append(request.getContextPath());
     RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/employeeregister.jsp");
     dispatcher.forward(request, response);
    }
  @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstName =request.getParameter("firstName");
	String lastName =request.getParameter("lastName");
	String username =request.getParameter("username");
	String password =request.getParameter("password");
	String address =request.getParameter("address");
	String contact =request.getParameter("contact");
	
	Employee employee = new Employee();
	employee.setFirstName(firstName);
	employee.setLastName(lastName);
	employee.setUsername(username);
	employee.setPassword(password);
	employee.setAddress(address);
	employee.setContact(contact);
	
	try {
		employeDao.registerEmployee(employee);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/employeedetails.jsp");
    dispatcher.forward(request, response);
	
}
  
}


