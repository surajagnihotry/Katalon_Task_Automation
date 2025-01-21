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

WebUI.mouseOver(findTestObject('Address_Cart_Billing_Objects/Mens_Category_Option'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Address_Cart_Billing_Objects/Mens_Category_Top_Section'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Address_Cart_Billing_Objects/Mens_Category_Tops_Jacket_Section'))

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Mens_Category_Tops_Jacket_Section'))

WebUI.waitForElementClickable(findTestObject('Address_Cart_Billing_Objects/Mens_Category_Jacket_List_Second_Item'), 10)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Mens_Category_Jacket_List_Second_Item'))

WebUI.waitForPageLoad(10)

WebUI.scrollToElement(findTestObject('Address_Cart_Billing_Objects/Add_to_cart_BTN'), 10)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Jacket_Size_Selection_Small'))

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Jacket_Color_Selection_Green'))

WebUI.delay(1)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/Add_to_cart_BTN'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Address_Cart_Billing_Objects/My_Cart_BTN'), 10)

WebUI.click(findTestObject('Address_Cart_Billing_Objects/My_Cart_BTN'))

