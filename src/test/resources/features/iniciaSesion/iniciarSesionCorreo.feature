#language:es

Característica: Inicio de sesion

  Esquema del escenario: inicio de sesion usuario
    Dado Que estoy en la pagina principal de Opencart y me encuentro registrado
    Cuando acceda a la pantalla de inicio de sesion e ingresar mi <correo> y <contrasena>
    Entonces deberia poder ver la opcion de editar cuenta
  Ejemplos:
    | correo                     | contrasena |
    | qapruebasmobile3@gmail.com | 123456     |

