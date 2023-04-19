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
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 
    3)) {
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

'Start - 1st month enrollee'
WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

'FollowUpCenter'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_FollowUpCenter'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_/div_ChgEnrollee1'))

now_enrollee = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_/div_ChgEnrollee1'))

println(now_enrollee)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

'組織轉換'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_OrgChange'))

WebUI.waitForAlert(5)

'繼續(A->B)'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_1'))

WebUI.waitForAlert(5)

'0955223332'
if (GlobalVariable.run_country == 'TW') {
    'TW1'
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'))

    '輸入Enrollee手機號碼(Policy Admin Hold)'
    WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), '0955223332')
} else {
    'HK3'
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'))

    '輸入Enrollee手機號碼(Policy Admin Hold)'
    WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), '85255551471')
}

'搜尋Enrollee'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/span_EnrolleeSearch'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_ChooseEnrollee'))

'顯示搜尋結果-會員處於hold的狀態無法移線'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/div_OrgChangeResult0'))

now_result = WebUI.getText(findTestObject('OB_Web/Page_- Melaleuca/div_OrgChangeResult0'))

now_result = now_result.trim()

println(now_result + ' 1st month enrollee (A->B)')

WebUI.verifyEqual(now_result, '會員處於hold的狀態無法移線', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), now_enrollee)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_EnrolleeSearch'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_ChooseEnrollee'))

WebUI.waitForAlert(5)

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_EnrollerPhone'), FailureHandling.STOP_ON_FAILURE)

'輸入Enroller手機號碼(Out of enroller\'s Org)'
WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_EnrollerPhone'), '0966380400')

'搜尋Enroller'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/span_EnrollerSearch'))

'顯示搜尋結果-您組織內的夥伴所提供的電話號碼不存在'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/td_EnrollerSearchResult'))

now_result = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/td_EnrollerSearchResult'))

now_result = now_result.trim()

println(now_result + ' 1st month enrollee (A->B)')

if (GlobalVariable.run_country == 'TW') {
    WebUI.verifyEqual(now_result, '您組織內的夥伴所提供的電話號碼不存在', FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyEqual(now_result, '根據你所提供的電話號碼，你的組織內沒有此人', FailureHandling.STOP_ON_FAILURE)
}

WebUI.waitForAlert(5)

'0933509231'
if (GlobalVariable.run_country == 'TW') {
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_EnrollerPhone'), FailureHandling.STOP_ON_FAILURE)

    '輸入Enroller手機號碼(Policy Admin Hold)'
    WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_EnrollerPhone'), '0933509231')
} else {
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_EnrollerPhone'), FailureHandling.STOP_ON_FAILURE)

    '輸入Enroller手機號碼(Policy Admin Hold)'
    WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_EnrollerPhone'), '85255551471')
}

'搜尋Enroller'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/span_EnrollerSearch'))

WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/a_ChooseEnroller'))

'顯示搜尋結果-此顧客見識無法移動目標'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/div_OrgChangeResult3'))

now_result = WebUI.getText(findTestObject('OB_Web/Page_- Melaleuca/div_OrgChangeResult3'))

now_result = now_result.trim()

println(now_result + ' 1st month enrollee (A->B)')

WebUI.verifyEqual(now_result, '此顧客見識無法移動目標', FailureHandling.STOP_ON_FAILURE)

'第1代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation1'))

'第2代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation2'))

'第3代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation3_1'))

WebUI.waitForAlert(5)

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_3'))

WebUI.waitForAlert(5)

'查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_CloseSearchEnrollerDetail'))

'關閉查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/img'))

'確認'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Confirm'))

'顯示移線結果-您的移線成功'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

now_result = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

println(now_result + ' 1st month enrollee (A->B)')

WebUI.verifyEqual(now_result, '您的移線成功', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/a_Logout_tw_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_Login2'))

WebUI.setText(findTestObject('OB_Web/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB_Web/Page_/button_Login'))

WebUI.waitForAlert(5)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 
    3)) {
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

'組織轉換'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_OrgChange'))

WebUI.waitForAlert(5)

'繼續(B->A)\r\n'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), now_enrollee)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_EnrolleeSearch'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_ChooseEnrollee'))

WebUI.waitForAlert(5)

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_2'))

WebUI.waitForAlert(5)

'第1代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation1'))

'第2代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation2'))

'第3代'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/span_enroller_generation3_2'))

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_3'))

WebUI.waitForAlert(5)

'查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_CloseSearchEnrollerDetail'))

'關閉查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/img'))

'確認'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Confirm'))

'顯示移線結果-您的移線成功'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

now_result = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

println(now_result + ' 1st month enrollee (B->A)')

