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

WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/Company Details/btn_Menu Segmentation Settings') , FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/Company Details/Segmentation Settings/lbl_Segmentation Settings') , 30, FailureHandling.STOP_ON_FAILURE)
GlobalVariable.DataTemporary = WebUI.getText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/Company Details/Segmentation Settings/lbl_Segmentation Settings') , FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/Company Details/Segmentation Settings/lbl_Segmentation Settings') , GlobalVariable.DataTemporary, FailureHandling.STOP_ON_FAILURE)
GlobalVariable.DataTemporary = WebUI.getText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/Company Details/Segmentation Settings/lbl_CurrSegmentation') , FailureHandling.STOP_ON_FAILURE)
if(GlobalVariable.DataTemporary == '-') {
	println('No Segmentation,error')
	FailureHandling.STOP_ON_FAILURE
}
else {
	println('PASSED')
}