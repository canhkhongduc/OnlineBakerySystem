
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="WEB-INF/jspf/header.jspf" %>
    </head>
    <body>
        <%@ include file="WEB-INF/jspf/navbar.jspf" %>
        <div class="row">
            <div class="col s4">

            </div>
            <form action="manualLogin" method="POST">
                <div class="col s8">
                    <div class="row"><h4>I have an account!</h4></div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="email" type="email" class="validate">
                            <label for="email" data-error="wrong" data-success="right">Email</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="password" name="password" type="password" class="validate">
                            <label for="password">Password</label>
                        </div>
                    </div>
                    <div class="row">
                        <p>
                            <input type="checkbox" class="filled-in" id="filled-in-box"/>
                            <label for="filled-in-box">Remember me!</label>
                        </p>
                    </div>
                    <div class="row">
                        <p>
                            Forgot your <a href="#">username</a> or<a href="#"> password</a>?
                        </p>
                    </div>
                    <div class="row">
                        <a href="manualLogin" class="medium waves-effect waves-light btn">Sign in</a>
                        <a href="#" class="medium waves-effect waves-light btn" style="margin-left: 2em;">Register</a>
                    </div>
                </div>
            </form>
        </div>
        <%@ include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
