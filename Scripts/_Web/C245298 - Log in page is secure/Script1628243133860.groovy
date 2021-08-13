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

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName (6)'), GlobalVariable.input_username)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password (6)'), GlobalVariable.input_password)

WebUI.click(findTestObject('OB001/Page_/button_ (6)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ (4) (5)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ (6)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ (5)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a__1 (3)'))

WebUI.click(findTestObject('OB001/Page_/div_ (6)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div__1 (5)'))

WebUI.click(findTestObject('OB001/Page_/div__1 (4)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__1'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a__1_2 (2)'))

WebUI.click(findTestObject('OB001/Page_/span_ (2)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ (1)'))

WebUI.click(findTestObject('OB001/Page_/a_ (6)'))

WebUI.closeBrowser()

'Log in page is secure (https in the url)'
GlobalVariable.test_case = '245298'

'Chrome 30 and higher'
GlobalVariable.test_case = '245302'

'Log in to Website'
GlobalVariable.test_case = '245307'

'Log out of Website'
GlobalVariable.test_case = '245308'

