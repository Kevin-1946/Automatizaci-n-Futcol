#language:es
#author: JavierPulido

Característica: quiero crear un juez

  @autenticacion

  Escenario: crear un juez

    Cuando ingrese la informacion del juez
      | juez        | numerojuez | correojuez      |
      | John Useche | 3028299227 | juez@torneo.com |
    Entonces se creara un juez visible en otro modulos