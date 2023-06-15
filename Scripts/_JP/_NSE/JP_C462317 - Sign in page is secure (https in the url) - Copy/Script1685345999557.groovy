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

WebUI.callTestCase(findTestCase('_JP/_General/_Login_jp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/input__Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/input__Search'), 
    '2000')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input__Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input__Search'), 'oil')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input__Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_ContinueShop'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_close'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input__Search'), 'renew')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/input__Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_addQty'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_cartCheckout2'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_bogo_action'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_cartCheckout'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input__cardNumber'), '4485198017122944')

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_/select_month'), '月', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_/select_month'), '01', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/_OB_Jill/Page_/select_year'), '2024', true)

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input__cvv'), '123')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/label_'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_shopping_cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button__1_2'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a__1_2'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button__1_2_3'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/img__o-myAccPopup__icon loaded'))

WebUI.callTestCase(findTestCase('_JP/_General/_Logout_jp'), [:], FailureHandling.STOP_ON_FAILURE)

