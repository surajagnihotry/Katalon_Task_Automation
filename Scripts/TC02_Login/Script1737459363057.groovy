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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.waitForElementClickable(findTestObject('Login_Objects/Sign_In_Option'), 20)

WebUI.click(findTestObject('Login_Objects/Sign_In_Option'))

WebUI.waitForElementPresent(findTestObject('Login_Objects/Sign_In_Email'), 10)

WebUI.setText(findTestObject('Login_Objects/Sign_In_Email'), Sign_In_Email)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Login_Objects/Sign_Password'), 'wmVGAGXRKInZds6KvsZnmA==')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Login_Objects/Sign_In_BTN'), 10)

WebUI.click(findTestObject('Login_Objects/Sign_In_BTN'))

