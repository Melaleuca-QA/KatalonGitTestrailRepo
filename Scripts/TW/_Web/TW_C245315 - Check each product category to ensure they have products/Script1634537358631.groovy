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

WebUI.callTestCase(findTestCase('_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_ProductCenter'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_ProductStore)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNutrition_FunctionalHealth'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductNutrition_FunctionalHealth_8408'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductBody'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductBody_Throat'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductSellbella'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductSellbella_Face'))

//WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductSellBella_Face_70069'))
WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductFamily'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductFamily_HomeClean'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductFamily_HomeClean_5680'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductValueLiving'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductValueLiving_FreshBody'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductValueLiving_FreshBody_2468'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductPureOil'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductPureOil_CarrierOil'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductPureOil_CarrierOil_51021'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNewProducts'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductPureOil_CarrierOil_51021'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNewProducts'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductNewProducts_ShowAll'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductBody'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_ProductBody_ValuePack'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductBody_ValuePack_7911'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_ProductBody_ValuePack_7911_phoenix'))

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/img_ProductBody_ValuePack_7911_vanilla'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ProductBody_ValuePack_AddtoCart'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_HomePage_Checkout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_BottomProceedtoCheckout'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_tw'))

WebUI.navigateToUrl(GlobalVariable.url_Checkout)

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB001/Page_/button_Payment'))

WebUI.waitForAlert(5)

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB001/Page_/button_ck35'))
}

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245315'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check each product subcategory to ensure they have products'
GlobalVariable.test_case = '245316'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Add to Cart'
GlobalVariable.test_case = '245319'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Add to Cart'
GlobalVariable.test_case = '245320'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check for Promotions'
GlobalVariable.test_case = '245321'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

