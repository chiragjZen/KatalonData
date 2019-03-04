import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat-pos--uat.cs72.force.com/FOS/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('input_Username_username'), 'cdprimedealer_fos@bfl.in')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), '3zsWnKN+YWTTdAG8/sekZA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/button_Change Dealer'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('select_--None--2222 Automation'), '0015D00000SRSZHQA5', true)

WebUI.delay(3)

WebUI.focus(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/a_Search'))

WebUI.setText(findTestObject('input_Mobile Number (New Custo'), Mobile_Number)

WebUI.setText(findTestObject('input_First Name (New Customer'), Customer_name)

WebUI.click(findTestObject('Object Repository/span_Confirm'))

WebUI.focus(findTestObject('button_Proceed as NTB'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/button_Proceed as NTB'))

WebUI.click(findTestObject('Object Repository/a_Add Asset'))

WebUI.delay(5)

WebUI.focus(findTestObject('select_--None--2222 Automation'))

WebUI.selectOptionByValue(findTestObject('select_--None--2222 Automation'), '0015D00000SRSZHQA5', true)

not_run: WebUI.selectOptionByLabel(findTestObject('select_--None--2222 Automation'), '8888765 Automation_Shree Nath Electrovision', 
    false)

WebUI.setText(findTestObject('Object Repository/input_Model Name_combobox-uniq'), 'Sansui11081936 - OEM Asset Category-11081512 Rs200000')

WebUI.delay(3)

WebUI.click(findTestObject('span_Sansui11081936 - OEM Asse'))

WebUI.setText(findTestObject('Object Repository/input_Invoice Amount_651650a'), '180000')

WebUI.setText(findTestObject('Object Repository/input_Gross Loan Amount_791650'), '150000')

WebUI.setText(findTestObject('Object Repository/input_Scheme Name_combobox-uni'), '0011757')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/span_Master_Scheme__c0011622'))

WebUI.click(findTestObject('Object Repository/button_Add To Cart'))

WebUI.click(findTestObject('div_Edit'))

WebUI.click(findTestObject('a_--None--'))

WebUI.click(findTestObject('Object Repository/a_Aadhaar'))

WebUI.setText(findTestObject('Object Repository/input__23710'), 'NA')

WebUI.click(findTestObject('Bypass mobile validate'))

WebUI.setText(findTestObject('Object Repository/input__27080'), '150000')

WebUI.setText(findTestObject('Object Repository/input__30740'), 'D')

WebUI.click(findTestObject('DateofBirth'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_19191920192119221923192'), '1991', true)

WebUI.click(findTestObject('Object Repository/span_14'))

WebUI.click(findTestObject('Marital status'))

WebUI.click(findTestObject('Object Repository/a_Married'))

WebUI.click(findTestObject('GenderSelect'))

WebUI.click(findTestObject('Object Repository/a_Female'))

WebUI.click(findTestObject('Residence_type'))

WebUI.click(findTestObject('Object Repository/a_Self Owned'))

WebUI.setText(findTestObject('Object Repository/input__33900'), 'Rajyog society')

WebUI.setText(findTestObject('Object Repository/input__34070'), 'Walwekar Lawns')

WebUI.setText(findTestObject('Object Repository/input_Address Line 3_34280'), 'Parwati')

WebUI.setText(findTestObject('Object Repository/input__34450'), 'Satara Road')

WebUI.setText(findTestObject('Object Repository/input__34660'), 'Swargate')

WebUI.click(findTestObject('Object Repository/div_443001 BULDHANA'))

WebUI.click(findTestObject('zipcode selection'))

WebUI.setText(findTestObject('Object Repository/input_BFL Branch_36200'), '443001 BULDHANA')

not_run: WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('div_443001-BULDHANA'), 60)

WebUI.click(findTestObject('Object Repository/div_443001-BULDHANA'))

WebUI.click(findTestObject('Credit Program'))

WebUI.click(findTestObject('Object Repository/a_1.02 Direct'))

WebUI.click(findTestObject('Sourcing Surrogate Info 3'))

WebUI.click(findTestObject('Object Repository/a_Less than Rs. 20000'))

WebUI.click(findTestObject('Employement Type'))

WebUI.click(findTestObject('Object Repository/a_Housewife'))

WebUI.click(findTestObject('Data Entry Status'))

WebUI.click(findTestObject('Object Repository/a_Completed'))

not_run: WebUI.click(findTestObject('input_Bypass Mobile Validate_2'))

WebUI.click(findTestObject('span_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Downarrow'))

not_run: WebUI.waitForElementVisible(findTestObject('img_Notifications_profileIcon'), 60)

not_run: WebUI.focus(findTestObject('img_Notifications_profileIcon'))

not_run: WebUI.click(findTestObject('Object Repository/img_Notifications_profileIcon'))

WebUI.click(findTestObject('Object Repository/a_Logout'))

