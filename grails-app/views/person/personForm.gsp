<html>
<head>
    <title></title>
    <meta name="layout" content="main"/>
</head>

<body>

<g:form name="myForm" url="[controller: 'Person', action: 'createNewPerson']">
    <label>Ім'я:</label> <g:textField name="name"/><br/>
    <label>Прізвище:</label> <g:textField name="surname"/><br/>
    <label>По-батькові:</label> <g:textField name="lastName"/><br/>
    <label>Електронна пошта:</label> <g:textField name="email"/><br/>
    <label>Номер телефону:</label> <g:textField name="phoneNumber"/><br/>
    <label>Місто:</label> <g:textField name="city"/><br/>
    <label>Адреса:</label> <g:textField name="address"/><br/>
    <label>Дата народження:</label> <g:datePicker name="birthDate" value="${new Date()}" noSelection="['':'-Вибрати-']"/>
    <label>Пароль:</label> <g:textField name="password"/><br/>
    <g:submitButton name="createNewPerson">Далі</g:submitButton>
</g:form>

</body>
</html>