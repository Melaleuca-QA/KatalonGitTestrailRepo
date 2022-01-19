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

'Running mode'
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (9)'))

WebUI.navigateToUrl(GlobalVariable.url_Home)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (39)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (30)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (23)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3 (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-chevron-down lists__chevron'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (13)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-plus-circle lists__add-to-list__plus'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__lists__focus-input'), 'My Pack')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (42)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (32)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span__fa fa-plus-circle (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (32)'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (32)'))
WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__js-search-input'), 'renew')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (16)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img__product-card__img'))

WebUI.click(findTestObject('Object Repository/OB003/Page_237/img'))

WebUI.click(findTestObject('Object Repository/OB003/Page_237/span__fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/OB003/Page_-(3)/button_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (32)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_-(3)/input__js-search-input'), '2000')

WebUI.click(findTestObject('Object Repository/OB003/Page_-(3)/span__fa fa-search'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img__product-card__img_1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_CV/span__fa fa-plus-circle'))

WebUI.click(findTestObject('Object Repository/OB003/Page_CV/button_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (32)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_CV/a_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_CV/a__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img__product-card__img_1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__fa fa-plus-circle_1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (32)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__js-search-input'), '油')

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__fa fa-search'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img__product-card__img_1_2_3'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__fa fa-plus-circle_1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (32)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa shopping-list-card__add-to-list__plus_dca709'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2 (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li_My Pack_1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle shopping-list-card__r_8668cf'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li_My Pack'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle shopping-list-card__r_8668cf'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle shopping-list-card__r_8668cf'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/li_My Pack_1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (13)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle lists__remove-icon_1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__fa fa-circle-thin lists__default-ci_fb57e6'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4 (5)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_'))

WebUI.closeBrowser()

'Try all Membership Pack options'
GlobalVariable.test_case = '247199'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Set up Customized Membership Pack'
GlobalVariable.test_case = '247200'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Most Popular Products"'
GlobalVariable.test_case = '247201'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Search by SKU name and number'
GlobalVariable.test_case = '247202'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

