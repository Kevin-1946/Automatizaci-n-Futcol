#language:es
#author: JavierPulido

Característica: quiero crear un encuentro

  @autenticacion

  Escenario: crear un encuentro

    Cuando ingrese la informacion del encuentro
      | diaencuentro | horaencuentro | goleslocalencuentro | golesvisitanteencuentro |
      | 01/01/2025   | 10:00         | 1                   | 1                       |
    Entonces se creara un encuentro visible en otros modulos