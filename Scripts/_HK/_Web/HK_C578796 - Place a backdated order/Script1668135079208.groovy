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

// 取上月月底日: BackDating Order Date
Calendar calendar = new GregorianCalendar()

Date b_date = calendar.getTime()

int b_day = calendar.get(Calendar.DAY_OF_MONTH)

BackDating_Date = (b_date - b_day)

println(b_date)

println(b_day)

println(BackDating_Date.format('dd/MM/yyyy'))

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

if (WebUI.waitForElementVisible(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_backdating_alert'), 0)) {
    WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/button_backdating_alert'))

    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_backdating_confirm'))

    WebUI.navigateToUrl('https://uatwweb.melaleuca.com/Home')

    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/span_fa fa-shopping-cart'))

    WebUI.setText(findTestObject('OB001/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '2000.2')

    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

    WebUI.waitForAlert(5)

    WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

    WebUI.waitForAlert(5)

    WebUI.click(findTestObject('OB001/Page_/button_TopProceedtoCheckout'))

    WebUI.waitForAlert(5)

    now_url = WebUI.getUrl()

    println(now_url)

    'CheckoutPromo Page'
    if (now_url == GlobalVariable.url_CheckoutPromo) {
        WebUI.click(findTestObject('OB001/Page_Melaleuca The Wellness Company/a_NoMorePurchase_hk'))

        WebUI.waitForAlert(5)
    }
    
    WebUI.setText(findTestObject('OB001/Page_/input_paymethodCvv'), '123')

    WebUI.waitForAlert(5)

    WebUI.click(findTestObject('OB001/Page_/button_TopCheckout_PlaceOrder'))

    WebUI.click(findTestObject('Object Repository/OB001/Page_Melaleuca The Wellness Company/td_OrderDate'))

    now_OrderDate = WebUI.getText(findTestObject('OB001/Page_Melaleuca The Wellness Company/td_OrderDate'))

    // 取Order Receipt 訂單日期
    println(now_OrderDate)

    //
    if (now_OrderDate != BackDating_Date.format('dd/MM/yyyy')) {
        println(((('...Order Date (' + now_OrderDate) + ') and BackDating (') + BackDating_Date.format('dd/MM/yyyy')) + 
            ') do not match...')

        WebUI.acceptAlert()
    } else {
        println(((('...Order Date (' + now_OrderDate) + ') and BackDating (') + BackDating_Date.format('dd/MM/yyyy')) + 
            ') match...')
    }
    
    WebUI.waitForAlert(5)

    WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

    'Place a backdated order'
    GlobalVariable.test_case = '578796'

    WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

    'Turn on Backdating'
    GlobalVariable.test_case = '578795'

    WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println(('... BackDating (' + BackDating_Date.format('dd/MM/yyyy')) + ') The commitment order has been completed...')

    WebUI.callTestCase(findTestCase('_TW/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)
}

