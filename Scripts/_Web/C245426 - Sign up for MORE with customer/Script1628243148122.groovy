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

WebUI.setText(findTestObject('OB001/Page_/input_ Email  _UserName (16)'), GlobalVariable.input_username2)

WebUI.setEncryptedText(findTestObject('OB001/Page_/input__Password (16)'), GlobalVariable.input_password2)

WebUI.click(findTestObject('OB001/Page_/button_ (22)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ (11)'))

WebUI.click(findTestObject('OB001/Page_/a_ (17)'))

WebUI.click(findTestObject('OB001/Page_/a_ (18)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_ (12)'))

WebUI.click(findTestObject('OB001/Page_/span_ (9)'))

WebUI.switchToWindowTitle('MORE')

WebUI.click(findTestObject('OB001/Page_MORE/a_ (2) (1)'))

WebUI.click(findTestObject('OB001/Page_MORE/a__1 (2) (1)'))

WebUI.click(findTestObject('OB001/Page_MORE/a__1_2 (2) (1)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/more/OrgViewer.aspx?sid=undefined')

WebUI.closeBrowser()

GlobalVariable.test_case = '245426'

GlobalVariable.test_case = '245427'

GlobalVariable.test_case = '245428'

