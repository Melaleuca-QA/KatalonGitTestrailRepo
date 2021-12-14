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

WebUI.setText(findTestObject('OB003/Page_/input_ Email  _UserName'), GlobalVariable.hk_input_username2)

WebUI.setEncryptedText(findTestObject('OB003/Page_/input__Password'), GlobalVariable.hk_input_password2)

WebUI.click(findTestObject('Object Repository/OB003/Page_/button_ (22) (1)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span_ (9)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/div_ (17)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1 (21)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2 (18)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/span__1 (2)'))

WebUI.click(findTestObject('Object Repository/OB003/Page_/span_ (4)'))

WebUI.switchToWindowTitle('MORE')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a_ (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11_12 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11_12_13 (1)'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a_2'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a_Back up Order Report'))

WebUI.waitForPageLoad(100)

WebUI.click(findTestObject('Object Repository/OB003/Page_MORE/a__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'))

WebUI.waitForPageLoad(100)

WebUI.navigateToUrl(GlobalVariable.url_undefined)

now_url = WebUI.getUrl()

println(now_url)

//WebUI.navigateToUrl('https://uatwweb.melaleuca.com/more/OrgViewer.aspx?sid=undefined')
WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.closeWindowTitle('Org Browser')

WebUI.switchToWindowUrl(GlobalVariable.url_MORE)

WebUI.delay(3)

now_url = WebUI.getUrl()

println(now_url)

WebUI.click(findTestObject('Object Repository/OB003/Page_/a_'))

WebUI.closeBrowser()

'Sign up for M.O.R.E. with customer who doesn\'t have it'
GlobalVariable.test_case = '245426'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Click every link with a live customer'
GlobalVariable.test_case = '245427'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Org Browser with a live customer'
GlobalVariable.test_case = '245428'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
