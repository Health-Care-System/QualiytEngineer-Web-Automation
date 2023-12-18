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



class dashboardSteps {
	@Given("I am on the dashboard page")
	def OnheDasboardPage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://fe-react-doctor-yjn3-nandorfn.vercel.app/login')

		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Email_email'), 'fdlhazizah25@gmail.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Doctor/input_Password_password'), 'i5Tq7bplk6M3iYVeKgBYPA==')

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Masuk'))
	}

	@When("I click lihat semua on article")
	def clickLihatSemua() {

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/a_Lihat Semua'))
	}

	@Then("I navigated article page")
	def navigateToArticlePage() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/h5_Kelola Artikel'))

		WebUI.closeBrowser()
	}

	@When("I click edit on daftar pasien")
	def clickEditPatient() {

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Edit'))
	}

	@Then("I can see pop up edit patient")
	def popUpEditPatient() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/h5_Edit'))

		WebUI.closeBrowser()
	}

	@When("I click mulai konsultasi")
	def clickMulaiKonsultas() {

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/a_Mulai Konsultasi'))
	}

	@Then("I navigated to chat pasien")
	def navigateToChatPasien() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/h5_Chat Pasien'))

		WebUI.closeBrowser()
	}
}