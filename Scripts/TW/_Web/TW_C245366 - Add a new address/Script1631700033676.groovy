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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (3)'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (2)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.ShipToName'), 'hsipaddress')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_'), '基隆市', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1'), '仁愛區', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine1'), 'hsipaddress1')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine2'), 'hsipaddress2')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.DeliveryInstruction'), 'do not ship')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine1'), 'hsipaddress3')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine2'), 'hsipaddress4')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_'))

WebUI.closeBrowser()

'Add a new address'
GlobalVariable.test_case = '245366'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing'
GlobalVariable.test_case = '245367'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an exisiting address'
GlobalVariable.test_case = '245368'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

