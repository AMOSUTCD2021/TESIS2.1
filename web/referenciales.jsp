<%-- 
    Document   : referenciales.jsp
    Created on : 07/06/2021, 02:07:25 PM
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Archivos referenciales</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <STYLE TYPE="text/css" MEDIA=screen>
            <!-- 
            html,body{
                background-image: url('https://cdn.hipwallpaper.com/m/62/20/4rKTDz.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                height: 100%;
                font-family: 'Numans', sans-serif;
                color: white;

                .custab{
                    border: 1px solid #ccc;
                    padding: 5px;
                    margin: 5% 0;
                    box-shadow: 3px 3px 2px #ccc;
                    transition: 0.5s;
                }
                .custab:hover{
                    box-shadow: 3px 3px 0px transparent;
                    transition: 0.5s;
                }
            }

            .margin{
                margin-top:-3px;    
                margin-bottom:0px;
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
                background: #0f8515;
                color: #ffffff !important;
                display: inline-block;
                font-size: 12px;
                font-weight: 500;
                height: 30px;
                line-height: 0.8;
                padding: 10px 20px;
                text-transform: capitalize;
                border-radius: 1px;
                letter-spacing: 0.5px;
                border:0px !important;
                cursor:pointer;
                border-radius:80px;

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


            .input-icons i {
                position: absolute;
            }

            .input-icons {
                width: 100%;
                margin-bottom: 10px;
            }

            .icon {
                padding: 10px;
                min-width: 40px;
            }



            --></style>

    </head>
    <body>
        <h3>Alta, baja, modificación de datos referenciales</h3>

        <nav class="navbar navbar-dark bg-clear"> 

            


            <form action="funcionario.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-info" value="Funcionario"><span class="glyphicon glyphicon-briefcase"></span>  -->  
                <button type="submit" enabled class="btn btn-lg btn-info" value="Funcionario"><i class="fa fa-briefcase"></i>Funcionario</button>
            </form>


            <form action="barrio.jsp" method="POST">  

            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-success" value="Barrio" >  <span class="glyphicon glyphicon-road"></span>   -->
                <button type="submit" enabled class="btn btn-lg btn-success"value="Barrio"><i class="fa fa-road"></i>Barrio</button>
            </form>


            <form action="ciudad.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-success" value="Ciudad"> <span class="glyphicon glyphicon-home"></span>    -->
                <button type="submit" enabled class="btn btn-lg btn-success"value="Ciudad"><i class="fa fa-home"></i>Ciudad</button>
            </form>
            
            <form action="departamento.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-success" value="Ciudad"> <span class="glyphicon glyphicon-home"></span>    -->
                <button type="submit" enabled class="btn btn-lg btn-success"value="departamento"><i class="fa fa-map"></i>Departemento</button>
            </form>

            <form action="pais.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-success" value="Pais"> <span class="glyphicon glyphicon-globe"></span>      --> 
                <button type="submit" enabled class="btn btn-lg btn-success"value="Pais"><i class="fa fa-globe"></i>Pais</button>
            </form>
            
            
            <form action="cliente.jsp" method="POST">                
             <!--   <input type="submit" target="_blank" class="btn btn-lg btn-warning" value="Cliente"> <span class="glyphicon glyphicon-lock"></span>    -->  
                <button type="submit" enabled class="btn btn-lg btn-warning"value="Cliente"><i class="fa fa-lock"></i>Cliente</button>
            </form>
            
            
            <form action="proveedor.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-warning" value="Proveedor"> <span class="glyphicon glyphicon-plane"></span>   -->
                <button type="submit" enabled class="btn btn-lg btn-warning"value="Proveedor"><i class="fa fa-plane"></i>Proveedor</button>
            </form>
            
            
            <form action="moneda.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Moneda"> <span class="glyphicon glyphicon-euro"></span>       --> 
                <button type="submit" enabled class="btn btn-lg btn-danger"value="Moneda"><i class="fa fa-dollar"></i>Moneda</button>
            </form>
            
            
            <form action="tipo_de_pago.jsp" method="POST">                
             <!--   <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Tipo de pago"> <span class="glyphicon glyphicon-star-empty"></span>   --> 
                <button type="submit" enabled class="btn btn-lg btn-danger"value="Tipo de pago"><i class="fa fa-euro"></i>Tipo de pago</button>
            </form>
            
            
            <form action="tipo_de_servicio.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-primary" value="Tipo de servicio técnico"> <span class="glyphicon glyphicon-wrench"></span>    --> 
                <button type="submit" enabled class="btn btn-lg btn-primary"value="Servicio tecnico"><i class="fa fa-wrench"></i>Tipo de Servicio Técnico</button>
            </form>
            
            <form action="contratos.jsp" method="POST">                
            <!--    <input type="submit" target="_blank" class="btn btn-lg btn-primary" value="Tipo de servicio técnico"> <span class="glyphicon glyphicon-wrench"></span>    --> 
                <button type="submit" enabled class="btn btn-lg btn-primary"value="contratos"><i class="fa fa-book"></i>Contratos</button>
            </form>
            
            <br>
            
            <form action="Principal.jsp" method="POST">
             <!--   <input type="submit" target="_blank" class="btn btn-lg btn-warning" value="Salir"><span class="glyphicon glyphicon-remove-circle"></span> -->
                <button type="submit" enabled class="btn btn-lg btn-warning"value="Salir"><i class="fa fa-undo"></i>Salir</button>
            </form>

            
        </nav>
        
        <div class="brand_logo_container">
            <img src="https://omni.com.py/img/logo.png" width="300" height="300" class="brand_logo" alt="Logo">
        </div>
    </body>
</html>
