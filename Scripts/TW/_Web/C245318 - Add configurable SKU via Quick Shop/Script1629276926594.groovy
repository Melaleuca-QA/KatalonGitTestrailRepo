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

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/account/SignIn')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), 'tw3')

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_(0)'))

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'), '1210.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/img_1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_()_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3'))

WebUI.closeBrowser()

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245318'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

