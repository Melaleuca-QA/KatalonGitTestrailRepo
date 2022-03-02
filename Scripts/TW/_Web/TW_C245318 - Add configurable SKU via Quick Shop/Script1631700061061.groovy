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
if (WebUI.waitForElementVisible(findTestObject('OB003/Page_Melaleuca The Wellness Company/div__stars'), 3)) {
    WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/i__fa fa-times-circle'))
}

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart'))

WebUI.doubleClick(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'), '1210.2')

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.setText(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/input_()_txtSkuEntry'), '2000.2')

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button_ShoppingCart_AddtoCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/div_CloseShoppingCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__ProductBody'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__ProductBody_ValuePack'))

//WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a__1_2_3 (1)'))
//WebUI.click(findTestObject('Object Repository/OB003/Page_Melaleuca The Wellness Company/a_'))
//WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a__1_2_3_4 (3)'))
WebUI.navigateToUrl(GlobalVariable.url_category119)

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button__ProductBody_ValuePack_7911'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/img__ProductBody_ValuePack_7911_phoenix'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/img__ProductBody_ValuePack_7911_vanilla'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button__ProductBody_ValuePack_7911_AddtoCart'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/button__HomePage_Checkout'))

WebUI.navigateToUrl(GlobalVariable.url_Cart)

WebUI.click(findTestObject('OB003/Page_/button_TopProceedtoCheckout'))

WebUI.click(findTestObject('OB003/Page_Melaleuca The Wellness Company/a_ NoMorePurchase'))

WebUI.waitForPageLoad(100)

WebUI.setText(findTestObject('OB003/Page_/input__paymethodCvv'), '123')

WebUI.click(findTestObject('OB003/Page_/button_Payment'))

WebUI.waitForPageLoad(100)

WebUI.callTestCase(findTestCase('_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Add normal SKU via Quick Shop'
GlobalVariable.test_case = '245317'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Add configurable SKU via Quick Shop'
GlobalVariable.test_case = '245318'

WebUI.callTestCase(findTestCase('TW/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

