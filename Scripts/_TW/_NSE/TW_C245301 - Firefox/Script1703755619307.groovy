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
    GlobalVariable.tw_input_creditcard = '4000176233801257'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_NSE/Page_/input_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '2000')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '蛋白質')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Search/button_add to cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '5點')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), 'Tub & Tile')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(5)

//WebUI.click(findTestObject('OB_NSE/Page_Search/button_add to cart'))

//WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_add'))

WebUI.waitForAlert(5)

'下一步'
WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_proceed to checkout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_continue to checkout'))

WebUI.waitForAlert(5)

WebUI.back()

WebUI.back()

WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart'))

WebUI.waitForAlert(5)

//WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/cart')
WebUI.click(findTestObject('OB_NSE/Page_/button_delete item'))

WebUI.click(findTestObject('OB_NSE/Page_/img_delete item1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete item'))

WebUI.click(findTestObject('OB_NSE/Page_/img_delete item2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete item'))

WebUI.click(findTestObject('OB_NSE/Page_/img_delete item3'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete item'))

WebUI.click(findTestObject('OB_NSE/Page_/img_delete item4'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete item'))

WebUI.click(findTestObject('OB_NSE/Page_/img_delete item5'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete item'))

WebUI.click(findTestObject('OB_NSE/Page_/img_delete item6'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_continue to shopping'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Firefox'
GlobalVariable.test_case = '245301'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

