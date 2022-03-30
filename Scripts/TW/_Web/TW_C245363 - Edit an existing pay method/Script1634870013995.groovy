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
    GlobalVariable.tw_input_creditcard = '4929028234403872'
} else {
    WebUI.callTestCase(findTestCase('TW/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/span_MyAccount'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_MyAccount_SetupPaymethod'))

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/MyAccount/ChangePaymethods')
WebUI.click(findTestObject('OB003/Page_/button_MyAccount_Setup_AddCreditCard'))

WebUI.setText(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_PaymethodToEdit.CardHolderName'), 
    'EH 2.2 HK Test')

WebUI.setText(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_PaymethodToEdit.CardNumber'), 
    GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_month'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_year'), '2040', true)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_MyAccount_Setup_AddCreditCard_save'))

WebUI.delay(5)

WebUI.click(findTestObject('OB003/Page_/span_MyAccount_Setup_EditCreditCard'))

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_year'), '2039', true)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_MyAccount_Setup_AddCreditCard_save'))

WebUI.delay(5)

WebUI.click(findTestObject('OB003/Page_/span_MyAccount_Setup_DeleteCreditCard'))

WebUI.click(findTestObject('OB003/Page_/button_Checkout_ChangePaymethod_delete_check'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_CloseShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.click(findTestObject('OB003/Page_/a_ProductNutrition_VitaminSeries'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing pay method'
GlobalVariable.test_case = '245363'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing pay method'
GlobalVariable.test_case = '245364'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

