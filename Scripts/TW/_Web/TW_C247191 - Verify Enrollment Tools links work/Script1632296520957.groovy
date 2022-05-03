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
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_enroll_tw'))

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_tw'))

WebUI.click(findTestObject('OB001/Page_/div_link presentationLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_melaleucapresentations)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/div_link followUpLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_FollowUp)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/div_link enrollmentFormsLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_Enrollment_Forms)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/div_link whichProductsLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_whichproducts)

WebUI.delay(2)

WebUI.back()

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify Enrollment Tools links work and proceed to expected pages '
GlobalVariable.test_case = '247191'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

