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

'Log in page is secure (https in the url)'
caseId = '245298'

caseId2 = ''

browserType = ''

//culture = ''
//checkUrl = (GlobalVariable.url_uatwweb + 'search?searchTerm')
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('null'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('null'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB001/Page_/button_ (6)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_CloseShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a__1 (3)'))

WebUI.click(findTestObject('OB003/Page_/div_LVIP_TW'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__MyAccount'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_MyAccountShowAll'))

WebUI.click(findTestObject('OB003/Page_/span_MyAccount_BackupOrderSetup'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_MyAccount_BackupOrderCancel'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1 (5) (1)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (44)'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_BusinessCenter_OLE_hk'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__link enrollmentFormsLink'))

now_title = WebUI.getWindowTitle()

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_Form1_Download'))

WebUI.delay(3)

WebUI.switchToWindowTitle(now_title)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_Form2_Download'))

WebUI.delay(3)

WebUI.switchToWindowTitle(now_title)

//url = WebUI.getUrl()
//assert url == checkUrl
//if (url.contains('tw')) {culture = 'TW'
//} else {culture = 'HK'
//}
browserType = CustomKeywords.'common.Utilities.driverBrowserType'()

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'common.Utilities.testRailRecorder'(caseId, caseId2, browserType, culture, passFail)

