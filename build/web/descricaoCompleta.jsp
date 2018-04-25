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
        <!-- Custom Theme files -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- Custom Theme files -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Cinema Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--webfont-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <%
            String msg = "";
            if (request.getParameter("msg") != null) {
                msg = request.getParameter("msg");
            }

            if (request.getParameter("id") == null) {
                response.sendRedirect("index.jsp");
            }

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

    <body><!-- header-section-starts -->
        <div class="full">
            <div class="menu">
                <ul>
                    <li><a class="active" href="index.jsp"><i class="home"></i></a></li>
                    <li><a href="videos.html"><div class="video"><i class="videos"></i><i class="videos1"></i></div></a></li>
                    <li><a href="reviews.html"><div class="cat"><i class="watching"></i><i class="watching1"></i></div></a></li>
                    <li><a href="404.html"><div class="bk"><i class="booking"></i><i class="booking1"></i></div></a></li>
                    <li><a href="contact.html"><div class="cnt"><i class="contact"></i><i class="contact1"></i></div></a></li>
                </ul>
            </div>
            <div class="main">
                <div class="header">
                    <div class="top-header">
                        <div class="logo">
                            <a href="index.jsp"><img src="images/logo.png" alt="" /></a>
                            <p>Movie Theater</p>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="row" style="margin-right: 0px">
                        <div class="col-md-8" style="width: fit-content; height: 790px !important; background: url('<%=fil.getFil_poster()%>') no-repeat 0px 0px; background-size: cover; margin-left: 1%;"></div>
                        <div class="header-info" style="width: 32.3%; float: right; margin-right: 0px;">
                            <h1><%=fil.getFil_nome()%></h1>
                            <p class="age"><a href="#"><%=fil.getFet_id()%> Anos</a><a href="descricaoCompleta.jsp?id=<%=fil.getFil_id()%>"><i class="book1"></i>Comprar Ingresso</a></p>
                            <p class="review reviewgo"><b>Gêneros</b> : &nbsp;&nbsp; <%=fil.getFil_genero()%></p>
                            <p class="review"><b>Estreia</b> : &nbsp;&nbsp; <%=fil.getFil_lancamento()%></p>
                            <p class="review"><b>Duração</b> : &nbsp;&nbsp; <%=fil.getFil_duracao()%> minutos</p> 
                            <p class="review"><b>Sessões</b> : &nbsp;&nbsp; <%=fil.getSes_id()%></p>
                            <p class="special"><%=fil.getFil_sinopse()%></p>
                        </div>           

                    </div>
                </div>
                <div class="review-slider">
                    <div class="container">
                        <p class="m-0 text-center text-white">Copyright &copy; MovieXon 2018</p>
                    </div>
                    <!-- /.container -->
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
    </body>

</html>
