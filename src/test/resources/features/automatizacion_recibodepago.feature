#language:es
#author: Camilo Goznalez

Característica: quiero crear un recibo de pago

  @autenticacion

  Escenario: crer un recibo de pago

    Cuando ingrese la informacion del recibo de pago
      | idinscripcion | idtorneorecibo | montorecibo | fecharecibo | metododepagorecibo | numerodecomprobante |
      | 24            | 28             | 1000        | 01/01/2025  | efectivo           | 123456              |
    Entonces se creara un recibo de pago visible en otros modulos