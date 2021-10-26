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

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_(2)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry (2)'), '2000.2')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (5)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (1) (2)'))

WebUI.focus(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (2) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (2) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (8)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3 (4)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.ShipToName_1'), 'shiptest')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2 (1)'), '852', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2_3 (1)'), '香港', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select__1_2_3_4'), '中環', true)

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine1_1'), 'testaddress1')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_,,(03,11,2)_AddressToEdit.AddressLine2'), 'testaddress2')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.DeliveryInstruction_1'), 'do not ship')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.FormattedPhoneNumber'), '85251654321')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4 (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (5)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input__AddressToEdit.AddressLine1_1'), 'testaddress3')

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_,,(03,11,2)_AddressToEdit.AddressLine2'), 'testaddress4')

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2_3_4 (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1_2_3 (2)'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (22)'))
WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (4) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (8)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_here (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (19)'))

WebUI.closeBrowser()

'Verify the order checkout is secure (https in the url)'
GlobalVariable.test_case = '245322'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245323'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing address'
GlobalVariable.test_case = '245324'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing address'
GlobalVariable.test_case = '245325'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

