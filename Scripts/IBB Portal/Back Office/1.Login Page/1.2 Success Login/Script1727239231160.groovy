import org.junit.runner.notification.Failure
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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

//WebDriver driver = DriverFactory.getWebDriver()
WebUI.click(findTestObject('Object Repository/IBB Portal/Login/Source Login/input_Username_ant-input'))
WebUI.setText(findTestObject('Object Repository/IBB Portal/Login/Source Login/input_Username_ant-input'), 'mii.rioneda', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/IBB Portal/Login/Source Login/input_Password_ant-input'))
WebUI.setEncryptedText(findTestObject('Object Repository/IBB Portal/Login/Source Login/input_Password_ant-input'), '0rCkGedkRwq+tTFfGUuCHw==', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/IBB Portal/Login/Source Login/btn_Login'), FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementPresent(findTestObject('Object Repository/IBB Portal/Dashboard/Menu/lbl_Dashboard'), 30, FailureHandling.STOP_ON_FAILURE)
//WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)