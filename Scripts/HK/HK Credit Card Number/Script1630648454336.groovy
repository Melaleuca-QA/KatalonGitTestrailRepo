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

WebUI.navigateToUrl('https://cardguru.io/')

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.enableSmartWait()

WebUI.click(findTestObject('OB001/Page_Credit Card Generator Validator/button_Generate'))

WebUI.waitForElementPresent(findTestObject('OB001/Page_Credit Card Generator Validator/span_CardNumber'), 5)

WebUI.refresh()

WebUI.refresh()

WebUI.refresh()

result1 = WebUI.getText(findTestObject('OB001/Page_Credit Card Generator Validator/span_CardNumber'))

WebUI.takeFullPageScreenshotAsCheckpoint('Sample Visual Test')

println(result1)

result2 = result1.replace('"', '')

GlobalVariable.hk_input_creditcard = result2

println(GlobalVariable.hk_input_creditcard)

WebUI.closeBrowser()

