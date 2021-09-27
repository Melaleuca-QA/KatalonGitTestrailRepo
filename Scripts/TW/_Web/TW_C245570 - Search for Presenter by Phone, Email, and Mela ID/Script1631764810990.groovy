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

WebUI.setText(findTestObject('OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ (9)'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_ (4)'))

WebUI.click(findTestObject('OB003/Page_/a__1 (2)'))

WebUI.click(findTestObject('OB003/Page_/div__link startEnrollmentLink'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtPresenter'), '0943654646')

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_EH 2.2 HK Test'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtPresenter'), 'jilllin@melaleuca.com')

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (3)'))

WebUI.click(findTestObject('OB003/Page_/div_EH 2.2 HK Test (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtPresenter'), '12101235555')

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_EH 2.2 HK Test'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (5)'))

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/Home?signedOut=true&culture=zh-TW')
WebUI.closeBrowser()

'Verify being able to search for Presenter by Phone, Email, and Member #'
GlobalVariable.test_case = '245570'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

