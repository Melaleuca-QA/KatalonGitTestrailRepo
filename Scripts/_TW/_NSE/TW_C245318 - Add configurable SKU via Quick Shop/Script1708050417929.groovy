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

WebUI.click(findTestObject('OB_NSE/Page_/input_search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '1008')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_choice to cart'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shop'))

WebUI.click(findTestObject('OB_NSE/Page_/button_close'))

WebUI.waitForAlert(10)

WebUI.setText(findTestObject('OB_NSE/Page_/input_search'), '7911')

'prodcut search'
WebUI.click(findTestObject('OB_NSE/Page_/input_search_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_choice sku'))

WebUI.waitForAlert(10)

'Single SKU'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_Search/a_view cart'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_Search/a_view cart'))
} else {
    'Multiple SKUs'
    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_7911-sku1'))

    WebUI.click(findTestObject('OB_NSE/Page_/img_7911-sku2'))

    WebUI.waitForAlert(10)

    WebUI.click(findTestObject('OB_NSE/Page_Search/button_add to cart'))

    WebUI.click(findTestObject('OB_NSE/Page_Search/a_view cart'))
}

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_keyboard_arrow_down1'))

'60138'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_shopping_cart sku1'))

WebUI.click(findTestObject('OB_NSE/Page_/button_continue shopping1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_keyboard_arrow_down1'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down2'))

if (GlobalVariable.run_env == 'ST') {
    WebUI.scrollToElement(findTestObject('OB_NSE/Page_/span_shopping_cart sku4'), 5, FailureHandling.STOP_ON_FAILURE)

    '4467'
    WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart sku5'))
} else {
    WebUI.scrollToElement(findTestObject('OB_NSE/Page_/span_shopping_cart sku2'), 5, FailureHandling.STOP_ON_FAILURE)

    '4467'
    WebUI.click(findTestObject('OB_NSE/Page_/span_shopping_cart sku3'))
}

WebUI.waitForAlert(10)

'Single SKU'
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_NSE/Page_/button_check shopping cart'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_check shopping cart'))
} else {
    'Three SKUs'
    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_refinerImage_img1'))

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_refinerImage_img2'))

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/img_refinerImage_img3'))

    WebUI.click(findTestObject('OB_NSE/Page_Search/button_add to cart'))

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_check shopping cart'))
}

WebUI.waitForAlert(10)

WebUI.click(findTestObject('OB_NSE/Page_/span_keyboard_arrow_down2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_next step'))

WebUI.waitForAlert(10)

'本月加購&贈品專區'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/span_promotion sku'), 3)) {
    //WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_promotion sku'))
    //WebUI.waitForAlert(5)
    //WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_add promotion to cart'))
    //WebUI.waitForAlert(5)
    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_add promotion to cart'))

    WebUI.waitForAlert(10)
}

if (GlobalVariable.run_env != 'PD') {
    WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_cvvCode_checkout'), '123')

    WebUI.waitForAlert(5)
}

WebUI.click(findTestObject('OB_NSE/Page_/span_pay'))

'close similar shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_NSE/Page_/span_pay-close'), 3)) {
    WebUI.click(findTestObject('OB_NSE/Page_/span_pay-close'))

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/span_pay'))
}

WebUI.waitForAlert(10)

//抓起訖日期 Earned LSD //
def sys_date = new Date()

def sys_day = new Date().format('dd')

'每月1日'
lsd_bdate1 = ((sys_date - sys_day.toInteger()) + 1)

'每月15日'
lsd_edate1 = (lsd_bdate1 + 14)

'每月16日'
lsd_bdate2 = (lsd_edate1 + 1)

'每月25日'
lsd_edate2 = (lsd_bdate1 + 24)

lsd_bdate1 = lsd_bdate1.format('yyyy/MM/dd 00:00:00')

lsd_bdate2 = lsd_bdate2.format('yyyy/MM/dd 00:00:00')

new_lsd_bdate1 = Date.parse(lsd_bdate1)

new_lsd_bdate2 = Date.parse(lsd_bdate2)

lsd_edate1 = lsd_edate1.format('yyyy/MM/dd 23:59:59')

lsd_edate2 = lsd_edate2.format('yyyy/MM/dd 23:59:59')

new_lsd_edate1 = Date.parse(lsd_edate1)

new_lsd_edate2 = Date.parse(lsd_edate2)

now_date = sys_date.format('yyyy/MM/dd HH:mm:ss')

new_now_date = Date.parse(now_date)

//計算Earned LSD//
now_pp = WebUI.getText(findTestObject('OB_NSE/Page_/span_now pp'))

println(now_pp)

now_lsd = WebUI.getText(findTestObject('OB_NSE/Page_/span_now lsd'))

println(now_lsd)

now_lsd = now_lsd.substring(3)

println(now_lsd)

switch (true) {
    case (new_now_date >= new_lsd_bdate1) && (new_now_date <= new_lsd_edate1):
        'VIP'
        cal_lsd = ((now_pp.toInteger() * 0.1) * 33 // PC * 10% * 33
        )

        break
    case (new_now_date >= new_lsd_bdate2) && (new_now_date <= new_lsd_edate2):
        'PC'
        cal_lsd = ((now_pp.toInteger() * 0.05) * 33 // PC * 5% * 33
        )

        break
    default:
        cal_lsd = 0 // PC *  0% * 33

        break
}

//計算Earned LSD lock_rate//
'lock rate'
if (now_lsd.toInteger() > cal_lsd) {
    cal_lsd1 = Math.round(Math.floor((now_pp.toInteger() * 0.1) * 33 // PC * 10% * 33
            ))

    println(cal_lsd1)

    cal_lsd2 = Math.round(Math.floor((now_pp.toInteger() * 0.05) * 33 // PC * 5% * 33
            ))

    println(cal_lsd2)

    if (now_lsd.toInteger() == cal_lsd1) {
        cal_lsd = cal_lsd1
    } else if (now_lsd.toInteger() == cal_lsd2) {
        cal_lsd = cal_lsd2
    }
}

now_cal_lsd = cal_lsd.toInteger()

now_cal_lsd = now_cal_lsd.toString()

'final now_cal_lsd'
println(now_cal_lsd)

'Check Earded LSD Amount in order receipt'
WebUI.verifyEqual(now_lsd, now_cal_lsd)

WebUI.waitForAlert(10)

'進order history再次付款, 訂單即收款成功.'
WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_pay button'))

if (GlobalVariable.run_env == 'PD') {
    '取消訂單'
    WebUI.click(findTestObject('OB_NSE/Page_/a_cancel-order'))

    '確定取消訂單?'
    WebUI.click(findTestObject('OB_NSE/Page_/button_cancel-order'))
} else {
    WebUI.setText(findTestObject('Object Repository/OB_NSE/Page_/input_cvvCode_checkout'), '123')

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_payment confirmation'))

    WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_continue shopping2'))
}

WebUI.waitForAlert(10)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/button_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_order history'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_/a_check order detail'))

WebUI.waitForAlert(10)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Quick Shop'
GlobalVariable.test_case = '245317'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245318'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

