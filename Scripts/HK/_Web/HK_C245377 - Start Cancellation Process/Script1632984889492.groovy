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

WebUI.click(findTestObject('OB003/Page_/button_ (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (2) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (17)'))

WebUI.navigateToUrl(GlobalVariable.url_account)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (3) (1)'))

now_url = WebUI.getUrl()

println(now_url)

WebUI.verifyMatch(now_url, GlobalVariable.url_CancelEmailConfirm, false)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_ (9)'))

WebUI.closeBrowser()

'Start Cancellation Process (blocked in UA because emails aren\'t successful)'
GlobalVariable.test_case = '245377'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

