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

WebUI.callTestCase(findTestCase('_HK/_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_ApplyEnroll_hk'))

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_hk'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_MelaleucaPresentation'))

WebUI.waitForPageLoad(30)

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_melaleucapresentations)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_melaleucapresentations)
}

WebUI.waitForAlert(5)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/div_link followUpLink'))

WebUI.waitForPageLoad(30)

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_FollowUp)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_FollowUp)
}

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/div_link enrollmentFormsLink'))

WebUI.waitForPageLoad(30)

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_Enrollment_Forms)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_Enrollment_Forms)
}

WebUI.waitForAlert(5)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/div_link whichProductsLink'))

WebUI.waitForPageLoad(30)

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_whichproducts)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_whichproducts)
}

WebUI.waitForAlert(5)

WebUI.back()

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify Enrollment Tools links work and proceed to expected pages '
GlobalVariable.test_case = '247191'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
