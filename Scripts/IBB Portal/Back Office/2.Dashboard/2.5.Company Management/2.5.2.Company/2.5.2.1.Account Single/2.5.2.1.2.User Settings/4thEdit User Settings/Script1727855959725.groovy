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

WebUI.click(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/btn_Edit User Data') , FailureHandling.STOP_ON_FAILURE)
GlobalVariable.UserId = 'RTESTAUTO'
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_User ID_userId') , Keys.chord(Keys.CONTROL,'a'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_User ID_userId') , Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_User ID_userId'), GlobalVariable.UserId, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.Fullname = 'RTESTFULLNAME'
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Full name_fullName') , Keys.chord(Keys.CONTROL,'a'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Full name_fullName') , Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Full name_fullName') , GlobalVariable.Fullname, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.NIK = '3171030102030004'
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_NIK_identityNumber') , Keys.chord(Keys.CONTROL,'a'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_NIK_identityNumber') , Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_NIK_identityNumber') , GlobalVariable.NIK, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.Email = 'dauseril3@gmail.com'
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Email_email') , Keys.chord(Keys.CONTROL,'a'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Email_email') , Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Email_email') , GlobalVariable.Email, FailureHandling.STOP_ON_FAILURE)

GlobalVariable.MobilePhone = '81413207170'
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Mobile Phone Number_phoneNumber') , Keys.chord(Keys.CONTROL,'a'), FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Mobile Phone Number_phoneNumber') , Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/IBB Portal/Dashboard/Company Management/Company/User Settings/Edit User Data/input_Mobile Phone Number_phoneNumber') , GlobalVariable.MobilePhone, FailureHandling.STOP_ON_FAILURE)
