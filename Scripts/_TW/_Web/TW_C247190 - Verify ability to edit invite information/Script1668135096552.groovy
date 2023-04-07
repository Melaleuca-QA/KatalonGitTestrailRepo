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
    GlobalVariable.tw_input_newname = 'tw918211'

    GlobalVariable.tw_input_email = ('tw918211' + '@melaleuca.com')

    GlobalVariable.tw_input_mphone = '0922918211'

    GlobalVariable.tw_input_citizen = 'X227185629'

    GlobalVariable.tw_input_creditcard = '4000172770045002'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_TW/_General/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('_TW/_General/TW Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get ole variables'
    WebUI.callTestCase(findTestCase('_TW/_General/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/div_link startEnrollmentLink'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_Web/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

WebUI.setText(findTestObject('OB_Web/Page_/input_txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB_Web/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_SendEmail'))

WebUI.waitForAlert(5)

WebUI.mouseOver(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/span_BusinessCenter_OLE_InvitationName'))

WebUI.click(findTestObject('OB_Web/Page_/span_BusinessCenter_OLE_Invitation_edit'))

WebUI.setText(findTestObject('OB_Web/Page_/input_txtMobilePhone1'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_Invitation_CancelResend'))

WebUI.click(findTestObject('OB_Web/Page_/span_BusinessCenter_OLE_InvitationName'))

WebUI.click(findTestObject('OB_Web/Page_/span_BusinessCenter_OLE_Invitation_edit'))

'Region is TW'
WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_ BusinessCenter_OLE_Invitation_Region'), '1', true)

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/span_BusinessCenter_OLE_Invitation_edit'))

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_ BusinessCenter_OLE_Invitation_Region'), '0', true)

'Region is HK'
WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/div_BusinessCenter_OLE_Invitation_CancelResend'))

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

// test env //
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

WebUI.waitForAlert(5)

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_ConfirmPassword'), GlobalVariable.tw_input_newpswd)

'input citizen number'
WebUI.setText(findTestObject('OB_Web/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_YearOfBirthEdit'), '1988', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_DayOfBirthEdit'), '1', true)

'input phone number'
WebUI.setText(findTestObject('OB_Web/Page_/input_PrimaryPhoneNumber'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Proceed'))

WebUI.waitForAlert(5)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_BusinessCenter_OLE_CityCtrl'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_BusinessCenter_OLE_SuburbCtrl'), '松山區', true)

WebUI.setText(findTestObject('OB_Web/Page_/input_AddressLine1'), '八德路四段760號3樓')

WebUI.setText(findTestObject('OB_Web/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.tw_input_newname)

'input credit card number'
WebUI.setText(findTestObject('OB_Web/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB_Web/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', true)

WebUI.clickOffset(findTestObject('OB_Web/Page_/label_PCChkAgree'), 50, 0)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_AddressConfirm'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_BusinessCenter_OLE_StartShopping'))

WebUI.waitForAlert(5)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.setText(findTestObject('OB_Web/Page_/input_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_Cart)

WebUI.click(findTestObject('OB_Web/Page_/button_BottomProceedtoCheckout'))

WebUI.waitForAlert(5)

now_url = WebUI.getUrl()

println(now_url)

'CheckoutPromo Page'
if (now_url == GlobalVariable.url_CheckoutPromo) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_NoMorePurchase_tw'))
}

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_Web/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_TopCheckout_PlaceOrder'))

if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_latest)

if (true) {
    WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('_TW/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('OB_Web/Page_/a_Logout_tw'))

    WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

    WebUI.setText(findTestObject('OB_Web/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

    WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.tw_input_password1)

    WebUI.click(findTestObject('OB_Web/Page_/button_Login'))
}

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_BusinessCenter_OLE_ConfirmDetails'))

WebUI.refresh()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ConfirmDetails_Presenter_Edit'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/input_txtPresenterSearch'), '0988297237')

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchPresenter'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchPresenter_Cancel'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ConfirmDetails_SuppleTeam_Edit'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/input_txtSupportTeamSearch'), 
    '0988297237')

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchSupportTeam'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_SearchSuppleTeam_Cancel'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_ConfirmDetails_Continue'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/a_BusinessCenter_OLE_ConfirmDetails_Return'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to edit invite information'
GlobalVariable.test_case = '247190'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify correct link for Confirm Details, Edit Presenter and Support Marketing Executive'
GlobalVariable.test_case = '247193'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

