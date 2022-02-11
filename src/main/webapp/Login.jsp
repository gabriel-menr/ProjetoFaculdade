<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        #cornav {
            background-color: black;
        }

        #borda {
            border: solid black 3px;
            width: 100%;
            height: 451px;
            background-color: rgb(3, 3, 3);
            margin-top: 42px;
        }

        #titulo {
            text-align: center;
            margin-top: 60px;
        }

        #bordalogin {
            border: solid rgb(255, 255, 255) 3px;
            width: 40%;
            height: 230px;
            background-color: rgb(255, 255, 255);
            color: rgb(0, 0, 0);
            margin-left: 30%;
            margin-top: 60px;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark" id="cornav">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">UNICAR</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav" id="itensnav">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="login.html">login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="cadastro.html">cadastro</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="detalhes.html">detalhes</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div id="titulo">
        <h1>LOGIN</h1>
    </div>
    <div id="borda">
        <div id="bordalogin">
            <form id="login-form" class="form" action="login" method="post">
                <div class="form-group">
                    <label>Usuario:</label><br>
                    <input type="text" name="username" id="username" class="form-control">
                </div>
                <div class="form-group">
                    <label>Senha:</label><br>
                    <input type="text" name="password" id="password" class="form-control">
                </div>
                <div class="form-group">
                    <label><span>lembre-me</span> <span><input id="lembre-me" name="remember-me"
                                type="checkbox"></span></label><br>
                    <input type="submit" name="submit" class="btn btn-info btn-md" value="entrar">
                </div>
                <div id="register-link" class="text-right">
                    <a href="/cadastro.html">CADASTRE-SE</a>
                </div>
            </form>
        </div>
    </div>
</body>

</html>