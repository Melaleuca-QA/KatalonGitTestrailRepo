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
    GlobalVariable.hk_input_newname = 'hk918211'

    GlobalVariable.hk_input_email = ('hk918211' + '@melaleuca.com')

    GlobalVariable.hk_input_mphone = '85251918211'

    GlobalVariable.hk_input_citizen = 'I0355571'

    GlobalVariable.hk_input_creditcard = '4080198467858103'
} else {
    'get ole variables'
    WebUI.callTestCase(findTestCase('HK/HK OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('HK/HK Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('HK/HK Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_ApplyEnroll_hk'))

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_hk'))

WebUI.click(findTestObject('OB001/Page_/div_link startEnrollmentLink'))

WebUI.setText(findTestObject('OB001/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.hk_input_newname)

WebUI.setText(findTestObject('OB001/Page_/input_txtEmailAddress'), GlobalVariable.hk_input_email)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_SendEmail'))

//WebUI.click(findTestObject('OB002/Page_/div__1 (5) (1)'))
//WebUI.click(findTestObject('OB002/Page_/div__1_2 (2) (1)'))
WebUI.mouseOver(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.hk_input_oleurl = WebUI.getAttribute(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.hk_input_oleurl)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_InvitationName'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_Invitation_edit'))

WebUI.setText(findTestObject('OB001/Page_/input_txtMobilePhone'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_CancelResend'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_InvitationName'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_Invitation_edit'))

'Region is TW'
WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_ BusinessCenter_OLE_Invitation_Region'), '0', true)

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_Invitation_edit'))

'Region is HK'
WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_ BusinessCenter_OLE_Invitation_Region'), '1', true)

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_CancelResend'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

// test env //
if (GlobalVariable.run_env == 'Test') {
    result1 = GlobalVariable.hk_input_oleurl.substring(0, 12)

    result2 = GlobalVariable.hk_input_oleurl.substring(12)

    now_oleurl = ((result1 + 'test') + result2)

    GlobalVariable.hk_input_oleurl = now_oleurl

    println(GlobalVariable.hk_input_oleurl)
}

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/BusinessCenter/Enrollments/NewEnrollment')
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.hk_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), GlobalVariable.hk_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_ConfirmPassword'), GlobalVariable.hk_input_newpswd)

println(GlobalVariable.hk_input_citizen)

'input citizen number'
WebUI.setText(findTestObject('OB001/Page_/input_GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_DayOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_YearOfBirthEdit'), '1988', true)

println(GlobalVariable.hk_input_mphone)

'input phone number'
WebUI.setText(findTestObject('OB001/Page_/input_PrimaryPhoneNumber'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Proceed'))

WebUI.focus(findTestObject('OB001/Page_/select_BusinessCenter_OLE_CityCtrl'))

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_CityCtrl'), '852', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_Region'), '香港', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_SuburbName'), '中環', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressLine1'), 'testaddress1')

WebUI.setText(findTestObject('OB001/Page_/input_AddressLine2'), 'testaddress2')

WebUI.setText(findTestObject('OB001/Page_/textarea_DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('OB001/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.hk_input_newname)

println(GlobalVariable.hk_input_creditcard)

'input credit card number'
WebUI.setText(findTestObject('OB001/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.hk_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', true)

WebUI.clickOffset(findTestObject('OB001/Page_/label_PCChkAgree'), 50, 0)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForPageLoad(100)

WebUI.focus(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_Confirm'))

WebUI.navigateToUrl(GlobalVariable.url_MarketingExecutive)

WebUI.setText(findTestObject('OB001/Page_/input_BasePaymethodViewModel.AccountHolderName'), GlobalVariable.hk_input_newname)

WebUI.click(findTestObject('OB001/Page_/span_HK_HSBC Banking'))

//WebUI.selectOptionByValue(findTestObject('OB001/Page_/span_The Hongkong and Shanghai Banking'), '004 香港上海滙豐銀行有限公司The Hongkong and Shanghai Banking Corporation Ltd', 
//    false)
WebUI.setText(findTestObject('OB001/Page_/input_BasePaymethodViewModel.AccountNumber'), GlobalVariable.hk_input_bankno)

WebUI.doubleClick(findTestObject('OB001/Page_/label_BusinessCenter_OLE_IMEA_ParticipationLevel'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_IMEA_PCChkAgree'))

WebUI.setText(findTestObject('OB001/Page_/input_EnrolleeDigitalSignature'), GlobalVariable.hk_input_newname)

'Add spouse information'
WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_IMEA_AddSpouse'))

WebUI.click(findTestObject('OB001/Page_/body_iframe srchttpswww.googletagmanager.co'))

WebUI.setText(findTestObject('OB001/Page_/input_SpouseFirstName'), GlobalVariable.hk_input_spouse_name)

WebUI.setText(findTestObject('OB001/Page_/input_SpouseEnglishName'), GlobalVariable.hk_input_spouse_name)

WebUI.setText(findTestObject('OB001/Page_/input_SpouseEmailAddress'), GlobalVariable.hk_input_spouse_email)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_SpousePhoneType'), 'HomePhone', true)

WebUI.setText(findTestObject('OB001/Page_/input_SpousePrimaryPhoneNumber'), GlobalVariable.hk_input_spouse_mphone)

WebUI.doubleClick(findTestObject('OB001/Page_/label_SpouseChkAgree'))

WebUI.setText(findTestObject('OB001/Page_/input_EnrolleeDigitalSignature'), GlobalVariable.hk_input_newname)

WebUI.setText(findTestObject('OB001/Page_/input_SpouseDigitalSignature'), GlobalVariable.hk_input_spouse_name)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_IMEA_Submit'))

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_StartShopping_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.setText(findTestObject('OB001/Page_/input_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.navigateToUrl(GlobalVariable.url_Cart)

WebUI.click(findTestObject('OB001/Page_/button_BottomProceedtoCheckout'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_hk'))

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.click(findTestObject('OB001/Page_/button_TopCheckout_PlaceOrder'))

WebUI.waitForPageLoad(100)

WebUI.navigateToUrl(GlobalVariable.url_latest)

WebUI.click(findTestObject('OB001/Page_/a_Logout'))

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.setText(findTestObject('OB001/Page_/input_Email_UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB001/Page_/button_Login'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_enroll_hk'))

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_hk'))

WebUI.click(findTestObject('Object Repository/OB001/Page_/a_BusinessCenter_OLE_ConfirmDetails'))

WebUI.waitForPageLoad(100)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ConfirmDetails_Presenter_Edit'))

WebUI.setText(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/input_txtPresenterSearch'), '0988297237')

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchPresenter'))

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchPresenter_Cancel'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ConfirmDetails_SuppleTeam_Edit'))

WebUI.setText(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/input_txtSupportTeamSearch'), 
    '0988297237')

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchSupportTeam'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchSuppleTeam_Cancel'))

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_Continue'))

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_OLE_ConfirmDetails_Return'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to edit invite information'
GlobalVariable.test_case = '247190'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify correct link for Confirm Details, Edit Presenter and Support Marketing Executive'
GlobalVariable.test_case = '247193'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
