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

WebUI.callTestCase(findTestCase('_TW/_General/_Login_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.doubleClick(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtSkuEntry'))

WebUI.setText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '1210.2')

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.setText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_CloseShoppingCart'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_ProductBody'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_ProductBody_ValuePack'))

WebUI.navigateToUrl(GlobalVariable.url_category119)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ProductBody_ValuePack_7911'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/img_ProductBody_ValuePack_7911_phoenix'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/img_ProductBody_ValuePack_7911_vanilla'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ProductBody_ValuePack_AddtoCart'))

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_HomePage_Checkout'))

WebUI.waitForAlert(5)

WebUI.navigateToUrl(GlobalVariable.url_Cart)

WebUI.click(findTestObject('OB_Web/Page_/button_TopProceedtoCheckout'))

WebUI.waitForAlert(5)

now_url = WebUI.getUrl()

println(now_url)

'CheckoutPromo Page'
if (now_url == GlobalVariable.url_CheckoutPromo) {
    WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_NoMorePurchase_tw'))
}

WebUI.waitForAlert(5)

WebUI.setText(findTestObject('OB_Web/Page_/input_paymethodCvv'), '123')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_Payment'))

if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_/div_3535'), 3)) {
    WebUI.click(findTestObject('OB_Web/Page_/button_ck35'))
}

//抓起訖日期 Earned LSD //
def sys_date = new Date()

def sys_day = new Date().format('dd')

lsd_bdate1 = ((sys_date - sys_day.toInteger()) + 1)

lsd_edate1 = (lsd_bdate1 + 14)

lsd_bdate2 = (lsd_edate1 + 1)

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
now_pp = WebUI.getText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/td_pp'))

println(now_pp)

now_lsd = WebUI.getText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/td_tw_lsd'))

println(now_lsd)

now_lsd = now_lsd.substring(7)

println(now_lsd)

switch (true) {
    case (new_now_date >= new_lsd_bdate1) && (new_now_date <= new_lsd_edate1):
        cal_lsd = ((now_pp.toInteger() * 0.1) * 33) // PC * 10% * 33
        break
    case (new_now_date >= new_lsd_bdate2) && (new_now_date <= new_lsd_edate2):
        cal_lsd = ((now_pp.toInteger() * 0.05) * 33) // PC * 5% * 33
        break
    default:
        cal_lsd = 0 // PC *  0% * 33
        break
}

//計算Earned LSD lock_rate//
if (now_lsd.toInteger() > cal_lsd) {
    cal_lsd1 = Math.round(Math.floor((now_pp.toInteger() * 0.1) * 33)) // PC * 10% * 33
    println(cal_lsd1)
    cal_lsd2 = Math.round(Math.floor((now_pp.toInteger() * 0.05) * 33)) // PC * 5% * 33
    println(cal_lsd2)
    if (now_lsd.toInteger() == cal_lsd1) {
        cal_lsd = cal_lsd1
    } else if (now_lsd.toInteger() == cal_lsd2) {
		cal_lsd = cal_lsd2
    }
}

now_cal_lsd = cal_lsd

now_cal_lsd = now_cal_lsd.toString()

println(now_cal_lsd)

'Check Earded LSD Amount in order receipt'
WebUI.verifyEqual(now_lsd, now_cal_lsd)

WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Quick Shop'
GlobalVariable.test_case = '245317'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245318'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

