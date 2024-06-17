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

'get credit card number'
if (false) {
    GlobalVariable.tw_input_creditcard = '4000178712803002'
} else {
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Credit Card Number2'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.waitForAlert(10)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'myAccPopup_icon'
WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/img_myAcc_icon'))

WebUI.waitForAlert(10)

'my-account'
WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_go to my account'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Order History/a_payment addresses'))

WebUI.click(findTestObject('OB_NSE/Page_/a_add-new-payment-method'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_cardNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_year'), '2044', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_save'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_edit-payment-method'))

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_year'), '2044', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_save'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete-payment-method'))

WebUI.click(findTestObject('OB_NSE/Page_/button_delete-payment-method-confirmation'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Payment  Addresses/a_Lists'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Lists/a_account settings'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/a_Order History'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Payment  Addresses/a_my-account'))

WebUI.waitForAlert(10)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing pay method'
GlobalVariable.test_case = '245363'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing pay method'
GlobalVariable.test_case = '245364'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

