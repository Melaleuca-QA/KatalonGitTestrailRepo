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
    GlobalVariable.tw_input_newname = 'tw918209'

    GlobalVariable.tw_input_email = ('tw918209' + '@melaleuca.com')

    GlobalVariable.tw_input_mphone = '0922918209'

    GlobalVariable.tw_input_citizen = 'J173624468'

    GlobalVariable.tw_input_creditcard = '4000176233801257'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_HK/_General/HK Credit Card Number2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('_HK/_General/HK Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get ole variables'
    WebUI.callTestCase(findTestCase('_HK/_General/HK OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_DataEntry)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/i_left fa fa-bars'))

WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/ExpressFormFeature'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/select_zh-TWzh-HK'), 
    'zh-HK', true)

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_CustomerName'), GlobalVariable.hk_input_newname)

WebUI.click(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_govermentId'))

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_govermentId'), GlobalVariable.hk_input_citizen)

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_birthday'), '1972/06/02')

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_mobileNumber'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_chk_TestCustomer'))

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_Shipping_Address'), 'testaddress')

WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/input_txt_Shipping_AddressLine2'), 
    '12F')

WebUI.selectOptionByValue(findTestObject('OB_DataEntry/Page_Customer Document Management System/select_shipping_City'), 
    'string:香港', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/select_shipping_Region'), 
    'string:香港', true)

WebUI.selectOptionByValue(findTestObject('OB_DataEntry/Page_Customer Document Management System/select_Shipping_Subburb'), 
    'string:半山', true)

WebUI.selectOptionByValue(findTestObject('OB_DataEntry/Page_Customer Document Management System/select_paymethodList'), 
    '2', true)

WebUI.click(findTestObject('OB_DataEntry/Page_Customer Document Management System/button_PaymethodOprionList'))

WebUI.click(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_Inbound_Account'))

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_Inbound_Account'), GlobalVariable.hk_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_DataEntry/Page_Customer Document Management System/select_Exp_Month'), 'string:7', 
    true)

WebUI.selectOptionByValue(findTestObject('OB_DataEntry/Page_Customer Document Management System/select_Exp_Year'), 'string:2030', 
    true)

WebUI.selectOptionByValue(findTestObject('OB_DataEntry/Page_Customer Document Management System/select_CommitmentLevel'), 
    'number:77', true)

WebUI.setText(findTestObject('OB_DataEntry/Page_Customer Document Management System/input_txt_Enroller'), GlobalVariable.hk_DataEntry_Enroller)

WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/search_Enroller_hk'))

WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/search_Manager_hk'))

WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_Customer Document Management System/button_Save_HK'))

WebUI.waitForAlert(20)

WebUI.closeBrowser()

