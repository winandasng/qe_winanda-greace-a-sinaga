import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ViewDetail {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigated to the Login Page V1")
	def openLoginPageV1() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill in (.*) then (.*) Field V1")
	def fillInFieldV1(String emailV1, String passwordV1) {
		
		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Email_input-18'), emailV1)

		WebUI.setText(findTestObject('Object Repository/Authentication/Login/Successful Login/Page_frontend-web/input_Password_input-21'), passwordV1)
	}
	
	@And("User click the Login Button V1")
	def clickLoginButtonV1() {
		WebUI.click(findTestObject('Object Repository/Homepage/Categories/Category Selection/Page_frontend-web/button_Login'))
	}
	
	@When("User click Detail Button on the product")
	def clickDetailV1() {
		WebUI.click(findTestObject('Object Repository/Homepage/View Detail/Detail of Item Page Access/Page_frontend-web/button_Detail'))
	}

	@Then("User successfully directed to Detail Page V1")
	def detailPageV1() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/View Detail/Detail of Item Page Access/Page_frontend-web/div_Sony PS5Rp 299 (3)'), 0)
		WebUI.closeBrowser()
	}
	
	@Then("User can view Costumer Ratings on Detail Page V2")
	def detailPageV2() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/View Detail/Customer Review/Page_frontend-web/div_(3)'), 0)
		WebUI.closeBrowser()
	}
}