<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Musteri Islemleri </title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <style type="text/css">
        .bs-example {
            margin: 20px;
        }
    </style>
</head>
<body>
<div class="btn-group">
    <a type="button" href="${pageContext.request.contextPath}/" class="btn btn-default"> Ana Sayfa </a>
</div>
<hr/>


<div style="padding: 30px; width: 90%; /*background-color: red;*/">
    <h5>Musteri Listesi</h5>
    <table id="example" class="table table-striped table-bordered" cellspacing="0" width="80%"
           style="margin:auto;">
        <thead>
        <tr>
            <th>Id</th>
            <th>Adi</th>
            <th>Soyadi</th>
            <th>Tckn</th>
            <th>Unvani</th>
            <th>#</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="shop" items="${customers}">

            <tr>
                <td>${shop.id}</td>
                <td>${shop.adi}</td>
                <td>${shop.soyadi}</td>
                <td>${shop.tckn}</td>
                <td>${shop.unvani}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/edit/${shop.id}.html"> <img title="Edit"
                                                                                            src="https://cdn3.iconfinder.com/data/icons/simplius-pack/512/pencil_and_paper-16.png"/></a>
                    <a href="${pageContext.request.contextPath}/delete/${shop.id}.html"><img title="Delete"
                                                                                             src="https://cdn2.iconfinder.com/data/icons/peppyicons/512/cancel-16.png"/></a>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
