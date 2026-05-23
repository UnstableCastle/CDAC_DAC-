<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt"%>

<html>
<head>
<title>Internationalization</title>

<c:set var="theLocale"
	value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" />

<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.app.mylabels" />

</head>

<body>

	<a href="index.jsp?theLocale=en_US">English(US)</a> |
	<a href="index.jsp?theLocale=es_ES">Spanish(ES)</a> |
	<a href="index.jsp?theLocale=de_DE">German(DE)</a> |
	<a href="index.jsp?theLocale=mr_IN">Marathi(IN)</a>

	<hr>

	<fmt:message key="label.greeting" />
	<br>
	<br>

	<fmt:message key="label.firstname" />
	: Unstable
	<br>
	<br>

	<fmt:message key="label.lastname" />
	: Castle
	<br>
	<br>

	<fmt:message key="label.welcome" />
	<br>
	<br>

	<hr>

	Selected Locale : ${theLocale}

</body>
</html>