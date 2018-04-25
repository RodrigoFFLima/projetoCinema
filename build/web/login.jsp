<%-- 
    Document   : login
    Created on : 10/04/2018, 15:11:06
    Author     : rodri
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Login    </title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/portfolio-item.css" rel="stylesheet">
        <%
            String msg = "";
            if (request.getParameter("msg") != null) {
                msg = request.getParameter("msg");
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
        <div class="row">
            <div class="container">
                <h1>Login</h1>
                <form name="form1" method="POST" action="SrvCliente">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-4">
                            <label for="txtcpf">CPF: </label>
                            <input class="form-control" type="text" name="txtcpf" value="" id="txtcpf" placeholder="CPF"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <label for="txtcpf">Senha: </label>
                            <input class="form-control" type="password" name="txtsenha" value="" id="txtsenha" placeholder="Senha"/>
                        </div>
                    </div>

                    <br/>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <span class="text-info"><%=msg%></span>
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <input type="submit" class="btn btn-success" value="Acessar" name="btnacessar" />
                            <input type="submit" class="btn btn-primary" value="Cadastrar" name="btncadastrar" />
                        </div>
                    </div>
                </form>
            </div>
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
