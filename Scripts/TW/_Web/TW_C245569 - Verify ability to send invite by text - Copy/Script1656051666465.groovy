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
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.waitForPageLoad(30)

WebUI.focus(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl(GlobalVariable.url_BusinessCenter)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_enroll_tw'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_tw'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_link startEnrollmentLink'))

WebUI.waitForPageLoad(100)

'input new enrollment name'
WebUI.setText(findTestObject('OB001/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.tw_input_newname)

'input new enrollment mphone'
WebUI.setText(findTestObject('OB001/Page_/input_txtMobilePhone2'), GlobalVariable.tw_input_mphone)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_SendText'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB002/Page_/div_'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/div_1'))

