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

WebUI.callTestCase(findTestCase('_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_GeneralError)

WebUI.waitForPageLoad(2)

now_url = WebUI.getUrl()

println(now_url)

WebUI.verifyEqual(now_url, GlobalVariable.url_GeneralError)

WebUI.click(findTestObject('OB003/Page_/a_ GeneralError_StartShopping'))

WebUI.waitForPageLoad(2)

def ps_url = WebUI.getUrl()

println(ps_url)

WebUI.verifyEqual(ps_url, GlobalVariable.url_ProductStore)

WebUI.waitForPageLoad(2)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForPageLoad(2)

def bc_url = WebUI.getUrl()

println(bc_url)

WebUI.verifyEqual(bc_url, GlobalVariable.url_BusinessCenter)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify General Error page comes up correctly'
GlobalVariable.test_case = '245309'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ProductStore link works'
GlobalVariable.test_case = '245310'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify BusinessCenter link works'
GlobalVariable.test_case = '245311'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

