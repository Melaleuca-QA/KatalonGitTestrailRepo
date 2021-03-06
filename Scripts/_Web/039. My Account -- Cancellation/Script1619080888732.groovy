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

WebUI.callTestCase(findTestCase('_Web/Log in --tw1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Melaleuca: The Wellness Company')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_ (9)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ (12)'))

WebUI.click(findTestObject('OB001/Page_/span_ (6)'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span__1 (1)'))

WebUI.click(findTestObject('OB001/Page_/a_ (13)'))

WebUI.click(findTestObject('OB001/Page_/a__1 (3)'))

WebUI.closeBrowser()

GlobalVariable.test_case = 245377

