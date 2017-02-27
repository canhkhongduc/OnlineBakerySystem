
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="WEB-INF/jspf/header.jspf" %>
    </head>
    <body>
        <%@ include file="WEB-INF/jspf/navbar.jspf" %>
        <div id="header">
            <span id="headerDescription" class="green-text">Beautiful design<br>Exceptional taste</span>
        </div>

        <div id="placeHolder1" class="white">
            <div style="text-align: center; padding-top: 5em">
                <h2>Inspired to excel.</h2>
            </div>
        </div>

        <div id='content1' class="row white valign-wrapper">
            <div class="col s1"></div>
            <div class="col s6 black-text valign">
                <h3>THE RED VELVET CAKE</h3>
                <a class="black-text" href=""><i class="medium material-icons left">shopping_cart</i></a>
            </div>
            <div class="col s5">
                <img class="responsive-img" id="img1" src="resources/img/red_velvet.jpg"/>
            </div>
        </div>
        <div id='content2' class="row white valign-wrapper">
            <div class="col s1"></div>
            <div class="col s6 black-text valign">
                <h3>CUPCAKE MUFFIN</h3>  
                <a class="black-text" href=""><i class="medium material-icons left">shopping_cart</i></a>
            </div>
            <div class="col s5">
                <img id="img1" src="resources/img/muffin.jpg"/>
            </div>
        </div>
        <%@ include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
