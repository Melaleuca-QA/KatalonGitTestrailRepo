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
if (false) {
    GlobalVariable.tw_input_creditcard = '4000176233801257'
} else {
    'get credit card number'
    WebUI.callTestCase(findTestCase('_TW/_Globals/TW Credit Card Number'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_NSE/Page_/input_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), '2000')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_Search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

'Return to shopping cart'
WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_add'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Shopping Cart/span_PROCEED TO CHECKOUT'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_Continue To Checkout'))

WebUI.waitForAlert(10)

//WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/checkout')
//WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down'))
WebUI.click(findTestObject('OB_NSE/Page_/span_Pay With'))

WebUI.click(findTestObject('OB_NSE/Page_/a_ADD NEW PAYMENT METHOD'))

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('OB_NSE/Page_Add New Payment Method/input_Card Number_cardNumber'), GlobalVariable.tw_input_creditcard)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_Month'), '12', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_Year'), '2043', true)

WebUI.click(findTestObject('OB_NSE/Page_Add New Payment Method/button_Save'))

WebUI.waitForAlert(10)

WebUI.refresh()

WebUI.click(findTestObject('OB_NSE/Page_/span_Pay With'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_/label_VisaCard   9462'))

WebUI.waitForAlert(10)

WebUI.refresh()

WebUI.click(findTestObject('OB_NSE/Page_/span_Pay With'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_Web/Page_/icon_delete'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete'))

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('OB_NSE/Page_/input_CVV_cvvCode'), '123')

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_Place Order'))

WebUI.waitForAlert(10)

'close duplicate order alert'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/button_Place Duplicate Order'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/button_Place Duplicate Order'))
}

WebUI.waitForAlert(10)

'Error Here, no cancel order button.'
WebUI.click(findTestObject('OB_NSE/Page_/a_No Thanks'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_Cancel'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_Cancel Order'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/img_See All_o-myAccPopup_icon loaded'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_ORDERS'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_Order History'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Order History/a_Overview'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/a_Order History Detail'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Order History/a_Payment  Addresses'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Payment  Addresses/a_Lists'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Lists/a_Account Settings'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/img_See All_o-myAccPopup_icon loaded'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_Go To My Account'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_My Account/a_Supplements'))

WebUI.click(findTestObject('OB_NSE/Page_My Account/a_Saving Packs  Bundles'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Saving Packs and Bundles/a_Cleaning and Laundry'))

WebUI.click(findTestObject('OB_NSE/Page_Saving Packs and Bundles/a_All Cleaning and Laundry'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Cleaning and Laundry/a_Personal Care'))

WebUI.click(findTestObject('OB_NSE/Page_Cleaning and Laundry/a_All Personal Care'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Personal Care/a_Beauty'))

WebUI.click(findTestObject('OB_NSE/Page_Personal Care/a_All Beauty'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sei Bella Beauty/a_Healthy Foods and Drinks'))

WebUI.click(findTestObject('OB_NSE/Page_Sei Bella Beauty/a_All Healthy Foods and Drinks'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Healthy Foods and Drinks/a_Medicines and Treatments'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Medicines and Treatments/a_Home Fragrance'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Home Fragrance/a_Essential Oils'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Essential Oils/a_New Member Savings Packs'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_NEW MEMBER SAVINGS PACKS/a_Sales Aids and Logo Gear'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sales Aids and Logo Gear/a_New Products'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sales Aids and Logo Gear/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_Limited-Time/a_Web-Only'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sales Aids and Logo Gear/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_New Products/a_Super Value'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sales Aids and Logo Gear/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_Super Value/a_Limited-Time'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sales Aids and Logo Gear/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_Web-Only/a_Pantry Packs'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Sales Aids and Logo Gear/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_Pantry Packs/a_Outlet Store'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Outlet Store/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_Outlet Store/a_VIPVIP Birthday Rewards'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Outlet Store/a_Extra Savings'))

WebUI.click(findTestObject('OB_NSE/Page_VIP Birthday/a_VIPVIP Monthly Promotion'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_My Account'))

'X'
WebUI.click(findTestObject('OB_NSE/Page_My Account/a_MyAccount Order History'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_My Account'))

WebUI.click(findTestObject('OB_NSE/Page_Order History/a_My Lists'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_My Account'))

WebUI.click(findTestObject('OB_NSE/Page_Lists/a_Payment Methods'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_My Account'))

WebUI.click(findTestObject('OB_NSE/Page_Payment  Addresses/a_Message Preferences'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_My Account'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_Edit Backup Order'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Account Settings/a_My Account'))

WebUI.click(findTestObject('OB_NSE/Page_Backup Order/a_Loyalty Shopping Dollars'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Loyalty Shopping Dollars/a_Our Story'))

WebUI.click(findTestObject('OB_NSE/Page_Our Story/span_play_circle_outline'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_Our Story/span_close'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Rewards/a_Which Products Do You Use'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_Which Products and Services Do You Use/a_Help Center'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_My Account/svg'))

WebUI.click(findTestObject('OB_NSE/Page_/a_Sign Out'))

WebUI.closeBrowser()

