#language:es

Característica: Registro

  Esquema del escenario: Registro usuario
    Dado Que estoy en la pagina principal de Opencart e ingreso al registro
    Cuando ingreso los datos necesarios para realizar el registro <nombre>, <apellido>, <correo>,<celular>,<contrasena>,<confirmar_contrasena>
    Entonces deberia poder ver un mensaje indicando que que la cuenta fue creada
    Ejemplos:
      | nombre  | apellido | correo                    | celular    | contrasena | confirmar_contrasena |
      | prueba2 | prueba2  | pruebaqa12345@prueba.cokk | 1293323311 | 123456     | 123456               |