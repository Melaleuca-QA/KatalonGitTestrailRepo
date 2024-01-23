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

'Contact Melaleuca'
WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_contact'))

def ps_url = WebUI.getUrl()

WebUI.waitForAlert(5)

println(ps_url)

WebUI.verifyEqual(ps_url, GlobalVariable.nse_contactus)

WebUI.waitForPageLoad(5)

'Frequently Asked Questions'
WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_cs'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_cs_orders'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_7'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_8'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_9'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_a'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_b'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_c'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_d'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_orders_e'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_cs_refunds'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_7'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_8'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_refunds_9'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_cs_shipping'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_shipping_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_shipping_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_cs_payment'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_payment_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_payment_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_cs_invoice'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_7'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_8'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_9'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_a'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_b'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_cs_invoice_c'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_mem_member'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_member_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_member_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_member_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_member_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_member_5'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_mem_benefits'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_benefits_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_benefits_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_benefits_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_benefits_4'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_mem_questions'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_questions_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_questions_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_questions_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_questions_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_mem_questions_5'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_melaleuca_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_enroll'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_7'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_enroll_8'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_build'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_build_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_build_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_build_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_build_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_build_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_build_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_change'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_7'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_change_8'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_report'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_report_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_report_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_report_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_meeting'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_meeting_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_tax'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_tax_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_tax_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_tax_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_tax_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_tax_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_charitable'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_charitable_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_charitable_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_charitable_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_charitable_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_ftt'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_ftt_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_ftt_2'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_ftt_3'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_ftt_4'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_ftt_5'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_ftt_6'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_bd_policy'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_policy_1'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_bd_policy_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/a_faq_links'))

WebUI.click(findTestObject('Object Repository/OB_NSE/Page_Welcome to Melaleuca, The Wellness Company/button_faq_links_1'))

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_TW/_NSE/_General/_Logout_tw'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to \'Contact Melaleuca\''
GlobalVariable.test_case = '245312'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to \'Frequently Asked Questions\''
GlobalVariable.test_case = '245314'

WebUI.callTestCase(findTestCase('_TW/_Globals/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

