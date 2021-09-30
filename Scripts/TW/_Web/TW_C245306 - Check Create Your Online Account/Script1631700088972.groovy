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

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (8)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__EmailAddress (1)'), 'jilllin100@melaleuca.com')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (8)'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_EmailSuccess)

WebUI.verifyElementVisible(findTestObject('OB003/Page_/div_jilllin100melaleuca.com'), FailureHandling.STOP_ON_FAILURE)

WebUI.back()

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__MobilePhoneNumber'), '0988297237')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (7)'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_MobileSuccess)

WebUI.delay(2)

WebUI.back()

WebUI.closeBrowser()

'Check \'Create Your Online Account\''
GlobalVariable.test_case = '245306'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

