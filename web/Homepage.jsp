<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:800i" rel="stylesheet">
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" type="text/css" href="css/materialize.min.css"/>
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <style>
            #header{
                background-image: url('img/cake2.jpg');
                background-size: cover;
                height: 50em;
            }

            #headerDescription{
                font-family: 'Open Sans', sans-serif;
                display: inline-block;
                font-size: 500%;
                margin-left: 1em;
                margin-top: 2em;
            }

            #content1{
                font-family: 'Abril Fatface', cursive;
                /*height: 50em;*/
            }
            
/*            #description1{
                color: white;
                
            }*/

            #img1{
                max-width: 100%;
                padding: 5em;
            }
            
            #placeHolder1{
                font-family: 'Abril Fatface', cursive;
                height: 20em;
            }
        </style>

    </head>
    <body>
        <jsp:include page="Navbar.jsp"></jsp:include>
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
                </div>
                <div class="col s5">
                    <img id="img1" src="img/red_velvet.jpg"/>
                </div>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
