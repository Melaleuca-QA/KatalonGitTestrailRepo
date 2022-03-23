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

WebUI.callTestCase(findTestCase('HK/HK OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'Running mode'
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_uatwweb)

WebUI.refresh()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('OB003/Page_/input_Email_UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input_Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('OB003/Page_/button_ Login'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

'789'
WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_BusinessCenter_ApplyEnroll_hk'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_BusinessCenter_OLE_hk'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__link startEnrollmentLink'))

//WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div__pageOverlay (1)'))
'input new enrollment name'
WebUI.setText(findTestObject('OB003/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.hk_input_newname)

'input new enrollment mphone'
WebUI.setText(findTestObject('OB003/Page_/input__txtMobilePhone'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB003/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB003/Page_/div_ (4)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (11)'))

WebUI.refresh()

WebUI.focus(findTestObject('OB003/Page_/span_ (2)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OB003/Page_/span_ (2)'), '發送提醒')

WebUI.click(findTestObject('OB003/Page_/span_ (2)'))

WebUI.delay(3)

WebUI.focus(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__1 (3)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__1 (3)'), '重新發送提醒')

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__1 (3)'))

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

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify ability to send a reminder '
GlobalVariable.test_case = '247187'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can delete invite'
GlobalVariable.test_case = '247188'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify you can sort with 2 or more invites'
GlobalVariable.test_case = '247189'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

