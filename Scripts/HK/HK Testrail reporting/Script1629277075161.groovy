import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import internal.GlobalVariable as GlobalVariable
import groovy.json.*
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.HttpBodyContent as HttpBodyContent
import java.util.List as List
import java.util.ArrayList as ArrayList
import java.util.HashMap as HashMap

/*clean up import list*/
/*https://www.toolsqa.com/katalon-studio/integrating-katalon-studio-andtestrail/*/
/*imports and classes for Katalon https://docs.katalon.com/javadoc/overview-summary.html*/

def add_results(String id, String request) {
	def slurper = new JsonSlurper()
	RequestObject ro = new RequestObject('Add TestRail results')	
	ro.setRestRequestMethod('POST')
	ro.setRestUrl('https://melaleuca.testrail.io/index.php?/api/v2/add_results_for_cases/' + id)
	
	def httpheader = new ArrayList<TestObjectProperty>()
	httpheader.add(new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json'))
	httpheader.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Basic c3RhbmxleWNoZW5nQG1lbGFsZXVjYS5jb206TTV3Wk91OGdkYTg5cFFucW1rRmUtR1NyUDVhRjRrVHJKb3JkN2RKZ2Q='))
	ro.setHttpHeaderProperties(httpheader)		
	//println httpheader		
	WebUI.comment('body = ' + request)
	ro.setBodyContent(new HttpTextBodyContent(request, 'UTF-8', 'application/json'))
	//println ro.setBodyContent()	
	def response = WS.sendRequest(ro)	
	def response_array = slurper.parseText(response.getResponseText())
	println response
	println response.getResponseBodyContent()
	//println response_array
	return slurper.parseText(response.getResponseText())	
}

def request
def id = GlobalVariable.run_id
def cases = GlobalVariable.test_case
def cases2 = GlobalVariable.test_case2
println id
println cases
println cases2

if (GlobalVariable.test_case2 != '') {
    request = (((('{"results":[{"case_id":' + cases) + ',"status_id":1,"assignedto_id":78, "comment":"Katalon-HK"}, {"case_id":') + 
    cases2) + ',"status_id":1, "assignedto_id":78, "comment":"Katalon-HK"}]}')
} else {
    request = (('{"results":[{"case_id":' + cases) + ',"status_id":1,"assignedto_id":78, "comment":"Katalon-HK"}]}')
}
println request

add_results(id, request)
