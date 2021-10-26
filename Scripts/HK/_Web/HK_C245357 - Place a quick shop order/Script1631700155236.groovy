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

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (5) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_()_fa fa-caret-down (1)'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry (3)'), '117.1')

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button_ (3) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/button__1 (4) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1 (5) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_ (4) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/button__1_2 (4) (1)'))

if (WebUI.verifyElementNotVisible(findTestObject('OB003/Page_/div_3535 (  )')) == true) {
} else {
    WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ck35'))
}

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (8)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_here (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (19)'))

/*
WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (1) (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_here (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (4) (1)'))
*/
WebUI.closeBrowser()

'Place a quick shop order'
GlobalVariable.test_case = '245357'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

