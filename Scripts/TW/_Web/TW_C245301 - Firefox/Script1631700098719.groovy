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

WebUI.callTestCase(findTestCase('_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__fa fa-close'))

WebUI.click(findTestObject('OB003/Page_/div_LVIP_TW'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB003/Page_/div__AboutMelaleuca'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/span__MyAccount'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__MyAccountShowAll'))

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Firefox'
GlobalVariable.test_case = '245301'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

