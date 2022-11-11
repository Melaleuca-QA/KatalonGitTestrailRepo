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

def input_newname    = GlobalVariable.tw_input_newname
def input_newaddr    = GlobalVariable.tw_input_email
def input_newphone   = GlobalVariable.tw_input_mphone

Random rand = new Random()

int min = 1
int max = 99999999
int result = ((rand.nextFloat() * (max - min)) + min).round(0)

request1 = result.toString()
println (request1)

/* int 转String 位数不够前面补零 sample
public static String addZeroForNum(String str,int strLength) {
	int strlen = str.length();
	if (strlen < strlenth) {
     while (strlen < strLength) {
	  StringBuffersb = new StringBuffer();
	  sb.append("0").append(str);
	  str = sb.toString();
	  strLen = str.length();
	 }
	}
 return str ;
}
*/

request2 = '09' + String.format("%08d",result)
println (request2)

input_newname = ('tw' + request1)

GlobalVariable.tw_input_newname = input_newname
GlobalVariable.tw_input_email   = input_newname + '@melaleuca.com'
GlobalVariable.tw_input_mphone  = request2

println (GlobalVariable.tw_input_newname)
println (GlobalVariable.tw_input_email)
println (GlobalVariable.tw_input_mphone)
