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

'Login'
WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_BusinessCenter_ApplyEnroll_hk'))

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_hk'))

WebUI.click(findTestObject('OB003/Page_/div_link startEnrollmentLink'))

//WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__pageOverlay (1)'))
'input new enrollment name'
WebUI.setText(findTestObject('OB003/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.hk_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('OB003/Page_/input_txtEmailAddress'), GlobalVariable.hk_input_email)

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_SendEmail'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1_2 (2)'))
WebUI.mouseOver(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.hk_input_oleurl = WebUI.getAttribute(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.hk_input_oleurl)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.hk_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_Password'), GlobalVariable.hk_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_ConfirmPassword'), GlobalVariable.hk_input_newpswd)

println(GlobalVariable.hk_input_citizen)

'input citizen number'
WebUI.setText(findTestObject('OB003/Page_/input_GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_DayOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_YearOfBirthEdit'), '1988', true)

println(GlobalVariable.hk_input_mphone)

'input phone number'
WebUI.setText(findTestObject('OB003/Page_/input_PrimaryPhoneNumber.PhoneNumber'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Proceed'))

WebUI.focus(findTestObject('OB003/Page_/select_BusinessCenter_OLE_City'))

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_City'), '852', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_ BusinessCenter_OLE_Region'), '香港', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_SuburbName'), '中環', true)

WebUI.setText(findTestObject('OB003/Page_/input_AddressLine1'), 'testaddress1')

WebUI.setText(findTestObject('OB003/Page_/input_AddressLine2'), 'testaddress2')

WebUI.setText(findTestObject('OB003/Page_/textarea_DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('OB003/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.hk_input_newname)

println(GlobalVariable.hk_input_creditcard)

'input credit card number'
WebUI.setText(findTestObject('OB003/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.hk_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', true)

WebUI.clickOffset(findTestObject('OB003/Page_/label_chkAgree'), 50, 0)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForPageLoad(100)

WebUI.focus(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (21)'))

WebUI.navigateToUrl(GlobalVariable.url_MarketingExecutive)

WebUI.setText(findTestObject('OB003/Page_/input_BasePaymethodViewModel.AccountHolderName'), GlobalVariable.hk_input_newname)

WebUI.click(findTestObject('OB003/Page_/span_004 HK_SH Banking'))

//WebUI.selectOptionByValue(findTestObject('OB003/Page_/span_004 The Hongkong and Shanghai Banking _f1933e'), '004 香港上海滙豐銀行有限公司The Hongkong and Shanghai Banking Corporation Ltd', 
//    false)
WebUI.setText(findTestObject('OB003/Page_/input_BasePaymethodViewModel.AccountNumber'), GlobalVariable.hk_input_bankno)

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_/label (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label_,   , 18()1.2.3'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_hk918212_EnrolleeDigitalSignature'), GlobalVariable.hk_input_newname)

'Add spouse information'
WebUI.click(findTestObject('Object Repository/OB003/Page_/span_()'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/body_iframe srchttpswww.googletagmanager.co_71ec2f (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__SpouseFirstName'), GlobalVariable.hk_input_spouse_name)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_()_SpouseEnglishName'), GlobalVariable.hk_input_spouse_name)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__SpouseEmailAddress'), GlobalVariable.hk_input_spouse_email)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2 (2)'), 'HomePhone', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__SpousePrimaryPhoneNumber.PhoneNumber'), GlobalVariable.hk_input_spouse_mphone)

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_/label_,   , 18()1.2.3 (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_hk918216_EnrolleeDigitalSignature'), GlobalVariable.hk_input_newname)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_hksp918216_SpouseDigitalSignature'), GlobalVariable.hk_input_spouse_name)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (33)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1 (9)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__1_2_3'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__1 (7)'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__1_2 (5)'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Start an enrollment, verify enrollment form comes up'
GlobalVariable.test_case = '245566'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify that OLE is secure (https in the url)'
GlobalVariable.test_case = '245567'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Complete an enrollment in every country of the software system'
GlobalVariable.test_case = '251905'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to send invite by email'
GlobalVariable.test_case = '245568'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Start Shopping'
GlobalVariable.test_case = '247197'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can continue to the IMEA'
GlobalVariable.test_case = '247198'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Complete the Earn Commissions and Bonuses section'
GlobalVariable.test_case = '247183'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add spouse information'
GlobalVariable.test_case = '247185'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Digital Signature'
GlobalVariable.test_case = '247186'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

