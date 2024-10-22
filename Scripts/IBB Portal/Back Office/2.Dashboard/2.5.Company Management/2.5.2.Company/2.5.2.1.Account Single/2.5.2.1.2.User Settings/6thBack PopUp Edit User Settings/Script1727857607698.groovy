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

WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/Pop Up/lbl_Confirmation'), 'Confirmation', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/Pop Up/btn_No') , FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/lbl_Edit User Data'), 'Edit User Data', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/lbl_Role Information') , 'Role Information', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/lbl_User Data') , 'User Data', FailureHandling.STOP_ON_FAILURE)