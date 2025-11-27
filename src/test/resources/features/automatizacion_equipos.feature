#language:es
#author: JavierPulido

Característica: quiero crear un equipo

  @autenticacion

  Escenario: crear un equipo

    Cuando ingrese la informacion del equipo
      | equiponombre      |
      | Equipo Prueba F.C |
    Entonces se creara un equipo visible en otros modulos