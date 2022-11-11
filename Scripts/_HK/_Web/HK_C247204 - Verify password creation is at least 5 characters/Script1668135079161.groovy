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
    GlobalVariable.hk_input_newname = 'hk874616'

    GlobalVariable.hk_input_email = ('hk874616' + '@melaleuca.com')

    GlobalVariable.hk_input_mphone = '85251874616'

    GlobalVariable.hk_input_citizen = 'O4485476'

    GlobalVariable.hk_input_creditcard = '4929630631717406'

    GlobalVariable.hk_input_bankno = '4420874616'
} else {
    'get citizen number'
    WebUI.callTestCase(findTestCase('_HK/_General/HK Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get ole variables'
    WebUI.callTestCase(findTestCase('_HK/_General/HK OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('_HK/_General/HK Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_HK/_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_ApplyEnroll_hk'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_hk'))

WebUI.waitForPageLoad(30)

WebUI.focus(findTestObject('OB001/Page_/div_link startEnrollmentLink'))

WebUI.click(findTestObject('OB001/Page_/div_link startEnrollmentLink'))

WebUI.waitForAlert(5)

'input new enrollment name'
WebUI.setText(findTestObject('OB001/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.hk_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('OB001/Page_/input_txtEmailAddress'), GlobalVariable.hk_input_email)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/label_BusinessCenter_OLE_Presenter_ChkAgree'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/label_BusinessCenter_OLE_NewEnroll_ChkAgree'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_SendEmail'))

WebUI.mouseOver(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.hk_input_oleurl = WebUI.getAttribute(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.hk_input_oleurl)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.run_env == 'Test') {
    result1 = GlobalVariable.hk_input_oleurl.substring(0, 12)

    result2 = GlobalVariable.hk_input_oleurl.substring(12)

    now_oleurl = ((result1 + 'test') + result2)

    GlobalVariable.hk_input_oleurl = now_oleurl

    println(GlobalVariable.hk_input_oleurl)
}

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.hk_input_oleurl)

WebUI.maximizeWindow()

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.waitForAlert(5)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), 'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_ConfirmPassword'), 'P9ET2sDE0SE=')

'input citizen number'
WebUI.setText(findTestObject('OB001/Page_/input_GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_YearOfBirthEdit'), '1988', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_DayOfBirthEdit'), '1', true)

'input phone number'
WebUI.setText(findTestObject('OB001/Page_/input_PrimaryPhoneNumber'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Proceed'))

if (WebUI.verifyElementVisible(findTestObject('OB001/Page_/div_pwd_5'))) {
    WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), GlobalVariable.hk_input_newpswd)

    WebUI.setEncryptedText(findTestObject('OB001/Page_/input_ConfirmPassword'), GlobalVariable.hk_input_newpswd)
}

WebUI.click(findTestObject('OB001/Page_/i_fa fa-eye-slash_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/i_fa fa-eye-slash_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Proceed'))

result1 = WebUI.getText(findTestObject('OB001/Page_/p_HK250.0'))

println(result1)

result2 = result1.substring(2, 14)

println(result2)

'HK$250.0 fee'
if (result2 == '會籍費用HK$250.0') {
} else {
    FailureHandling.STOP_ON_FAILURE
}

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_CustomerType'))

WebUI.navigateToUrl(GlobalVariable.url_CustomerType)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_DCSelect'))

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_DCSelect'))

WebUI.waitForAlert(5)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), GlobalVariable.hk_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_ConfirmPassword'), GlobalVariable.hk_input_newpswd)

WebUI.setText(findTestObject('OB001/Page_/input_GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Proceed'))

result1 = WebUI.getText(findTestObject('OB001/Page_/label_BusinessCenter_OLE_NewEnroll_ChkAgree'))

println(result1)

result2 = result1.substring(0, 14)

println(result2)

'I agree'
if (result2 == '我授權美商亞洲美樂家有限公司') {
} else {
    FailureHandling.STOP_ON_FAILURE
}

WebUI.waitForAlert(5)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_CityCtrl'), '852', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_Region'), '香港', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_SuburbName'), '中環', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressLine1'), 'testaddress1')

WebUI.setText(findTestObject('OB001/Page_/input_AddressLine2'), 'testaddress2')

WebUI.setText(findTestObject('OB001/Page_/textarea_DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('OB001/Page_/input_PaymethodViewModel'), GlobalVariable.hk_input_newname)

println(GlobalVariable.hk_input_creditcard)

'input credit card number'
WebUI.setText(findTestObject('OB001/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.hk_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', true)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_NewEnroll_ChkAgree'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_NewEnroll_ChkAgree'))

WebUI.clickOffset(findTestObject('OB001/Page_/label_BusinessCenter_OLE_DCChkAgree2'), 50, 0)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB001/Page_/button_BusinessCenter_OLE_IMEA_Start'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_BasePaymethodViewModel.AccountHolderName'), GlobalVariable.hk_input_newname)

WebUI.click(findTestObject('OB001/Page_/span_HK_HSBC Banking'))

WebUI.setText(findTestObject('OB001/Page_/input_BasePaymethodViewModel.AccountNumber'), GlobalVariable.hk_input_bankno)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_IMEA_ParticipationLevel'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_IMEA_PCChkAgree'))

WebUI.setText(findTestObject('OB001/Page_/input_EnrolleeDigitalSignature'), GlobalVariable.hk_input_newname)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_IMEA_Submit'))

WebUI.waitForAlert(5)

'開始購物'
WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_StartShopping_hk'))

WebUI.waitForAlert(5)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_MyAccount'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_MyAccount_SetupPaymethod'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_MyAccount_SetupPaymethod_Edit'))

WebUI.selectOptionByValue(findTestObject('OB001/Page_Melaleuca The Wellness Company/select_MyAccount_SetupPaymethod_Edit_Month'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_Melaleuca The Wellness Company/select_MyAccount_SetupPaymethod_Edit_Year'), 
    '2039', true)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_MyAccount_SetupPaymethod_save'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify password creation is at least 5 characters'
GlobalVariable.test_case = '247204'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the "Show" feature shows correct password information'
GlobalVariable.test_case = '247205'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify correct membership fee is displayed (if Preferred)'
GlobalVariable.test_case = '247206'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify functionality of all fields on the Account Information tab'
GlobalVariable.test_case = '247207'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit CC after info has been entered '
GlobalVariable.test_case = '247209'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Opt Out of text / email notifications'
GlobalVariable.test_case = '247210'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Opt Out of text / email notifications'
GlobalVariable.test_case = '247203'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

