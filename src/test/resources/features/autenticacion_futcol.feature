#language:es
  #author: JavierPulido

Característica: como usuario de FutCol quiero autenticarme en la pagina web para luego hacer acceder a todas las funcionalidades de mi rol

  Escenario: Verificar la autenticacion exitosa en la pagina de FutCol

    Dado que el usuario se encuentra en la vista de inicio de sesion de FutCol
    Cuando ingrese las credenciales correctas de su rol (correo y contrasena)
      | correo           | contrasena |
      | admin@torneo.com | admin123   |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su página de inicio de sesion de FutCol