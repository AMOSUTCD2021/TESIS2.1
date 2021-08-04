<%-- 
    Document   : mensaje
    Created on : 04/08/2021, 02:40:46 PM
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



</head>

<body>

    <div class="col-lg-12">
        <div class="row">
            <center><h1>No se puede dejar datos en blanco.....</h1></center>
            <hr>
            <img src="https://upload.wikimedia.org/wikipedia/commons/8/8d/Yarra_Night_Panorama%2C_Melbourne_-_Feb_2005.jpg">
        </div><!---end of row--->
    </div><!---end of col-12--->
    <!---page load popup_content---->
    <div id="popup_content_wrap" style='display:none'>
        <div id="popup_content">
            <center>
                <h1>Page Load popup</h1> 
                <p>Lorem ipsum dolor sit amet, onsectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et. Advertise your ads Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut laboreet.</p>
                <input type="submit" name="submit" value="Continue" class="btn btn-primary" onClick="popup_content('hide')" />
            </center>
        </div>
    </div>

    <form action="Controlador?accion=Salir" method="POST">
        <div class="container-fluid margin">
            <input type="submit" target="_blank" class="btn btn-lg btn-danger" value="Salir">
        </div>

    </form>

</body>
</html>
