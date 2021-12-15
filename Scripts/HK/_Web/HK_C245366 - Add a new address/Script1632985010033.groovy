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

WebUI.setText(findTestObject('OB003/Page_/input_Email_UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (2) (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.ShipToName_1 (1)'), 'hsipaddress')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2 (1) (1)'), '852', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2_3 (1) (1)'), '香港', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2_3_4 (1)'), '中環', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine1_1 (1)'), 'hsipaddress1')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_,,(03,11,2)_AddressToEdit.AddressLine2 (1)'), 'hsipaddress2')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.DeliveryInstruction_1 (1)'), 'do not ship')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.FormattedPhoneNumber (1)'), '85251654321')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4 (4) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3 (5)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine1_1 (1)'), 'hsipaddress3')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_,,(03,11,2)_AddressToEdit.AddressLine2 (1)'), 'hsipaddress4')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4 (4) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4 (5)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (7)'))

WebUI.closeBrowser()

'Add a new address'
GlobalVariable.test_case = '245366'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing'
GlobalVariable.test_case = '245367'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an exisiting address'
GlobalVariable.test_case = '245368'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

