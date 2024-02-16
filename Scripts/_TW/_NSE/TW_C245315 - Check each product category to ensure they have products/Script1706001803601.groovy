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

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'營養輔助食品'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_supplements'))

'日常/推薦套組'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_supplements_savings-pack'))

'所有產品'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_supplements_all'))

'活力寶鈣錠'
WebUI.click(findTestObject('_OB_Jill/Page_/button_sku-2000'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'體重管理及食品'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_healthy-foods-and-drinks'))

'R3減醣計畫'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_R3'))

'所有產品'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_healthy-foods-and-drinks_all'))

'諾麗複合果汁'
WebUI.click(findTestObject('_OB_Jill/Page_/button_sku-7449'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'素食'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_vegetarian'))

'奶素'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_lacto-vegetarian'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_lacto-vegetarian_all'))

'觀適健晶潤飲'
WebUI.click(findTestObject('_OB_Jill/Page_/button_sku-3918'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'家用清潔'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_cleaning-and-laundry'))

WebUI.click(findTestObject('_OB_Jill/Page_/span_4333'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/img_4333'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'沐浴洗髮美體'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_personal-care'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_sku-5832'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'專業護理'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_pharmacy'))

WebUI.click(findTestObject('_OB_Jill/Page_/span_3847'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'美妝保養'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_sei-bella-beauty'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_beauty'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('_OB_Jill/Page_/span_70191'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'精油'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_essential-oils'))

WebUI.click(findTestObject('_OB_Jill/Page_/span_50059'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'新品'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_new-products'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_sku-8089'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_continue shopping'))

'特惠專區'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_extra-savings'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_69984'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_check shopping cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('_OB_Jill/Page_/span_add qty'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku1'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku2'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku3'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_delete cart sku4'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku5'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku6'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku7'))

WebUI.click(findTestObject('_OB_Jill/Page_/button_delete cart sku8'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_next step'))

'本月加購&贈品專區'
WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_promotion sku'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_add promotion to cart'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_add promotion to cart'))

WebUI.setText(findTestObject('Object Repository/_OB_Jill/Page_/input_cvvCode_checkout'), '123')

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_pay'))

'close similar shopping'
if (WebUI.waitForElementVisible(findTestObject('_OB_Jill/Page_/span_pay-close'), 3)) {
    WebUI.click(findTestObject('_OB_Jill/Page_/span_pay-close'))

    WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/span_pay'))
}

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_order history'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_order history'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_pay button'))

WebUI.setText(findTestObject('_OB_Jill/Page_/input_cvvCode_owing balance'), '123')

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_payment confirmation'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_Welcome to Melaleuca, The Wellness Company/button_continue shopping'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/button_order history'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_order history'))

WebUI.click(findTestObject('Object Repository/_OB_Jill/Page_/a_check order detail'))

WebUI.waitForAlert(10)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245315'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check each product subcategory to ensure they have products'
GlobalVariable.test_case = '245316'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Add to Cart'
GlobalVariable.test_case = '245319'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Add to Cart'
GlobalVariable.test_case = '245320'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check for Promotions'
GlobalVariable.test_case = '245321'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

