<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
        <link rel="shortcut icon" href="assets/ico/favicon.png">
    <title>School Help</title>
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
    <script src="assets/js/modernizr.custom.js"></script>
</head>
<body>
<f:view>

<h:form id="formularioLogin">

<table align="center">
<tr>
<td colspan="2" style="font-weight: bold; size: 20px;">Ingresa tu Usuario y tu Contraseña</td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Usuario : </td>
<td><h:inputText value="#{loginBean.usuario}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Password : </td>
<td><h:inputSecret value="#{loginBean.password}"/></td>
</tr>
<tr>
<td><input type="button" value="Cancelar" style="font-size: 14px; color: blue;"></td>
<td><h:commandButton value="Aceptar" action="#{loginBean.validarLogin}"  style="font-size: 14px; color: blue;"/></td>
</tr>
</table>

</h:form>
</f:view>
</body>
</html>
