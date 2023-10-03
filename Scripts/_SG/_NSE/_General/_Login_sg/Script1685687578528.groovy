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

WebUI.navigateToUrl(GlobalVariable.url_uatsg)

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_signon'))

//WebUI.navigateToUrl('https://productstore2-uatjp.melaleuca.com/account/signin?ReturnUrl=%2fconnect%2fauthorize%2fcallback%3fclient_id%3dmelaleuca-sitecore-dev%26culture%3den-US%26nonce%3d7cfaa58d-515c-4bf8-b6d1-5334d47e8b67%26redirect_uri%3dhttps%253A%252F%252Fproductstore2-uatjp.melaleuca.com%252Fdepaccount%252FLoadProfile%26response_mode%3dform_post%26response_type%3dcode%2520id_token%26scope%3dopenid%2520offline_access%2520DEPInterface.API.Full%2520CustomerAccount.API.Full%2520Order.API.Full%2520Product.API.Full%2520Communication.API.Full%2520Address.API.Full%2520Organization.API.Full%2520SubscribedServices.API.Full%2520PayMethod.API.Full%2520Document.API.Full%2520BackupOrder.API.Full%2520Promotion.API.Full%2520LSD.API.Full%26state%3dhttps%253A%252F%252Fproductstore2-uatjp.melaleuca.com%252F')
WebUI.setText(findTestObject('OB_NSE/Page_/input_username'), GlobalVariable.sg_username1)

WebUI.setEncryptedText(findTestObject('OB_NSE/Page_/input_password'), GlobalVariable.sg_password1)

WebUI.click(findTestObject('OB_NSE/Page_/button_Login'))

