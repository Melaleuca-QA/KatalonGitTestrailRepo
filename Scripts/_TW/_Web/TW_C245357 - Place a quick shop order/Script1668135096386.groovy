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
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_fa fa-caret-down'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '2000.1')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_TopProceedtoCheckout'))

WebUI.waitForAlert(5)

now_url = WebUI.getUrl()

println(now_url)

'CheckoutPromo Page'
if ('now_url' == GlobalVariable.url_CheckoutPromo) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_tw'))

    WebUI.waitForAlert(5)
}

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Payment'))

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB001/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Place a quick shop order'
GlobalVariable.test_case = '245357'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

