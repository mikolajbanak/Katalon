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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/KatalonDemo/InkMakeAppointment'))

WebUI.setText(findTestObject('Object Repository/KatalonDemo/inputUsername'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/KatalonDemo/inputPassword'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/KatalonDemo/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KatalonDemo/SelectFacility'), 'Seoul CURA Healthcare Center',
	true)

//WebUI.selectOptionByIndex(findTestObject,('Object Repository/KatalonDemo/SelectFacility'), 1)
//WebUI.click(findTestObject('Object Repository/KatalonDemo/input_Apply for hospital readmission_hospit_63901f'))
WebUI.check(findTestObject('Object Repository/KatalonDemo/input_Apply for hospital readmission_hospit_63901f'))

//WebUI.click(findTestObject('Object Repository/KatalonDemo/label_Medicaid'))
WebUI.check(findTestObject('Object Repository/KatalonDemo/label_Medicaid'))

WebUI.setText(findTestObject('Object Repository/KatalonDemo/input_Visit Date (Required)_visit_date'), '26.06.2023')

WebUI.click(findTestObject('Object Repository/KatalonDemo/td_26'))

WebUI.setText(findTestObject('Object Repository/KatalonDemo/textarea_Comment_comment'), 'TestComment')

WebUI.click(findTestObject('Object Repository/KatalonDemo/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/KatalonDemo/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/KatalonDemo/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/KatalonDemo/Logout'))

WebUI.closeBrowser()