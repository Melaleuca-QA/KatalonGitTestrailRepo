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

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input_ Email  _UserName (11) (1) (1)'), GlobalVariable.input_username)

WebUI.setEncryptedText(findTestObject('Object Repository/OB002/Page_/input__Password (11) (1) (1)'), GlobalVariable.input_password)

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_ (13) (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/button_ (0) (1) (1) (1)'))

WebUI.setText(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (1) (1) (1)'), 
    '2000.2')

WebUI.sendKeys(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/input_ ()_txtSkuEntry (1) (1) (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/button__1 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/a_ (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1_2 (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1_2_3 (1) (1)'))

'Add a new address'
WebUI.setText(findTestObject('Object Repository/OB002/Page_/input__AddressToEdit.ShipToName (1) (1)'), 'shiptest')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select_ (1) (1)'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB002/Page_/select__1 (1) (1)'), '大同區', true)

GlobalVariable.test_case = '245322'

GlobalVariable.test_case = '245323'

GlobalVariable.test_case = '245324'

GlobalVariable.test_case = '245325'

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input__AddressToEdit.AddressLine1 (1) (2)'), 'testaddress1')

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input__AddressToEdit.AddressLine2 (1) (1)'), 'testaddress2')

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input__AddressToEdit.DeliveryInstruction (1) (1)'), 'do not ship')

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_ (2) (1)'))

WebUI.navigateToUrl('https://uatwweb.melaleuca.com/ProductStore/Checkout/ChangeAddress')

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1_2_3_4_5 (1) (1)'))

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input__AddressToEdit.AddressLine1 (1) (2)'), 'testaddress3')

WebUI.setText(findTestObject('Object Repository/OB002/Page_/input__AddressToEdit.AddressLine2 (1) (1)'), 'testaddress4')

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_ (2) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button_ (2) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/input__SelectedAddressID (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1_2_3_4_5_6 (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1 (2) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_/button__1_2_3_4 (1) (1)'))

WebUI.click(findTestObject('Object Repository/OB002/Page_Melaleuca The Wellness Company/a__1 (1) (1)'))

WebUI.closeBrowser()

