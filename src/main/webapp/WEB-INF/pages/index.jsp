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
    <a type="button" href="${pageContext.request.contextPath}/create.html" class="btn btn-default"> Musteri Ekle </a>
    <a type="button" href="${pageContext.request.contextPath}/list.html" class="btn btn-default"> Musteri Listele </a>
    <a type="button" href="${pageContext.request.contextPath}/search.html" class="btn btn-default"> Musteri Ara </a>
    <a type="button" href="${pageContext.request.contextPath}/export/excel" class="btn btn-default"> Exel
        Raporu </a>
    <a type="button" href="${pageContext.request.contextPath}/export/pdf" class="btn btn-default"> Pdf Raporu </a>
</div>

</body>
</html>