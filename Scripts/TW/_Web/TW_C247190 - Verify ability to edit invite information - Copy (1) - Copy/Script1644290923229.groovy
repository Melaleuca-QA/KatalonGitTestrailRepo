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

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (13)'), '1', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (16)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1 (6)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2 (3)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_tw918301'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (12) (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OB003/Page_/select_ (13)'), '0', true)

WebUI.click(findTestObject('Object Repository/OB003/Page_/div_ (16)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/div__1_2_3 (3)'))

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_/div__1_2_3_4 (2)'))

