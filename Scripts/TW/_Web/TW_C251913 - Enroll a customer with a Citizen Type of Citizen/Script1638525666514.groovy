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

WebUI.setText(findTestObject('OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ Login'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_enroll_tw'))

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_tw'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link startEnrollmentLink'))

'input new enrollment name'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('Object Repository/OB003/Page_/label_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (2)'))

WebUI.mouseOver(findTestObject('OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__1 (5)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (19)'))

'Change the country to Hong Kong'
WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (12)'), '1', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (19)'))

'Change the country to Taiwan'
WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (12)'), '0', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (15)'))

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tw_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (4)'))

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__ConfirmPassword'), GlobalVariable.tw_input_newpswd)

'input citizen number'
WebUI.setText(findTestObject('OB003/Page_/input__GovernmentId'), GlobalVariable.tw_input_citizen)

'Citizen'
WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (10)'), '1', true)

'Foreigner'
WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (10)'), '2', true)

'Emigrate'
WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (10)'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_200120001999199819971996199519941993_9425cf'), 
    '1988', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_ (2)'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_123456789101112131415161718192021222_566da4 (1)'), '1', true)

'input phone number'
WebUI.setText(findTestObject('OB003/Page_/input__PrimaryPhoneNumber.PhoneNumber'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB003/Page_/button__1_2 (5)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (4)'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1 (4)'), '松山區', true)

WebUI.setText(findTestObject('OB003/Page_/input__AddressLine1'), '八德路四段760號3樓')

WebUI.setText(findTestObject('OB003/Page_/input_()_PaymethodViewModel.CreditCardViewM_9e70de'), GlobalVariable.tw_input_newname)

'input credit card number'
WebUI.setText(findTestObject('OB003/Page_/input__PaymethodViewModel.CreditCardViewMod_b0d8b7'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_010203040506070809101112 (1)'), '1', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_202120222023202420252026202720282029_fb3c11 (1)'), '2040', 
    true)

WebUI.clickOffset(findTestObject('Object Repository/OB003/Page_/label_'), 50, 0)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (7)'))

WebUI.waitForPageLoad(100)

WebUI.delay(3)

WebUI.click(findTestObject('OB003/Page_/button_ (6)'))

WebUI.focus(findTestObject('OB003/Page_/button__1'))

WebUI.click(findTestObject('OB003/Page_/button__1'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2'))

WebUI.refresh()

WebUI.refresh()

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

//WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1'))
WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__1_2_3'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_'))

WebUI.closeBrowser()

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

