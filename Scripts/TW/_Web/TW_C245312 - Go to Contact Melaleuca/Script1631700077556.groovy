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

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_contack_tw)

WebUI.waitForPageLoad(2)

now_text0 = WebUI.getAttribute(findTestObject('OB003/Page_Melaleuca The Wellness Company/select_tw'), 'value')

println(now_text0)

WebUI.verifyMatch(now_text0, 'zh-TW', false)

now_text1 = WebUI.getText(findTestObject('OB003/Page_Melaleuca The Wellness Company/select_tw')).trim()

println(now_text1)

WebUI.verifyMatch(now_text1, '台灣', false)

now_text2 = WebUI.getText(findTestObject('OB003/Page_Melaleuca The Wellness Company/span_tw'))

println(now_text2)

WebUI.verifyMatch(now_text2, '美樂家台灣', false)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/a_ContactMelaleuca'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/a__QandA'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/span_QandA_CustomerInformation'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_1'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_2'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_3'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_4'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_5'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_6'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_7'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_8'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_CustomerInformation_9'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/a__QandA'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/span_QandA_MemberInformation'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_MemberInformation_10'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_MemberInformation_11'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_MemberInformation_12'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_MemberInformation_13'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_MemberInformation_14'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_MemberInformation_15'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/a__QandA'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/span_QandA_BusinessInformation_tw'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_16'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_17'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_18'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_19'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_20'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_21'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_22'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_23'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_24'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_25'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_26'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_27'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_28'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_29'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_30'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_31'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_32'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_33'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_34'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/div__QandA_BusinessInformation_35'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/a__QandA'))

WebUI.click(findTestObject('OB004/Page_Melaleuca The Wellness Company/span_RelatedLinks'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to \'Contact Melaleuca\''
GlobalVariable.test_case = '245312'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'\r\nGo to \'Frequently Asked Questions\''
GlobalVariable.test_case = '245314'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

