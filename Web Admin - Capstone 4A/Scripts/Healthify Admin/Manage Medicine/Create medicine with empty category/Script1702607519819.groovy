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

WebUI.click(findTestObject('Object Repository/success create medicine/img_Portal Admin_img-fluid'))

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Email_email'), 'adminsuperr@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/success create medicine/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/success create medicine/div_Lupa Kata Sandi'))

WebUI.setEncryptedText(findTestObject('Object Repository/success create medicine/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')

WebUI.click(findTestObject('Object Repository/success create medicine/button_Masuk'))

WebUI.click(findTestObject('Object Repository/success create medicine/div_Obat - obatan'))

WebUI.click(findTestObject('Object Repository/success create medicine/button_Tambah Produk Baru'))

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Kode_code'), 'PC12527')

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Nama_name'), 'Automated')

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Merk_merk'), 'Automated')

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Jenis_type'), 'Automated')

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Stock_stock'), '100')

WebUI.setText(findTestObject('Object Repository/success create medicine/input_Harga_price'), '10000')

WebUI.setText(findTestObject('success create medicine/textarea_A'), 'A')

WebUI.click(findTestObject('Object Repository/success create medicine/button_Simpan'))

WebUI.verifyElementVisible(findTestObject('Manage Medicine/p_Kategori obat wajib diisi'))

WebUI.closeBrowser()

