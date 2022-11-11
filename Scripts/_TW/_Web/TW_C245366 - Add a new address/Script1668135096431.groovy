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

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_MyAccount'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_MyAccountShowAll'))

WebUI.click(findTestObject('OB001/Page_/span_Myaccount_ShowAll_SetupAddress'))

WebUI.click(findTestObject('OB001/Page_/button_Myaccount_ShowAll_SetupAddress_add'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.ShipToName_tw'), 'hsipaddress')

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_city_tw'), '基隆市', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_suburb_tw'), '仁愛區', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine1'), 'hsipaddress1')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), 'hsipaddress2')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.DeliveryInstruction'), 'do not ship')

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_edit2'))

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine1'), 'hsipaddress3')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), 'hsipaddress4')

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

WebUI.waitForAlert(5)

now_url = WebUI.getUrl()

println(now_url)

if (now_url != GlobalVariable.url_ChangeAddress2) {
    WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

    WebUI.waitForAlert(5)
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_Checkout_ChangeAddress_delete'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245366'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing'
GlobalVariable.test_case = '245367'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an exisiting address'
GlobalVariable.test_case = '245368'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

