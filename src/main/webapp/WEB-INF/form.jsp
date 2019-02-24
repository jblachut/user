<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fomularz dodawania użytkowanika</title>
 <script

            src="https://code.jquery.com/jquery-2.2.4.min.js"

            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="

            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<%@ include file="/WEB-INF/navbar.jsp" %>
<div class="container">
    <div class="roow">
        <div class=" col-sm-offset-3 col-sm-6 col-xs-12">
    <form method="post"
     action="<c:url value="/users/form"/>"
     class="form-horizontal">

    <div class="form-group">
        <label for="imie" class="col-sm-2 control-label">Imię: </label>
        <div class="col-sm-10">
        <input  id="imie" type="text" class="form-control" placeholder="imie" name="firstName">
    </div>
    </div>

    <div class="form-group">
        <label for="nazwisko" class="col-sm-2 control-label">Nazwisko: </label>
        <div class="col-sm-10">
        <input id="nazwisko" type="text" class="form-control" placeholder="nazwisko" name="lastName">
    </div>
    </div>

    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">Email: </label>
        <div class="col-sm-10">
        <input id="email" type="email" class="form-control" placeholder="email" name="email">
    </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">Zapisz</button>
            <button type="reset" class="btn btn-primary">Reset</button>
        </div>
    </div>
</form>
        </div>
    </div>
</div>

</body>
</html>