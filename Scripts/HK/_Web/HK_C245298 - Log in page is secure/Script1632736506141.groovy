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

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB001/Page_/button_ (6)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ (4) (5)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ (6)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ (5)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a__1 (3)'))

WebUI.click(findTestObject('OB001/Page_/div_ (6)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1 (5)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__1'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a__1_2 (2)'))

WebUI.click(findTestObject('OB001/Page_/span_ (2)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1 (5) (1)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (44)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (34)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__link enrollmentFormsLink'))

now_title = WebUI.getWindowTitle()

WebUI.click(findTestObject('Object Repository/OB003/Page_- Melaleuca/a_ (1)'))

WebUI.delay(3)

WebUI.switchToWindowTitle(now_title)

WebUI.click(findTestObject('Object Repository/OB003/Page_- Melaleuca/a__1'))

WebUI.delay(3)

WebUI.switchToWindowTitle(now_title)

WebUI.click(findTestObject('OB001/Page_/a_ (6)'))

WebUI.closeBrowser()

'Log in page is secure (https in the url)'
GlobalVariable.test_case = '245298'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Chrome 30 and higher'
GlobalVariable.test_case = '245302'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in to Website'
GlobalVariable.test_case = '245307'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out of Website'
GlobalVariable.test_case = '245308'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to print paperwork correctly'
GlobalVariable.test_case = '247216'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

