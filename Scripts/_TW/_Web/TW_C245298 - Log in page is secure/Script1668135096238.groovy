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
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_CloseShoppingCart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_ProductNutrition_ShowAll'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/div_LVIP_TW'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/div_AboutMelaleuca_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_MyAccount'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_MyAccountShowAll'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/span_MyAccount_BackupOrderSetup'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_MyAccount_BackupOrderCancel'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_link enrollmentFormsLink'))

now_title = WebUI.getWindowTitle()

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_Form1_Download'))

WebUI.waitForAlert(5)

WebUI.switchToWindowTitle(now_title)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_Form2_Download'))

WebUI.waitForAlert(5)

WebUI.switchToWindowTitle(now_title)

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_HK/_General/_Logout_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in page is secure (https in the url)'
GlobalVariable.test_case = '245298'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Chrome 30 and higher'
GlobalVariable.test_case = '245302'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in to Website'
GlobalVariable.test_case = '245307'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out of Website'
GlobalVariable.test_case = '245308'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to print paperwork correctly'
GlobalVariable.test_case = '247216'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

