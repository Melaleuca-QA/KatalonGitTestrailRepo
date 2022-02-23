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
} else {
    'get ole variables'
    WebUI.callTestCase(findTestCase('HK/HK OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('HK/HK Citizen Number'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('HK/HK Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

'Running mode'
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ Login'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link startEnrollmentLink'))

'input new enrollment name'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtNewEnrolleeFirstName'), GlobalVariable.hk_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtEmailAddress'), GlobalVariable.hk_input_email)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/label_ (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/label__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/label_60 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1 (2)'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1_2 (2)'))
WebUI.mouseOver(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'))

GlobalVariable.hk_input_oleurl = WebUI.getAttribute(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'), 
    'value')

println(GlobalVariable.hk_input_oleurl)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.hk_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (4)'))

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), 'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__ConfirmPassword'), 'P9ET2sDE0SE=')

'input citizen number'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_200120001999199819971996199519941993_9425cf'), 
    '1988', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (2)'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_123456789101112131415161718192021222_566da4 (1)'), 
    '1', true)

'input phone number'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__PrimaryPhoneNumber.PhoneNumber'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (5) (2)'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/OB003/Page_/div_5'))) {
    WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.hk_input_newpswd)

    WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__ConfirmPassword'), GlobalVariable.hk_input_newpswd)
}

WebUI.click(findTestObject('Object Repository/OB003/Page_/i__fa fa-eye-slash_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OB003/Page_/i__fa fa-eye-slash'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (5) (2)'))

result1 = WebUI.getText(findTestObject('Object Repository/OB003/Page_/p_HK250.0'))

println(result1)

result2 = result1.substring(2, 14)

println(result2)

'HK$250.0 fee'
if (result2 == '會籍費用HK$250.0') {
} else {
    FailureHandling.STOP_ON_FAILURE
}

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__disc'))

WebUI.navigateToUrl(GlobalVariable.url_CustomerType)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (19)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (31)'))

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.hk_input_newpswd)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__ConfirmPassword'), GlobalVariable.hk_input_newpswd)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (5) (2)'))

result1 = WebUI.getText(findTestObject('Object Repository/OB003/Page_/label_ (6)'))

println(result1)

result2 = result1.substring(0, 14)

println(result2)

'I agree'
if (result2 == '我授權美商亞洲美樂家有限公司') {
} else {
    FailureHandling.STOP_ON_FAILURE
}

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1 (2)'), '852', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_ (5)'), '香港', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select__1 (5)'), '中環', true)

WebUI.setText(findTestObject('OB003/Page_/input__AddressLine1'), 'testaddress1')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_(03,11,2)_AddressLine2 (1)'), 'testaddress2')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/textarea__DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_()_PaymethodViewModel.CreditCardViewM_9e70de (1)'), GlobalVariable.hk_input_newname)

println(GlobalVariable.hk_input_creditcard)

'input credit card number'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__PaymethodViewModel.CreditCardViewMod_b0d8b7'), GlobalVariable.hk_input_creditcard)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_010203040506070809101112 (1)'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_202120222023202420252026202720282029_fb3c11 (1)'), 
    '2040', true)

WebUI.click(findTestObject('OB003/Page_/label_ (6)'))

WebUI.click(findTestObject('OB003/Page_/label_ (6)'))

WebUI.clickOffset(findTestObject('Object Repository/OB003/Page_/label_ (5)'), 50, 0)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (15)'))

WebUI.waitForPageLoad(100)

WebUI.delay(3)

'開始購物'
WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3 (8)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (16)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_()'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span__1_2 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/select_010203040506070809101112'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_Melaleuca The Wellness Company/select_202120222023202420252026202720282029_fb3c11 (2)'), 
    '2039', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (8)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (38)'))

WebUI.closeBrowser()

'Verify password creation is at least 5 characters'
GlobalVariable.test_case = '247204'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the "Show" feature shows correct password information'
GlobalVariable.test_case = '247205'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify correct membership fee is displayed (if Preferred)'
GlobalVariable.test_case = '247206'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify functionality of all fields on the Account Information tab'
GlobalVariable.test_case = '247207'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit CC after info has been entered '
GlobalVariable.test_case = '247209'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Opt Out of text / email notifications'
GlobalVariable.test_case = '247210'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can Opt Out of text / email notifications'
GlobalVariable.test_case = '247203'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

