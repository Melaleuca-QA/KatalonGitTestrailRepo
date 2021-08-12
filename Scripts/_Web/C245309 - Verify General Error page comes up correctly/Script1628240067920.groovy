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

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName (9) (1) (1) (1)'), 'tw3')

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password (9) (1) (1) (1)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('OB001/Page_/button_ (11) (1) (1) (1)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/GeneralError.aspx')

WebUI.waitForPageLoad(2)

GlobalVariable.test_case = '245309'

WebUI.click(findTestObject('OB001/Page_/a_ (9)'))

WebUI.waitForPageLoad(2)

WebUI.getUrl()

def ps_url = WebUI.getUrl()

println(ps_url)

WebUI.verifyEqual(ps_url, GlobalVariable.ProductStore_url)

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/GeneralError.aspx')

WebUI.waitForPageLoad(2)

GlobalVariable.test_case = '245310'

WebUI.click(findTestObject('OB001/Page_/a__1 (2)'))

WebUI.waitForPageLoad(2)

WebUI.getUrl()

def bc_url = WebUI.getUrl()

println(bc_url)

WebUI.verifyEqual(bc_url, GlobalVariable.BusinessCenter_url)

WebUI.click(findTestObject('OB001/Page_/a__1_2 (1)'))

WebUI.closeBrowser()

GlobalVariable.test_case = '245311'

