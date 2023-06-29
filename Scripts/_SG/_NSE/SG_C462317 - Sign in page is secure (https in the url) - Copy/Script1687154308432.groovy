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

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_Search'), '2000')

'prodcut search'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/input_Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_Search'), 'oil')

'prodcut search'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/input_Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_shopping_cart'))

WebUI.click(findTestObject('OB_NSE/Page_/button_ContinueShop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_Search'), 'renew')

'prodcut search'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/input_Search2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

'Return to shopping cart'
WebUI.click(findTestObject('Object Repository/_OB_NSE/Page_/span_shopping_cart'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_add'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Shopping Cart/span_PROCEED TO CHECKOUT'))

//WebUI.navigateToUrl('https://productstore2-uatsg.melaleuca.com/checkout')
//WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_keyboard_arrow_down'))
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_Pay With'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_ADD NEW PAYMENT METHOD'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/input_Card Number_cardNumber'), '4485198017122944')

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_Month'), '01', true)

WebUI.selectOptionByValue(findTestObject('OB_NSE/Page_Add New Payment Method/select_Year'), '2025', true)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Add New Payment Method/button_Save'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_CVV_cvvCode'), '123')

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_Place Order'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_No Thanks'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_Print My Receipt'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_Cancel'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_Cancel Order'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_See All_o-myAccPopup__icon loaded'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_ORDERS'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_Order History'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/a_Overview'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_My Account/a_Order History'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/a_Payment  Addresses'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/a_Lists'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Lists/a_Account Settings'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Account Settings/img_See All_o-myAccPopup__icon loaded'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Account Settings/a_Go To My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_My Account/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_My Account/a_Supplements'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_My Account/a_Saving Packs  Bundles'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Saving Packs and Bundles/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Saving Packs and Bundles/a_Cleaning and Laundry'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Saving Packs and Bundles/a_All Cleaning and Laundry'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Cleaning and Laundry/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Cleaning and Laundry/a_Personal Care'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Cleaning and Laundry/a_All Personal Care'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Personal Care/span_Menu'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Personal Care/a_Beauty'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Personal Care/a_All Beauty'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Sei Bella Beauty/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Sei Bella Beauty/a_Healthy Foods and Drinks'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Sei Bella Beauty/a_All Healthy Foods and Drinks'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Healthy Foods and Drinks/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Healthy Foods and Drinks/a_Medicines and Treatments'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Medicines and Treatments/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Medicines and Treatments/a_Home Fragrance'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Home Fragrance/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Home Fragrance/a_Essential Oils'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Essential Oils/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Essential Oils/a_New Member Savings Packs'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_NEW MEMBER SAVINGS PACKS/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_NEW MEMBER SAVINGS PACKS/a_Sales Aids and Logo Gear'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Sales Aids and Logo Gear/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Sales Aids and Logo Gear/a_Extra Savings'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Sales Aids and Logo Gear/a_New Products'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_New Products/a_Super Value'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Super Value/a_Limited-Time'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Limited-Time/a_Web-Only'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Web-Only/a_Pantry Packs'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Pantry Packs/a_Outlet Store'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Outlet Store/span_Menu'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Outlet Store/a_Extra Savings'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Outlet Store/a_VIPVIP Birthday Rewards'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_VIP Birthday/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_VIP Birthday/a_Extra Savings'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_VIP Birthday/a_VIPVIP Monthly Promotion'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_VIP/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_VIP/a_My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_VIP/a_Order History'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/a_My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Order History/a_My Lists'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Lists/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Lists/a_My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Lists/a_Payment Methods'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/a_My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Payment  Addresses/a_Message Preferences'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Account Settings/svg'))

WebUI.doubleClick(findTestObject('Object Repository/_OB_Jill/Page_Account Settings/a_My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Account Settings/a_Edit Backup Order'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Backup Order/span_Menu'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Backup Order/a_My Account'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Backup Order/a_Loyalty Shopping Dollars'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Loyalty Shopping Dollars/span_Menu'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Loyalty Shopping Dollars/a_Our Story'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Our Story/span_play_circle_outline'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Our Story/span_close'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Our Story/svg'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Our Story/a_Rewards'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Rewards/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Rewards/a_Which Products Do You Use'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Which Products and Services Do You Use/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Which Products and Services Do You Use/a_Help Center'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Help Center/path'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Help Center/a_Sign Out'))

