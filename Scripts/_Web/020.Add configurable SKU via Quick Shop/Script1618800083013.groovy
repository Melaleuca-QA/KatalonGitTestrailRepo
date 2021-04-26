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

WebUI.setText(findTestObject('Object Repository/Page_/input_ Email  _UserName (15)'), 'tw1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__Password (15)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_/button_ (20)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/span_()_fa fa-caret-down (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (5)'), '117.2')

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (13)'))

WebUI.setText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (5)'), '2000.2')

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (13)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button__1 (4)'))

WebUI.click(findTestObject('Object Repository/Page_/a_ (16)'))

WebUI.click(findTestObject('Object Repository/Page_/a__1 (5)'))

WebUI.click(findTestObject('Object Repository/Page_/button_ (4) (2)'))

WebUI.click(findTestObject('Object Repository/Page_/span_ (8)'))

WebUI.click(findTestObject('Object Repository/Page_/span_ (8)'))

WebUI.click(findTestObject('Object Repository/Page_/div_ (8)'))

WebUI.click(findTestObject('Object Repository/Page_/a__1_2 (2)'))

WebUI.closeBrowser()

GlobalVariable.test_case = '245318'

WebUI.callTestCase(findTestCase('Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

