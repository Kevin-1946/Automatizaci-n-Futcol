#language:es
#author: JavierPulido

Característica: quiero crear una inscripcion

  @autenticacion

  Escenario: crear una inscripcion

    Cuando ingrese la informacion de la inscripcion
      | idequipoinscripcion | idtorneoinscripcion | fechainscripcion | formadepago | estadodepago | valorinscripcion |
      | 25                  | 7                   | 01/01/2025       | efectivo    | realizado    | 1000             |
    Entonces se creara una inscripcion visible en otros modulos