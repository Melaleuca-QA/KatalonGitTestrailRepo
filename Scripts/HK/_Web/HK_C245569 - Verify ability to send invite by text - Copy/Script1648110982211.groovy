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

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

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

WebUI.click(findTestObject('OB003/Page_/div_BusinessCenter_OLE_SendText'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (11)'))

