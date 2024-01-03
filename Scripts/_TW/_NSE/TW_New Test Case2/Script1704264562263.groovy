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

WebUI.waitForAlert(10)

'選單'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'套組推薦'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_recommended set'))

WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/productstore/extra-savings/pantry-pack')

WebUI.waitForAlert(10)

'選單'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'絕版商品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_out of items_c5'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'尊榮/永恆卡獨家特惠'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vip'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'生日特惠'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_birthday special'))

WebUI.waitForAlert(10)

'選單'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

'我的帳戶'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_my account'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

'訂單紀錄'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_order history'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

'付款及地址管理'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_payment and address'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

'追蹤清單'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_tracking list'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

'帳戶設定'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_account settings'))

WebUI.waitForAlert(10)

'選單'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

'編輯預備訂單'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_buo'))

'50點公司組合套裝'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_50pp_buo'))

'更新預備訂單內容'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_update buo content'))

'35點公司組合套裝'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_35pp_buo'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_update buo content'))

'回到我的帳戶'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_back to my account'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvld'))

'消費回饋'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_lsd'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_LSD_accumulated'))

WebUI.waitForAlert(10)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_wg'))

WebUI.waitForAlert(10)

WebUI.back()

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vip_upgrade'))

WebUI.waitForAlert(10)

'繼續購物'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vip_continue shopping'))

