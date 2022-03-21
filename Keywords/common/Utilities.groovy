package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
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
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import internal.GlobalVariable as GlobalVariable
import groovy.json.*
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.HttpBodyContent
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.util.List
import java.util.ArrayList
import java.util.HashMap
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

class Utilities {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
	// this makes results for
	def add_results(String id, String request) {
		def slurper = new JsonSlurper()
		def testrailKey = GlobalVariable.testrail_Api
		RequestObject ro = new RequestObject('Add TestRail results')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://melaleuca.testrail.io/index.php?/api/v2/add_results_for_cases/' + id)

		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		httpheader.add(new TestObjectProperty(
				'Authorization', ConditionType.EQUALS,
				"""Basic $testrailKey"""))
		ro.setHttpHeaderProperties(httpheader)

		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))

		def response = WS.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		return slurper.parseText(response.getResponseText())
	}
	/**
	 * record to test rail
	 * @param to Katalon variable
	 * @param to Katalon variable
	 * @param to Katalon variable
	 * @param to Katalon variable
	 * @param to Katalon variable
	 */
	@Keyword
	def testRailRecorder(String caseId, String caseId2, String browserType, String culture, String status) {
		def request
		def id = GlobalVariable.runId
		def cases = caseId
		def cases2 = caseId2
		def passFail = status
		println cases2
		if (passFail == "PASSED") {
			if (cases2 != ""){
				request = """{"results":[{"case_id":$cases,"status_id":1, "assignedto_id":78, "comment":"Katalon - $browserType | $culture"}, {"case_id":$cases2,"status_id":1, "assignedto_id":78, "comment":"Katalon - $browserType | $culture"}]}"""
			}else{
				request = """{"results":[{"case_id":$cases, "status_id":1, "assignedto_id":78, "comment": "Katalon - $browserType |  $culture"}]}"""}
			add_results(id, request)
		} else {
			if (cases2 != ""){
				request = """{"results":[{"case_id":$cases,"status_id":4, "assignedto_id":78, "comment":"Katalon - $browserType | $culture"}, {"case_id":$cases2,"status_id":1, "assignedto_id":78, "comment":"Katalon - $browserType | $culture"}]}"""
			}else{
				request = """{"results":[{"case_id":$cases, "status_id":4, "assignedto_id":78, "comment": "Katalon - $browserType |  $culture"}]}"""}
			add_results(id, request)

		}
	}
	/**
	 * Detect and output the current browser type, by getting the current driver being executed, by driver factory
	 */
	@Keyword
	def driverBrowserType() {
		def browserType = DriverFactory.getExecutedBrowser()
		browserType.toString()
		println(browserType)
		return browserType
	}
	/**
	 * Sign in passing customer as the customer wanted to sign in , password hard coded encrypted
	 *  @param to Katalon variable
	 */
	@Keyword
	def desktopSignIn(String customer) {
		if(WebUI.waitForElementVisible(findTestObject('North America - Web/not_Signed_In_Home/link_Sign_In'),10))
		{
			WebUI.waitForElementVisible(findTestObject('North America - Web/not_Signed_In_Home/link_Sign_In'), 10)
			WebUI.click(findTestObject('North America - Web/not_Signed_In_Home/link_Sign_In'))
		}
		WebUI.waitForPageLoad(10)
		WebUI.waitForElementVisible(findTestObject('North America - Web/sign_In/input_Username'), 10)
		WebUI.setText(findTestObject('North America - Web/sign_In/input_Username'), customer)
		WebUI.setEncryptedText(findTestObject('North America - Web/sign_In/input_Password'), 'TkieytSrkmTXJHOu+KLYQA==')
		WebUI.enhancedClick(findTestObject('North America - Web/sign_In/button_Sign_In'))
		WebUI.waitForElementNotPresent(findTestObject('North America - Web/sign_In/button_Sign_In'), 10)
		// get rid of any pop-ups by refreshing page
		WebUI.executeJavaScript('var origin = window.location.host; console.log(origin);location.replace("https://"+origin);', [])
		WebUI.refresh()
	}
	/**
	 * Mobile Sign in passing customer as the customer wanted to sign in , password hard coded encrypted
	 *  @param customer: web account
	 */
	@Keyword
	def mobileSignIn(String customer) {
		WebUI.waitForElementVisible(findTestObject('North America - Mobile/not_signed_in/link_Sign_In'), 10)
		WebUI.click(findTestObject('North America - Mobile/not_signed_in/link_Sign_In'), FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForPageLoad(10)
		WebUI.waitForElementNotVisible(findTestObject('North America - Mobile/not_signed_in/link_Sign_In'), 10)
		WebUI.waitForPageLoad(10)
		WebUI.waitForElementVisible(findTestObject('North America - Mobile/sign_in/input_Username'), 10)
		WebUI.setText(findTestObject('North America - Mobile/sign_in/input_Username'), customer)
		WebUI.setEncryptedText(findTestObject('North America - Mobile/sign_in/input_Password'), 'TkieytSrkmTXJHOu+KLYQA==')
		WebUI.click(findTestObject('North America - Mobile/sign_in/button_Sign In'))
		WebUI.waitForElementNotVisible(findTestObject('North America - Mobile/sign_in/button_Sign In'), 10)
		WebUI.waitForPageLoad(10)
		// get rid of any pop-ups by refreshing page
		WebUI.executeJavaScript('var origin = window.location.host; console.log(origin);location.replace("https://"+origin);', [])
		WebUI.refresh()
	}
	/**
	 * remove from cart
	 * @param to Katalon variable
	 */
	@Keyword
	def removeFromCart(String url) {
		WebUI.navigateToUrl(url + 'cart')
		WebUI.refresh() //prevent any pop-ups
		//check for remove button and remove items from cart
		while (WebUI.waitForElementVisible(findTestObject('North America - Web/shopping_Cart/link_Remove'), 5)) {
			WebUI.click(findTestObject('North America - Web/shopping_Cart/link_Remove'), FailureHandling.OPTIONAL)
		}
	}
	/**
	 * Make an NSE Api Call add items to cart via javascript
	 * @param skus list of Skus
	 * @param culture - this is US-en, CA-en or MX-sp
	 */
	@Keyword
	def apiAddCart(List skus, String culture) {
		String test = "0"
		String apiRoute = "#"
		if (culture == "enUS") {
			apiRoute = "/api/cart?sc_itemid=%2DB7CA56-D8E5-4A4F-B007-5E1F91F85418&sc_lang=en-US&sc_site=productstoreUs"
		}else if (culture == "enCA") {
			apiRoute = "/api/cart?sc_itemid=%7B2B65E850-5C68-44D5-83DF-B04BB2DA0DB2%7D&sc_lang=en-CA&sc_site=productstoreCa"
		}else if (culture == "esMX") {
			apiRoute = "/api/cart?sc_itemid=%7B80013D86-3E55-450F-8C55-D0E02FC05976%7D&sc_lang=es-MX&sc_site=productstoreMx"
		}

		WebUI.executeJavaScript(((((((((((((((((((((((
				'var melaSite = window.origin;'+
				"""var cartApi = melaSite + "$apiRoute";""")+
				'if(typeof(jQuery)=="undefined")')+
				'{window.jQuery="loading";')+
				'var a=document.createElement("script");')+
				'a.type="text/javascript";')+
				'a.src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js";')+
				'a.onload=function(){console.log("jQuery "+jQuery.fn.jquery+" loaded successfully.");')+
				'var addCart = {Sku: '+ test +', Quantity: 1};')+
				'$.ajax({type: "POST",')+
				'url: cartApi,')+
				'data: JSON.stringify(addCart),')+
				'contentType: "application/json; charset=utf-8",')+
				'dataType: "json",')+
				'success: function(data){console.log(data);},')+
				'failure: function(errMsg) {')+
				'  alert(errMsg);}')+
				'});')+
				'};')+
				'a.onerror=function(){delete jQuery;alert("Error while loading jQuery!");};')+
				'document.getElementsByTagName("head")[0].appendChild(a);')+
				'}else{')+
				'if(typeof(jQuery)=="function"){alert("jQuery ("+jQuery.fn.jquery+") is already loaded!");}else{alert("jQuery is already loading...");}};'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		for (String sku:skus ) {
			WebUI.executeJavaScript((((((((((((
					'var melaSite = window.origin;'+
					"""var cartApi = melaSite + "$apiRoute";""")+
					'var addCart = {Sku: '+ sku +', Quantity: 1};')+
					'$.ajax({type: "POST",')+
					'url: cartApi,')+
					'data: JSON.stringify(addCart),')+
					'contentType: "application/json; charset=utf-8",')+
					'dataType: "json",')+
					'success: function(data){console.log(data);},')+
					'failure: function(errMsg) {')+
					'  alert(errMsg);}')+
					'});'), null, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(5)
		}
	}
	/**
	 * create a unique name for address
	 * @param to culture
	 */
	@Keyword
	def uniqueAddressName(String culture) {
		TimeZone.getTimeZone('UTC')

		Date date = new Date()

		String newdate = date.format('MMddYYYY')

		String time = date.format('HHmm')

		String test = 'Delete_me'

		String unique_add_name = ""

		if (culture != null) {

			unique_add_name = ((test + newdate) + culture) + time
			println(unique_add_name)
		} else {
			unique_add_name = ((test + newdate) + 'nocountry') + time
			println(unique_add_name)
		}
		return unique_add_name
	}
	/**
	 * create a unique name for address
	 * @param to culture
	 */
	@Keyword
	def dateTime() {
		TimeZone.getTimeZone('UTC')

		Date date = new Date()

		String newdate = date.format('MMddYYYY')

		String time = date.format('HHmm')

		String dateTime = newdate + time

		return dateTime
	}
	/**
	 * Fill out address form
	 * @param addressName = unique name using time stamp for address with culture
	 * @param addressOne = variable passing the address line 1
	 * @param city = variable pass city name
	 * @param zip = variable pass postal code or zipcode
	 * @param state = variable pass State, Province or State MX
	 * @param suburb = variable pass suburb only used by Mexico
	 */
	@Keyword
	def addressFormFill(String addressName, String addressOne, String city, String zip, String state, String suburb) {

		WebUI.waitForPageLoad(2)

		WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/input_Recipient Name'), 3)

		WebUI.setText(findTestObject('North America - Web/add_New_Shipping_Address/input_Recipient Name'), addressName)

		WebUI.setText(findTestObject('North America - Web/add_New_Shipping_Address/input_Address_1'), addressOne)

		WebUI.setText(findTestObject('North America - Web/add_New_Shipping_Address/input_City'), city)

		if (WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/input_Zipcode'), 3)) {
			WebUI.setText(findTestObject('North America - Web/add_New_Shipping_Address/input_Zipcode'), zip, FailureHandling.STOP_ON_FAILURE)
		} else if (WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/input_Postal_Code_CA_MX'),
		3)) {
			WebUI.setText(findTestObject('North America - Web/add_New_Shipping_Address/input_Postal_Code_CA_MX'), zip, FailureHandling.STOP_ON_FAILURE)
		}

		if (WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/select_State'), 3)) {
			WebUI.selectOptionByLabel(findTestObject('North America - Web/add_New_Shipping_Address/select_State'), state, false)
		} else if (WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/select_State_Ca'), 3)) {
			WebUI.selectOptionByLabel(findTestObject('North America - Web/add_New_Shipping_Address/select_State_Ca'), state, false)
		} else if (WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/select_State_Mx'), 3)) {
			WebUI.selectOptionByLabel(findTestObject('North America - Web/add_New_Shipping_Address/select_State_Mx'), state, false)

			WebUI.setText(findTestObject('North America - Web/add_New_Shipping_Address/input_Suburb'), suburb)
		}
		WebUI.check(findTestObject('North America - Web/add_New_Shipping_Address/check_Default_Address'))
		String isChecked = WebUI.getAttribute(findTestObject('North America - Web/add_New_Shipping_Address/checkbox_Default_Shipping_Address'), 'checked')
		if (!isChecked) {
			WebUI.check(findTestObject('North America - Web/add_New_Shipping_Address/check_Default_Address'))
		}
		WebUI.click(findTestObject('North America - Web/add_New_Shipping_Address/Link_Save'), FailureHandling.STOP_ON_FAILURE)

		'in case asks to verify address, optional check '
		WebUI.waitForElementVisible(findTestObject('North America - Web/add_New_Shipping_Address/link_Use_Address'), 5, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('North America - Web/add_New_Shipping_Address/link_Use_Address'), FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('North America - Web/add_New_Shipping_Address/Link_Save'), FailureHandling.OPTIONAL)

		WebUI.verifyElementNotPresent(findTestObject('North America - Web/add_New_Shipping_Address/Link_Save'), 5, FailureHandling.STOP_ON_FAILURE)

		WebUI.waitForPageLoad(2)
	}
	// this does an API request for pay method from automation route
	def requestPayMethod(String country, String accType, String env) {
		def request // not being used
		//String env = 'UserAcceptance'
		String environmentUrl = 'env=' + env
		String route = 'generateAccountNumber?'
		//String accType = 'Visa'
		String payType = 'payType='+accType
		//String country = 'UnitedStates'
		String countrySelect = 'country='+ country
		request = '' //A json request would go here if needed
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('get account number')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://auto-win-pd.melaleuca.net:8091/'+route+environmentUrl+'&'+payType+'&'+countrySelect)
		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		ro.setHttpHeaderProperties(httpheader)
		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))
		def response = WS.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		return slurper.parseText(response.getResponseText())
	}
	/**
	 * make call to function for request pay method
	 * @param culture to find what country we want
	 * @param account for account wanted
	 * @param env for env wanted
	 */
	@Keyword
	def getPayMethod(String culture, String account, String env) {
		String country
		if (culture == "enUS" || culture == "spUS") {
			country = "UnitedStates"
		}else if (culture == "enCA"||culture == "frCA") {
			country = "Canada"
		}else if (culture == "esMX") {
			country = "Mexico"
		}
		String payment = requestPayMethod(country, account, env).toString()
		String cleanPayment = payment.replace("{", "")
		cleanPayment = cleanPayment.replace("}", "")
		cleanPayment = cleanPayment.replace("accountNumber=", "")
		return cleanPayment
	}
	/**
	 * create a unique name for address
	 * @param to culture
	 */
	@Keyword
	def uniqueCardName(String culture) {
		TimeZone.getTimeZone('UTC')

		Date date = new Date()

		String newdate = date.format('MMddYYYY')

		String time = date.format('HHmm')

		String test = 'NewCard'

		String unique_add_name = ""

		if (culture != null) {

			unique_add_name = ((test + newdate) + culture) + time
			println(unique_add_name)
		} else {
			unique_add_name = ((test + newdate) + 'nocountry') + time
			println(unique_add_name)
		}
		return unique_add_name
	}
	/**
	 * create a unique name for email
	 * @param to culture
	 */
	@Keyword
	def uniqueEmailAddress(String culture) {
		TimeZone.getTimeZone('UTC')

		Date date = new Date()

		String newdate = date.format('MMddYYYY')

		String time = date.format('HHmm')

		String test = 'NewEmail'

		String unique_add_name = ""

		if (culture != null) {

			unique_add_name = ((test + newdate) + culture) + time +'@fakemail.com'
			println(unique_add_name)
		} else {
			unique_add_name = ((test + newdate) + 'nocountry') + time +'@fakemail.com'
			println(unique_add_name)
		}
		return unique_add_name
	}
	/**
	 * remove all paymethods and add one
	 * @param customerId
	 * @param accType - visa , master card
	 * @param account - credit card number
	 */
	@Keyword
	def removePayMethods(String customerId, String accType, String account) {
		def request
		String userId = 'Sitecore'
		String env = 'UserAcceptance'
		String enviromentUrl = 'env=' + env
		String route = 'TestCustomers/removeAllPaymethodsAndAddNewWithOptions'
		String payType = 'payType='+accType
		String country = 'NorthAmerica'
		String countrySelect = 'country='+ country
		request = """{ "customerId": $customerId,
					"paymethodOptionsArray": [
						{"accountNumber": $account,
						"cardHolderName": "Test",
						"payTypeProperty": "$accType",
						"cardExpiration": "2029-06-10T18:50:22.107Z",
						"createdDate": "2021-06-10T18:50:22.108Z",
						"startedDate": "2021-06-10T18:50:22.108Z",
						"isDefaultPayment": true,
						"isBackupOrderPayment": true,
						"cvvCode": "777"
					}
				]
		}"""
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('remove paymethods, add new')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://auto-win-pd.melaleuca.net:8091/'+route+'?'+'networkLogonId='+userId)
		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		httpheader.add(new TestObjectProperty(
				'testEnvironment', ConditionType.EQUALS, env))
		httpheader.add(new TestObjectProperty(
				'softwareSystem', ConditionType.EQUALS, country))
		ro.setHttpHeaderProperties(httpheader)
		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))
		def response = WS.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		return slurper.parseText(response.getResponseText())
	}
	/**
	 * @param culture you want to create customer in
	 * returns a list item 0: username 1: userID
	 */
	@Keyword
	def createCustomer(String culture) {
		def request
		String env = 'UserAcceptance'
		String route = 'TestCustomers/v2/CreateBasic?testEnvironment='
		request = """{}"""
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('remove paymethods, add new')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://auto-win-pd.melaleuca.net:8091/'+route+env+'&cuValue='+culture)
		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		ro.setHttpHeaderProperties(httpheader)
		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))
		def response = WS.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		println(response_array)
		def username = WS.getElementPropertyValue(response, 'webAccountUserName')
		def userId = WS.getElementPropertyValue(response, 'customerDataProperty.customerId')
		println(username.toString() +" customer ID:"+ userId.toString())
		List customerInfo = [username.toString(), userId.toString()]
		return customerInfo
	}
	/**
	 * @param culture you want to create phone number for
	 */
	@Keyword
	def generatePhoneNum(String culture){
		List usAreaCode = ['208', '951', '909', '671', '684', '691', '680', '692']
		List caAreaCode = ['236', '778', '403', '204', '807', '819', '418', '709']
		String areaCode
		int random_area
		int rand
		String phone

		switch (culture) {
			case 'enUS':
				rand = Math.abs( new Random().nextInt() % (9999999 -2000000+1)) + 2000000
				random_area = Math.abs( new Random().nextInt() % 8-2+1) + 2
				areaCode = usAreaCode[random_area]
				if(areaCode == null ) {areaCode=909}
				phone = areaCode+rand.toString()
				return phone
			case 'spUS':
				rand = Math.abs( new Random().nextInt() % (9999999 -2000000+1)) + 2000000
				random_area = Math.abs( new Random().nextInt() % 8-2+1) + 2
				areaCode = usAreaCode[random_area]
				if(areaCode == null ) {areaCode=909}
				phone = areaCode+rand.toString()
				return phone
				break
			case 'enCA':
				rand = Math.abs( new Random().nextInt() % (9999999 -2000000 +1)) + 2000000
				random_area = Math.abs( new Random().nextInt() % 8-2+1) + 2
				areaCode = caAreaCode[random_area]
				if(areaCode == null ) {areaCode=236}
				phone = areaCode+rand.toString()
				return phone
				break
			case 'frCA':
				rand = Math.abs( new Random().nextInt() % (9999999 -2000000 +1)) + 2000000
				random_area = Math.abs( new Random().nextInt() % 8-2+1) + 2
				areaCode = caAreaCode[random_area]
				if(areaCode == null ) {areaCode=236}
				phone = areaCode+rand.toString()
				return phone
				break
			case 'esMX':
				rand = (int)Math.floor(Math.random()*(9999999999-2000000000+1)+2000000000);
				phone = rand.toString()
				return phone
				break
		}
	}
	/**
	 * @param username
	 * @param id for customer
	 */
	@Keyword
	def changePassword(username, customerId) {
		def request
		request = """{"userName": "$username", "password": "P4ssword",  "resetOnNextLogin": false}"""
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('change customer password')
		ro.setRestRequestMethod('PUT')
		ro.setRestUrl('http://uausapicde/customeraccount.api/v1/customers/webaccounts/'+customerId)

		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		httpheader.add(new TestObjectProperty('SoftwareSystem', ConditionType.EQUALS, 'NorthAmerica'))
		httpheader.add(new TestObjectProperty('CorrelationId', ConditionType.EQUALS, '11111'))
		ro.setHttpHeaderProperties(httpheader)

		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))

		def response = WS.sendRequest(ro)

	}
	// this does an API request for Gov id from automation route
	def requestGovId(String culture, String env) {
		def request
		//String env = 'UserAcceptance'
		String enviromentUrl = 'env=' + env
		String route = 'generateGovernmentId?'
		//String culture = 'enUS'
		String cultureSelect = 'culture='+ culture
		request = '' //A json request would go here if needed
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('get goverment id')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://auto-win-pd.melaleuca.net:8091/'+route+enviromentUrl+'&'+cultureSelect)
		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		ro.setHttpHeaderProperties(httpheader)
		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))
		def response = WS.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		return slurper.parseText(response.getResponseText())
	}

	/**
	 * make call to function for request Gov Id
	 * @param culture to find what country we want
	 * @param env for env wanted
	 */
	@Keyword
	def getGovId(String culture, String env) {
		String idGov = requestGovId(culture, env).toString()
		String cleanIdGov = idGov.replace("{", "")
		cleanIdGov = cleanIdGov.replace("}", "")
		cleanIdGov = cleanIdGov.replace("id=", "")
		println(cleanIdGov)
		return cleanIdGov
	}
	/**
	 * requires culture = enUS
	 * requires paymentType = Mastercard, Discover, AmericanExpress
	 *
	 */
	@Keyword
	def oleAddPaymethodContinue(culture, paymentType, env) {
		WebUI.waitForElementVisible(findTestObject('OLE/OLE_Signup_form/input_CardNumber'), 10)

		String paymethod = getPayMethod(culture, paymentType, env)

		WebUI.setText(findTestObject('OLE/OLE_Signup_form/input_CardNumber'), paymethod, FailureHandling.STOP_ON_FAILURE)

		WebUI.setText(findTestObject('OLE/OLE_Signup_form/input_Password'), 'checkTests')

		WebUI.setText(findTestObject('OLE/OLE_Signup_form/input_Confirm Password'), 'checkTests')

		if (paymentType =='AmericanExpress') {
			WebUI.setText(findTestObject('OLE/OLE_Signup_form/input_SecurityCode'), '7777', FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.click(findTestObject('OLE/OLE_Signup_form/button_Continue_finish'))
		WebUI.waitForElementNotVisible(findTestObject('OLE/OLE_Signup_form/input_CardNumber'), 10)
	}

	def requestRoutingMethod(country, account, env) {
		def request
		//String env = 'UserAcceptance'
		String enviromentUrl = 'env=' + env
		String route = 'generateRoutingNumber?'
		//String accType = 'ACHChecking'
		String payType = 'payType='+account
		//String country = 'UnitedStates'
		String countrySelect = 'country='+ country
		request = '' //A json request would go here if needed
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('get account number')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://auto-win-pd.melaleuca.net:8091/'+route+enviromentUrl+'&'+payType+'&'+countrySelect)
		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		ro.setHttpHeaderProperties(httpheader)
		WebUI.comment('body = ' + request)
		ro.setBodyContent(new HttpTextBodyContent(
				request, 'UTF-8', 'application/json'))
		def response = WS.sendRequest(ro)
		def response_array = slurper.parseText(response.getResponseText())
		return slurper.parseText(response.getResponseText())
	}
	/**
	 * requires culture = enUS
	 * requires paymentType = Mastercard, Discover, AmericanExpress
	 *
	 */
	@Keyword
	def getRoutingMethod(String culture, String account, String env) {
		String country
		if (culture == "enUS" || culture == "spUS") {
			country = "UnitedStates"
		}else if (culture == "enCA" || culture == "frCA") {
			country = "Canada"
		}else if (culture == "esMX") {
			country = "Mexico"
		}
		String routingNum = requestRoutingMethod(country, account, env).toString()
		String cleanRouting = routingNum.replace("{", "")
		cleanRouting = cleanRouting.replace("}", "")
		cleanRouting = cleanRouting.replace("routingNumber=", "")
		println(cleanRouting)
		return cleanRouting
	}
	/**********************API Keywords****************************/
	/**
	 * Generate the token and set it to the global variable Token for use with api calls
	 * This only works with UA and Stage
	 */
	@Keyword
	def generateToken() {
		def response
		def data
		def tokenText
		String enviroment = GlobalVariable.TestEnvironment
		if (enviroment == 'UserAcceptance' || enviroment =='Stage')
		{
			// get the token with a response
			response = WS.sendRequest(findTestObject('API Testing/Service Smoke-Sanity(UA)/Generate Token - UA'))
			// verify token response is 200
			WS.verifyResponseStatusCode(response, 200)
			// take the json response and convert to text or string
			data = response.getResponseText()
			// show me in console the json text
			println(data)
			// set a variable tokenText to equal the property of access_token
			tokenText = WS.getElementPropertyValue(response, 'access_token')
			// show me in console the token text
			println(tokenText.toString())
			// Set the global variable token to equal the tokenText or newely generated token
			GlobalVariable.Token = tokenText
			//show me in console that the global variable is now the new token
			println('UA or Stage Token: ' + GlobalVariable.Token)
		} else if (enviroment == 'Production')
		{
			// get the token with a response
			response = WS.sendRequest(findTestObject('API Testing/Service Smoke-Sanity(UA)/Generate Token - Prod'))
			// verify token response is 200
			WS.verifyResponseStatusCode(response, 200)
			// take the json response and convert to text or string
			data = response.getResponseText()
			// show me in console the json text
			println(data)
			// set a variable tokenText to equal the property of access_token
			tokenText = WS.getElementPropertyValue(response, 'access_token')
			// show me in console the token text
			println(tokenText.toString())
			// Set the global variable token to equal the tokenText or newely generated token
			GlobalVariable.Token = tokenText
			//show me in console that the global variable is now the new token
			println('Production Token: ' + GlobalVariable.Token)
		}
	}
}