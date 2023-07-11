#language: es

Característica: Validar Campos Formulario

  Antecedentes:
    Dado  Que la usuaria avanza hasta la pantalla de login


  Esquema del escenario: Escenario:Validar Campos vacios
    Cuando  no ingrese credenciales <correo> y <contrasena>
    Entonces deberia ver un mensaje de error indicando que se debe ingresar informacion
    Ejemplos:
      | correo | contrasena |
      |        |            |

  Esquema del escenario: Escenario:Validar correo no registrado
    Cuando ingreso un <correo> no registrado y una <contrasena>
    Entonces deberia ver un mensaje de error indicando que los datos no coinciden
    Ejemplos:
      | correo                    | contrasena |
      | qapruebasssscvb@gmail.com | 0000000    |

  Esquema del escenario: Escenario: Numero de intentos fallidos
    Cuando el usuario ingrese un <correo> y <contrasena> errados varias veces
#    Entonces deberia ver un mensaje de error indicando que se ha excedido el limite de intentos
    Ejemplos:
      | correo                  | contrasena |
      | qapruebasacxv@gmail.com | 123456     |