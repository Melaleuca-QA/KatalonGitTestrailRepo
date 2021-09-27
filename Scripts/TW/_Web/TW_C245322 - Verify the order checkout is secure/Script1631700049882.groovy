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

WebUI.setText(findTestObject('OB002/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB002/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB002/Page_/button_ (3)'))

WebUI.click(findTestObject('OB002/Page_Melaleuca The Wellness Company/button_(2)'))

WebUI.setText(findTestObject('OB002/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/button_ (1)'))

WebUI.click(findTestObject('OB002/Page_Melaleuca The Wellness Company/button__1'))

WebUI.click(findTestObject('OB002/Page_/button__1 (1)'))

WebUI.focus(findTestObject('OB002/Page_Melaleuca The Wellness Company/a_ (2)'))

WebUI.click(findTestObject('OB002/Page_Melaleuca The Wellness Company/a_ (2)'))

WebUI.click(findTestObject('OB002/Page_/button__1_2'))

WebUI.click(findTestObject('OB002/Page_/button__1_2_3'))

WebUI.setText(findTestObject('OB002/Page_/input__AddressToEdit.ShipToName'), 'shiptest')

WebUI.selectOptionByValue(findTestObject('OB002/Page_/select_'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('OB002/Page_/select__1'), '大同區', true)

WebUI.setText(findTestObject('OB002/Page_/input__AddressToEdit.AddressLine1'), 'testaddress1')

WebUI.setText(findTestObject('OB002/Page_/input__AddressToEdit.AddressLine2'), 'testaddress2')

WebUI.setText(findTestObject('OB002/Page_/input__AddressToEdit.DeliveryInstruction'), 'do not ship')

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4_5'))

WebUI.setText(findTestObject('OB002/Page_/input__AddressToEdit.AddressLine1'), 'testaddress3')

WebUI.setText(findTestObject('OB002/Page_/input__AddressToEdit.AddressLine2'), 'testaddress4')

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4_5_6'))

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('OB002/Page_/button__1_2_3_4_5_6_7_8'))

Windows.delay(5)

WebUI.click(findTestObject('OB002/Page_Melaleuca The Wellness Company/a__1'))

WebUI.closeBrowser()

'Verify the order checkout is secure (https in the url)'
GlobalVariable.test_case = '245322'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245323'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing address'
GlobalVariable.test_case = '245324'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing address'
GlobalVariable.test_case = '245325'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

