#language:es
#author: KevinHernandez

Característica: quiero registrar los goles de cada jugador

  @autenticacion

  Escenario: registrar goles

    Cuando ingrese la informacion en los campos de jugador y encuentro
      | idjugadorgoles | idencuentrogoles | cantidadgoles |
      | 4              | 27               | 3             |
    Entonces se crearan los goles visibles en otro modulos