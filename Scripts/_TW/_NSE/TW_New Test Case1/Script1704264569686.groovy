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

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

'Return to shopping cart'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_add'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_proceed to checkout'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_continue to checkout'))

WebUI.waitForAlert(10)

//WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/checkout')
//WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down'))
WebUI.click(findTestObject('OB_NSE/Page_/span_pay with'))

WebUI.click(findTestObject('OB_NSE/Page_/a_add new payment method'))

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/input_card number'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_year'), '2044', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_save'))

WebUI.waitForAlert(10)

WebUI.refresh()

WebUI.click(findTestObject('OB_NSE/Page_/span_pay with'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/label_visa card'))

WebUI.waitForAlert(10)

WebUI.refresh()

WebUI.click(findTestObject('OB_NSE/Page_/span_pay with'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/icon_delete'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete'))

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_cvv code'), '123')

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_place order'))

WebUI.waitForAlert(10)

'close duplicate order alert'
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_NSE/Page_/button_Place Duplicate Order'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_Place Duplicate Order'))
}

WebUI.waitForAlert(10)

//'Error Here, no cancel order button.'
//WebUI.click(findTestObject('OB_NSE/Page_/a_No Thanks'))
//WebUI.waitForAlert(10)
//WebUI.click(findTestObject('OB_NSE/Page_/button_Cancel'))
//WebUI.waitForAlert(10)
//WebUI.click(findTestObject('OB_NSE/Page_/button_Cancel Order'))
//WebUI.waitForAlert(10)
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_See All-myAccPopup_icon loaded'))

WebUI.waitForAlert(10)

WebUI.refresh()

'訂單'
WebUI.click(findTestObject('OB_NSE/Page_/button_orders'))

WebUI.waitForAlert(10)

'訂單紀錄'
WebUI.click(findTestObject('OB_NSE/Page_/a_order history'))

WebUI.waitForAlert(10)

'Owing-Balance Page - 再次付款button'
WebUI.click(findTestObject('OB_NSE/Page_/a_owing-balance_paybutton'))

WebUI.waitForAlert(10)

'取消訂單'
WebUI.click(findTestObject('OB_NSE/Page_/a_cancel-order'))

WebUI.waitForAlert(10)

'確定取消訂單?'
WebUI.click(findTestObject('OB_NSE/Page_/button_cancel-order'))

WebUI.waitForAlert(10)

'myAccPopup_icon'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_See All-myAccPopup_icon loaded'))

WebUI.waitForAlert(10)

'my-account'
WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_go to my account'))

WebUI.waitForAlert(10)

//WebUI.click(findTestObject('OB_NSE/Page_/a_Order History'))
//WebUI.waitForAlert(10)
WebUI.click(findTestObject('OB_NSE/Page_Order History/a_overview'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_order history detail'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Order History/a_payment addresses'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Payment  Addresses/a_Lists'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Lists/a_account settings'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl1'))

'營養輔助食品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_nutritional supplements'))

WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/productstore/supplements')

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl1'))

'日常推薦套裝'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_Daily recommended'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl1'))

'活力巔峰營養隨身包'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vitality bag'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl2'))

'體重管理及食品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_weight management'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl2'))

'健康管理 & 蛋白飲'
WebUI.click(findTestObject('OB_NSE/Page_/a_protein drink'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl2'))

'R3減醣計畫'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_R3'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl2'))

'健康零食'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_healthy snacks'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl2'))

'精選飲品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_selected drinks'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl2'))

'膳食纖維'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_dietary fiber'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl3'))

'素食'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vegetarian diet'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_menu_item-lvl3'))

'奶素'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_lacto-vegetarian'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl3'))

'五辛素/奶蛋素'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_lacto-ovo-protein'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl3'))

'全素'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vegan'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl4'))

'家用清潔'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_household cleaning'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl4'))

'居家清潔'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_home cleaning'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl4'))

'衣物清潔'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_laundry cleaning'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'沐浴洗髮美體'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_body care'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'身體清潔保養'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_body cleansing'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'口腔護理'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_oral care'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'頭髮清潔保養'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_hair cleaning'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'手部清潔'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_hand hygiene'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'戶外必備'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_outdoor essentials'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'寶寶兒童專用'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_babies and children'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'淨化抗痘'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_purifying and anti-acne'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'愛芬亞'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_affinia'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'型男高效保養'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_handsome men'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'清新體香'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_fresh body fragrance'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl5'))

'超值套組'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_value set'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

'專業護理'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl6'))

WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/productstore/pharmacy')

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'美妝保養'
WebUI.click(findTestObject('OB_NSE/Page_/a_beauty care'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'肌膚保養系列'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_skin care'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'自然美妝系列'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_natural beauty'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'美髮沙龍系列'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_hair salon'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'機能/美顏飲品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_beauty drinks'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'限量及推薦套組'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_Limited and recommended'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl7'))

'絕版商品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_out of items_77'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

'精油'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl8'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

'美樂家產品套裝'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvl9'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

'事業輔銷品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvla'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

'新品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlb'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'特惠專區'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_special offer'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'本月特惠'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_monthly special offer'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/svg'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_menu_item-lvlc'))

'滿40點特惠'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_40'))

WebUI.waitForAlert(10)

