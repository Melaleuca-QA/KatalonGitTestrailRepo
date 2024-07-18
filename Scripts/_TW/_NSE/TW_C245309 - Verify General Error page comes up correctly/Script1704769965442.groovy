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

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.nse_GeneralError)

WebUI.navigateToUrl(GlobalVariable.nse_GeneralError)

'General Error Page'
now_url = WebUI.getUrl()

println(now_url)

WebUI.verifyEqual(now_url, GlobalVariable.nse_GeneralError)

WebUI.click(findTestObject('OB_NSE/Page_/a_back to home'))

WebUI.waitForAlert(5)

'Product Store Page'
def ps_url = WebUI.getUrl()

println(ps_url)

WebUI.verifyEqual(ps_url, GlobalVariable.nse_ProductStore)

WebUI.waitForAlert(5)

'back to legacy PD env  Business Center Page'
WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_business center'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.waitForAlert(5)

//WebUI.setText(findTestObject('OB_Web/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)
//WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.tw_input_password1)
//WebUI.click(findTestObject('OB_Web/Page_/button_Login'))
//WebUI.waitForAlert(5)
'Business Center Page'
def bc_url = WebUI.getUrl()

println(bc_url)

WebUI.verifyEqual(bc_url, GlobalVariable.url_BusinessCenter)

WebUI.waitForAlert(5)

WebUI.back()

WebUI.back()

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify General Error page comes up correctly'
GlobalVariable.test_case = '245309'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ProductStore link works'
GlobalVariable.test_case = '245310'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify BusinessCenter link works'
GlobalVariable.test_case = '245311'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

