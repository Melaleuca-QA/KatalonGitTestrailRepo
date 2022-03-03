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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (2) (4)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_(0) (2)'))

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry (4)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry (4)'), '1210.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (2) (2)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry (4)'), '2000.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (2) (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (7)'))

WebUI.navigateToUrl(GlobalVariable.url_Cart)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (25)'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_ (28)'))

WebUI.click(findTestObject('OB003/Page_/button_ (27)'))

WebUI.click(findTestObject('OB003/Page_/button_Checkout_ChangePaymethod_add'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_- Melaleuca/input_()_PaymethodToEdit.CardHolderName'), 'EH 2.2 HK Test')

WebUI.setText(findTestObject('Object Repository/OB003/Page_- Melaleuca/input__PaymethodToEdit.CardNumber'), '4000177354775866')

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_month'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_year'), 
    '2040', true)

WebUI.click(findTestObject('OB003/Page_/button_Checkout_ChangePaymethod_save'))

WebUI.back()

WebUI.click(findTestObject('OB003/Page_/button_Checkout_ChangePaymethod_save'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (6)'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (6)'))

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_month'), '12', 
    true)

WebUI.selectOptionByValue(findTestObject('OB003/Page_/select_Chectout_edit_year'), 
    '2039', true)

WebUI.click(findTestObject('OB003/Page_/button_Checkout_ChangePaymethod_save'))

WebUI.click(findTestObject('OB003/Page_/span_Checkout_ChangePaymethod_edit'))

WebUI.click(findTestObject('OB003/Page_/button__Checkout_paymethod_delete'))

WebUI.click(findTestObject('OB003/Page_/button_Checkout_ChangePaymethod_return'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__paymethodCvv (3)'), '123')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4_5 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (25)'))

WebUI.closeBrowser()

'Edit an existing pay method'
GlobalVariable.test_case = '245352'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete a pay method'
GlobalVariable.test_case = '245355'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
