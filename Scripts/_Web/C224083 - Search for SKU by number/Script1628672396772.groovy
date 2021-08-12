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

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName (10)'), 'tw3')

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password (10)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('OB001/Page_/button_ (12)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_                ,                      _a6d0c1'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input__js-search-input'), '117')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__fa fa-search'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_                ,                      _a6d0c1'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input__js-search-input'), 'lemon')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__fa fa-search'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img__product-card__img'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_                ,                      _a6d0c1'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input__js-search-input'), '觀適健')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__fa fa-search'))

WebUI.click(findTestObject('OB001/Page_/a_ (10)'))

WebUI.closeBrowser()

def C224083

def C224084

