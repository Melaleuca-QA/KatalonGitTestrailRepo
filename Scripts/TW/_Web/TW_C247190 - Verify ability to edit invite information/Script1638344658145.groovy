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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ Login'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_enroll_tw'))

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_tw'))

WebUI.click(findTestObject('OB003/Page_/div_link startEnrollmentLink'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtNewEnrolleeFirstName (1)'), GlobalVariable.tw_input_newname)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtEmailAddress (1)'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('Object Repository/OB003/Page_/label_ (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label__1 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label__1_2 (1)'))

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_SendEmail'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1 (5)'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2 (2)'))

WebUI.mouseOver(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('OB003/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_tw918211 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (13)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtMobilePhone (2)'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_tw918211 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (13)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (9)'), '1', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (13)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (9)'), '0', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4_5'))

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/BusinessCenter/Enrollments/NewEnrollment')
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tw_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_PCselect'))

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_Password'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_ConfirmPassword'), GlobalVariable.tw_input_newpswd)

'input citizen number'
WebUI.setText(findTestObject('OB003/Page_/input_GovernmentId'), GlobalVariable.tw_input_citizen)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_YearOfBirthEdit'), 
    '1988', true)

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

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Paymethod_CreditCard_ExpirationYear'), '2040', 
    true)

WebUI.clickOffset(findTestObject('OB003/Page_/label_PCChkAgree'), 50, 0)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Continue'))

WebUI.waitForPageLoad(100)

WebUI.delay(3)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_AddressConfirm'))

WebUI.focus(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_Submit'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('OB003/Page_/button_BusinessCenter_OLE_StartShopping'))

