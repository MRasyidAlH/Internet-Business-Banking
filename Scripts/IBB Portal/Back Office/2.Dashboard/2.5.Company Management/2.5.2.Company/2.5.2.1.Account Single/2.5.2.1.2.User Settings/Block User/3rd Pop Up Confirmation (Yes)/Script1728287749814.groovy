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

WebUI.verifyElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_Confirmation') , 30, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_Confirmation') , 'Confirmation', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_Are You Sure Want To Block Your Data') , 'Are You Sure Want To Block Your Data?', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_You cannot undo this action') , 'You cannot undo this action', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/btn_Yes'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_Please Wait For Approval') , 30, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_Please Wait For Approval') , 'Please Wait For Approval', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/lbl_Saved Successfully'), 'Saved Successfully', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Block/btn_OK'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/lbl_Owner'), 30, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/lbl_Owner'), 'Owner', FailureHandling.STOP_ON_FAILURE)