<%@ include file="header.jsp" %>
<body>
    <%@ include file="navbarbefore.jsp" %>
    <div id='header'>
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
            <img class="responsive-img" id="img1" src="img/red_velvet.jpg"/>
        </div>
    </div>
    <div id='content2' class="row white valign-wrapper">
        <div class="col s1"></div>
        <div class="col s6 black-text valign">
            <h3>CUPCAKE MUFFIN</h3>  
            <a class="black-text" href=""><i class="medium material-icons left">shopping_cart</i></a>
        </div>
        <div class="col s5">
            <img id="img1" src="img/muffin.jpg"/>
        </div>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
