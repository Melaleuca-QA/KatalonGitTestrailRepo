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

// 取上月月底日: BackDating Order Date
Calendar calendar = new GregorianCalendar()

Date b_date = calendar.getTime()

int b_day = calendar.get(Calendar.DAY_OF_MONTH)

BackDating_Date = (b_date - b_day)

StartTime = (BackDating_Date + 1)

EndTime = (b_date + 1)

BackDateTo = BackDating_Date

println(b_date)

println(b_day)

println(BackDating_Date.format('yyyy/MM/dd'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://uatwapincde/CMS/BackdatingAdmin.aspx')

WebUI.selectOptionByValue(findTestObject('Object Repository/OB_DataEntry/Page_/select_ProductionDevelopment'), 'Development', true)

WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_/input_StartTime'), '11/01/2022 01:00 AM')

WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_/input_EndTime'), '11/17/2022 17:00 PM')

WebUI.setText(findTestObject('Object Repository/OB_DataEntry/Page_/input_BackDateTo'), '10/31/2022')

//WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_/td_Format example 01302050 500 pm'))
WebUI.click(findTestObject('Object Repository/OB_DataEntry/Page_/Click_Save'))

WebUI.closeBrowser()

