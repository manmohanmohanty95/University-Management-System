/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author asuto
 */
public class NewServlet2 extends HttpServlet {

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
//        String name=request.getParameter("t1");
        int RollNo=Integer.parseInt(request.getParameter("RollNo"));
        String Firstname=request.getParameter("Firstname");
        String Lastname=request.getParameter("Lastname");
        String Username=request.getParameter("Username");
        int Age=Integer.parseInt(request.getParameter("Age"));
        long MobileNo=Long.parseLong(request.getParameter("MobileNo"));
        String Email=request.getParameter("Email");
        String Password=request.getParameter("Password");
        String Address=request.getParameter("Address");
        try (PrintWriter out = response.getWriter()) {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement","root","");
           PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?)");
           ps.setInt(1, RollNo);
           ps.setString(2, Firstname);
           ps.setString(3, Lastname);
           ps.setString(4, Username);
           ps.setInt(5, Age);
           ps.setLong(6, MobileNo);
           ps.setString(7, Email);
           ps.setString(8, Password);
           ps.setString(9, Address);
           int x=ps.executeUpdate();
           if(x>0){
               out.println("successfull");
           }
           else{
               out.println("unsuccessfull");
           } 
        }
        catch(Exception e){
           System.out.println(e);
        }
        out.close();
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
        processRequest(request, response);
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
