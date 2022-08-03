package org.stepdefine;

import java.util.Set;

import org.baseclass.baseclass;
import org.openqa.selenium.By;
import org.pojo.pojo;

import io.cucumber.java.en.*;

public class Stepdefine extends baseclass {

	public static pojo pojo;

	@Given("user Launch browser")
	public void user_Launch_browser() {
		launchBrowser();
		windowMax();
	}

	@When("user launch the flipkart web applicatons")
	public void user_launch_the_flipkart_web_applicatons() throws Exception {

		launchUrl(" https://www.flipkart.com/ ");
		Thread.sleep(3000);
		clk(pojo.getCancel());
	}
	
	@When("user enter  the product and click search Button")
	public void user_enter_the_product_and_click_search_Button() throws InterruptedException {
		
		pojo = new pojo();
		
		clk(pojo.getCancel());
		passText("iphone", pojo.getSearch());
		clk(pojo.getSearchbtn());
	}
	
	
	@Then("User select a particular product and added the product to the cart and checks wheather the product is added to the cart or not.")
	public void user_select_a_particular_product_and_added_the_product_to_the_cart_and_checks_wheather_the_product_is_added_to_the_cart_or_not() {
		
		pojo = new pojo();

		clk(pojo.getProduct());

		String windowParent = driver.getWindowHandle();
		Set<String> windowChild = driver.getWindowHandles();
		for (String x : windowChild) {

			if (!windowParent.equals(x))

			{
				driver.switchTo().window(x);
			}

			clk(pojo.getAddCartButton());
		}
		
		
	}

	@Then("User clicks place order Button and gets login to the application using valid credentials.")
	public void user_clicks_place_order_Button_and_gets_login_to_the_application_using_valid_credentials() throws Exception {
		pojo = new pojo();
		Thread.sleep(3000);
		
		clk(pojo.getPlaceOrderButton());
		passText(" 6383089678 ", pojo.getUserName());
		clk(pojo.getContinueBut());
		passText(" Jeeva@123 ", pojo.getPassword());
		clk(pojo.getLoginBut());

	}

	

	@Then("User enters the shipping address and clicks the payment option.")
	public void user_enters_the_shipping_address_and_clicks_the_payment_option() {
		pojo = new pojo();
		passText(" 6383089678 ", pojo.getUserName());
		clk(pojo.getContinueBut());
		passText(" Jeeva@123 ", pojo.getPassword());
		clk(pojo.getLoginBut());
		passText(" jeeva ", pojo.getAddName());
		passText(" 6383089678 ", pojo.getAddPhno());
		passText(" 620019", pojo.getAddPinCode());
		passText(" Trichy ", pojo.getAddAddressline2());
		passText(" 3/972-1 , Indragandhi nagar2nd street , kattur , trichy , Tamil Nadu ", pojo.getAddAddressline1());
		clk(pojo.getRadioButton1());
		clk(pojo.getSaveAddressBut());
		clk(pojo.getCofirmOrderBut());
	}

	@Then("User remove the product from the cart and check whether the product is removed or not")
	public void user_remove_the_product_from_the_cart_and_check_whether_the_product_is_removed_or_not() {
		pojo = new pojo();
		clk(pojo.getChangeOrderBut());
		clk(pojo.getRemoveproductBut());
		clk(pojo.getDeliveryBut());

	}

}