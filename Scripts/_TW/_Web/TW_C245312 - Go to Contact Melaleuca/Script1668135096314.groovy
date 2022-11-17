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

WebUI.callTestCase(findTestCase('_TW/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_contack_tw)

WebUI.waitForPageLoad(2)

now_text0 = WebUI.getAttribute(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/select_tw'), 'value')

println(now_text0)

WebUI.verifyMatch(now_text0, 'zh-TW', false)

now_text1 = WebUI.getText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/select_tw')).trim()

println(now_text1)

WebUI.verifyMatch(now_text1, '台灣', false)

now_text2 = WebUI.getText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_tw'))

println(now_text2)

WebUI.verifyMatch(now_text2, '美樂家台灣', false)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_ContactMelaleuca'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_QandA_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_QandA_CustomerInformation'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_1_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_2_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_3_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_4_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_5_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_6_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_7_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_8_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_9_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_QandA_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_QandA_MemberInformation_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_1_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_2_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_3_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_4_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_5_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_6_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_QandA_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_QandA_BusinessInformation_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_1_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_2_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_3_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_4_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_5_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_6_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_7_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_8_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_9_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_10_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_11_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_12_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_13_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_15_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_16_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_17_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_18_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_19_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_20_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_21_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_QandA_tw'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_RelatedLinks'))

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to \'Contact Melaleuca\''
GlobalVariable.test_case = '245312'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'\r\nGo to \'Frequently Asked Questions\''
GlobalVariable.test_case = '245314'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

