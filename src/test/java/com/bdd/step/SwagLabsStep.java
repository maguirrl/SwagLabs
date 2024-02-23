package com.bdd.step;

import com.bdd.page.SwagLabsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SwagLabsStep extends ScenarioSteps {
    SwagLabsPage swagLabsStep;

    @Step
    public void queAbreLaPaginaWebDemoBlazeEnElNavegador(String navegador) {
        swagLabsStep.queAbreLaPaginaWebDemoBlazeEnElNavegador(navegador);
    }

    public void ingresoElUsername(String sUsername) {
        swagLabsStep.ingresoElUsername(sUsername);
    }

    public void ingresoElPassword(String sPassword) {
        swagLabsStep.ingresoElPassword(sPassword);
    }

    public void agregoDosProductosAlCarritoDeCompras() {
        swagLabsStep.agregoDosProductosAlCarritoDeCompras();
    }

    public void seleccionoElCarritoDeCompras() {
        swagLabsStep.seleccionoElCarritoDeCompras();
    }

    public void realizoElCheckout() {
        swagLabsStep.realizoElCheckout();
    }

    public void ingresoElFirstName(String sFirst) {
        swagLabsStep.ingresoElFirstName(sFirst);
    }

    public void ingresoElLastName(String sLast) {
        swagLabsStep.ingresoElLastName(sLast);
    }

    public void ingresoElCodigoPostal(String sCodigo) {
        swagLabsStep.ingresoElCodigoPostal(sCodigo);
    }

    public void alAcabarElProcesoDePagoDeberiaMostrarmeElMensajeThankYouForYourOrder() {
        swagLabsStep.alAcabarElProcesoDePagoDeberiaMostrarmeElMensajeThankYouForYourOrder();
    }
}
