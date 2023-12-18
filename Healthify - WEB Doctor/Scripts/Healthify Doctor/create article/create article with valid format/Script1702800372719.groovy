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

WebUI.navigateToUrl('https://healthify-doctor.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Email_email'), 'fdlhazizah25@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Healthify Doctor/input_Password_password'), 'i5Tq7bplk6M3iYVeKgBYPA==')

WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/div_Kelola Artikel'))

WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/p_Tambah Artikel'))

WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/input_Aktif_title'), 'Tips Memenuhi Kebutuhan Gizi Anak')

WebUI.setText(findTestObject('Object Repository/Page_Healthify Doctor/textarea_Kebutuhan gizi anak adalah kuantit_fd6869'), 
    'Kebutuhan gizi anak adalah kuantitas serta kualitas nutrisi yang harus dipenuhi oleh anak untuk mendukung pertumbuhan fisik dan perkembangan kognitif mereka, serta menjaga kesehatan mereka secara keseluruhan. Setiap anak memiliki kebutuhan gizi yang berbeda tergantung pada usia, jenis kelamin, tingkat aktivitas, dan kondisi kesehatan.\n\nAKG dibuat berdasarkan penelitian ilmiah mengenai kebutuhan nutrisi manusia, dan mencakup rekomendasi untuk asupan energi, protein, lemak, karbohidrat, vitamin, dan mineral bagi masyarakat Indonesia. Dengan mengikuti AKG, masyarakat dapat memastikan bahwa mereka memenuhi kebutuhan nutrisi harian dan memperoleh manfaat kesehatan yang optimal.\n\nAdapun tips yang dapat dilakukan untuk memenuhi gizi pada anak.\n\n1. Sediakan Makanan dengan Gizi Seimbang\n2. Perkenalkan Sayuran dan Buah\n3. Berikan Protein Hewani dan Nabati\n4. Biasakan Olahraga Rutin')

WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/label_Upload Foto'))

WebUI.click(findTestObject('Object Repository/Page_Healthify Doctor/button_Posting'))

