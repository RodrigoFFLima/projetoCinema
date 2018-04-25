/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.Clientes;
import DAO.ClientesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rodri
 */
public class SrvCliente extends HttpServlet {

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
          
            //pagina de login
            try {
                if(request.getParameter("btnacessar")!=null)
                {
                    String cpf = request.getParameter("txtcpf");
                    String senha = request.getParameter("txtsenha");
                    if(!cpf.equals("") && !senha.equals("")){
                        Clientes cli = (new ClientesDAO()).logar(cpf, senha);
                        if(cli!=null)
                        {
                            HttpSession sessao = request.getSession();
                            sessao.setAttribute("usu_id", cli.getCodigo());
                            response.sendRedirect("index.jsp");
                            
                            
                        }
                        else
                        {
                            response.sendRedirect("login.jsp?msg=Usuario não encontrado!");
                        }
                    }
                    else
                        response.sendRedirect("login.jsp?msg=Informar CPF e/ou senha");
                }
                
                if(request.getParameter("btncadastrar")!= null)
                {
                    response.sendRedirect("cadastro_usuario.jsp");
                }
                
            } catch (Exception ex) {
                response.sendRedirect("login.jsp?msg=Erro! " + ex.getMessage());
            }
            
            //pagina de cadastro
            try {
                
                //clique do sair
                if(request.getParameter("btnsair")!=null)
                {
                    HttpSession sessao = request.getSession();
                    sessao.removeAttribute("usu_id");
                    response.sendRedirect("login.jsp");
                }
                
                //verificar se o botao salvar foi clicado
                if (request.getParameter("btnsalvar") != null) {
                    //validar
                    if (!request.getParameter("txtnome").equals("")
                            && !request.getParameter("txtcpf").equals("")) {
                        Clientes cli = new Clientes();
                        cli.setNome(request.getParameter("txtnome"));
                        cli.setCpf(request.getParameter("txtcpf"));
                        cli.setSenha(request.getParameter("txtsenha"));
                        cli.setTelefone(request.getParameter("txttelefone"));
                        cli.setEmail(request.getParameter("txtemail"));
                        
                        int codigo = Integer.parseInt(request.getParameter("usu_id"));
                        
                        if(codigo==0){
                        
                            (new ClientesDAO()).salvar(cli);
                        }
                        else
                        {
                            cli.setCodigo(codigo);
                            (new ClientesDAO()).salvar(cli);
                        }
                        
                            response.sendRedirect("index.jsp?msg=Dados Salvos! :D");
                    } 
                    else {
                        response.sendRedirect("cadastro_usuario.jsp?msg=Há campos incorretos!");
                    }
                }
            }
            catch(Exception ex)
            {
                response.sendRedirect("cadastro_usuario.jsp?msg=Erro!" + ex.getMessage());

            }
            
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