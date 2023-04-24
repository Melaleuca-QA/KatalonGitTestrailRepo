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
import java.util.Date as Date

def sys_date = new Date()
def sys_day  = new Date().format('dd')

lsd_bdate = ((sys_date - sys_day.toInteger()) + 1)
lsd_edate = (lsd_bdate + 24)

lsd_bdate = lsd_bdate.format('yyyy/MM/dd 00:00:00')
new_lsd_bdate = Date.parse(lsd_bdate)

lsd_edate = lsd_edate.format('yyyy/MM/dd 23:59:59')
new_lsd_edate = Date.parse(lsd_edate)

now_date = sys_date.format('yyyy/MM/dd HH:mm:ss')
new_now_date = Date.parse(now_date)

//now_pp = '51'

if (new_now_date >= new_lsd_bdate && new_now_date <= new_lsd_edate) {
    cal_lsd = (now_pp.toInteger() * 0.1) * 7
} else {
    cal_lsd = 0
}

now_cal_lsd = Math.floor(cal_lsd)
println(now_cal_lsd)

