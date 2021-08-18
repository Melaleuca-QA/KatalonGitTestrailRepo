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

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName (9) (1) (1)'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password (9) (1) (1)'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB001/Page_/button_ (11) (1) (1)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/GeneralError.aspx')

WebUI.waitForPageLoad(2)

'Go to \'Contact Melaleuca\''
GlobalVariable.test_case = '245312'

WebUI.back()

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ (8) (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_ (6) (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ (7) (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1 (6) (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2 (2) (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3 (1) (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ (8)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1 (7)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2 (3)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3 (2)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_, (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29_30 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29_30_31 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29_30_31_32 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29_30_31_32_33 (1)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ (7) (1) (1)'))

WebUI.closeBrowser()

'\r\nGo to \'Frequently Asked Questions\''
GlobalVariable.test_case = '245314'

