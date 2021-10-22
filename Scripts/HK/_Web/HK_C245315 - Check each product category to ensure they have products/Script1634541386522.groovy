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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName (7)'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password (18)'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (2) (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (2) (1)'))

WebUI.navigateToUrl(GlobalVariable.url_ProductStore)

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca/a_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca/a__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (27)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (24)'))

WebUI.navigateToUrl(GlobalVariable.url_category119)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__1 (5)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (20)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4 (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9 (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span__fa fa-shopping-cart'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (24)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__paymethodCvv (2)'), '123')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (10)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.closeBrowser()

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245315'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check each product subcategory to ensure they have products'
GlobalVariable.test_case = '245316'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Add to Cart'
GlobalVariable.test_case = '245319'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Add to Cart'
GlobalVariable.test_case = '245320'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check for Promotions'
GlobalVariable.test_case = '245321'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

