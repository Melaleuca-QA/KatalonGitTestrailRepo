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

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.waitForAlert(5)

WebUI.focus(findTestObject('OB001/Page_/button_TopProceedtoCheckout'))

WebUI.click(findTestObject('OB001/Page_/button_TopProceedtoCheckout'))

WebUI.waitForAlert(5)

if (GlobalVariable.run_env == 'UA') {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_tw'))
} else {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase2_tw_st'))
}

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_ChangeShippingOptions'))

WebUI.waitForAlert(5)

WebUI.focus(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_add'))

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_add'))

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.ShipToName_tw'), 'shiptest')

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_city_tw'), '台北市', true)

WebUI.selectOptionByValue(findTestObject('OB001/Page_/select_Checkout_ChangeAddress_add_suburb_tw'), '大同區', true)

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine1'), 'testaddress1')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), 'testaddress2')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.DeliveryInstruction'), 'do not ship')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.FormattedPhoneNumber'), '0911111111')

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_edit'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine1'), 'testaddress3')

WebUI.setText(findTestObject('OB001/Page_/input_AddressToEdit.AddressLine2'), 'testaddress4')

WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

WebUI.waitForAlert(5)

now_url = WebUI.getUrl()

println(now_url)

if (now_url != GlobalVariable.url_ChangeAddress) {
    WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))

    WebUI.waitForAlert(5)
}

//WebUI.click(findTestObject('OB001/Page_/button_Checkout_ChangeAddress_save'))
//WebUI.waitForAlert(5)
WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_Checkout_ChangeAddress_delete'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_Checkout_ChangeAddress_ReturnToCheckout'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_TopCheckout_PlaceOrder'))

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB001/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the order checkout is secure (https in the url)'
GlobalVariable.test_case = '245322'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add a new address'
GlobalVariable.test_case = '245323'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Edit an existing address'
GlobalVariable.test_case = '245324'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Delete an existing address'
GlobalVariable.test_case = '245325'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

