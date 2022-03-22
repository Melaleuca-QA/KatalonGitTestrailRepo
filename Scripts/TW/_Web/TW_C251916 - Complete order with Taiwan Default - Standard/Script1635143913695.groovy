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

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (2)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_(0)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_()_txtSkuEntry'), '1210.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (13)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_()_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (13)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (11)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3 (7)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/Promotion/CheckoutPromo')

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a_ (4)'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/button_ (1)'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1 (1)'))

WebUI.setText(findTestObject('OB003/Page_/input_AddressToEdit.AddressLine1'), 'testaddress5')

WebUI.setText(findTestObject('Object Repository/OB004/Page_/input__AddressToEdit.AddressLine2'), 'testaddress6')

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1_2 (2)'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1_2_3 (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__paymethodCvv (1)'), '123')

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1_2_3_4 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3'))

WebUI.closeBrowser()

'Complete order with Taiwan Default - Standard'
GlobalVariable.test_case = '251916'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

