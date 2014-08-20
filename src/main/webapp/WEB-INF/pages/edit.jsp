<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="tr">
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


<div style="margin: 0px auto; width:50%; border:1px dotted #000;  /*background-color: red;*/ ">
    <div class="row dash-cols">
        <div class="col-sm-6 col-md-12">
            <div class="block-flat">
                <div class="content">
                    <form:form method="POST" action="/editCustomer" class="form-horizontal group-border-dashed"
                               style="border-radius: 0px;">

                        <c:forEach var="cust" items="${customers}">

                            <input type="hidden" name="id" value="${cust.id}"/>

                            <div class="form-group">
                                <label class="col-sm-4 control-label"> Musteri Bilgilerini Giriniz </label>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"> Tckn </label>
                                <div class="col-sm-10"><input name="tckn" value="${cust.tckn}" type="text"/></div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"> Adi </label>
                                <div class="col-sm-10"><input name="adi" value="${cust.adi}" type="text"/></div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"> Soyadi </label>
                                <div class="col-sm-10"><input name="soyadi" value="${cust.soyadi}" type="text"/></div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"> Unvani </label>
                                <div class="col-sm-10"><input name="unvani" value="${cust.unvani}" type="text"/></div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-5 control-label">
                                    <button type="submit" class="btn btn-primary"> Güncelle</button>
                                </label>
                            </div>
                        </c:forEach>

                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>