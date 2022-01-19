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

WebUI.setText(findTestObject('Object Repository/OB004/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB004/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('Object Repository/OB004/Page_/button_ (2)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/div_ (2)'))

WebUI.navigateToUrl(GlobalVariable.url_ProductStore)

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca/a_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca/a__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (36)'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/button_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/a_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button_'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/a__1_2'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/a__1_2_3'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/img'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/img_1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1'))

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1_2_3_4_5_6_7'))

//WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/button__1_2_3_4_5_6_7_8_9_10_11_12_13_14'))
//WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img_1_2 (2)'))
//WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3_4_--5_6_7_8_9_10_11_12'))
WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a_ (3)'))

WebUI.navigateToUrl(GlobalVariable.url_Checkout)

WebUI.setText(findTestObject('Object Repository/OB004/Page_/input__paymethodCvv (1)'), '123')

WebUI.click(findTestObject('Object Repository/OB004/Page_/button__1_2 (1)'))

WebUI.click(findTestObject('Object Repository/OB004/Page_Melaleuca The Wellness Company/a__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.closeBrowser()

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245315'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check each product subcategory to ensure they have products'
GlobalVariable.test_case = '245316'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Add to Cart'
GlobalVariable.test_case = '245319'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Add to Cart'
GlobalVariable.test_case = '245320'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check for Promotions'
GlobalVariable.test_case = '245321'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

