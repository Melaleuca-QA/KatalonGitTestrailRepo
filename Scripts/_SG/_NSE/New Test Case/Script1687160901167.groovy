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

WebUI.callTestCase(findTestCase('_SG/_General/_Login_sg'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/input_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_Search'), 
    '2000')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input__Search2 (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close (1)'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input__Search (1)'), 'oil')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input__Search2 (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close (1)'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input__Search (1)'), 'renew')

'prodcut search'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input__Search2 (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

'Return to shopping cart'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_shopping_cart (1)'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_add'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_PROCEED TO CHECKOUT'))

//WebUI.navigateToUrl('https://productstore2-uatsg.melaleuca.com/checkout')
//WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_keyboard_arrow_down'))
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_Pay With (2)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_ADD NEW PAYMENT METHOD (2)'))

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/input_Card Number_cardNumber (2)'), 
    '4485198017122944')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/select_Month                    01         _758b39 (2)'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/select_Year                    2023        _f8c894 (2)'), 
    '2040', true)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/button_Save (2)'))

WebUI.navigateToUrl('https://productstore2-uatsg.melaleuca.com/checkout')

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_CVV_cvvCode (2)'), '123')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Place Order (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Place Order_1'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_No Thanks (2)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Cancel (2)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Cancel Order (2)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/img_See All_o-myAccPopup__icon loaded (2)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_Go To My Account (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_My Account/a_Payment  Addresses (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/button_Delete (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/button_Delete_1 (1)'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/a_Order History'))

