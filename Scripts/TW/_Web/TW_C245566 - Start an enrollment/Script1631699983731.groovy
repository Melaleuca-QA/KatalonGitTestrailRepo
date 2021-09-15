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

if (1 == 2) {
    GlobalVariable.tw_input_newname = 'tw918209'

    GlobalVariable.tw_input_email = ('tw918209' + '@melaleuca.com')

    GlobalVariable.tw_input_mphone = '0922918209'

    GlobalVariable.tw_input_citizen = 'J173624468'

    GlobalVariable.tw_input_creditcard = '4000176233801257'
} else {
    'get ole variables'
    WebUI.callTestCase(findTestCase('TW/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('TW/TW Citizen Number'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('TW/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName (5) (1)'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password (5) (1)'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (9) (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (4) (2)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/BusinessCenter/Home')

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link startEnrollmentLink'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__txtEmailAddress'), GlobalVariable.tw_input_email)

WebUI.click(findTestObject('Object Repository/OB003/Page_/label_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/label__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (2)'))

GlobalVariable.tw_input_oleurl = WebUI.getAttribute(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__txtInvitationLink'), 
    'value')

println(GlobalVariable.tw_input_oleurl)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (4)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tw_input_oleurl)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (4)'))

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password (6) (1)'), GlobalVariable.tw_input_newpswd)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__ConfirmPassword (1) (1)'), GlobalVariable.tw_input_newpswd)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__GovernmentId (3)'), GlobalVariable.tw_input_citizen)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_200120001999199819971996199519941993_9425cf'), 
    '1988', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (2) (1)'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_123456789101112131415161718192021222_566da4 (1) (1)'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__PrimaryPhoneNumber.PhoneNumber (3)'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (5) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (4)'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1 (4)'), '松山區', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressLine1 (1) (1)'), 'testaddress')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_()_PaymethodViewModel.CreditCardViewM_9e70de (1) (1)'), 
    GlobalVariable.tw_input_newname)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__PaymethodViewModel.CreditCardViewMod_b0d8b7 (3)'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_010203040506070809101112 (1) (1)'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_202120222023202420252026202720282029_fb3c11 (1) (1)'), 
    '2040', true)

WebUI.clickOffset(findTestObject('Object Repository/OB003/Page_/label_'), 50, 0)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (7)'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7'))

WebUI.closeBrowser()

'Place a quick shop order'
GlobalVariable.test_case = '245566'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

