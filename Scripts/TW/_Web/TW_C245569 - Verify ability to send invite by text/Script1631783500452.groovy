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

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_enroll_tw'))

WebUI.click(findTestObject('OB003/Page_/a_BusinessCenter_OLE_tw'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_link startEnrollmentLink'))

'input new enrollment name'
WebUI.setText(findTestObject('OB003/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment mphone'
WebUI.setText(findTestObject('OB003/Page_/input__txtMobilePhone'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_SendText'))

WebUI.delay(3)

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_CloseButton'))

WebUI.refresh()

WebUI.focus(findTestObject('OB003/Page_/span_BusinessCenter_OLE_SendReminder'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OB003/Page_/span_BusinessCenter_OLE_SendReminder'), '發送提醒')

WebUI.click(findTestObject('OB003/Page_/span_BusinessCenter_OLE_SendReminder'))

WebUI.delay(3)

WebUI.focus(findTestObject('OB003/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ReSendReminder'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OB003/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ReSendReminder'), 
    '重新發送提醒')

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/span_BusinessCenter_OLE_ReSendReminder'))

WebUI.delay(3)

WebUI.focus(findTestObject('OB003/Page_/i_fa fa-trash_ole'))

WebUI.click(findTestObject('OB003/Page_/i_fa fa-trash_ole'))

WebUI.click(findTestObject('OB003/Page_/div_ole'))

WebUI.delay(3)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort-asc'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort-asc'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort-asc'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort-asc'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/i_fa fa-sort'))

WebUI.refresh()

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

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

