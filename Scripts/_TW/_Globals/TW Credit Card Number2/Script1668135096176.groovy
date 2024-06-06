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

WebUI.navigateToUrl('https://www.vccgenerator.org/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OB_Web/Page_VCCGenerator/a_BIN GENERATOR'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_VCCGenerator/input_BIN_namso-bin'), '405430')

'Page Down'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_VCCGenerator/b_GENERATE'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_VCCGenerator/b_GENERATE'))

'Page Up'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))

result1 = WebUI.getText(findTestObject('OB_Web/Page_VCCGenerator/div_CreditCardNumber'))

println(result1)

result2 = result1.substring(0, 16)

GlobalVariable.tw_input_creditcard = result2

println(GlobalVariable.tw_input_creditcard)

WebUI.closeBrowser()
