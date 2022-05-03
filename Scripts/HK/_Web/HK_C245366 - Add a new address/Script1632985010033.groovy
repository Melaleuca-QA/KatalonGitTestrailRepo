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

WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_MyAccount'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_MyAccountShowAll'))

WebUI.click(findTestObject('OB001/Page_/span_Myaccount_ShowAll_SetupAddress'))

WebUI.click(findTestObject('OB001/Page_/button_Myaccount_ShowAll_SetupAddress_add'))

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.ShipToName_hk'), 'hsipaddress')

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_state_hk'), '852', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_city_hk'), '香港', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_suburb_hk'), '中環', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine1'), 'hsipaddress1')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), 'hsipaddress2')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.FormattedPhoneNumber'), '85251654321')

WebUI.click(findTestObject('OB001/Page_/button_Myaccount_ShowAll_SetupAddress_save'))

WebUI.click(findTestObject('OB001/Page_/button_Myaccount_ShowAll_SetupAddress_Edit'))

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine1'), 'hsipaddress3')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), 'hsipaddress4')

WebUI.click(findTestObject('OB001/Page_/button_Myaccount_ShowAll_SetupAddress_save'))

WebUI.click(findTestObject('OB001/Page_/button_Myaccount_ShowAll_SetupAddress_Delete'))

WebUI.click(findTestObject('OB001/Page_/a_ChangeShippingOptions'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245366'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing'
GlobalVariable.test_case = '245367'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an exisiting address'
GlobalVariable.test_case = '245368'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

