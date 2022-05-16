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

'Recording mode'
if (true) {
    GlobalVariable.hk_input_newname = 'hk918310'

    GlobalVariable.hk_input_email = ('hk918310' + '@melaleuca.com')

    GlobalVariable.hk_input_mphone = '85251918310'

    GlobalVariable.hk_input_citizen = 'C7470361'

    GlobalVariable.hk_input_creditcard = '4539035154270308'
} else {
    'get ole variables'
    WebUI.callTestCase(findTestCase('HK/HK OLE Variables'), [:], FailureHandling.STOP_ON_FAILURE)

    'get citizen number'
    WebUI.callTestCase(findTestCase('HK/HK Citizen Number 2'), [:], FailureHandling.STOP_ON_FAILURE)

    'get credit card number'
    WebUI.callTestCase(findTestCase('HK/HK Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_ApplyEnroll_hk'))

WebUI.click(findTestObject('OB001/Page_/a_BusinessCenter_OLE_hk'))

WebUI.click(findTestObject('OB001/Page_/div_link startEnrollmentLink'))

WebUI.setText(findTestObject('OB001/Page_/input_txtNewEnrolleeFirstName'), GlobalVariable.hk_input_newname)

WebUI.setText(findTestObject('OB001/Page_/input_txtEmailAddress'), GlobalVariable.hk_input_email)

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_SearchPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_EditPresenter'))

WebUI.click(findTestObject('OB001/Page_/label_BusinessCenter_OLE_chkCommunicationConfirm'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_SendEmail'))

//WebUI.click(findTestObject('OB002/Page_/div__1 (5) (1)'))
//WebUI.click(findTestObject('OB002/Page_/div__1_2 (2) (1)'))
WebUI.mouseOver(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'))

GlobalVariable.hk_input_oleurl = WebUI.getAttribute(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtInvitationLink'), 
    'value')

println(GlobalVariable.hk_input_oleurl)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_OLE_OKsent'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_InvitationName'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_Invitation_edit'))

WebUI.setText(findTestObject('OB001/Page_/input_txtMobilePhone'), GlobalVariable.hk_input_mphone)

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_save'))

WebUI.click(findTestObject('OB001/Page_/div_BusinessCenter_OLE_Invitation_CancelResend'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_InvitationName'))

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_OLE_Invitation_edit'))

'Region is TW'
WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_ BusinessCenter_OLE_Invitation_Region'), '1', true)

