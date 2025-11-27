#language:es
#author: JavierPulido

Característica: quiero crear una sede

  @autenticacion

  Escenario: crear una sede

    Cuando ingrese la informacion en los campos
      | sede                | direccion                  |
      | SENA - Complejo sur | Av. Cra. 30 #17-28, Bogotá |
    Entonces se creara una sede visible en otro modulos