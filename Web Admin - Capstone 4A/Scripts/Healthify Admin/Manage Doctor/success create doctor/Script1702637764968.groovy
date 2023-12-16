import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Doctor/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')

WebUI.setText(findTestObject('Object Repository/Manage Doctor/input_Email_email'), 'adminsuperr@mail.com')

WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Manage Doctor/div_Dokter'))

WebUI.click(findTestObject('Object Repository/Manage Doctor/button_Tambah Dokter'))

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

WebUI.closeBrowser()

