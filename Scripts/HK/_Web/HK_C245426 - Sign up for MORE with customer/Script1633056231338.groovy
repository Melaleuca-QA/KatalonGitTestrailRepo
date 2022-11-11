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

WebUI.callTestCase(findTestCase('_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_BusinessCenter_hk'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_hk_ReportandTool'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_BusinessCenter_hk_ReportandTool_ReportandTool'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_BusinessCenter_tw_ReportandTool_ReportandTool_view'))

WebUI.click(findTestObject('OB001/Page_/input_BusinessCenter_tw_ReportandTool_ReportandTool_view_checkbox'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_BusinessCenter_tw_ReportandTool_ReportandTool_view_enable_hk'))

if (GlobalVariable.run_env == 'PD') {
    WebUI.switchToWindowUrl('https://hk.melaleuca.com/more/')
} else {
    WebUI.switchToWindowTitle('MORE')
}

WebUI.maximizeWindow()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Dashboard'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Alerts'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Snapshot'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Enrollments'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Cancellations'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Reactivations'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_LeadershipPoints'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Advancements'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Mentoring'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_CoreOrganization'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_KPI'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_StatusGoals'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_PersonalEnrollees'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_SupportTeam'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_NewDirectors'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_NewAdvancements'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_OrgDirectors'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_Enrolled2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_BackupOrderReport'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_MORE/a_ShowOrgViewer'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_undefined)

now_url = WebUI.getUrl()

println(now_url)

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/more/OrgViewer.aspx?sid=undefined')
WebUI.maximizeWindow()

WebUI.waitForAlert(5)

WebUI.closeWindowTitle('Org Browser')

//WebUI.switchToWindowUrl(GlobalVariable.url_ProductStore)
//WebUI.delay(3)
//now_url = WebUI.getUrl()
//println(now_url)
WebUI.callTestCase(findTestCase('_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.callTestCase(findTestCase('_General/_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Sign up for M.O.R.E. with customer who doesn\'t have it'
GlobalVariable.test_case = '245426'

WebUI.callTestCase(findTestCase('HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Click every link with a live customer'
GlobalVariable.test_case = '245427'

WebUI.callTestCase(findTestCase('HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Org Browser with a live customer'
GlobalVariable.test_case = '245428'

WebUI.callTestCase(findTestCase('HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

