<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>
<head>
        <%--FAVICON--%>

        <%--JQUERY--%>
            <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">--%>
            <%--old jquery--%>
        <c:url value="/webjars/jquery/2.1.4/jquery.min.js" var="jquery" />
            <script src="${jquery}"></script>


        <%--BOOTSTRAP--%>

            <%--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>--%>
            <%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>--%>
            <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>--%>

        <%--old bootstrap --%>
            <%--<c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" var="bootstrapJS"/>--%>
            <%--<script src="${bootstrapJS}"></script>--%>
            <%--<c:url value="/webjars/bootstrap/3.3.4/css/bootstrap.min.css" var="bootstrapCSS"/>--%>
            <%--<link href="${bootstrapCSS}" rel="stylesheet" media="screen"/>--%>

        <%--bootswatch--%>
            <%--bootswatch paper--%>
                <%--<c:url value="../../static/css/bootswatch_paper.css" var="bootstrapCSS"/>--%>
                <%--<link href="${bootstrapCSS}" rel="stylesheet" media="screen"/>--%>

            <%--bootswatch darkly--%>
            <c:url value="/static/css/bootswatch_darkly.css" var="bootstrapCSS"/>
            <link href="${bootstrapCSS}" rel="stylesheet" media="screen"/>

            <%--bootswatch superhero--%>
                <%--<c:url value="../../static/css/bootswatch_superhero.css" var="bootstrapCSS"/>--%>
                <%--<link href="${bootstrapCSS}" rel="stylesheet" media="screen"/>--%>

            <%--bootswatch sandstone--%>
                <%--<c:url value="../../static/css/bootswatch_sandstone.css" var="bootstrapCSS1"/>--%>
                <%--<link href="${bootstrapCSS1}" rel="stylesheet" media="screen"/>--%>

        <%--CUSTOM JS--%>
            <c:url value="/static/js/common.js" var="common"/>
            <script src="${common}"></script>

        <%--CUSTOM CSS--%>
            <c:url value="/static/css/astonengineer.css" var="bootstrapCUSTOM" />
            <link href="${bootstrapCUSTOM}" rel="stylesheet" media="screen">

            <title>Aston Technonlgies HR Applicaion</title>

</head>
<body>


