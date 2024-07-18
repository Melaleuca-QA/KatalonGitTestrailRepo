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
if (false) {
    GlobalVariable.tw_input_creditcard = '4080198467858103'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Credit Card Number2'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_NSE/Page_/input_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '860')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_choice to cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/img_m-refinerImage_img_861'))

WebUI.click(findTestObject('OB_NSE/Page_Search/button_add to cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Search/a_view cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/span_next step'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_continue to checkout'))

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down4'))

WebUI.click(findTestObject('OB_NSE/Page_/a_add new payment method'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_NSE/Page_Add New Payment Method/input_card number'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_year'), '2044', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down4'))

WebUI.click(findTestObject('OB_NSE/Page_/a_add new payment method'))

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_year'), '2044', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down4'))

WebUI.click(findTestObject('OB_NSE/Page_/svg_CC_modification'))

WebUI.click(findTestObject('OB_NSE/Page_/button_delete'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_NSE/Page_/input_cvvCode_checkout'), '123')

WebUI.click(findTestObject('OB_NSE/Page_/span_pay'))

'close similar shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/span_pay-close'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/span_pay-close'))

    WebUI.click(findTestObject('OB_NSE/Page_/span_pay'))
}

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_pay_button2'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_NSE/Page_/input_cvvCode_checkout'), '123')

WebUI.click(findTestObject('OB_NSE/Page_/button_payment_owing-balance'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shopping2'))

'order button'
WebUI.click(findTestObject('OB_NSE/Page_/button_orders'))

'order history'
WebUI.click(findTestObject('OB_NSE/Page_/a_order history'))

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing pay method'
GlobalVariable.test_case = '245352'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete a pay method'
GlobalVariable.test_case = '245355'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

