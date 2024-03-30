/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.LoginCredentialsValidator;
import za.ac.tut.model.LoginCredentialsValidator;

/**
 *
 * @author gee
 */
public class TheLoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TheLoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TheLoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String errorMessage;
        
        // Initialize the session 
        initializeSession(session);
        
        // Get form parameters
        String enteredUsername = (String) request.getParameter("username");
        String enteredPassword = (String) request.getParameter("password");
        
        // Get the username and password specified in the DD file
        String username=(String) getServletConfig().getInitParameter("username");
        String password=(String) getServletConfig().getInitParameter("password");
        
        // Get the admin name and email specified in the DD file
        String adminName = (String) getServletContext().getInitParameter("Name");
        String adminEmail = (String) getServletContext().getInitParameter("Email");
        String compName = (String) getServletContext().getInitParameter("comp_name");
        
        // Error message to be output in the error page specified in the DD file
        errorMessage = "Invalid username or password, please contact " + adminName + " at " + adminEmail;
        
        // Instantiate the object that performs the business logic
        LoginCredentialsValidator lcv = new LoginCredentialsValidator(enteredPassword,enteredUsername,username,password,errorMessage);
        
        // Perform the business logic
        String message = lcv.generateResponse();
       
        // Attach the data to the session object
        session.setAttribute("username", username);
        session.setAttribute("comp_name",compName);
        session.setAttribute("message", message);
        
        // Forward the data to the jsp
        RequestDispatcher disp = request.getRequestDispatcher("number_entry.jsp");
        disp.forward(request,response);
    }
    
    // A method that initializes the session
    private void initializeSession(HttpSession theSession){
        int numPalindromes = 0;
        int numNonPalindromes = 0;
        
        theSession.setAttribute("numPalindromes", numPalindromes);
        theSession.setAttribute("numNonPalindromes",numNonPalindromes);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
