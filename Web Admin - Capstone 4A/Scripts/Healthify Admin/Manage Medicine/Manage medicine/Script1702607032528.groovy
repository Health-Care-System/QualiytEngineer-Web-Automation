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

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Medicine/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Email_email'), 'adminsuperr@mail.com')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/div_Obat - obatan'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Kelola Obat_searchMedicine'), 'bodrex')

WebUI.click(findTestObject('Object Repository/Manage Medicine/td_Bodrex'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Informasi Produk_btn-close'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Tambah Produk Baru'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Gambar obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Kode Obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Nama obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Merk obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Kategori obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Jenis obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Stock obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Harga obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Details obat wajib diisi'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Informasi Produk_btn-close'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Tambah Produk Baru'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Kode_code'), 'PC12345')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Nama_name'), '12345')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Nama obat harus mengandung huruf'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Merk_merk'), '12345')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Merk obat harus mengandung huruf'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Kategori_category'), '12345')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Kategori obat harus mengandung huruf'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Jenis_type'), '12345')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Jenis obat harus mengandung huruf'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Stock_stock'), 'abcde')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Stock obat harus berupa angka'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Harga_price'), 'abcde')

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/p_Harga obat harus berupa angka'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Informasi Produk_btn-close'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/img_Tambah Produk Baru_me-2'))

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Kode_code'), 'Automated')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Nama_name'), 'Automated')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Merk_merk'), 'Automated')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Kategori_category'), 'Automated')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Jenis_type'), 'Automated')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Stock_stock'), '100')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/input_Harga_price'), '10000')

WebUI.setText(findTestObject('Object Repository/Manage Medicine/textarea_Automated'), 'Automated')

WebUI.click(findTestObject('Object Repository/Manage Medicine/img_Tambah Produk_mt-2 img-fluid p-4 rounde_ad7aa7'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Manage Medicine/div_Anda berhasil menambahkan produk'))

WebUI.closeBrowser()

