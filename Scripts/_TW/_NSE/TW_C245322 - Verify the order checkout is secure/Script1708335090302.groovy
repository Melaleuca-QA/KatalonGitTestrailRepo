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

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_NSE/Page_/input_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '2000')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_choice to cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '2000')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_choice to cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Search/a_view cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/span_next step'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_continue to checkout'))

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down3'))

WebUI.click(findTestObject('OB_NSE/Page_/a_checkout_shipping_address_add'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_shipping_name'), 'shiptest')

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_/select_shipping_city'), '高雄市', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_/select_shipping_suburb'), '鼓山區', true)

WebUI.setText(findTestObject('OB_NSE/Page_/input_shipping_address1'), 'testaddress1')

WebUI.setText(findTestObject('OB_NSE/Page_/input_shipping_address2'), 'testaddress2')

WebUI.setText(findTestObject('OB_NSE/Page_/input_shipping_phoneNumber'), '0911111111')

WebUI.setText(findTestObject('OB_NSE/Page_/input_shipping_instructions'), 'do not ship')

WebUI.click(findTestObject('OB_NSE/Page_/button_shipoing_address_save'))

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down3'))

WebUI.click(findTestObject('OB_NSE/Page_/label_first_address'))

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down3'))

WebUI.click(findTestObject('OB_NSE/Page_/path_shipping_address_delete_icon'))

WebUI.click(findTestObject('OB_NSE/Page_/button_shipping_address_delete_confirmation'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_NSE/Page_/input_cvvCode_checkout'), '123')

'Payment'
WebUI.click(findTestObject('OB_NSE/Page_/span_pay'))

'close similar shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/span_pay-close'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/span_pay-close'))

    WebUI.click(findTestObject('OB_NSE/Page_/span_pay'))
}

WebUI.waitForAlert(5)

'cancel order'
WebUI.click(findTestObject('OB_NSE/Page_/button_receipt_cancel_order'))

WebUI.waitForAlert(5)

'cancel order confirmation'
WebUI.click(findTestObject('OB_NSE/Page_/button_receipt_cancel_order_confirmation'))

WebUI.waitForAlert(5)

'order button'
WebUI.click(findTestObject('OB_NSE/Page_/button_orders'))

'order history'
WebUI.click(findTestObject('OB_NSE/Page_/a_order history'))

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the order checkout is secure (https in the url)'
GlobalVariable.test_case = '245322'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245323'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing address'
GlobalVariable.test_case = '245324'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing address'
GlobalVariable.test_case = '245325'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

