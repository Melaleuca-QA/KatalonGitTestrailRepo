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

'Recording mode'
if (true) {
    GlobalVariable.sg_input_creditcard = '4000176233801257'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_SG/_General/SG Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_SG/_General/_Login_sg'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_Search'), '2000')

'prodcut search'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_Search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_Search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

'Return to shopping cart'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_shopping_cart'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_add'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_PROCEED TO CHECKOUT'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_Continue To Checkout'))

//WebUI.navigateToUrl('https://productstore2-uatsg.melaleuca.com/checkout')
//WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_keyboard_arrow_down'))
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_Pay With'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_ADD NEW PAYMENT METHOD'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/input_Card Number_cardNumber'), GlobalVariable.sg_input_creditcard)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/select_Month'), '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/select_Year'), '2043', true)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/button_Save'))

WebUI.waitForAlert(5)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_Pay With'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/label_VisaCard   9462'))

WebUI.waitForAlert(5)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_Pay With'))

WebUI.click(findTestObject('_OB_Jill/Page_/icon_delete'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_delete'))

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_CVV_cvvCode'), '123')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Place Order'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_No Thanks'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_Order History'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/a_See Full Order Receipt'))

'error here'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Cancel'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Cancel Order'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_Order History'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/img_See All_o-myAccPopup__icon loaded'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/a_Sign Out'))

WebUI.closeBrowser()

