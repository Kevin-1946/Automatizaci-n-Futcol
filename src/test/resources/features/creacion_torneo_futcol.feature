#language: es
#author: KevinHernandez

Característica: Quiero crear un torneo

  @autenticacion

    Escenario: Crear torneo exitosamente

    Cuando rellena el formulario de torneo
      | tipoTorneo | categoria | fechaInicio | fechaFin   | modalidad          | organizador | precio  | sede                |
      | Liga       | Juvenil   | 20/12/2025  | 25/01/2026 | Todos contra todos | Futcol      | 100.000 | SENA - Complejo sur |
    Entonces creara un torneo visible en todos los modulos