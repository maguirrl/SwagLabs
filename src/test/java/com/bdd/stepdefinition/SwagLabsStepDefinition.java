package com.bdd.stepdefinition;

import com.bdd.step.SwagLabsStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class SwagLabsStepDefinition {
    @Steps
    SwagLabsStep swagLabsStep;

    @Dado("^estoy en la pagina web Swag Labs \"([^\"]*)\"$")
    public void estoyEnLaPaginaWebSwagLab(String navegador) throws Throwable {
        swagLabsStep.queAbreLaPaginaWebDemoBlazeEnElNavegador(navegador);
    }

    @Y("^ingreso el Username \"([^\"]*)\"$")
    public void ingresoElUsername(String sUsername) throws Throwable {
        swagLabsStep.ingresoElUsername(sUsername);
    }

    @Y("^ingreso el Password \"([^\"]*)\"$")
    public void ingresoElPassword(String sPassword) throws Throwable {
        swagLabsStep.ingresoElPassword(sPassword);
    }

    @Y("^agrego dos productos al carrito de compras$")
    public void agregoDosProductosAlCarritoDeCompras() {
        swagLabsStep.agregoDosProductosAlCarritoDeCompras();
    }

    @Y("^ingreso el first name \"([^\"]*)\"$")
    public void ingresoElFirstName(String sFirst) throws Throwable {
        swagLabsStep.ingresoElFirstName(sFirst);
    }

    @Y("^ingreso el last name \"([^\"]*)\"$")
    public void ingresoElLastName(String sLast) throws Throwable {
        swagLabsStep.ingresoElLastName(sLast);
    }

    @Y("^ingreso el codigo postal \"([^\"]*)\"$")
    public void ingresoElCodigoPostal(String sCodigo) throws Throwable {
        swagLabsStep.ingresoElCodigoPostal(sCodigo);
    }

    @Y("^selecciono el carrito de compras$")
    public void seleccionoElCarritoDeCompras() {
        swagLabsStep.seleccionoElCarritoDeCompras();
    }

    @Cuando("^realizo el checkout$")
    public void realizoElCheckout() {
        swagLabsStep.realizoElCheckout();
    }

    @Entonces("^al acabar el proceso de pago deberia mostrarme el mensaje Thank you for your order!$")
    public void alAcabarElProcesoDePagoDeberiaMostrarmeElMensajeThankYouForYourOrder() {
        swagLabsStep.alAcabarElProcesoDePagoDeberiaMostrarmeElMensajeThankYouForYourOrder();
    }
}
