#language:es
#author: JavierPulido

Característica: quiero crear un jugador

  @autenticacion

  Escenario: crear un jugador

    Cuando ingrese la informacion del jugador
      | nombre       | documento  | nacimiento | contrasenajugador | correojugador | idequipo |
      | Lionel Messi | 1000624390 | 24/06/1987 | messi123          | messi@torneo  | 3        |
    Entonces se creara un jugador