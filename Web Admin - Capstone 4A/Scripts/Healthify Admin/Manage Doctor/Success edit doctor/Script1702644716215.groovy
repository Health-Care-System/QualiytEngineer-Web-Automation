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

String randomEmail = ('contoh' + UUID.randomUUID().toString().substring(0, 8)) + '@gmail.com'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://healthify-admin.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Email_email'), 'adminsuperr@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/success edit doctor/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')

WebUI.click(findTestObject('Object Repository/success edit doctor/button_Masuk'))

WebUI.click(findTestObject('Object Repository/success edit doctor/div_Dokter'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/success edit doctor/div_Bagus'))

WebUI.click(findTestObject('Object Repository/success edit doctor/button_Edit'))

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nama_fullname'), 'Setyo')

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Email_email_1'), randomEmail)

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Biaya_price'), '120000')

WebUI.selectOptionByValue(findTestObject('Object Repository/success edit doctor/select_ChooseDokter UmumSpesialis AnakDokte_7dbaf5'), 
    'Anak', true)

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Pengalaman_experience'), '10 Tahun')

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Alumnus_alumnus'), 'Universitas Indonesia')

WebUI.setText(findTestObject('Object Repository/success edit doctor/input_Nomor STR_no_str'), '15616527')

WebUI.click(findTestObject('Object Repository/success edit doctor/button_Simpan'))

WebUI.verifyElementVisible(findTestObject('Manage Doctor/h5_Kelola Dokter'))

WebUI.closeBrowser()

