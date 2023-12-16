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



class ManageMedicineSteps {

//	Scenario: Create medicine with empty brand
	@Given("I am on the medicine page")
	def onTheMedicinePage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/img_Portal Admin_img-fluid'))
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Email_email'), 'adminsuperr@mail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/success create medicine/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Masuk'))
		
		WebUI.click(findTestObject('Object Repository/success create medicine/div_Obat - obatan'))
	}
	
	@When("I click Tambah Produk button")
	def clickTambahProduk() {
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Tambah Produk Baru'))
	}
	
	@And("I click simpan with empty brand")
	def clickSimpanWithEmptyBrand() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert brand is empty")
	def validateAlertEmptyBrand() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Merk obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with empty category
	@And("I click simpan with empty category")
	def clickSimpanWithEmptyCategory() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert category is empty")
	def validateAlertCategoryEmpty() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Kategori obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with empty code
	@And("I click simpan with empty code")
	def clickSimpanWithEmptyCode() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert code is empty")
	def validateAlertCodeEmpty() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Kode Obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with empty price
	@And("I click simpan with empty price")
	def clickSimpanWithEmptyPrice() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert price is empty")
	def validateAlertPriceEmpty() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Harga obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
//	Scenario: Create medicine with empty product name
	@And("I click simpan with empty product name")
	def clickSimpanWithEmptyName() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert product name is empty")
	def validateAlertNameEmpty() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Nama obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with empty stock
	@And("I click simpan with empty stock")
	def clickSimpanWithEmptyStock() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert stock is empty")
	def validateAlertStockEmpty() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Stock obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
//	Scenario: Create medicine with empty type
	@And("I click simpan with empty type")
	def clickSimpanWithEmptyType() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert type is empty")
	def validateAlertTypeEmpty() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Jenis obat wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with numeric type
	@And("I click simpan with numeric type")
	def clickSimpanWithNumericType() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert type is invalid")
	def validateAlertTypeInvalid() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Jenis obat harus mengandung huruf'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with numeric name
	@And("I click simpan with numeric name")
	def clickSimpanWithNumericName() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert name is invalid")
	def validateAlertNameInvalid() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Nama obat harus mengandung huruf'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with numeric category
	@And("I click simpan with numeric category")
	def clickSimpanWithNumericCategory() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert category is invalid")
	def validateAlertCategoryInvalid() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Kategori obat harus mengandung huruf'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create medicine with numeric brand
	@And("I click simpan with numeric brand")
	def clickSimpanWithNumericBrand() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I can see alert brand is invalid")
	def validateAlertBrandInvalid() {
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Merk obat harus mengandung huruf'))
		
		WebUI.closeBrowser()
	}
	
//	Scenario: Edit medicine with numeric type
	@When("I open medicine details")
	def openMedicineDetails() {
		WebUI.click(findTestObject('Manage Medicine/td_Bodrex'))
	}
	
	@And("I update type field with numeric value")
	def clickSimpanEditWithNumericType() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), '12345')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	
//	Scenario: Edit medicine with numeric name
	@And("I update name field with numeric value")
	def clickSimpanEditWithNumericName() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), '12345')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	
//	Scenario: Edit medicine with numeric category
	@And("I update category field with numeric value")
	def clickSimpanEditWithNumericCategory() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), '12345')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	
//	Scenario: Edit medicine with numeric brand
	@And("I update brand field with numeric value")
	def clickSimpanEditWithNumericBrand() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), '12345')
		
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	
//	Scenario: Edit medicine with valid data
	@And("I update medicine with valid data")
	def updateMedicineWithValidData() {
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Panadol')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Paramount')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kategori_category'), 'Dewasa')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Kapsul')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '150')
		
		WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '8000')
		
		WebUI.setText(findTestObject('success create medicine/textarea_A'), 'B')
	}
	
	@And("I click simpan product button")
	def clickSimpanValidEdit() {
		WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))
	}
	
	@Then("I should be successfully edit medicine data")
	def validateAlertSuccessEditMedicine() {
		WebUI.delay(2)
		
		WebUI.verifyElementVisible(findTestObject('Manage Medicine/div_Anda berhasil mengubah produk'))
		
		WebUI.closeBrowser()
	}
	
	
	
	
	

	
	
}