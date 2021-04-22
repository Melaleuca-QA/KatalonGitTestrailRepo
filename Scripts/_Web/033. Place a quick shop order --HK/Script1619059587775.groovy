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

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/')

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/span_ - _fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/a_ (10)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ _UserName'), 'hk1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input__Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button__1 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (3) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (2)'), '117.1')

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button__1_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button__1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_/button_ (15)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/a__1 (4)'))

WebUI.click(findTestObject('Object Repository/Page_/button__1 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/span_ (7)'))

WebUI.click(findTestObject('Object Repository/Page_/a_here'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/a__1_2 (3)'))

WebUI.closeBrowser()
GlobalVariable.test_case = '245357'
