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



class articleSteps {
	@Given("I am on kelola artikel page")
	def OnMangeArticle() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://fe-react-doctor-yjn3-nandorfn.vercel.app/login')

		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Email_email'), 'fdlhazizah25@gmail.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Doctor/input_Password_password'), 'i5Tq7bplk6M3iYVeKgBYPA==')

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Masuk'))

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/div_Kelola Artikel'))
	}

	@When("I click tambah article")
	def clickTambahArticle() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/p_Tambah Artikel'))
	}

	@And("I write article with empty tittle")
	def writeArticleInvalidData() {

		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/textarea_Kebutuhan gizi anak adalah kuantit_fd6869'),
				'Kebutuhan gizi anak adalah kuantitas serta kualitas nutrisi yang harus dipenuhi oleh anak untuk mendukung pertumbuhan fisik dan perkembangan kognitif mereka, serta menjaga kesehatan mereka secara keseluruhan. Setiap anak memiliki kebutuhan gizi yang berbeda tergantung pada usia, jenis kelamin, tingkat aktivitas, dan kondisi kesehatan.\n\nAKG dibuat berdasarkan penelitian ilmiah mengenai kebutuhan nutrisi manusia, dan mencakup rekomendasi untuk asupan energi, protein, lemak, karbohidrat, vitamin, dan mineral bagi masyarakat Indonesia. Dengan mengikuti AKG, masyarakat dapat memastikan bahwa mereka memenuhi kebutuhan nutrisi harian dan memperoleh manfaat kesehatan yang optimal.\n\nAdapun tips yang dapat dilakukan untuk memenuhi gizi pada anak.\n\n1. Sediakan Makanan dengan Gizi Seimbang\n2. Perkenalkan Sayuran dan Buah\n3. Berikan Protein Hewani dan Nabati\n4. Biasakan Olahraga Rutin')

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/label_Upload Foto'))
	}

	@Then("I can see article alert failed create")
	def verifyfailedCreate() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_Artikel gagal dipublish'))
		
		WebUI.closeBrowser()
	}

	@And("I click posting button")
	def clickPosting() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Posting'))
	}


	@And("I write article with valid format")
	def writeArticle() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Aktif_title'), 'Tips Memenuhi Kebutuhan Gizi Anak')

		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/textarea_Kebutuhan gizi anak adalah kuantit_fd6869'),
				'Kebutuhan gizi anak adalah kuantitas serta kualitas nutrisi yang harus dipenuhi oleh anak untuk mendukung pertumbuhan fisik dan perkembangan kognitif mereka, serta menjaga kesehatan mereka secara keseluruhan. Setiap anak memiliki kebutuhan gizi yang berbeda tergantung pada usia, jenis kelamin, tingkat aktivitas, dan kondisi kesehatan.\n\nAKG dibuat berdasarkan penelitian ilmiah mengenai kebutuhan nutrisi manusia, dan mencakup rekomendasi untuk asupan energi, protein, lemak, karbohidrat, vitamin, dan mineral bagi masyarakat Indonesia. Dengan mengikuti AKG, masyarakat dapat memastikan bahwa mereka memenuhi kebutuhan nutrisi harian dan memperoleh manfaat kesehatan yang optimal.\n\nAdapun tips yang dapat dilakukan untuk memenuhi gizi pada anak.\n\n1. Sediakan Makanan dengan Gizi Seimbang\n2. Perkenalkan Sayuran dan Buah\n3. Berikan Protein Hewani dan Nabati\n4. Biasakan Olahraga Rutin')

		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/label_Upload Foto'))
	}
	@Then("I can see article alert successful create")
	def verifySuccessCreate() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_Artikel berhasil dipublish'))
		
		WebUI.closeBrowser()
	}

	@When("I click edit article button")
	def clickEditArticle() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/edit article'))
	}

	@And("I update article with valid format")
	def updateArticle() {
		WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Aktif_title'), 'Tips Memenuhi Kebutuhan Gizi Pada Anak')
	}

	@Then("I can see article alert successful edited")
	def verifySuccessEdit() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_Artikel berhasil diedit'))
		
		WebUI.closeBrowser()
	}

	@When("I click delete article button")
	def clickDeleteArticle() {
		WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/delete article'))
	}

	@Then("I can see article alert successful deleted")
	def verifySuccessDelete() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Healthify Doctor/div_Artikel berhasil dihapus'))
		
		WebUI.closeBrowser()
	}
}