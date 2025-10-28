#language:es
  #author: JavierPulido

Característica: como usuario de Saucedemo quiero autenticarme en el portal para luego hacer la compra de un producto

  @autenticacionS

  Escenario: Verificar la autenticacion exitosa en la pagina de Saucedemo

    Dado que el usuario ingrese a la pagina oficial de Saucedemo
    Cuando digite las credenciales validas por la web

      | username      | password     | firstname | lastname | postalcode        |
      | standard_user | secret_sauce | Javier    | Herrera  | San Cristobal Sur |

    Entonces se debe redirigir al usuario a la compra de un producto