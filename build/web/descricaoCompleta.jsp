<%-- 
    Document   : index
    Created on : 10/04/2018, 15:10:56
    Author     : rodri
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.FilmesDAO"%>
<%@page import="Bean.Filmes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>MovieXon</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/portfolio-item.css" rel="stylesheet">
        <%
            String msg = "";
            if (request.getParameter("msg") != null) {
                msg = request.getParameter("msg");
            }
                        
            if(request.getParameter("id")== null)
                response.sendRedirect("index.jsp");
            
            String fil_nome = "", fil_sinopse = "", fil_genero = "", fil_poster = "", ses_id = "";
            int fil_id = 0, fil_ativo = 0, fil_duracao = 0, fet_id = 0;
            
            List<Filmes> lista = (new FilmesDAO()).selecionarEspecifico(Integer.parseInt(request.getParameter("id")));
            
            Filmes fil = new Filmes();
            fil = lista.get(0);

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

        <!-- Navigation -->
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

        <!-- Page Content -->
        <div class="container">

            <!-- Portfolio Item Heading -->
            <h1 class="my-4">Comprar Ingresso</small>
            </h1>

            <!-- Portfolio Item Row -->
            <div class="row">
                <div class="col-md-8">
                    <img src="<%=fil.getFil_poster()%>" alt="">
                </div>
                    <div class="col-md-4">
                    <h3><%=fil.getFil_nome()%></h3>
                    <p style="font-style:italic"><%=fil.getFil_sinopse()%></p>
                    <h3 class="my-3">Detalhes do Filme</h3>
                    <ul>
                        <li><b>Data de lançamento:</b> <%=fil.getFil_lancamento()%></li>
                        <li><b>Duração:</b> <%=fil.getFil_duracao()%> minutos</li>
                        <li><b>Gêneros:</b> <%=fil.getFil_genero()%></li>
                        <li><b>Faixa Etária:</b> <%=fil.getFet_id()%> Anos</li> 
                        <li><b>Sessões:</b>  <%=fil.getSes_id()%></li>

                    </ul>
                </div>               

            </div>
            <!-- /.row -->

            <!-- Related Projects Row -->
            <!-- /.row -->

        </div>
        <!-- /.container -->

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
