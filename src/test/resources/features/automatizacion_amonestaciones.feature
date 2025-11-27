#language:es
#author: KevinHernandez

Característica: quiero crear una tarjeta

  @autenticacion

  Escenario: crear una tarjeta

    Cuando rellena el formulario de amonestaciones

      | selectEncuentro         | selectJugador                  | equipoJugador  | numeroCamiseta |
      | Millonarios FC Santa Fe | Javier Pulido - Millonarios FC | Millonarios Fc | 7              |

    Entonces se creara una tarjeta