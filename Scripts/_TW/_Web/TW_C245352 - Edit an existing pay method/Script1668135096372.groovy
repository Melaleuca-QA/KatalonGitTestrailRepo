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
    WebUI.callTestCase(findTestCase('_TW/_General/TW Credit Card Number2'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '1210.2')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.navigateToUrl(GlobalVariable.url_Cart)

WebUI.click(findTestObject('OB001/Page_/button_TopProceedtoCheckout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_tw'))

WebUI.waitForAlert(5)

WebUI.focus(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod'))

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod'))

WebUI.waitForAlert(5)

WebUI.focus(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_add'))

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_add'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_PaymethodToEdit.CardHolderName'), 'EH 2.2 HK Test')

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_PaymethodToEdit.CardNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Chectout_edit_month'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Chectout_edit_year'), '2040', true)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_save'))

WebUI.waitForAlert(5)

WebUI.back()

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_Checkout_ChangePaymethod_edit'))

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Chectout_edit_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Chectout_edit_year'), '2039', true)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_Checkout_ChangePaymethod_delete'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_delete_check'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangePaymethod_return'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Payment'))

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB001/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing pay method'
GlobalVariable.test_case = '245352'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete a pay method'
GlobalVariable.test_case = '245355'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

