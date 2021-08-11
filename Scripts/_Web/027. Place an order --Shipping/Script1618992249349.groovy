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

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/')

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (6)'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ Email  _UserName (11)'), 'tw1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__Password (11)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_/button_ (13)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (0) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (1)'), '2000.2')

WebUI.sendKeys(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (1)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/a_ (9)'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AddressToEdit.ShipToName'), 'shiptest')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select__1'), '大同區', true)

WebUI.click(findTestObject('Object Repository/Page_/input__AddressToEdit.AddressLine1'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AddressToEdit.AddressLine1'), 'testaddress')

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/Page_/input__AddressToEdit.AddressLine1'), 'testaddress112')

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Page_/button__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_/a_ (11)'))

WebUI.closeBrowser()

GlobalVariable.test_case = '245322'

WebUI.callTestCase(findTestCase('Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.test_case = '245323'

WebUI.callTestCase(findTestCase('Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.test_case = '245324'

WebUI.callTestCase(findTestCase('Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.test_case = '245325'

WebUI.callTestCase(findTestCase('Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

