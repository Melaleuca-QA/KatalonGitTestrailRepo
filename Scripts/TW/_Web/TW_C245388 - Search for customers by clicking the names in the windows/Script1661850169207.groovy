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
if (true) {
    GlobalVariable.tw_input_newname = 'tw918230'

    GlobalVariable.tw_input_email = ('tw918230' + '@melaleuca.com')

    GlobalVariable.tw_input_mphone = '0922918230'

    GlobalVariable.tw_input_citizen = 'Z167356461'

    GlobalVariable.tw_input_creditcard = '4000173421633592'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('TW/TW Credit Card Number2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('TW/TW Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get ole variables'
    WebUI.callTestCase(findTestCase('TW/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div_stars'), 
    3)) {
    WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForAlert(5)

//WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)
WebUI.click(findTestObject('Object Repository/OB002/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_/div_link startEnrollmentLink'))

WebUI.waitForAlert(5)

'input new enrollment name'
WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('Object Repository/OB002/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/div_BusinessCenter_OLE_SendEmail'))

WebUI.mouseOver(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

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

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.waitForAlert(5)

WebUI.setEncryptedText(findTestObject('Object Repository/OB002/Page_/input_Password'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('Object Repository/OB002/Page_/input_ConfirmPassword'), GlobalVariable.tw_input_newpswd)

'input citizen number'
WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_YearOfBirthEdit'), '1988', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_MonthOfBirthEdit'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_DayOfBirthEdit'), '1', true)

'input phone number'
WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_PrimaryPhoneNumber'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_BusinessCenter_OLE_Proceed'))

WebUI.waitForAlert(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_BusinessCenter_OLE_CityCtrl'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_BusinessCenter_OLE_SuburbCtrl'), '松山區', true)

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_AddressLine1'), '八德路四段760號3樓')

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_Paymethod_CreditCard_AccountHolderName'), GlobalVariable.tw_input_newname)

'input credit card number'
WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_Paymethod_CreditCard_AccountNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_Paymethod_CreditCard_ExpirationMonth'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', 
    true)

WebUI.clickOffset(findTestObject('Object Repository/OB002/Page_/label_PCChkAgree'), 50, 0)

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_BusinessCenter_OLE_AddressConfirm'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_BusinessCenter_OLE_StartShopping'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForAlert(5)

//WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)
WebUI.click(findTestObject('Object Repository/OB002/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_/a_'))

WebUI.waitForAlert(5)
