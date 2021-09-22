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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName (5) (1)'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password (5) (1)'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link presentationLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_melaleucapresentations)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link followUpLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_FollowUp)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link enrollmentFormsLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_Enrollment_Forms)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__link whichProductsLink'))

now_url = WebUI.getUrl()

WebUI.verifyEqual(now_url, GlobalVariable.url_whichproducts)

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_'))

WebUI.closeBrowser()

'Verify Enrollment Tools links work and proceed to expected pages '
GlobalVariable.test_case = '247191'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

