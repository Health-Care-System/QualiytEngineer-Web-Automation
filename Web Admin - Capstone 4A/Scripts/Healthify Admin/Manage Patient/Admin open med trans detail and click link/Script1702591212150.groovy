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

WebUI.setText(findTestObject('Object Repository/Object Login/input_Email_email'), 'adminsuperr@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Object Login/input_Password_password'), 'Uto11gDjU0D/sa8FurFi9g==')

WebUI.click(findTestObject('Object Repository/open med trans/button_Masuk'))

WebUI.click(findTestObject('Object Repository/open med trans/div_Pasien'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/open med trans/td_manual transfer bca'))

WebUI.click(findTestObject('New Folder/button_Link'))

WebUI.click(findTestObject('Object Repository/open med trans/img'))

WebUI.closeBrowser()

