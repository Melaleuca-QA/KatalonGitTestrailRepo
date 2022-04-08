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

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.focus(findTestObject('OB001/Page_Random Test Credit Card Numbers/input_BIN_form-input block w-full'))

WebUI.setText(findTestObject('OB001/Page_Random Test Credit Card Numbers/input_BIN_form-input block w-full'), '405430')

WebUI.focus(findTestObject('OB001/Page_Random Test Credit Card Numbers/input_QUANTITY_form-input block w-full'))

WebUI.sendKeys(findTestObject('OB001/Page_Random Test Credit Card Numbers/input_QUANTITY_form-input block w-full'), Keys.chord(
        Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('OB001/Page_Random Test Credit Card Numbers/input_QUANTITY_form-input block w-full'), '1')

WebUI.click(findTestObject('OB001/Page_Random Test Credit Card Numbers/button_Generate'))

result1 = WebUI.getAttribute(findTestObject('OB001/Page_Random Test Credit Card Numbers/textarea_Result'), 'value')

WebUI.takeFullPageScreenshotAsCheckpoint('Sample Visual Test')

println(result1)

result2 = result1.substring(0, 16)

GlobalVariable.tw_input_creditcard = result2

println(GlobalVariable.tw_input_creditcard)

WebUI.closeBrowser()

