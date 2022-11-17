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

WebUI.click(findTestObject('OB_Web/Page_/a_CannotLogin'))

WebUI.setText(findTestObject('OB_Web/Page_/input_AccountSearchParam'), 'jilllin2@melaleuca.com')

WebUI.click(findTestObject('OB_Web/Page_/button_CannotLogin_Continue'))

WebUI.click(findTestObject('OB_Web/Page_/span_CannotLogin_Resend'))

WebUI.delay(2)

WebUI.closeBrowser()

'Check \'Can\'t Access Your Account\''
GlobalVariable.test_case = '245304'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

