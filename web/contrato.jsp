<%-- 
    Document   : contrato
    Created on : 06/08/2021, 04:37:49 PM
    Author     : Alvaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contrato</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="css/estiloformulario.css">
    </head>
    <style>
        body {
            background-color: #808080;
            background-image: url("https://b21importexport.com/wp-content/uploads/2020/05/WhatsApp-Image-2020-05-14-at-13.01.16-1080x675.jpeg");
        }

        .container {
            width: max-content !important;
        }
    </style>
    <body>
        <main class="page payment-page">
            <section class="payment-form dark">
                <div class="container">
                    <div class="block-heading">
                        <h2>Registro del contrato</h2>
                        <p>Por favor, complete los campos</p>
                    </div>
                    <form action="contratos" method="POST">
                        <div class="card-details">
                            <h3 class="title">Datos del contrato</h3>
                            <div class="row">
                                <%-- Campo para completar--%>

                                <%--
                                                                <label for="card-holder">Cliente</label> &nbsp &nbsp &nbsp  &nbsp <label for="card-holder">Fiscal del contrato</label>
                                                                <div class="form-row">
                                                                    <div class="col">
                                                                        <input type="text" name=clientetxt" class="form-control" placeholder="Nombre del cliente">
                                                                    </div>
                                                                    <div class="col">
                                                                        <input type="text" name=fiscaltxt" class="form-control" placeholder="Fiscal del contrato">
                                                                    </div>
                                                                     <div class="col">
                                                                        <input type="text" name=clientetxt" class="form-control" placeholder="Nombre del cliente">
                                                                    </div>
                                                                    <div class="col">
                                                                        <input type="text" name=fiscaltxt" class="form-control" placeholder="Fiscal del contrato">
                                                                    </div>

                                </div> --%>



                                <div class="form-group col-sm-12"> <%-- agregar espacio entre los labels &nbsp --%>
                                    <label for="card-holder">Nombre de cliente</label> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp  <label for="card-holder">Fiscal de contrato</label>
                                    <div class="input-group">
                                        <input id="card-holder" type="text" name="nombreclientetxt" class="form-control" placeholder="Cliente" aria-label="Card Holder" aria-describedby="basic-addon1">
                                        <span class="input-group-addon">-</span>
                                        <input id="card-holder" type="text" name="fiscaltxt" class="form-control" placeholder="Fiscal del contrato" aria-label="Card Holder" aria-describedby="basic-addon1">
                                    </div>
                                </div>

                                <div class="form-group col-sm-12">
                                    <label for="card-holder">Código de contrato</label>  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp   <label for="card-holder">Validéz</label>
                                    <div class="input-group">
                                        <input   id="card-holder" type="text" name="codigocontratotxt" class="form-control" placeholder="Código del contrato" aria-label="Card Holder" aria-describedby="basic-addon1">
                                        <span class="input-group-addon">-</span>
                                        <input   id="card-holder" type="text" name="valideztxt" class="form-control" placeholder="Validéz" aria-label="Card Holder" aria-describedby="basic-addon1">
                                    </div>
                                </div>                           

                                <div class="form-group col-sm-12">                               
                                    <label for="card-holder">Fecha de inicio </label>  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp <label for="card-holder">Fecha de final</label>
                                    <div class="input-group">
                                        <input   id="card-holder" type="text" name="fechainiciotxt" class="form-control" placeholder="Fecha de inicio" aria-label="Card Holder" aria-describedby="basic-addon1">
                                        <span class="input-group-addon">-</span>
                                        <input id="card-holder" type="text" name="fechafin" class="form-control" placeholder="Fecha de final" aria-label="Card Holder" aria-describedby="basic-addon1">
                                    </div>
                                </div>

                                <div class="form-group col-sm-12">                                
                                    <label for="card-holder">Tipo de contrato</label>  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp  &nbsp <label for="card-holder">Estado</label>
                                    <div class="input-group">
                                        <input   id="card-holder" type="text" name="tipocontratotxt" class="form-control" placeholder="Tipo de contrato" aria-label="Card Holder" aria-describedby="basic-addon1">
                                        <span class="input-group-addon">-</span>
                                        <input id="card-holder" type="text" name="estadotxt" class="form-control" placeholder="Estado" aria-label="Card Holder" aria-describedby="basic-addon1">
                                    </div>
                                </div>

                                


                                <%--Botones--%>
                                <div>
                                    <nav class="navbar navbar-dark navbar-expand-md navigation-clean-search">
                                        <ul class="nav navbar-nav">

                                            <li class="dropdown">
                                                <input type="submit" name="accion" target="_blank" class="btn btn-light action-button" value="Guardar">
                                            </li>

                                            <li class="dropdown">
                                                <input type="submit" name="accion" target="_blank" class="btn btn-light action-button" value="Modificar">
                                            </li>

                                            <li class="dropdown">
                                                <input type="submit" name="accion" target="_blank" class="btn btn-light action-button" value="Estado">
                                            </li>
                                            <a class="btn btn-light action-button" role="button" href="ventas.jsp">Salir</a>
                                        </ul>
                                    </nav>
                                </div>
                                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
                                <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>

                            </div>
                        </div> 
                    </form>
                </div>
            </section>
        </main>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</html>
