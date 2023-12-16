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



class DashboardSteps {
	@Given("I am on the dashboard page")
	def onTheDashboardPage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Admin/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')
		
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Admin/input_Transaksi Pembelian Obat_searchMedicine'), 'adminsuperr@mail.com')
		
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/button_Masuk'))
	}
	
	@When("I click lihat semua button at patient table")
	def clickLihatSemuaPasienButton() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/a_Lihat Semua'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Admin/h5_Kelola Pasien'))
		
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/div_Dashboard'))
	}
	
	@And("I click lihat semua button at medicine table")
	def clickLihatSemuaMedicineButton() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/a_Lihat Semua_1'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Admin/h5_Kelola Obat'))
		
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/div_Dashboard'))
	}
	
	@And("I click lihat semua button at doctor table")
	def clickLihatSemuaDoctorButton() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/a_Lihat Semua_1_2'))
	}
	
	@Then("I am on the doctor page")
	def validateOnTheDoctorPage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Admin/h5_Kelola Dokter'))
		
		WebUI.closeBrowser()
	}

	
}

