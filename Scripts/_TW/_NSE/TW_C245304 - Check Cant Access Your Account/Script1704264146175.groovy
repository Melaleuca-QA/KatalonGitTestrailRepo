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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.nse_url_uattw)

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_signon'))

//WebUI.navigateToUrl('https://productstore2-uattw.melaleuca.com/account/signin?ReturnUrl=%2fconnect%2fauthorize%2fcallback%3fclient_id%3dmelaleuca-sitecore-dev%26culture%3den-US%26nonce%3d85a9a43c-a202-4f32-9b74-6b21eb534178%26redirect_uri%3dhttps%253A%252F%252Fproductstore2-uattw.melaleuca.com%252Fdepaccount%252FLoadProfile%26response_mode%3dform_post%26response_type%3dcode%2520id_token%26scope%3dopenid%2520offline_access%2520DEPInterface.API.Full%2520CustomerAccount.API.Full%2520Order.API.Full%2520Product.API.Full%2520Communication.API.Full%2520Address.API.Full%2520Organization.API.Full%2520SubscribedServices.API.Full%2520PayMethod.API.Full%2520Document.API.Full%2520BackupOrder.API.Full%2520Promotion.API.Full%2520LSD.API.Full%26state%3dhttps%253A%252F%252Fproductstore2-uattw.melaleuca.com%252F')
'Forgot Password'
WebUI.click(findTestObject('OB_NSE/Page_/a_forgot password'))

WebUI.waitForAlert(5)

WebUI.switchToWindowTitle('登入')

WebUI.switchToWindowTitle('建立您的網路帳戶')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/input_identificationString'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_identificationString'), 'jilllin2@melaleuca.com')

WebUI.click(findTestObject('OB_NSE/Page_/button_continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/input_IdentificationPin'))

WebUI.setText(findTestObject('OB_NSE/Page_/input_IdentificationPin'), '123456')

WebUI.click(findTestObject('OB_NSE/Page_/button_next'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/p_IdentificationMessage'))

'顯示搜尋結果-驗證碼無效，請輸入正確驗證碼或 申請新的驗證碼.'
now_result = WebUI.getText(findTestObject('OB_NSE/Page_/p_IdentificationMessage'))

now_result = now_result.trim()

println(now_result)

WebUI.verifyEqual(now_result, '驗證碼無效，請輸入正確驗證碼或 申請新的驗證碼.', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_signon'))

'Create Account'
WebUI.click(findTestObject('OB_NSE/Page_/a_create account'))

WebUI.waitForAlert(5)

WebUI.switchToWindowTitle('登入')

WebUI.switchToWindowTitle('建立您的網路帳戶')

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/input_identificationString'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_identificationString'), 'jilllin100@melaleuca.com')

WebUI.click(findTestObject('OB_NSE/Page_/button_continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/input_IdentificationPin'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_IdentificationPin'), '123456')

WebUI.click(findTestObject('OB_NSE/Page_/button_next'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/p_IdentificationMessage'))

'顯示搜尋結果-驗證碼無效，請輸入正確驗證碼或 申請新的驗證碼.'
now_result = WebUI.getText(findTestObject('OB_NSE/Page_/p_IdentificationMessage'))

now_result = now_result.trim()

println(now_result)

WebUI.verifyEqual(now_result, '驗證碼無效，請輸入正確驗證碼或 申請新的驗證碼.', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/a_resend IdentificationPin'))

WebUI.click(findTestObject('OB_NSE/Page_/input_identificationString'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_NSE/Page_/input_identificationString'), '0906556712')

WebUI.click(findTestObject('OB_NSE/Page_/button_continue'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_/p_IdentificationMessage'))

'顯示搜尋結果-驗證碼無效，請輸入正確驗證碼或 申請新的驗證碼.'
now_result = WebUI.getText(findTestObject('OB_NSE/Page_/p_IdentificationMessage'))

now_result = now_result.trim()

println(now_result)

WebUI.verifyEqual(now_result, '驗證碼無效，請輸入正確驗證碼或 申請新的驗證碼.', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.closeBrowser()

'Check \'Can\'t Access Your Account\''
GlobalVariable.test_case = '245304'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Check \'Create Your Online Account\''
GlobalVariable.test_case = '245306'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in to Website'
GlobalVariable.test_case = '245307'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out of Website'
GlobalVariable.test_case = '245308'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

