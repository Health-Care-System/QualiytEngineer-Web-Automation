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



class loginSteps {
	//	Scenario: Verify admin success login and logout
	@Given("I am on the login page")
	def onTheLoginPage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://fe-react-doctor-yjn3-nandorfn.vercel.app/login')

	}

	@When("I input valid email and password")
	def inputValidLoginData() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Email_email'), 'fdlhazizah25@gmail.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Doctor/input_Password_password'), 'i5Tq7bplk6M3iYVeKgBYPA==')

	}

	@And("I click button masuk")
	def clickButtonMasuk() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Masuk'))
	}

	@And("I am on the dashboard")
	def onTheDashboard() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_Dashboard'))
	}

	@Then("I click logout button")
	def clickLogoutButton() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/div_Logout'))

		WebUI.click(findTestObject('Object Repository/Page_dasboard/button_Ya logout'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/h3_Portal Dokter'))

		WebUI.closeBrowser()
	}


	//	Scenario: Verify admin failed login with empty email
	@When("I input valid password")
	def inputInvalidEmailFormat() {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Doctor/input_Password_password'), 'i5Tq7bplk6M3iYVeKgBYPA==')
	}


	@Then("I can see alert email must be fill")
	def validateFailedToLogin() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/p_Email wajib diisi'))

		WebUI.closeBrowser()
	}


	//	Scenario: Verify functionality of lupa kata sandi
	@When("I click lupa kata sandi button")
	def clickLupaKataSandiButton() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/a_Lupa Kata Sandi'))

	}

	@Then("I am on the lupa kata sandi page")
	def onTheLupaKataSandiPage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/h2_Lupa Password'))

		WebUI.closeBrowser()
	}

}