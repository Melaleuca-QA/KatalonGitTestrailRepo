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

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (2) (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (3)'), '117.1')

WebUI.sendKeys(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (3)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/button_ (11)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/ProductStore/Cart')

WebUI.click(findTestObject('Object Repository/Page_/button_ (18)'))

WebUI.click(findTestObject('Object Repository/Page_Melaleuca The Wellness Company/a_ (13)'))

WebUI.closeBrowser()

