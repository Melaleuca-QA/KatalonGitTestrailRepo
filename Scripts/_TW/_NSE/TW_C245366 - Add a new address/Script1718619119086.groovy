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

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'myAccPopup_icon'
WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/img_myAcc_icon'))

'my-account'
WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_go to my account'))

WebUI.click(findTestObject('OB_NSE/Page_Order History/a_payment addresses'))

'Page Down'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_myaccount_shipping_address_add'))

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_name'), 'hsipaddress')

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_My Account/select_shipping_city'), '高雄市', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_My Account/select_shipping_suburb'), '鼓山區', true)

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_addr1'), 'hsipaddress1')

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_addr2'), 'hsipaddress2')

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_phone'), '0922222222')

WebUI.setText(findTestObject('OB_NSE/Page_My Account/textarea_deliveryInstructions'), 'do not ship')

WebUI.click(findTestObject('OB_NSE/Page_My Account/button_shipping-addr_save'))

'Page Down'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_My Account/a_edit-shipping-addr'))

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_addr1'), 'hsipaddress3')

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_addr2'), 'hsipaddress4')

WebUI.setText(findTestObject('OB_NSE/Page_My Account/input_shipping_phone'), '0933333333')

WebUI.click(findTestObject('OB_NSE/Page_My Account/button_shipping-addr_save'))

'Page Down'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_My Account/button_delete-shipping-addr'))

WebUI.click(findTestObject('OB_NSE/Page_My Account/button_delete-shipping-addr_confirm'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245366'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing'
GlobalVariable.test_case = '245367'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an exisiting address'
GlobalVariable.test_case = '245368'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

