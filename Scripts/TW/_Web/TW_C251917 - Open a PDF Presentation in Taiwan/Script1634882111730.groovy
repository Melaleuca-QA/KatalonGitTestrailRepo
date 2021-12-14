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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca/div_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (16)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1 (7)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img__image-placeholder'))

WebUI.switchToWindowTitle('TW_Overview_1021')

WebUI.waitForPageLoad(100)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.click(findTestObject('Object Repository/OB003/Page_TW_Overview_1021/button__icon-book-next stripe-btn'))

WebUI.switchToWindowTitle('Melaleuca: The Wellness Company')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (33)'))

WebUI.closeBrowser()

'Open a PDF Presentation in Taiwan'
GlobalVariable.test_case = '251917'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
