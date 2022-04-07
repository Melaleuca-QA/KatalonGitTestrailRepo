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
    'get ole variables'
    WebUI.callTestCase(findTestCase('TW/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('TW/TW Citizen Number'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('TW/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

'Running mode'
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OB001/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB001/Page_/button_Login'))

WebUI.click(findTestObject('OB002/Page_Melaleuca The Wellness Company/div_ (4) (1)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_enroll_tw'))

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_tw'))

WebUI.click(findTestObject('OB001/Page_/div_link startEnrollmentLink'))

'input new enrollment name'
WebUI.setText(findTestObject('OB001/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('OB001/Page_/input_txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_SendEmail'))

WebUI.mouseOver(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.click(findTestObject('OB002/Page_/span_tw918211'))

WebUI.click(findTestObject('OB002/Page_/span_ (12)'))

WebUI.setText(findTestObject('OB002/Page_/input__txtMobilePhone (1)'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB002/Page_/div_ (12)'))

WebUI.click(findTestObject('OB002/Page_/div__1 (4)'))

WebUI.click(findTestObject('OB002/Page_/span_tw918211'))

WebUI.click(findTestObject('OB002/Page_/span_ (12)'))

'TW'
WebUI.selectOptionByValue(findTestObject('OB002/Page_/select_ (8)'), '1', true)

'HK'
WebUI.selectOptionByValue(findTestObject('OB002/Page_/select_ (13)'), '0', true)

WebUI.click(findTestObject('OB002/Page_/div_ (12)'))

WebUI.click(findTestObject('OB002/Page_/div__1 (4)'))

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tw_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_Password'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input_ConfirmPassword'), GlobalVariable.tw_input_newpswd)

'input citizen number'
WebUI.setText(findTestObject('OB001/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_YearOfBirthEdit'), 
    '1988', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_DayOfBirthEdit'), '1', true)

'input phone number'
WebUI.setText(findTestObject('OB001/Page_/input_PrimaryPhoneNumber'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Proceed'))

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_CityCtrl'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_BusinessCenter_OLE_SuburbCtrl'), '松山區', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressLine1'), '八德路四段760號3樓')

WebUI.setText(findTestObject('OB001/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.tw_input_newname)

'input credit card number'
WebUI.setText(findTestObject('OB001/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', 
    true)

WebUI.clickOffset(findTestObject('OB001/Page_/label_PCChkAgree'), 50, 0)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForPageLoad(100)

WebUI.delay(3)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_AddressConfirm'))

WebUI.focus(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_StartShopping'))

