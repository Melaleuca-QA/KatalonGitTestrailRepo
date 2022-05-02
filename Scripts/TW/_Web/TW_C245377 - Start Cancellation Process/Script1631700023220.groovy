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

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB002/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_MyAccount'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ContactMelaleuca'))

WebUI.navigateToUrl(GlobalVariable.url_account)

WebUI.click(findTestObject('OB001/Page_/a_MyAccountShowAll_TransfeeHistory'))

WebUI.click(findTestObject('OB001/Page_/a_MyAccountShowAll_OtherOption_tw'))

WebUI.navigateToUrl(GlobalVariable.url_OtherOptions)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_MyAccountShowAll_OtherOption_MoreDetail'))

WebUI.waitForPageLoad(100)

now_url = WebUI.getUrl()

println(now_url)

WebUI.verifyMatch(now_url, GlobalVariable.url_CancelEmailConfirm, false)

WebUI.click(findTestObject('OB001/Page_/a_MyAccountShowAll_OtherOption_MoreDetail_SendSteps'))

WebUI.waitForPageLoad(100)

WebUI.refresh()

now_url = WebUI.getUrl()

println(now_url)

WebUI.verifyMatch(now_url, GlobalVariable.url_CancelEmailSent, false)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Start Cancellation Process (blocked in UA because emails aren\'t successful)'
GlobalVariable.test_case = '245377'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

