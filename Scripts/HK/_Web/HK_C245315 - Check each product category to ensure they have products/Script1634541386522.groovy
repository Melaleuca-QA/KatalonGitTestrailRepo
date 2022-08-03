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

WebUI.callTestCase(findTestCase('_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ProductCenter'))

WebUI.navigateToUrl(GlobalVariable.url_ProductStore)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition_FunctionalHealth'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductNutrition_FunctionalHealth_8408'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductBody'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductBody_ValuePack'))

WebUI.navigateToUrl(GlobalVariable.url_category119)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductBody_ValuePack_2004'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ProductBody_ValuePack_2004_2'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductBody_ValuePack_AddtoCart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductSkinCare'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductSkinCare_ShowAll'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductSkinCare_ShowAll_3621'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductFamily'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductFamily_ClothesClean'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductFamily_ClothesClean_7625'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductValueLiving'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductValueLiving_ChildCare'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductValueLiving_ChildCare_4913'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductPureOil'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductPureOil_CarrierOil'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductPureOil_CarrierOil_51036'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNewProducts'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNewProducts_NewArrivals'))

//WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductPureOil_NewProduct_4172'))
WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_fa fa-shopping-cart'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_TopProceedtoCheckout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_promotion_add'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_hk'))

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_TopCheckout_PlaceOrder'))

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB001/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245315'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check each product subcategory to ensure they have products'
GlobalVariable.test_case = '245316'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Add to Cart'
GlobalVariable.test_case = '245319'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Add to Cart'
GlobalVariable.test_case = '245320'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check for Promotions'
GlobalVariable.test_case = '245321'

WebUI.callTestCase(findTestCase('HK/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

