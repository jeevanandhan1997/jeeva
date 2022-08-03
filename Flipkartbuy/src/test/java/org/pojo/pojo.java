package org.pojo;

import org.baseclass.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends baseclass {

	public pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}
	@FindBy(xpath = "//input[@class='_2IX_2-VJZDxU']")
	private WebElement userName;
	@FindBy(xpath = "//input[@class='_2IX_2-_3mctLh VJZDxU']")
	private WebElement password;
	@FindBy(xpath = " //button[@class='_2KpZ6l_2HKlqd _3AWRsL']']")
	private WebElement loginBut;

	
	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement search;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addCartButton;
	@FindBy(xpath = "//span[text()= 'Place Order']")
	private WebElement placeOrderButton;

	@FindBy(xpath = "//button[@class ='_2KpZ61_20xBvF _3AWRsL']")
	private WebElement continueBut;

	@FindBy(xpath = " //input [@name ='name']")
	private WebElement addName;

	@FindBy(xpath = " //input[@name ='phone']")
	private WebElement addPhno;
	@FindBy(xpath = " //input[@name ='pincode']")
	private WebElement addPinCode;
	@FindBy(xpath = " //input[@name='pincode']")
	private WebElement addPinCode1;
	@FindBy(xpath = " //input[@name='addressLine2']")
	private WebElement addAddressline2;
	@FindBy(xpath = " //textarea[@name='addressLine1']")
	private WebElement addAddressline1;
	@FindBy(xpath = " //span[text()='Home (All day delivery)']")
	private WebElement radioButton1;
	@FindBy(xpath = " //button[@class ='_ 2KpZ61 _1JDhFS _3AWRsL']")
	private WebElement saveAddressBut;
	@FindBy(xpath = " //button [@class= '_2KpZ61 _1seccl _3AWRSL']")
	private WebElement cofirmOrderBut;
	@FindBy(xpath = " //div[@class='_2ECO5T']")
	private WebElement deliveryBut;
	@FindBy(xpath = " //div[@class='_2ECO5T' ]")
	private WebElement changeOrderBut;
	@FindBy(xpath = " //span[ text()='Remove']")
	private WebElement removeproductBut;

	public WebElement getAddCartButton() {
		return addCartButton;
	}

	public void setProduct(WebElement product) {
		this.product = product;

	}

	public WebElement getProduct() {
		return product;

	}

	@FindBy(xpath = "product")

	private WebElement product;

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public void setSearchbtn(WebElement searchbtn) {
		this.Searchbtn = searchbtn;
	}

	public WebElement getCancel() {
		return cancel;

	}

	public WebElement getSearch() {
		return search;

	}

	public WebElement getSearchbtn() {

		return Searchbtn;

	}

	private WebElement Searchbtn;

	public void setPlaceOrderButton(WebElement placeOrderButton) {
		this.placeOrderButton = placeOrderButton;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public void setContinueBut(WebElement continueBut) {
		this.continueBut = continueBut;
	}
	
	public void setPassWord(WebElement password) {
		this.password = password;
	}
	
	public void setLoginBut1(WebElement loginBut) {
		this.loginBut = loginBut;
	}

	public void setaddName(WebElement addName) {
		this.loginBut = addName;
	}

	public void setaddPhno(WebElement addPhno) {
		this.loginBut = addPhno;
	}

	public void setAddPinCode(WebElement addPinCode) {
		this.addPinCode = addPinCode;
	}

	public void setAddAddressline2(WebElement addAddressline2) {
		this.addAddressline2 = addAddressline2;
	}

	public void setAddAddresslinel(WebElement addAddresslinel) {
		this.addAddressline1 = addAddresslinel;
	}

	public void setRadioButton1(WebElement radioButton1) {
		this.radioButton1 = radioButton1;
	}

	public void setSaveAddressBut(WebElement saveAddressBut) {

		this.saveAddressBut = saveAddressBut;
	}

	public void setCofirmOrderBut(WebElement cofirmOrderBut) {
		this.cofirmOrderBut = cofirmOrderBut;
	}

	public void setDeliveryBut(WebElement deliveryBut) {
		this.deliveryBut = deliveryBut;
	}

	public void setChangeOrderBut(WebElement changeOrderBut) {
		this.changeOrderBut = changeOrderBut;

	}

	public void setRemoveproductBut(WebElement removeproductBut) {
		this.removeproductBut = removeproductBut;
	}

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getContinueBut() {
		return continueBut;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBut() {
		return loginBut;
	}

	public WebElement getAddName() {
		return addName;
	}

	public WebElement getAddPhno() {
		return addPhno;
	}

	public WebElement getAddPinCode() {
		return addPinCode;
	}

	public WebElement getAddAddressline2() {
		return addAddressline2;
	}

	public WebElement getAddAddressline1() {
		WebElement addAddresslinel = null;
		return addAddresslinel;
	}

	public WebElement getRadioButton1() {
		return radioButton1;
	}

	public WebElement getSaveAddressBut() {
		return saveAddressBut;
	}

	public WebElement getCofirmOrderBut() {
		return cofirmOrderBut;
	}

	public WebElement getDeliveryBut() {
		return deliveryBut;
	}

	public WebElement getChangeOrderBut() {
		return changeOrderBut;
	}

	public WebElement getRemoveproductBut() {
		return removeproductBut;
	}
	
	
	

	public void setAddCartButton(WebElement addCartButton) {
		this.addCartButton = addCartButton;
	}
	

}
