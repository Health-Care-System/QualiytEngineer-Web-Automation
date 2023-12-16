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



class ManageDoctorSteps {
	
//	Scenario: Create doctor with empty name
	@Given("I am on the manage doctor page")
	def onTheManageDoctorPage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email'), 'adminsuperr@mail.com')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Masuk'))
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/div_Dokter'))
	}
	
	@When("I click tambah dokter button")
	def clickTambahDokterButton() {
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Tambah Dokter'))
	}
	
	@And("I click simpan with empty doctor name")
	def clickSimpanWithEmptyDoctorName() {
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert name is empty")
	def validateAlertEmptyDoctorNameEmpty() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/p_Nama Dokter wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty gender
	@And("I click simpan with empty gender")
	def clickSimpanWithEmptyGender() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert gender is empty")
	def validateAlertEmptyGender() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/p_Gender wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty email
	@And("I click simpan with empty email")
	def clickSimpanWithEmptyEmail() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert email is empty")
	def validateAlertEmptyEmail() {
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Email wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty password
	@And("I click simpan with empty password")
	def clickSimpanWithEmptyPassword() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert password is empty")
	def validateAlertEmptyPassword() {
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Password wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty medical speciality
	@And("I click simpan with empty medical speciality")
	def clickSimpanWithEmptyMedicalSpeciality() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert medical speciality is empty")
	def validateAlertEmptyMedicalSpeciality() {
		
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Spesialis wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty experiences
	@And("I click simpan with empty experiences")
	def clickSimpanWithEmptyExperiences() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	
	}
	
	@Then("I can see alert experiences is empty")
	def validateAlertEmptyExperiences() {
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Pengalaman wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty alumnus
	@And("I click simpan with empty alumnus")
	def clickSimpanWithEmptyAlumnus() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	
	}
	
	@Then("I can see alert alumunus is empty")
	def validateAlertEmptyAlumnus() {
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Alumnus wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty STR
	@And("I click simpan with empty STR")
	def clickSimpanWithEmptySTR() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	
	}
	
	@Then("I can see alert STR is empty")
	def validateAlertEmptySTR() {
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Nomor STR wajib diisi'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with empty profile picture
	@And("I click simpan with empty profile picture")
	def clickSimpanWithEmptyProfilePicture() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	
	}
	
	@Then("I can see alert profile picture is empty")
	def validateAlertEmptyProfilePicture() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/p_Harap pilih profile picture'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with invalid email format
	@And("I click simpan with invalid email format")
	def clickSimpanWithInvalidEmailFormat() {
		
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automatedgmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
		
	}
	
	@Then("I can see alert doctor email format is invalid")
	def validateAlertInvalidEmailFormat() {
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/p_Format email tidak valid'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with numeric doctor name
	@And("I click simpan with numeric doctor name")
	def clickSimpanWithNumericName() {
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), 'Automated@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert doctor name is invalid")
	def validateAlertInvalidDoctorName() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/p_Nama Dokter tidak boleh terdiri dari angka'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Create doctor with numeric doctor email
	@And("I click simpan with numeric doctor email")
	def clickSimpanWithNumericEmail() {
		WebUI.setText(findTestObject('Manage Doctor/input_Nama_fullname'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email_1'), '12345')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password_1'), 'i5Tq7bplk6OZyRsw3ic9iw==')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/input_Jenis Kelamin_gender'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Umum', true)
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Harga Konsultasi_price'), '100000')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Pengalaman Kerja_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Alumnus_alumnus'), 'Automated')
		
		WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Nomor STR_no_str'), '1234567890')
		
		WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Simpan'))
	}
	
	@Then("I can see alert doctor email is cant be numeric")
	def validateAlertDoctorEmailIsNumeric() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/debug manage doctor/p_Format email tidak valid'))
		
		WebUI.closeBrowser()
	}
	
	
	
//	Scenario: Verify functionality of batal button for create doctor
	@And("I click batal button for create doctor")
	def clickBatalButtonForCreateDoctor() {
		WebUI.click(findTestObject('Object Repository/success edit doctor/a_Batal create doc'))
		
	}
	
	@Then("I am navigated back to doctor page")
	def backToDoctorPage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage Doctor/h5_Kelola Dokter'))
		
		WebUI.closeBrowser()
	}
	
	
//	Scenario: Edit doctor with valid data
	@When("I open doctor details")
	def openDoctorDetails() {
		
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('Object Repository/success edit doctor/div_Bagus'))
		
		
	}
	
	@And("I click edit button")
	def clickEditButton() {
		
		WebUI.click(findTestObject('Object Repository/success edit doctor/button_Edit'))
		
	}
	
	@And("I update doctor with valid data")
	def updateDoctorWithValidData() {
		
		String randomEmail = ('contoh' + UUID.randomUUID().toString().substring(0, 8)) + '@gmail.com'
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nama_fullname'), 'Setyo')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Email_email_1'), randomEmail)
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Biaya_price'), '120000')
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/success edit doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Anak', true)
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Pengalaman_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Alumnus_alumnus'), 'Universitas Indonesia')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nomor STR_no_str'), '15616527')
	
		
	}
	
	@And("I click simpan doctors update button")
	def clickSimpanButtonForUpdateDoctor() {
		
		WebUI.click(findTestObject('Object Repository/success edit doctor/button_Simpan'))
		
	}
	
	@Then("I can see notification success update doctor data")
	def validateNotificationSuccessUpdateDoctorData() {
		
		WebUI.verifyElementVisible(findTestObject('Manage Doctor/h5_Kelola Dokter'))
		
		WebUI.closeBrowser()
		
	}
	
	
//	Scenario: Edit doctor with numeric name
	@And("I update doctor with numeric name")
	def updateDoctorDataWithNumericName() {
		String randomEmail = ('contoh' + UUID.randomUUID().toString().substring(0, 8)) + '@gmail.com'
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nama_fullname'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Email_email_1'), randomEmail)
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Biaya_price'), '120000')
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/success edit doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Anak', true)
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Pengalaman_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Alumnus_alumnus'), 'Universitas Indonesia')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nomor STR_no_str'), '15616527')
	}
	
	@Then("I can see alert doctor name is invalid at edit page")
	def validateDoctorNameNumericAtEditPage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/New Folder (3)/p_Nama Dokter tidak boleh terdiri dari angka'))
		
		WebUI.closeBrowser()
	}

	
//	Scenario: Edit doctor with numeric email
	@And("I update doctor with numeric email")
	def updateDoctorDataWithNumericEmail() {
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nama_fullname'), 'Setyo')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Email_email_1'), '12345')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Biaya_price'), '120000')
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/success edit doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'),
			'Anak', true)
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Pengalaman_experience'), '10 Tahun')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Alumnus_alumnus'), 'Universitas Indonesia')
		
		WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nomor STR_no_str'), '15616527')
	}
	
	@Then("I can see alert doctor email is cant be numeric at edit page")
	def validateDoctorEmailCantBeNumericAtEditPage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/New Folder (2)/p_Format email tidak valid at edit page'))

		WebUI.closeBrowser()
	}
	
	
//	Scenario: Verify functionality of batal button for edit doctor
	@And("I click batal button for edit doctor")
	def clickBatalEditDokterButton() {
		WebUI.click(findTestObject('Object Repository/success edit doctor/a_Batal edit doc'))
		
	}
	
}