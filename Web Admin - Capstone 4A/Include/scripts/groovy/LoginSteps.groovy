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



class LoginSteps {

	//	Scenario: Verify admin success login and logout
	@Given("I am on the login page")
	def onTheLoginPage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')

	}

	@When("I input valid email and password")
	def inputValidLoginData() {
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email'), 'adminsuperr@mail.com')
		
	}

	@And("I click button masuk")
	def clickButtonMasuk() {
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Masuk'))
	}

	@And("I am on the dashboard")
	def onTheDashboard() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/div_Dokter'))
	}

	@Then("I click logout button")
	def clickLogoutButton() {
		WebUI.click(findTestObject('Object Repository/New Folder (3)/p_Logout'))
		
		WebUI.click(findTestObject('Object Repository/New Folder (3)/button_Ya'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/button_Masuk'))

		WebUI.closeBrowser()
	}


	//	Scenario: Verify admin failed login with invalid email
	@When("I input invalid email and valid password")
	def inputInvalidEmail() {
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email'), 'salah@mail.com')
	}

	@Then("I can see alert invalid email")
	def validateAlertInvalidEmail() {
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/New Folder (4)/p_Email tidak terdaftar'))
		
		WebUI.closeBrowser()
	}


	//	Scenario: Verify admin failed login with invalid email format
	@When("I input invalid email format and valid password")
	def inputInvalidEmailFormat() {
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email'), 'salahmail.com')
	}
	

	@Then("I should be failed to login")
	def validateFailedToLogin() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/button_Masuk'))

		WebUI.closeBrowser()
	}
	
	
	//	Scenario: Verify functionality of lupa kata sandi
	@When("I click lupa kata sandi button")
	def clickLupaKataSandiButton() {
	  WebUI.click(findTestObject('Object Repository/New Folder (3)/label_Lupa Kata Sandi'))
	  
	}

	@Then("I am on the lupa kata sandi page")
	def onTheLupaKataSandiPage() {
	  WebUI.verifyElementVisible(findTestObject('Object Repository/New Folder (3)/p_Lupa Kata Sandi'))
	  
	  WebUI.closeBrowser()
	}

}