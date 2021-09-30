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

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB001/Page_/button_ (11)'))

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

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/span_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/span__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/span__1_2'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2'))

WebUI.closeBrowser()

'Go to \'Contact Melaleuca\''
GlobalVariable.test_case = '245312'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'\r\nGo to \'Frequently Asked Questions\''
GlobalVariable.test_case = '245314'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

