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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/')

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div_-                                      _71b33c'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/a_ (5)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/button_ (4)'))

WebUI.setText(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input__UserName'), 'hk1')

WebUI.setEncryptedText(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input__Password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/button__1 (5)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div_ (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/a__1 (5)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/a__1_2'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div__link startEnrollmentLink'))

WebUI.setText(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input__txtNewEnrolleeFirstName'), 
    'hk1ole2')

WebUI.setText(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input__txtEmailAddress'), 'hk1ole2@melaleuca.com')

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/label_'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/label__1'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/label_60'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div__1'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/div__1_2'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/a__1_2_3'))

WebUI.closeBrowser()

