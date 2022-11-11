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

WebUI.callTestCase(findTestCase('_TW/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/div_link startEnrollmentLink'))

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('OB001/Page_/input_txtPresenter'), '0943654646')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/div_EH 2.2 HK Test'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_EditPresenter'))

WebUI.setText(findTestObject('OB001/Page_/input_txtPresenter'), 'jilllin@melaleuca.com')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/div_EH 2.2 HK Test 2'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_EditPresenter'))

WebUI.setText(findTestObject('OB001/Page_/input_txtPresenter'), '1264222901')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/div_EH 2.2 HK Test'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_NewEnroll_Cancel'))

WebUI.waitForPageLoad(30)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify being able to search for Presenter by Phone, Email, and Member #'
GlobalVariable.test_case = '245570'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

