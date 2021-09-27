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

WebUI.callTestCase(findTestCase('TW/TW OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OB003/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ (9)'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_ (4)'))

WebUI.click(findTestObject('OB003/Page_/a__1 (2)'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__link startEnrollmentLink'))

'input new enrollment name'
WebUI.setText(findTestObject('OB003/Page_/input__txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment mphone'
WebUI.setText(findTestObject('OB003/Page_/input__txtMobilePhone'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB003/Page_/label_ (3)'))

WebUI.click(findTestObject('OB003/Page_/label__1'))

WebUI.click(findTestObject('OB003/Page_/label__1_2'))

WebUI.click(findTestObject('OB003/Page_/div_ (4)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1 (1)'))

WebUI.refresh()

WebUI.focus(findTestObject('OB003/Page_/span_ (2)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OB003/Page_/span_ (2)'), '發送提醒')

WebUI.click(findTestObject('OB003/Page_/span_ (2)'))

WebUI.delay(3)

WebUI.focus(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__1'), '重新發送提醒')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span__1'))

WebUI.delay(3)

WebUI.focus(findTestObject('OB003/Page_/i__fa fa-trash_ole'))

WebUI.click(findTestObject('OB003/Page_/i__fa fa-trash_ole'))

WebUI.click(findTestObject('OB003/Page_/div_ole'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort-asc'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort-asc'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort-asc'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort-asc'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-sort'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (6)'))

WebUI.closeBrowser()

'Verify ability to send invite by text'
GlobalVariable.test_case = '245569'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to send a reminder '
GlobalVariable.test_case = '247187'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can delete invite'
GlobalVariable.test_case = '247188'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can sort with 2 or more invites'
GlobalVariable.test_case = '247189'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
