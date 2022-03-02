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
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_CloseShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__ProductNutrition'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__ProductNutrition_ShowAll'))

WebUI.click(findTestObject('OB003/Page_/div_LVIP_TW'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB003/Page_/div__AboutMelaleuca'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__MyAccount'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__MyAccountShowAll'))

WebUI.click(findTestObject('OB003/Page_/span_MyAccount_BackupOrderSetup'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_MyAccount_BackupOrderCancel'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_enroll'))

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__link enrollmentFormsLink'))

now_title = WebUI.getWindowTitle()

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_Form1_Download'))

WebUI.delay(3)

WebUI.switchToWindowTitle(now_title)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_Form2_Download'))

WebUI.delay(3)

WebUI.switchToWindowTitle(now_title)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in page is secure (https in the url)'
GlobalVariable.test_case = '245298'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Chrome 30 and higher'
GlobalVariable.test_case = '245302'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in to Website'
GlobalVariable.test_case = '245307'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out of Website'
GlobalVariable.test_case = '245308'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to print paperwork correctly'
GlobalVariable.test_case = '247216'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

