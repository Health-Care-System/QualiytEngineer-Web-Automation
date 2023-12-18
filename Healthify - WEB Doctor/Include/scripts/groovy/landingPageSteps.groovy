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


public class landingPageSteps {
	//	Scenario: Verify functionality of link Beranda
	@Given("I am on the healthify landing page")
	def onTheLandingPage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://healthify-reactapp.vercel.app/')

	}

	@When("I click text beranda")
	def clickBeranda() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify/a_Beranda'))

	}

	@Then("I navigated to home section")
	def navigatedHomeSection() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify/h1_Wujudkan Kesehatanmu Untuk Hidup Bahagia Kini Dan Nanti'))
	}


	//	Scenario: Verify functionality of link Tentang Kami
	@When("I click text tentang kami")
	def clickTentangKami() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify/a_Tentang Kami'))

	}

	@Then("I navigated to about section")
	def navigatedAboutSection() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify/h1_Wujudkan Hidup Sehat Bersama Healthify'))
	}


	//	Scenario: Verify functionality of link Layanan
	@When("I click text layanan")
	def clickLayanan() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify/a_Layanan'))

	}

	@Then("I navigated to service section")
	def navigatedServiceSection() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify/h1_Cari Obat-Obatan Online Tanpa Ribet'))
	}


	//	Scenario: Verify functionality of link FAQ
	@When("I click text FAQ")
	def clickFAQ() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify/a_FAQ'))

	}

	@Then("I navigated to FAQ section")
	def navigatedFAQSection() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify/h3_Frequently Asked Question'))
	}

	//	Scenario: Verify functionality of dropdown FAQ Apa itu Healthify?
	@And("I click FAQ Apa itu Healthify")
	def clickFAQ1() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify/button_Apa itu Healthify'))

	}

	@Then("I can see answer of the question")
	def seeAnswer() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify/p_Healthify adalah platform kesehatan yang menyediakan berbagai layanan, termasuk konsultasi dokter online, informasi kesehatan, dan akses ke apotek online'))
	}

	//	Scenario: Verify functionality of get application in google play button
	@When("I click get application button")
	def clickGetApp() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify/img_Wujudkan Kesehatanmu Untuk Hidup Bahagia Kini Dan Nanti_img-play'))

	}

	@Then("I navigated to google play")
	def navigatedGooglePlay() {
		WebUI.navigateToUrl('https://play.google.com/store/games?device=windows')

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify/a_google_logo Play'))
		
		WebUI.closeBrowser()
	}

}
