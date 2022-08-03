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
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_MelaleucaPresentation'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_image-placeholder'))

WebUI.waitForAlert(5)

WebUI.switchToWindowTitle('TW_Overview_0322')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.click(findTestObject('OB001/Page_/button_icon-book-next stripe-btn'))

WebUI.switchToWindowTitle('Melaleuca: The Wellness Company')

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Open a PDF Presentation in Taiwan'
GlobalVariable.test_case = '251917'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

