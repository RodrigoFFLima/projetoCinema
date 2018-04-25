<%-- 
    Document   : cadastro_usuario
    Created on : 10/04/2018, 16:17:10
    Author     : rodri
--%>

<%@page import="DAO.ClientesDAO"%>
<%@page import="Bean.Clientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Cadastro de Usuario    </title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/portfolio-item.css" rel="stylesheet">
        <%
            String msg = "";
            if (request.getParameter("msg") != null) {
                msg = request.getParameter("msg");
            }

            String usu_nome = "", usu_email = "", usu_senha = "", usu_cpf = "", usu_telefone = "";
            int usu_id = 0;

            if (session.getAttribute("usu_id") != null) {
                //existe a sessão do codigo
                usu_id = (int) session.getAttribute("usu_id");
                Clientes cli = (new ClientesDAO()).selecionar(usu_id);

                if (cli != null) {
                    usu_nome = cli.getNome();
                    usu_email = cli.getEmail();
                    usu_senha = cli.getSenha();
                    usu_cpf = cli.getCpf();
                    usu_telefone = cli.getTelefone();
                }
            }

        %>
        <style>
            .footer {
                position:absolute;
                bottom:0;
                width:100%;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="#">MovieXon</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.jsp">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Sessões</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Ingressos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <br/>
        <div class="container">
            <h1>Cadastro</h1>
            <form name="form1" method="POST" action="SrvCliente">
                <div class="row">
                    <input type="hidden" id="usu_id" name="usu_id" value="<%=usu_id%>">
                    <div class="col-md-8 col-md-offset-2">
                        <label for="txtnome">Nome:</label>
                        <input class="form-control" type="text" name="txtnome" value="<%=usu_nome%>" id="txtnome" placeholder="Digite seu Nome" />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <label for="txtemail">Email: </label>
                        <input class="form-control" type="text" name="txtemail" value="<%=usu_email%>" id="txtemail" placeholder="Digite seu Email"  />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <label for="txtsenha">Senha: </label>
                        <input class="form-control" type="password" name="txtsenha" value="<%=usu_senha%>" id="txtsenha" placeholder="Digite sua Senha"  />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <label for="txtcpf">CPF: </label>
                        <input class="form-control" type="text" name="txtcpf" value="<%=usu_cpf%>" id="txtcpf" placeholder="Digite seu CPF"  />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <label for="txttelefone">Telefone: </label>
                        <input class="form-control" type="text" name="txttelefone" value="<%=usu_telefone%>" id="txttelefone" placeholder="Digite seu Telefone"  />
                    </div>
                </div>
                <div class="row">
                    <span class="text-info"><%=msg%></span>
                </div>
                <br/>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <input type="submit" class="btn btn-primary" value="Salvar" name="btnsalvar" />
                        <input type="submit" class="btn btn-danger" value="Sair" name="btnsair" />
                    </div>
                </div>
            </form>
        </div>
        <!-- Footer -->
        <footer class="footer py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; MovieXon 2018</p>
            </div>
            <!-- /.container -->
        </footer>


        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>

