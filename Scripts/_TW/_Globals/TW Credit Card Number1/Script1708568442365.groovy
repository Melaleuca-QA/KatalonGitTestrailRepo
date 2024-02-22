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

WebUI.navigateToUrl('https://namso-gen.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Random Test Credit Card Numbers/a_Advance'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Random Test Credit Card Numbers/div_BIN'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_Random Test Credit Card Numbers/input_BIN_form.bin'), 
    '405430')

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Random Test Credit Card Numbers/span_Generate'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_Random Test Credit Card Numbers/span_Generate'))

result1 = WebUI.getText(findTestObject('OB_Web/Page_Random Test Credit Card Numbers/pre_CreditCard'))

println(result1)

result2 = result1.substring(0, 16)

GlobalVariable.tw_input_creditcard = result2

println(GlobalVariable.tw_input_creditcard)

WebUI.closeBrowser()

