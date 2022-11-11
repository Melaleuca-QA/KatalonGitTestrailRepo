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

WebUI.callTestCase(findTestCase('_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_contack_hk)

WebUI.waitForPageLoad(2)

now_text0 = WebUI.getAttribute(findTestObject('OB001/Page_Melaleuca The Wellness Company/select_hk'), 'value')

println(now_text0)

WebUI.verifyMatch(now_text0, 'zh-HK', false)

now_text1 = WebUI.getText(findTestObject('OB001/Page_Melaleuca The Wellness Company/select_hk')).trim()

println(now_text1)

WebUI.verifyMatch(now_text1, '香港', false)

now_text2 = WebUI.getText(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_hk'))

println(now_text2)

WebUI.verifyMatch(now_text2, '美樂家香港', false)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_QandA_hk'))

WebUI.navigateToUrl(GlobalVariable.url_FAQ)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_QandA_CustomerInformation_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_1_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_2_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_3_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_4_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_5_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_6_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_CustomerInformation_7_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_QandA_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_QandA_MemberInformation_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_1_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_2_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_3_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_4_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_5_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_MemberInformation_6_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_QandA_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_QandA_BusinessInformation_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_1_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_2_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_3_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_4_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_5_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_6_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_7_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_8_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_9_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_10_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_11_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_12_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_13_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_QandA_BusinessInformation_14_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_QandA_hk'))

WebUI.callTestCase(findTestCase('_General/_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to \'Contact Melaleuca\''
GlobalVariable.test_case = '245312'

WebUI.callTestCase(findTestCase('HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to \'Frequently Asked Questions\''
GlobalVariable.test_case = '245314'

WebUI.callTestCase(findTestCase('HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

