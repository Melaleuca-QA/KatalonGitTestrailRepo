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

WebUI.callTestCase(findTestCase('_HK/_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_Home)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_TrackingList'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductPurchaseTemporaryList'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_Purchased'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_MyTrackingList'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-chevron-down lists_chevron'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ModifyorAddTrackingList'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-plus-circle lists_add-to-list_plus'))

WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_lists_focus-input'), 'My Pack')

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ModifyorAddTrackingList_save'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition_ShowAll'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_fa fa-plus-circle_400'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))

//WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))
'1'
WebUI.setText(findTestObject('OB001/Page_/input_js-search-input'), 'renew')

WebUI.click(findTestObject('OB001/Page_/button_SearchSubmit'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/img_product-card_img_3604'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_fa fa-plus-circle'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))

WebUI.waitForAlert(5)

/*
WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_product-card_img_6317'))

//WebUI.click(findTestObject('OB001/Page_/img_3600'))
WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB001/Page_/div_offsale'))

now_text = WebUI.getText(findTestObject('Object Repository/OB001/Page_/div_offsale'))

println(now_text)

if (now_text != '暫時缺貨') {
    WebUI.click(findTestObject('OB001/Page_/span_fa fa-plus-circle'))

    WebUI.click(findTestObject('OB001/Page_/button_MyPack'))

    WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))
}
*/
'2'
WebUI.setText(findTestObject('OB001/Page_/input_js-search-input'), '2000')

WebUI.click(findTestObject('OB001/Page_/span_fa fa-search'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_product-card_img_2000'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_fa fa-plus-circle'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))

WebUI.waitForAlert(5)

'3'
WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductValueLiving'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductValueLiving_BodyClean'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_product-card_img_117'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_fa fa-plus-circle'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))

WebUI.waitForAlert(5)

'4'
WebUI.setText(findTestObject('OB001/Page_/input_js-search-input'), '油')

WebUI.click(findTestObject('OB001/Page_/span_fa fa-search'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_product-card_img_5542'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/span_fa fa-plus-circle'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack'))

WebUI.click(findTestObject('OB001/Page_/button_MyPack_Continue'))

WebUI.click(findTestObject('OB001/Page_/a_shopping-list'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyFavorite'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyPack'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa shopping-list-card_add-to-list'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_fa shopping-list-card_add-to-list'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyPack_1'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyFavorite_1'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle shopping-list-card'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyFavorite'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyPack'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle shopping-list-card'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle shopping-list-card'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/li_MyPack_1'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ModifyorAddTrackingList'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle lists_remove-icon'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_fa fa-circle-thin lists_default'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ModifyorAddTrackingList_save'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Try all Membership Pack options'
GlobalVariable.test_case = '247199'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Set up Customized Membership Pack'
GlobalVariable.test_case = '247200'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify "Most Popular Products"'
GlobalVariable.test_case = '247201'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Search by SKU name and number'
GlobalVariable.test_case = '247202'

WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

