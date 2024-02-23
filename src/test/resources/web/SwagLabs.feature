#language: es

@FEATURE_SWAGLAB
Característica: Compra de productos
  Como cliente quiero comprar productos
  Para poder usarlos

  @SWAGLAB_COMPRAR_2PRODUCTOS
  Esquema del escenario: Realizar compra de productos
    Dado estoy en la pagina web Swag Labs "<NAVEGADOR>"
    Y ingreso el Username "<sUsername>"
    Y ingreso el Password "<sPassword>"
    Y agrego dos productos al carrito de compras
    Y selecciono el carrito de compras
    Y ingreso el first name "<sFirst>"
    Y ingreso el last name "<sLast>"
    Y ingreso el codigo postal "<sCodigo>"
    Cuando realizo el checkout
    Entonces al acabar el proceso de pago deberia mostrarme el mensaje Thank you for your order!

    Ejemplos:
      | NAVEGADOR | sUsername     | sPassword    | sFirst | sLast   | sCodigo |
      | chrome    | standard_user | secret_sauce | Mark   | Aguirre | 13013   |