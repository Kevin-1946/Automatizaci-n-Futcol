#language: es
#author: KevinHernandez

Característica: Creación de Torneo en FUTCOL
  Como administrador de FUTCOL
  Quiero crear un nuevo torneo
  Para gestionar las competencias deportivas

    Escenario: Crear torneo exitosamente
    Dado que el administrador ingresa a la plataforma FUTCOL
    Cuando inicia sesión con credenciales de administrador
    Y navega al menú de creación de torneos
    Y completa el formulario con los siguientes datos:
      | tipoTorneo | categoria | fechaInicio | fechaFin   | modalidad          | organizador | precio  | sede        |
      | Liga       | Juvenil   | 20-12-2025  | 25-01-2026 | Todos contra todos | Futcol      | 100.000 | Los yarumos |
    Entonces debería ver el mensaje de confirmación de creación exitosa