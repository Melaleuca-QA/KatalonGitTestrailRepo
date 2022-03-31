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
    GlobalVariable.tw_input_newname = 'tw918517'

    GlobalVariable.tw_input_email = ('tw918517' + '@melaleuca.com')

    GlobalVariable.tw_input_mphone = '0922918517'

    GlobalVariable.tw_input_citizen = 'Q237666501'

    GlobalVariable.tw_input_creditcard = '4000171827071375'
} else {
    'get citizen number'
    WebUI.callTestCase(findTestCase('TW/TW Citizen Number'), [:], FailureHandling.STOP_ON_FAILURE)

    'get ole variables'
    WebUI.callTestCase(findTestCase('TW/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('TW/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_enroll_tw'))

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_tw'))

WebUI.click(findTestObject('OB003/Page_/div_link startEnrollmentLink'))

'input new enrollment name'
WebUI.setText(findTestObject('OB003/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('OB003/Page_/input_txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_SendEmail'))

WebUI.mouseOver(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.click(findTestObject('OB003/Page_/span_BusinessCenter_OLE_FirstEnrollee'))

WebUI.click(findTestObject('OB003/Page_/span_BusinessCenter_OLE_FirstEnrollee_RegionEdit'))

'Change the country to Hong Kong'
WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_FirstEnrollee_RegionEdit'), '1', true)

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_FirstEnrollee_Save'))

WebUI.click(findTestObject('OB003/Page_/span_BusinessCenter_OLE_FirstEnrollee_RegionEdit'))

'Change the country to Taiwan'
WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_FirstEnrollee_RegionEdit'), '0', true)

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_FirstEnrollee_Save'))

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_EmailAddress'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tw_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_Password'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_ConfirmPassword'), GlobalVariable.tw_input_newpswd)

'input citizen number'
WebUI.setText(findTestObject('OB003/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

'Citizen'
WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_CitizenType'), '1', true)

'Foreigner'
WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_CitizenType'), '2', true)

'Emigrate'
WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_CitizenType'), '4', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_YearOfBirthEdit'), '1988', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_DayOfBirthEdit'), '1', true)

'input phone number'
WebUI.setText(findTestObject('OB003/Page_/input_PrimaryPhoneNumber.PhoneNumber'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Proceed'))

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_CityCtrl'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_BusinessCenter_OLE_SuburbCtrl'), '松山區', true)

WebUI.setText(findTestObject('OB003/Page_/input_AddressLine1'), '八德路四段760號3樓')

WebUI.setText(findTestObject('OB003/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.tw_input_newname)

'input credit card number'
WebUI.setText(findTestObject('OB003/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', true)

WebUI.clickOffset(findTestObject('OB003/Page_/label_PCChkAgree'), 50, 0)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForPageLoad(100)

WebUI.delay(3)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_AddressConfirm'))

WebUI.focus(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_StartShopping'))

WebUI.refresh()

WebUI.refresh()

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

//WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1'))
WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_ProductFamily'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Complete an enrollment in Taiwan'
GlobalVariable.test_case = '251911'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Complete an enrollment in Hong Kong'
GlobalVariable.test_case = '251912'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Enroll a customer with a Citizen Type of Citizen'
GlobalVariable.test_case = '251913'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Enroll a customer with a Citizen Type of Foreigner'
GlobalVariable.test_case = '251914'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Enroll a customer with a Citizen Type of Emigrate'
GlobalVariable.test_case = '251915'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

