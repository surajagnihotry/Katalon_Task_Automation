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

WebUI.delay(1)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.verifyElementPresent(findTestObject('Account_Registration_Objects/CreateAcc_BTN'), 20)

WebUI.click(findTestObject('Account_Registration_Objects/CreateAcc_BTN'))

WebUI.waitForElementVisible(findTestObject('Account_Registration_Objects/Acc_Reg_F_Name_Placeholder'), 15)

WebUI.setText(findTestObject('Account_Registration_Objects/Acc_Reg_F_Name_Placeholder'), 'Surya')

WebUI.delay(1)

WebUI.setText(findTestObject('Account_Registration_Objects/Acc_Reg_L_Name_Placeholder'), 'Task')

WebUI.delay(1)

WebUI.setText(findTestObject('Account_Registration_Objects/Acc_Reg_Email_Placeholder'), Email)

WebUI.setEncryptedText(findTestObject('Account_Registration_Objects/Acc_Reg_Set_Pass_PlaceHolder'), 'wmVGAGXRKInZds6KvsZnmA==')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Account_Registration_Objects/Acc_Reg_Conf_Pass_PlaceHolder'), 'wmVGAGXRKInZds6KvsZnmA==')

WebUI.delay(1)

WebUI.click(findTestObject('Account_Registration_Objects/Acc_Reg_CreateAcc_BTN'))

WebUI.waitForPageLoad(10)

String currentUrl = WebUI.getUrl()

String expectedUrl = 'https://magento.softwaretestingboard.com/customer/account/'

'This Steps verify that user account succefully created and login to dashboard url.'
WebUI.verifyEqual(currentUrl, expectedUrl)

String success_Msg = WebUI.getText(findTestObject('Account_Registration_Objects/Acc_Reg_Success_Message'))

String expected_Msg = 'Thank you for registering with Main Website Store.'

WebUI.verifyEqual(success_Msg, expected_Msg)

WebUI.verifyElementPresent(findTestObject('Account_Registration_Objects/Acc_Reg_Success_Verify_Welcome_Text'), 10)

String Welcome_UName = WebUI.getText(findTestObject('Account_Registration_Objects/Acc_Reg_Success_Verify_Welcome_Text'))

println('You Have Registered on Application as User' + Welcome_UName)

