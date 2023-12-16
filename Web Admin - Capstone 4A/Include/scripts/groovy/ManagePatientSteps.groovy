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



class ManagePatientSteps {
	
	
//	Scenario: Verify functionality of search bar
	@Given("I am on the manage patient page")
	def onTheManagePatientPage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')
		
		WebUI.setText(findTestObject('Object Login/input_Email_email'), 'adminsuperr@mail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Login/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')
		
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/button_Masuk'))
		
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/div_Pasien'))
	}
	
	@When("I search doc trans ID")
	def searchDocTransID() {
		WebUI.setText(findTestObject('search bar doc trans/input_Transaksi Konsultasi Dokter_searchDoctor'), '125')

		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/td_125'))
	}
	
	@And("I search med trans ID")
	def searchMedTransID() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Admin/input_Transaksi Pembelian Obat_searchMedicine'), '50')

	}
	
	@Then("I successfully searched")
	def validateSearchResult() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Admin/td_50'))
		WebUI.closeBrowser()
	}
	
	
	
//	Scenario: Verify functionality of search bar at data pasien	
	@When("I click data pasien")
	def clickPatientData() {
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('Object Repository/search bar data pasien/span_Data Pasien'))
	}
	
	@And("I search patient ID")
	def searchPatientID() {
		WebUI.setText(findTestObject('Object Repository/search bar data pasien/input_Daftar Pasien_search'), '111')
		
		WebUI.delay(5)
	}
	
	@Then("I successfully searched patient")
	def validateSearchPatient() {
		WebUI.click(findTestObject('Object Repository/search bar data pasien/td_111'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/search bar data pasien/td_111'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Admin acc payment confirmation doc trans
	@When("I click terima doc trans button")
	def clickTerimaDocTrans() {
		WebUI.maximizeWindow()
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Manage Patient Object/button_Terima'))
		
		WebUI.click(findTestObject('Object Repository/Manage Patient Object/reject doc trans/button_Tidak'))
		
		WebUI.click(findTestObject('Manage Patient Object/button_Terima'))
		
		WebUI.click(findTestObject('Object Repository/Manage Patient Object/reject doc trans/button_Ya'))
	}
	
	@Then("I successfully acc doc trans")
	def validateSuccessAccDocTrans() {
		WebUI.verifyElementVisible(findTestObject('Manage Patient Object/p_Diterima'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Admin acc payment confirmation med trans
	@When("I click terima med trans button")
	def clickTerimaMedTrans() {
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('Object Repository/acc med trans/button_Terima'))
		
		WebUI.click(findTestObject('Object Repository/acc med trans/button_Tidak'))
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/acc med trans/button_Terima'))
		
		WebUI.click(findTestObject('Object Repository/acc med trans/button_Ya'))
	}
	
	@Then("I successfully acc med trans")
	validateSuccessMedTrans(){
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/acc med trans/p_Diterima'))
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/acc med trans/p_Diterima'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Admin reject payment confirmation doc trans
	@When("I click tolak doc trans button")
	def clickTolakDocTrans() {
		WebUI.maximizeWindow()
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Manage Patient Object/reject doc trans/button_Tolak'))
		
		WebUI.click(findTestObject('Manage Patient Object/reject doc trans/button_Tidak'))
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Manage Patient Object/reject doc trans/button_Tolak'))
		
		WebUI.click(findTestObject('Manage Patient Object/reject doc trans/button_Ya'))
	}
	
	@Then("I successfully reject doc trans")
	def validateRejectDocTrans() {
		WebUI.delay(3)
		
		WebUI.verifyElementVisible(findTestObject('Manage Patient Object/reject doc trans/p_Ditolak'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Admin reject payment confirmation med trans
	@When("I click tolak med trans button")
	def clickTolakMedTrans() {
		WebUI.maximizeWindow()
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('New Folder/button_Tolak'))

		WebUI.click(findTestObject('New Folder/button_Tidak'))
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('New Folder/button_Tolak'))
		
		WebUI.click(findTestObject('New Folder/button_Ya'))
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('New Folder/p_Ditolak'))
	}
	
	@Then("I successfully reject med trans")
	def validateRejectMedTrans() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/reject med trans/p_Ditolak'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Admin view payment confirmation
	@When("I click link payment confirmation doc trans")
	def clickLinkPCDocTrans() {
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('Object Repository/Manage Patient Object/button_Link'))
		
		WebUI.click(findTestObject('Object Repository/Manage Patient Object/img'))
		
		WebUI.click(findTestObject('Object Repository/Manage Patient Object/button_Link'))
		
		WebUI.click(findTestObject('Object Repository/Manage Patient Object/img'))
	}
	
	@And("I Open med trans detail")
	def openMedTransDetail() {
		WebUI.click(findTestObject('Object Repository/open med trans/td_manual transfer bca'))
	}
	
	@Then("I click payment confirmation med trans")
	def clickPCMedTrans() {
		WebUI.click(findTestObject('Object Repository/open med trans/button_Link'))
		
		WebUI.click(findTestObject('Object Repository/open med trans/img'))
		
		WebUI.closeBrowser()
	}
	
	
}