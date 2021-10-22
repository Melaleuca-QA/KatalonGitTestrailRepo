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

WebUI.setText(findTestObject('Object Repository/OB003/Page_/input_Email_UserName'), GlobalVariable.hk_input_username1)

WebUI.setEncryptedText(findTestObject('Object Repository/OB003/Page_/input__Password'), GlobalVariable.hk_input_password1)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (2) (4)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (14)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (32)'))

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/MyAccount/ChangePaymethods')
WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (28)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_PaymethodToEdit.CardHolderName'), 
    '港島一號')

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input__PaymethodToEdit.CardNumber'), 
    '4054303368018334')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/select_010203040506070809101112'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/select_202120222023202420252026202720282029_fb3c11'), 
    '2040', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (8)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__1 (3)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/select_010203040506070809101112'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/select_202120222023202420252026202720282029_fb3c11'), 
    '2039', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (8)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span__1_2'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (12)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_(4) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (8)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/a__1_2 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (21)'))

WebUI.closeBrowser()

'Edit an existing pay method'
GlobalVariable.test_case = '245363'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing pay method'
GlobalVariable.test_case = '245364'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

