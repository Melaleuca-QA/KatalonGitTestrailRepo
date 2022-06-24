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

WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.setText(findTestObject('OB001/Page_/input_txtSkuEntry'), '1210.2')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.setText(findTestObject('OB001/Page_/input_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/button_BottomProceedtoCheckout'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_hk'))

WebUI.waitForPageLoad(30)

WebUI.focus(findTestObject('OB001/Page_/button_Checkout_ChangeAddress'))

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_edit'))

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_city_hk'), '香港', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_suburb_hk'), '中環', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), '中和路1號')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.DeliveryInstruction'), 'do not ship')

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_Checkout_ChangeAddress_ReturnToCheckout'))

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_TopCheckout_PlaceOrder'))

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB001/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Complete order with Taiwan Default - Standard'
GlobalVariable.test_case = '251916'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

