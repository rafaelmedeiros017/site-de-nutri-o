<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="login.css">
    <title>NutreBem</title>
</head>
<body>
    <div class="main-login">
        <div class="left-login">
            <h1>NUTRIBEM<br>Vamos descobrir a sua melhor dieta</h1>
            <img src="animate.svg" class="left-login-image">
</div>
    <div class="right-login">
    <div class="card-login">
        <h1>LOGIN</h1>
        <div class="textfield">
            <label for="usuario">Usuário</label>
            <input type="text" name="usuario" placeholder="Usuário"> 
    </div>
    <div class="textfield">
        <label for="senha">Senha</label>
        <input type="password" name="senha" placeholder="Senha">
    </div> 
    <button class="btn-login">LOGIN</button>
    <button class="btn-cadastro"><a href="http://127.0.0.1:5500/Projeto%20final/cadastro.index.html">CRIAR NOVA CONTA</a></button>
    
        
</div>
</body>
<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+Display:ital,wght@0,100..900;1,100..900&display=swap');
body {
     margin: 0;
     font-family: 'Noto Sans', sans-serif;
}

body * {
    box-sizing: border-box;
}

.main-login{
    width: 100vw;
    height: 100vh;
    background-color: rgb(245, 245, 245);
    display: flex; 
    justify-content: center;
    align-items: center;

}

.left-login{
    width: 50vw;
    height: 100vh;
    display: flex; 
    justify-content: center;
    align-items: center;
    flex-direction: column;
}
.left-login > h1{
    font-size: 3ch;
    color:rgb(67, 107, 72)
    
    
}

.left-login-image{
    width: 35vw;
}

.right-login{
    width: 50vw;
    height: 100vh;
    display: flex; 
    justify-content: center;
    align-items: center;
}

.card-login{
    width: 40ch;
    display: flex; 
    justify-content: center;
    align-items: center;
    flex-direction: column;
    padding: 30px 35px;
    background-color: #589260;
    border-radius: 20px;
    box-shadow: 0px 10px 40px #00000056;
}

.card-login > h1{
    color: rgb(234, 245, 237);
    font-weight: 800;
    margin: 0;
}

.textfield{
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    justify-content: center;
    margin: 10px 0px;
}

.textfield > input{
    width: 100%;
    border: none;
    border-radius: 10px;
    padding: 15px;
    background: #cce7cffa;
    font-size: 12pt;
    box-shadow: 0px 10px 40px #00000056;
    outline: none;
    box-sizing: border-box;
}

.textfield > input:hover{
    background-color:  #acbeaffa;
        transition: 0.3s;
}

.textfield> label{
    color: #f0ffffde;
    margin-bottom: 10px;
}

.textfield > input::placeholder{
    color: #1e221efd
}

.btn-login{
    
    width: 100%;
    padding: 16px 0px;
    margin: 25px;
    border: none;
    border-radius: 8px;
    outline: none;
    text-transform: uppercase;
    font-weight: 800;
    letter-spacing: 3px;
    color:rgb(73, 138, 82)
    
}

.btn-login a{
    text-decoration: none;
    color: rgb(73, 138, 82)
}

.btn-login:hover{
    background-color: rgb(190, 190, 190);
    transition: 0.5s;
}

.btn-cadastro{
    width: 100%;
    padding: 16px 0px;
    margin: 25px;
    border: none;
    border-radius: 8px;
    outline: none;
    text-transform: uppercase;
    font-weight: 800;
    letter-spacing: 3px;
    color:rgb(73, 138, 82)
}

.btn-cadastro a{
    text-decoration: none;
    color: rgb(73, 138, 82)
    
}

.btn-cadastro:hover{
    background-color: rgb(190, 190, 190);
    transition: 0.5s;
}

@media only screen and (max-width: 950px){
    .card-login{
        width: 85%;
    }
}

@media only screen and (max-width: 600px){
      .main-login{
        flex-direction: column;
      }
      .left-login > h1{
        display: none;
      }

      .left-login{
        width: 100%;
        height: auto;
      }
      .right-login{
        width: 100%;
        height: auto;
      }
      .left-login-image{
        width: 50vw;
      }
      .card-login{
        width: 90%;
      }
}

 </style>  
</html>
