import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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

GlobalVariable.DataTemporary = ''
GlobalVariable.DataTemporary = 'mrchief'
if(WebUI.verifyElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/lbl_Company Management') , GlobalVariable.TimeOut, FailureHandling.OPTIONAL)) {
	WebUI.setText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/input_Search Company Management') , GlobalVariable.DataTemporary, FailureHandling.STOP_ON_FAILURE)	 
	WebUI.verifyElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/span_CompanyID'), 30, FailureHandling.STOP_ON_FAILURE)
		
	if(WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/span_CompanyID'), GlobalVariable.DataTemporary, FailureHandling.OPTIONAL)) {
		println('Data '+GlobalVariable.DataTemporary+' have in list company')
		WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/input_Search Company Management'), Keys.chord(Keys.CONTROL,'a'), FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/input_Search Company Management'), Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)
	}
	else {
		WebUI.verifyTextPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/lbl_NoData'), true, FailureHandling.STOP_ON_FAILURE)t
		println('No Data')
	}
} else {
	println('You are not in the menu Company')	
}