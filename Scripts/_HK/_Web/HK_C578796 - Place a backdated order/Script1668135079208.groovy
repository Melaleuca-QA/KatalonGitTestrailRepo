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

if (GlobalVariable.run_env == 'UA') {
    Calendar calendar = new GregorianCalendar()

    Date b_date = calendar.getTime()

    int b_day = calendar.get(Calendar.DAY_OF_MONTH)

    BackDating_Date = (b_date - b_day)

    StartTime = b_date

    StartTime = StartTime.format('yyyy/MM/dd')

    EndTime = (b_date + 1)

    EndTime = EndTime.format('yyyy/MM/dd')

    BackDateTo = BackDating_Date

    BackDateTo = BackDateTo.format('yyyy/MM/dd')

    println(StartTime)

    println(EndTime)

    println(BackDateTo)

    '1.Start - Turn on Backdating'
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl('http://uatwapincde/CMS/BackdatingAdmin.aspx')

    WebUI.waitForAlert(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/OB_DataEntry/Page_/select_ProductionDevelopment'), 'Development', 
        true)

    WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_/input_StartTime'), StartTime)

    WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_/input_EndTime'), EndTime)

    WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_/input_BackDateTo'), BackDateTo)

    //WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_/td_Format example 01302050 500 pm'))
    WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_/Click_Save'))

    '1.End - Turn on Backdating'
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('_HK/_General/_Login_hk'), [:], FailureHandling.STOP_ON_FAILURE)

    'close birthday\'s shopping'
    if (WebUI.waitForElementVisible(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 3)) {
        WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
    }
    
    '2.Place a backdated order'
    if (WebUI.getText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BackDating')) == '下前月訂單') {
        WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/button_backdating_alert'))

        WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_backdating_confirm'))

        WebUI.navigateToUrl('https://uatwweb.melaleuca.com/Home')

        WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/span_fa fa-shopping-cart'))

        WebUI.setText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/input_txtSkuEntry'), '2000.2')

        WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

        WebUI.waitForAlert(5)

        WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/button_ShoppingCart_Checkout'))

        WebUI.waitForAlert(5)

        WebUI.click(findTestObject('OB_Web/Page_/button_TopProceedtoCheckout'))

        WebUI.waitForAlert(5)

        now_url = WebUI.getUrl()

        println(now_url)

        'CheckoutPromo Page'
        if (now_url == GlobalVariable.url_CheckoutPromo) {
            WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/a_NoMorePurchase_hk'))

            WebUI.waitForAlert(5)
        }
        
        WebUI.setText(findTestObject('OB_Web/Page_/input_paymethodCvv'), '123')

        WebUI.waitForAlert(5)

        WebUI.click(findTestObject('OB_Web/Page_/button_TopCheckout_PlaceOrder'))

        WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/td_OrderDate'))

        now_OrderDate = WebUI.getText(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/td_OrderDate'))

        // 取Order Receipt 訂單日期
        println(now_OrderDate)

        if (now_OrderDate != BackDating_Date.format('dd/MM/yyyy')) {
            println(((('...Order Date (' + now_OrderDate) + ') and BackDating (') + BackDating_Date.format('dd/MM/yyyy')) + 
                ') do not match...')

            WebUI.acceptAlert()
        } else {
            println(((('...Order Date (' + now_OrderDate) + ') and BackDating (') + BackDating_Date.format('dd/MM/yyyy')) + 
                ') match...')
        }
        
        WebUI.waitForAlert(5)

        WebUI.callTestCase(findTestCase('_HK/_General/_Logout_hk_2'), [:], FailureHandling.STOP_ON_FAILURE)

        'Place a backdated order'
        GlobalVariable.test_case = '578796'

        WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

        'Turn on Backdating'
        GlobalVariable.test_case = '578795'

        WebUI.callTestCase(findTestCase('_HK/_General/HK Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)
    } else {
        println(('... BackDating (' + BackDating_Date.format('yyyy/MM/dd')) + ') The commitment order has been completed...')

        WebUI.callTestCase(findTestCase('_HK/_General/_Logout_hk_2'), [:], FailureHandling.STOP_ON_FAILURE)
    }
    
    '3.Start - Turn off Backdating'
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl('http://uatwapincde/CMS/BackdatingAdmin.aspx')

    WebUI.waitForAlert(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/OB_DataEntry/Page_/select_ProductionDevelopment'), 'Development', 
        true)

    WebUI.click(findTestObject('Object Repository/OB_Web/Page_/input_BackDatingDuration_cancel'))

    '3.End - Turn on Backdating'
    WebUI.waitForAlert(5)

    WebUI.closeBrowser()
}

