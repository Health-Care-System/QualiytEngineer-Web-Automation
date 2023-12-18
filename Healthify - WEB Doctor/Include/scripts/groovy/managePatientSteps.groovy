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



class managePatientSteps {
	@Given("I am on manage patient page")
	def OnMangeArticle() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://fe-react-doctor-yjn3-nandorfn.vercel.app/login')

		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Email_email'), 'fdlhazizah25@gmail.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Doctor/input_Password_password'), 'i5Tq7bplk6M3iYVeKgBYPA==')

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Masuk'))

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/div_Kelola Pasien'))
	}

	@When("I click button edit patient")
	def clickEditPatient() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Edit patient'))
	}

	@And("I edit patient detail and status with invalid format")
	def invalidFormatUpdateDataPatient() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Healthify Doctor/select_MenungguDiberi resepKonsultasi lanju_dcdb5b'),
				'recovered', true)
	}

	@And("I click simpan")
	def clickSimpan() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Simpan'))
	}

	@Then("I cant click button simpan")
	def verifyButtonSimpanCantBeClicked() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_BatalSimpan'))
		
		WebUI.closeBrowser()
	}

	@And("I edit patient detail and status with valid format")
	def validFormatUpdateDataPatient() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Aktif_title (1)'), 'Demam')

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Healthify Doctor/select_MenungguDiberi resepKonsultasi lanju_dcdb5b'),
				'recovered', true)

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Simpan'))
	}

	@Then("Patient data is updated")
	def verifyPatientDataIsUpdated() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_Anda berhasil mengubah data pasien'))
		
		WebUI.closeBrowser()
	}

	@When("I search patient name in search bar")
	def searchValidNamePatient() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Daftar Pasien_searchPatient'), 'fadlilah')
	}

	@Then("I can see patient data")
	def verifySuccessSearch() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/td_Fadlilah Azizah'))
		
		WebUI.closeBrowser()
	}

	@When("I search patient invalid name in search bar")
	def searchInvalidNamePatient() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Daftar Pasien_searchPatient'), 'fadi')
	}

	@Then("I can alert cant find data by keyword")
	def alertCantFindData() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/td_Data pasien dengan kata kunci fadi tidak ditemukan'))
		
		WebUI.closeBrowser()
	}
}