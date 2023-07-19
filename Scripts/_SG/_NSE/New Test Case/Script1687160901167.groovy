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

WebUI.click(findTestObject('OB_NSE/Page_/input_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), '2000')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

'Return to shopping cart'
WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart'))

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_add'))

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_PROCEED TO CHECKOUT'))

WebUI.click(findTestObject('OB_NSE/Page_/a_Continue To Checkout'))

WebUI.click(findTestObject('OB_NSE/Page_/span_Pay With'))

WebUI.click(findTestObject('OB_NSE/Page_/a_ADD NEW PAYMENT METHOD'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_NSE/Page_Add New Payment Method/input_Card Number_cardNumber'), '4485198017122944')

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/select_Month'), '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/select_Year'), '2040', 
    true)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/label_Make this my Default Payment Method'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/button_Save'))

WebUI.navigateToUrl('https://productstore2-uatsg.melaleuca.com/checkout')

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_CVV_cvvCode'), '123')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Place Order'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_No Thanks'))

