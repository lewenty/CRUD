<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
                    <form:form method="POST" action="/searchCustomer" class="form-horizontal group-border-dashed"
                               style="border-radius: 0px;">

                        <div class="form-group">
                            <label class="col-sm-4 control-label"> Musteri Bilgilerini Giriniz </label>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label"> <form:label path="tckn">Tckn</form:label> </label>

                            <div class="col-sm-10"><form:input path="tckn"/></div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label"> <form:label path="adi">Adi</form:label> </label>

                            <div class="col-sm-10"><form:input path="adi"/></div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label"> <form:label
                                    path="soyadi">Soyadi</form:label> </label>

                            <div class="col-sm-10"><form:input path="soyadi"/></div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label"> <form:label
                                    path="unvani">Unvani</form:label> </label>

                            <div class="col-sm-10"><form:input path="unvani"/></div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-5 control-label">
                                <button type="submit" class="btn btn-primary"> Ara </button>
                            </label>
                        </div>

                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>