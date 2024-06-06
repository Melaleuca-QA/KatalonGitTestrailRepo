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

WebUI.callTestCase(findTestCase('_HK/_Web/_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_Web/Page_/input_js-search-input'), '117')

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_/span_fa fa-search'))

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_sku117)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_sku117)
}

WebUI.back()

WebUI.setText(findTestObject('OB_Web/Page_/input_js-search-input'), 'lemon')

WebUI.click(findTestObject('OB_Web/Page_/span_fa fa-search'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/img_product-card_img_2854'))

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_sku2854)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_sku2854)
}

WebUI.back()

WebUI.setText(findTestObject('OB_Web/Page_/input_js-search-input'), '觀適健')

WebUI.click(findTestObject('OB_Web/Page_/span_fa fa-search'))

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_sku2855)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_sku2855)
}

WebUI.back()

WebUI.setText(findTestObject('OB_Web/Page_/input_js-search-input'), 'Safe &')

WebUI.click(findTestObject('OB_Web/Page_/span_fa fa-search'))

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_sku5680)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_sku5680)
}

WebUI.back()

WebUI.setText(findTestObject('OB_Web/Page_/input_js-search-input'), '___')

WebUI.click(findTestObject('OB_Web/Page_/span_fa fa-search'))

now_url = WebUI.getUrl()

println(now_url)

if (GlobalVariable.run_env == 'PD') {
    WebUI.verifyEqual(now_url, GlobalVariable.url_hk_sku_notfound)
} else {
    WebUI.verifyEqual(now_url, GlobalVariable.url_sku_notfound)
}

WebUI.back()

WebUI.callTestCase(findTestCase('_TW/_Web/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Search for SKU by number'
GlobalVariable.test_case = '224083'

WebUI.callTestCase(findTestCase('_HK/_Globals/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Search for SKU by name'
GlobalVariable.test_case = '224084'

WebUI.callTestCase(findTestCase('_HK/_Globals/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Search using general words '
GlobalVariable.test_case = '224085'

WebUI.callTestCase(findTestCase('_HK/_Globals/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Search using general words '
GlobalVariable.test_case = '224086'

WebUI.callTestCase(findTestCase('_HK/_Globals/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
