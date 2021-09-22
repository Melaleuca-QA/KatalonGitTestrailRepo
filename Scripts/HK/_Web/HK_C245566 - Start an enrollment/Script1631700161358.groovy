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
if (1 == 2) {
    GlobalVariable.hk_input_newname = 'hk918210'

    GlobalVariable.hk_input_email = ('hk918210' + '@melaleuca.com')

    GlobalVariable.hk_input_mphone = '85251918210'

    GlobalVariable.hk_input_citizen = 'X56163410'

    GlobalVariable.hk_input_creditcard = '4539787274187123'
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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName (5)'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password (5)'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__link startEnrollmentLink (2)'))

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__pageOverlay (1)'))

'input new enrollment name'
WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__txtNewEnrolleeFirstName (2)'), 
    GlobalVariable.hk_input_newname)

'input new enrollment email'
WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__txtEmailAddress (2)'), 
    GlobalVariable.hk_input_email)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/label_ (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/label__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/label_60 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1_2 (2)'))

WebUI.focus(findTestObject('OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'))

GlobalVariable.hk_input_oleurl = WebUI.getAttribute(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'), 
    'value')

println(GlobalVariable.hk_input_oleurl)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (4)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.hk_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (4)'))

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password (6)'), GlobalVariable.hk_input_newpswd)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__ConfirmPassword (1)'), GlobalVariable.hk_input_newpswd)

println(GlobalVariable.hk_input_citizen)

'input citizen number'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__GovernmentId'), GlobalVariable.hk_input_citizen)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_123456789101112131415161718192021222_566da4 (1)'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (2)'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_200320022001200019991998199719961995_65c502 (1)'), 
    '1988', true)

println(GlobalVariable.hk_input_mphone)

'input phone number'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__PrimaryPhoneNumber.PhoneNumber'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (5)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1 (2)'), '852', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2 (1)'), '香港', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2_3 (1)'), '中環', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressLine1 (1)'), 'testaddress1')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_(03,11,2)_AddressLine2 (1)'), 'testaddress2')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/textarea__DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_()_PaymethodViewModel.CreditCardViewM_9e70de (1)'), GlobalVariable.hk_input_newname)

println(GlobalVariable.hk_input_creditcard)

'input credit card number'
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__PaymethodViewModel.CreditCardViewMod_b0d8b7'), GlobalVariable.hk_input_creditcard)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_010203040506070809101112 (1)'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_202120222023202420252026202720282029_fb3c11 (1)'), 
    '2040', true)

WebUI.clickOffset(findTestObject('OB003/Page_/label_ (1)'), 100, 0)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (7)'))

WebUI.waitForPageLoad(100)

WebUI.focus(findTestObject('Object Repository/OB003/Page_/button__1_2_3 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3 (3)'))

WebUI.waitForPageLoad(100)

//WebUI.click(findTestObject('Object Repository/OB003/Page_/h5_'))
WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4 (3)'))

WebUI.refresh()

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7'))

WebUI.closeBrowser()

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

