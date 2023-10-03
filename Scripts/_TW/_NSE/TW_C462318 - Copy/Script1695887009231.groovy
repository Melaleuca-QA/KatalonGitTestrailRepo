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

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_Search'), '2000')

'prodcut search'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Search/span_1'))

WebUI.navigateToUrl('https://productstore2-qatw.melaleuca.com/cart')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a__1'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/input__cardNumber'), '4485279812655047')

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/select_01                    02            _295013'), 
    '月', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/select_01                    02            _295013'), 
    '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/select_2023                    2024        _edd9c3'), 
    '2024', true)

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/input_cvv'), '123')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Add New Payment Method/button_'))

