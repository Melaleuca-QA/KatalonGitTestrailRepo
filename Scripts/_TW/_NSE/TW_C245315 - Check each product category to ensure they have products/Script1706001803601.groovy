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

WebUI.waitForAlert(5)

'營養輔助食品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_supplements'))

'日常/推薦套組'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_supplements_savings-pack'))

'所有產品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_supplements_all'))

if (GlobalVariable.run_env == 'ST') {
    '寶維適CV'
    WebUI.click(findTestObject('OB_NSE/Page_/button_sku-2000'))
} else {
    '活力寶鈣錠'
    WebUI.click(findTestObject('OB_NSE/Page_/button_sku-405'))
}

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'體重管理及食品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_healthy-foods-and-drinks'))

'R3減醣計畫'
WebUI.click(findTestObject('OB_NSE/Page_/a_R3'))

'所有產品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_healthy-foods-and-drinks_all'))

'諾麗複合果汁'
WebUI.click(findTestObject('OB_NSE/Page_/button_sku-7449'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'素食'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_vegetarian'))

'奶素'
WebUI.click(findTestObject('OB_NSE/Page_/a_lacto-vegetarian'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_lacto-vegetarian_all'))

'觀適健晶潤飲'
WebUI.click(findTestObject('OB_NSE/Page_/button_sku-3918'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'家用清潔'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_cleaning-and-laundry'))

WebUI.click(findTestObject('OB_NSE/Page_/span_4333'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_4333'))

WebUI.click(findTestObject('OB_NSE/Page_/button_add to cart'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'沐浴洗髮美體'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_personal-care'))

if (GlobalVariable.run_env == 'ST') {
    WebUI.click(findTestObject('OB_NSE/Page_/button_sku-3152'))
} else {
    WebUI.click(findTestObject('OB_NSE/Page_/button_sku-5832'))
}

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'專業護理'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_pharmacy'))

WebUI.click(findTestObject('OB_NSE/Page_/span_3847'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'美妝保養'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_sei-bella-beauty'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_beauty'))

WebUI.waitForAlert(10)

if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_NSE/Page_/a_beauty'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_beauty'))
}

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/span_70191'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'精油'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_essential-oils'))

WebUI.click(findTestObject('OB_NSE/Page_/span_50059'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'新品'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_new-products'))

WebUI.click(findTestObject('OB_NSE/Page_/button_sku-8089'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping1'))

WebUI.waitForAlert(10)

'特惠專區'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_extra-savings'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_69984'))

WebUI.waitForAlert(5)

'choice sku to shopping cart'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_Search/button_add to cart'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/img_4333'))

    WebUI.click(findTestObject('OB_NSE/Page_Search/button_add to cart'))

    WebUI.waitForAlert(5)
}

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_check shopping cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/span_add qty'))

WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku3'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_delete cart sku4'))

WebUI.waitForAlert(5)

//WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku5'))
//WebUI.waitForAlert(5)
WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku6'))

WebUI.waitForAlert(5)

//WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku7'))
//WebUI.waitForAlert(5)
//WebUI.click(findTestObject('OB_NSE/Page_/button_delete cart sku8'))
//WebUI.waitForAlert(5)
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_next step'))

WebUI.waitForAlert(5)

'本月加購&贈品專區'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/span_promotion sku'), 3)) {
    if (false) {
        WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_promotion sku'))

        WebUI.waitForAlert(5)

        WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_add promotion to cart'))

        WebUI.waitForAlert(5)

        WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_add promotion to cart'))
    } else {
        WebUI.click(findTestObject('OB_NSE/Page_/a_continue to checkout'))
    }
    
    WebUI.waitForAlert(5)
}

if (GlobalVariable.run_env != 'PD') {
    WebUI.setText(findTestObject('OB_NSE/Page_/input_cvvCode_owing balance'), '123')

    WebUI.waitForAlert(5)
}

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_pay'))

'close similar shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/span_pay-close'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/span_pay-close'))

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_pay'))
}

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_pay button'))

if (GlobalVariable.run_env == 'PD') {
    '取消訂單'
    WebUI.click(findTestObject('OB_NSE/Page_/a_cancel-order'))

    '確定取消訂單?'
    WebUI.click(findTestObject('OB_NSE/Page_/button_cancel-order' //  WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping2'))
            ))
} else {
    WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_cvvCode_checkout'), '123')

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_payment_owing-balance'))
}

WebUI.waitForAlert(10)

'close continue shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/button_continue shopping2'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/button_continue shopping2'))
}

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_check order detail'))

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

