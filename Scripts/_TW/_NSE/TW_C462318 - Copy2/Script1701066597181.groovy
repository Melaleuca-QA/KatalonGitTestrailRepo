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

'Recording mode'
if (true) {
    GlobalVariable.tw_input_creditcard = '4000176233801257'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_NSE/Page_/input_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), '2000')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

'Return to shopping cart'
WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_add'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_PROCEED TO CHECKOUT'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_Continue To Checkout'))

WebUI.waitForAlert(10)

//WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/checkout')
//WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down'))
WebUI.click(findTestObject('OB_NSE/Page_/span_Pay With'))

WebUI.click(findTestObject('OB_NSE/Page_/a_ADD NEW PAYMENT METHOD'))

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('OB_NSE/Page_Add New Payment Method/input_Card Number_cardNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_Month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_Year'), '2043', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_Save'))