'End - 1st month enrollee'
WebUI.verifyEqual(now_result, '您的移線成功', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/a_Logout_tw_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_Login2'))

WebUI.setText(findTestObject('OB_Web/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB_Web/Page_/button_Login'))

WebUI.waitForAlert(5)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 
    3)) {
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

'Start - 2nd month enrollee'
WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

'FollowUpCenter'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_FollowUpCenter'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_/td_ChgEnrollee'))

now_get_phonenumber = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_/td_ChgEnrollee'))

println(now_get_phonenumber)

now_enrollee = (now_get_phonenumber.substring(0, 2) + now_get_phonenumber.substring(3, 11))

println(now_enrollee)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

'組織轉換'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_OrgChange'))

WebUI.waitForAlert(5)

'繼續(A->B)'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), now_enrollee)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_EnrolleeSearch'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_ChooseEnrollee'))

WebUI.waitForAlert(5)

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_2'))

WebUI.waitForAlert(5)

'第1代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation1'))

'顯示搜尋結果-此移動不允許。第一代目標已額滿。'
now_result = WebUI.getText(findTestObject('OB_Web/Page_- Melaleuca/div_OrgChangeResult2'))

now_result = now_result.trim()

println(now_result + ' 1st month enrollee (A->B)')

WebUI.verifyEqual(now_result, '此移動不允許。第一代目標已額滿。', FailureHandling.STOP_ON_FAILURE)

'第2代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation2'))

'第3代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation3_1'))

WebUI.waitForAlert(5)

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_3'))

WebUI.waitForAlert(5)

'查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_CloseSearchEnrollerDetail'))

'關閉查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/img'))

'確認'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Confirm'))

'顯示移線結果-您的移線成功'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

now_result = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

println(now_result + ' 2nd month enrollee (A->B)')

WebUI.verifyEqual(now_result, '您的移線成功', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/a_Logout_tw_2'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('OB_Web/Page_/button_Login2'))

WebUI.setText(findTestObject('OB_Web/Page_/input_Email_UserName'), GlobalVariable.tw_input_username1)

WebUI.setEncryptedText(findTestObject('OB_Web/Page_/input_Password'), GlobalVariable.tw_input_password1)

WebUI.click(findTestObject('OB_Web/Page_/button_Login'))

WebUI.waitForAlert(5)

'close birthday\'s shopping'
if (WebUI.waitForElementVisible(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/div_stars'), 
    3)) {
    WebUI.click(findTestObject('Object Repository/OB_Web/Page_Melaleuca The Wellness Company/i_fa fa-times-circle'))
}

WebUI.click(findTestObject('OB_Web/Page_Melaleuca The Wellness Company/div_BusinessCenter_tw'))

WebUI.click(findTestObject('OB_Web/Page_/a_BusinessCenter_enroll_tw'))

'組織轉換'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_/a_OrgChange'))

WebUI.waitForAlert(5)

'繼續(B->A)\r\n'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'))

WebUI.setText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/input_applicant'), now_enrollee)

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_EnrolleeSearch'))

WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_ChooseEnrollee'))

WebUI.waitForAlert(5)

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_2'))

WebUI.waitForAlert(5)

'第1代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation1'))

'第2代'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_enroller_generation2'))

'第3代'
WebUI.click(findTestObject('OB_Web/Page_- Melaleuca/span_enroller_generation3_2'))

'繼續'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Continue_3'))

WebUI.waitForAlert(5)

'查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/a_CloseSearchEnrollerDetail'))

'關閉查看細節'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/img'))

'確認'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/span_OrgChange_Confirm'))

'顯示移線結果-您的移線成功'
WebUI.click(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

now_result = WebUI.getText(findTestObject('Object Repository/OB_Web/Page_- Melaleuca/div_OrgChangeResult1'))

println(now_result + ' 2nd month enrollee (B->A)')

'End - 2nd month enrollee'
WebUI.verifyEqual(now_result, '您的移線成功', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForAlert(5)

WebUI.callTestCase(findTestCase('_HK/_General/_Logout_hk'), [:], FailureHandling.STOP_ON_FAILURE)

'Search for customers by clicking the names in the windows'
GlobalVariable.test_case = '245388'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Save a new enrollee change'
GlobalVariable.test_case = '245400'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Move a customer in their 1st month'
GlobalVariable.test_case = '245389'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Try to move a customer out of enroller\'s organization'
GlobalVariable.test_case = '245390'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Move a customer at least in 2nd month'
GlobalVariable.test_case = '245391'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Move to Marketing Executive with full 1st generation'
GlobalVariable.test_case = '245402'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Move to Marketing Executive on policy hold'
GlobalVariable.test_case = '245393'

WebUI.callTestCase(findTestCase('_TW/_General/TW Testrail reporting'), [:], FailureHandling.STOP_ON_FAILURE)

