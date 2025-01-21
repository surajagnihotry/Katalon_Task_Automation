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

WebUI.callTestCase(findTestCase('TC02_Login'), [('Sign_In_Email') : 'testtask01@yopmail.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/My_Cart_BTN'))

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Order_Checkout_BTN'))

WebUI.waitForPageLoad(10)

WebUI.scrollToElement(findTestObject('Address_Cart_Billing_Objects/Street_Address_Placeholder'), 10)

WebUI.setText(findTestObject('Address_Cart_Billing_Objects/Street_Address_Placeholder'), 'Satelite Road')

WebUI.setText(findTestObject('Address_Cart_Billing_Objects/Address_City_Field_Placholder'), 'Bareilly')

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Address_Cart_Billing_Objects/Address_Country_Selection'), 'India', false)

WebUI.selectOptionByLabel(findTestObject('Address_Cart_Billing_Objects/Address_Province_State'), 'Uttar Pradesh', false)

WebUI.setText(findTestObject('Address_Cart_Billing_Objects/Address_Post_Code'), '243123')

WebUI.setText(findTestObject('Address_Cart_Billing_Objects/User_Phone_Number_Placeholder'), '9717627643')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Address_Cart_Billing_Objects/Cart_CheckOut_Next_BTN'), 10)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Cart_CheckOut_Next_BTN'))

WebUI.waitForElementPresent(findTestObject('Address_Cart_Billing_Objects/Place_Order_BTN'), 20)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Place_Order_BTN'))

WebUI.verifyElementText(findTestObject('Address_Cart_Billing_Objects/Purchase_Success_Message'), 'Thank you for your purchase!')

