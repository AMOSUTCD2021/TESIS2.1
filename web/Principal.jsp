<%-- 
    Document   : Principal
    Created on : 05/08/2020, 09:33:50 AM
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <title>JSP Principal</title>
        <STYLE TYPE="text/css" MEDIA=screen>
            <!-- 
            html,body{
                background-image: url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                height: 100%;
                font-family: 'Christmas Holiday', sans-serif;
                color: white;
            }



            .margin{
                margin-top:10px;    
                margin-bottom:10px;
            }

            .themeBtn {
                background: #ff5c00;
                color: #ffffff !important;
                display: inline-block;
                font-size: 15px;
                font-weight: 500;
                height: 30px;
                line-height: 0.8;
                padding: 10px 20px;
                text-transform: capitalize;
                border-radius: 1px;
                letter-spacing: 0.5px;
                border:0px !important;
                cursor:pointer;
                border-radius:100px;

            }
            a:hover{
                color: #ffffff;
                text-decoration:none;
            }
            .themeBtn:hover {
                background: rgb(255, 92, 0);
                color: #ffffff;
                box-shadow: 0 10px 25px -2px rgba(255, 92, 0, 0.6);
            }
            .themeBtn2 {
                background: #7600ff;
                color: #ffffff !important;
                display: inline-block;
                font-size: 15px;
                font-weight: 500;
                height: 50px;
                line-height: 0.8;
                padding: 18px 30px;
                text-transform: capitalize;
                border-radius: 1px;
                letter-spacing: 0.5px;
                border:0px !important;
                cursor:pointer;
                border-radius:100px;

            }
            .themeBtn2:hover {
                background: rgb(118, 0, 255);
                color: #ffffff;
                box-shadow: 0 10px 25px -2px rgba(118, 0, 255, 0.6);
            }
            .themeBtn3 {
                background: #ff2e4d;
                color: #ffffff !important;
                display: inline-block;
                font-size: 15px;
                font-weight: 500;
                height: 30px;
                line-height: 0.8;
                padding: 10px 20px;
                text-transform: capitalize;
                border-radius: 1px;
                letter-spacing: 0.5px;
                border:0px !important;
                cursor:pointer;
                border-radius:100px;

            }
            .themeBtn3:hover {
                background: rgb(255, 46, 77);
                color: #ffffff;
                box-shadow: 0 10px 25px -2px rgba(255, 46, 77, 0.6);
            }
            .themeBtn4 {
                background: #006eff;
                color: #ffffff !important;
                display: inline-block;
                font-size: 15px;
                font-weight: 500;
                height: 30px;
                line-height: 0.8;
                padding: 10px 20px;
                text-transform: fullwidth;
                border-radius: 1px;
                letter-spacing: 0.5px;
                border:0px !important;
                cursor:pointer;
                border-radius:100px;

            }
            .themeBtn4:hover {
                background: rgb(0, 110, 255);
                color: #ffffff;
                box-shadow: 0 10px 25px -2px rgba(0, 110, 255, 0.6);
            }



            --></style>
        <link rel="stylesheet" href="css/style.css">
        
    </head>
    <body>


        <%@ page import="controller.muestraPagos" %>

        <nav class="navbar navbar-dark bg-dark">         
            <%-- <a style="color: white" class="navbar-toggler"><span class="navbar-toggler-icon"></span> PAGOS DE CUOTAS WEB </a> --%>


            <form action="referenciales.jsp" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Archivos Referenciales">
                </div>

            </form>
            
            <form action="usuarios.jsp" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Usuarios">
                </div>

            </form>

            <form action="consultaPrest.jsp" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Ventas">
                </div>

            </form>
            <form action="verTodos" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Cobranzas">
                </div>
            </form>

            <form action="verTodos" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Servicios">
                </div>
            </form>

            <form action="verTodos" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Compras">
                </div>
            </form>

            <form action="verTodos" method="POST">
                <div class="container-fluid  margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Importaciones">
                </div>
            </form>
            <form action="muestraPagos" method="POST">

                <div class="container-fluid margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Informes">
                </div>
            </form>
            <form action="Controlador?accion=Salir" method="POST">
                <div class="container-fluid margin">
                    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Salir">
                </div>

            </form>

        </nav>
        <div class="brand_logo_container">
            <img src="https://omni.com.py/img/logo.png" width="350" height="300" class="brand_logo" alt="Logo">
        </div>
        <br>
        <div class="container mt-4">
            <h1>Bienvenido al sistema usuario......<strong> ${usuar}</strong>  </h1>
        </div>

    </body>
</html>
