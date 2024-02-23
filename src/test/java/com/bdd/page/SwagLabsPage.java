package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com")

public class SwagLabsPage extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameLabel;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordLabel;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement producto1Button;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement producto2Button;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement carritoButton;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameLabel;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameLabel;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipLabel;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continuarButton;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    WebElement graciasLabel;

    public void queAbreLaPaginaWebDemoBlazeEnElNavegador(String navegador) {
        Browser.Start(this, "chrome");
    }

    public void ingresoElUsername(String sUsername) {
        usernameLabel.sendKeys(sUsername);
    }

    public void ingresoElPassword(String sPassword) {
        passwordLabel.sendKeys(sPassword);
        loginButton.click();
    }

    public void agregoDosProductosAlCarritoDeCompras() {
        producto1Button.click();
        producto2Button.click();
    }

    public void seleccionoElCarritoDeCompras() {
        carritoButton.click();
        checkoutButton.click();
    }

    public void ingresoElFirstName(String sFirst) {
        firstNameLabel.sendKeys(sFirst);
    }

    public void ingresoElLastName(String sLast) {
        lastNameLabel.sendKeys(sLast);
    }

    public void ingresoElCodigoPostal(String sCodigo) {
        zipLabel.sendKeys(sCodigo);
        continuarButton.click();
    }

    public void realizoElCheckout() {
        Browser.Scroll(this, 600);
        finishButton.click();
    }

    public void alAcabarElProcesoDePagoDeberiaMostrarmeElMensajeThankYouForYourOrder() {
        try {
            getDriver().findElement(By.xpath("//h2[text()='Thank you for your order!']"));
            Assert.assertTrue("Thank you for your order!", true);
        }catch (Exception e) {
            Assert.fail("Error al comprar");
        }
    }
}
