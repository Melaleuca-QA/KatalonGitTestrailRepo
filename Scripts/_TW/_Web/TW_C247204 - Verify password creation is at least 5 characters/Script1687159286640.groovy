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
    GlobalVariable.tw_input_newname = 'tw918219'

    GlobalVariable.tw_input_email = ('tw918219' + '@melaleuca.com')

    GlobalVariable.tw_input_mphone = '0922918219'

    GlobalVariable.tw_input_citizen = 'L271440029'

    GlobalVariable.tw_input_creditcard = '4000176777723776'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get ole variables'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_Web/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_/div_link startEnrollmentLink'))

WebUI.waitForAlert(10)

'input new enrollment name'
WebUI.setText(findTestObject('OB_Web/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('OB_Web/Page_/input_txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_SendEmail'))

WebUI.mouseOver(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

if (GlobalVariable.run_env == 'Test') {
    result1 = GlobalVariable.tw_input_oleurl.substring(0, 12)

    result2 = GlobalVariable.tw_input_oleurl.substring(12)

    now_oleurl = ((result1 + 'test') + result2)

    GlobalVariable.tw_input_oleurl = now_oleurl

    println(GlobalVariable.tw_input_oleurl)
}

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tw_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), 'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_ConfirmPassword'), 'P9ET2sDE0SE=')

'input citizen number'
WebUI.setText(findTestObject('OB_Web/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_YearOfBirthEdit'), '1988', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_DayOfBirthEdit'), '1', true)

'input phone number'
WebUI.setText(findTestObject('OB_Web/Page_/input_PrimaryPhoneNumber'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Proceed'))

if (WebUI.verifyElementVisible(findTestObject('OB_Web/Page_/div_pwd_5'))) {
    WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.hk_input_newpswd)

    WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_ConfirmPassword'), GlobalVariable.hk_input_newpswd)
}

WebUI.click(findTestObject('OB_Web/Page_/i_fa fa-eye-slash_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/i_fa fa-eye-slash_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Proceed'))

result1 = WebUI.getText(findTestObject('OB_Web/Page_/span_BusinessCenter_OLE_PCInfo'))

println(result1)

result2 = result1.substring(4, 15)

println(result2)

'TW$1000 fee'
if (result2 == '入會費新台幣1000元') {
}

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_CustomerType'))

WebUI.navigateToUrl(GlobalVariable.url_CustomerType)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_DCSelect'))

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_DCSelect'))

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.hk_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_ConfirmPassword'), GlobalVariable.hk_input_newpswd)

WebUI.setText(findTestObject('OB_Web/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Proceed'))

result1 = WebUI.getText(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_DCChkAgree1'))

println(result1)

result2 = result1.substring(2, 12)

println(result2)

'20 ages'
if (result2 == '本人已滿20歲') {
}

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_BusinessCenter_OLE_CityCtrl'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_BusinessCenter_OLE_SuburbCtrl'), '松山區', true)

WebUI.setText(findTestObject('OB_Web/Page_/input_AddressLine1'), '八德路四段760號3樓')

WebUI.setText(findTestObject('OB_Web/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.tw_input_newname)

'input credit card number'
WebUI.setText(findTestObject('OB_Web/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', true)

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_DCChkAgree1'))

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_DCChkAgree1'))

WebUI.clickOffset(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_DCChkAgree2'), 50, 0)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_AddressConfirm'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_StartShopping'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_MyAccount'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_MyAccount_SetupPaymethod'))

WebUI.navigateToUrl(GlobalVariable.url_ChangePaymethods)

WebUI.click(findTestObject('OB_Web/Page_/span_MyAccount_SetupPaymethod_Edit'))

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/select_MyAccount_SetupPaymethod_Edit_Month'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/select_MyAccount_SetupPaymethod_Edit_Year'), 
    '2039', true)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_MyAccount_SetupPaymethod_AddCreditCard_save'))

WebUI.waitForAlert(10)

WebUI.callTestCase(findTestCase('_TW/_Web/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify password creation is at least 5 characters'
GlobalVariable.test_case = '247204'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the "Show" feature shows correct password information'
GlobalVariable.test_case = '247205'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify correct membership fee is displayed (if Preferred)'
GlobalVariable.test_case = '247206'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify functionality of all fields on the Account Information tab'
GlobalVariable.test_case = '247207'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit CC after info has been entered '
GlobalVariable.test_case = '247209'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Opt Out of text / email notifications'
GlobalVariable.test_case = '247210'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Opt Out of text / email notifications'
GlobalVariable.test_case = '247203'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

