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

WebUI.setText(findTestObject('Page_Login  FOS Community/input_Username_username'), 'AutomationFOS@bfl.com')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), '3zsWnKN+YWTTdAG8/sekZA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.click(findTestObject('Page_Home/button_Change Dealer'))

WebUI.click(findTestObject('Page_Home/button_Save'))

WebUI.click(findTestObject('Page_Home/a_Search'))

WebUI.setText(findTestObject('Page_Search Customer/input_Mobile Number (New Custo'), '7725022019')

WebUI.setText(findTestObject('Page_Search Customer/input_First Name (New Customer'), 'Chirag')

WebUI.click(findTestObject('Page_Search Customer/span_Confirm'))

WebUI.click(findTestObject('Page_Search SRCH-0096723/lightning-primitive-icon'))

WebUI.click(findTestObject('Page_Customer Chirag/span_Add Asset'))

WebUI.click(findTestObject('Object Repository/select_--None--2222 Automation'))

WebUI.selectOptionByLabel(findTestObject('Page_Customer Chirag/select_--None--2222 Automation'), '8888765 Automation_Shree Nath Electrovision', 
    false)

WebUI.setText(findTestObject('Page_Customer Chirag/input_Model Name_combobox-uniq'), 'Sansui11081936 - OEM Asset Category-11081512 Rs200000')

WebUI.doubleClick(findTestObject('Page_Customer Chirag/span_Sansui11081936 - OEM Asse'))

WebUI.setText(findTestObject('Page_Customer Chirag/input_Invoice Amount_651647a'), '180000')

WebUI.setText(findTestObject('Page_Customer Chirag/input_Gross Loan Amount_791647'), '150000')

WebUI.setText(findTestObject('Page_Customer Chirag/input_Scheme Name_combobox-uni'), '0011622')

WebUI.click(findTestObject('Page_Customer Chirag/span_0011622'))

WebUI.click(findTestObject('Page_Customer Chirag/button_Add To Cart'))

WebUI.click(findTestObject('Page_Customer Chirag/div_Edit'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Aadhaar'))

WebUI.setText(findTestObject('Page_Customer Chirag/input__24310'), 'NA')

WebUI.setText(findTestObject('Page_Customer Chirag/input__27680'), '150000')

WebUI.click(findTestObject('Page_Customer Chirag/input_Bypass Mobile Validate_2'))

WebUI.setText(findTestObject('Page_Customer Chirag/input__31340'), 'Jain')

WebUI.click(findTestObject('Page_Customer Chirag/a_Date Picker'))

WebUI.selectOptionByValue(findTestObject('Page_Customer Chirag/select_19191920192119221923192'), '1990', true)

WebUI.click(findTestObject('Page_Customer Chirag/span_22'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Married'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Female'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Self Owned'))

WebUI.setText(findTestObject('Page_Customer Chirag/input__34500'), 'vrundawan colony')

WebUI.setText(findTestObject('Page_Customer Chirag/input__34670'), 'azadwadi')

WebUI.setText(findTestObject('Page_Customer Chirag/input_Address Line 3_34880'), 'Vanaz')

WebUI.setText(findTestObject('Page_Customer Chirag/input__35050'), 'Kothrud')

WebUI.setText(findTestObject('Page_Customer Chirag/input__35260'), 'sfdf')

WebUI.setText(findTestObject('Page_Customer Chirag/input__35430'), 'b')

WebUI.click(findTestObject('Page_Customer Chirag/div_443001 BULDHANA'))

WebUI.setText(findTestObject('Page_Customer Chirag/input_BFL Branch_36800'), '443001')

WebUI.click(findTestObject('Page_Customer Chirag/div_443001-BULDHANA'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_1.02 Direct'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Less than Rs. 20000'))

WebUI.click(findTestObject('Page_Customer Chirag/a_--None--'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Housewife'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Draft'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Completed'))

WebUI.click(findTestObject('Page_Customer Chirag/span_Save'))

WebUI.click(findTestObject('Page_Customer Chirag/img_Notifications_profileIcon'))

WebUI.click(findTestObject('Page_Customer Chirag/a_Logout'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pos--uat.cs72.my.salesforce.com/')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pos--uat.cs72.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/input_Username_username'), 'yogesh.jamgaonkar@bajajfinserv.in.uat')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_pw'), 'xbEUYNQNhZ9KKDnUvGvtqA==')

WebUI.click(findTestObject('Object Repository/input_Password_Login'))

WebUI.setText(findTestObject('Object Repository/input_Select an object to limi'), '7725022019')

WebUI.click(findTestObject('Object Repository/span_7725022019 in Customers'))

WebUI.setText(findTestObject('Object Repository/input_Select an object to limi (1)'), '7725022019')

WebUI.click(findTestObject('Object Repository/a_Chirag'))

WebUI.click(findTestObject('Object Repository/span_Related'))

WebUI.click(findTestObject('Object Repository/a_IR-034984'))

WebUI.click(findTestObject('Object Repository/div_Edit'))

WebUI.click(findTestObject('Object Repository/a_--None--'))

WebUI.click(findTestObject('Object Repository/a_Match'))

WebUI.click(findTestObject('Object Repository/a_--None--'))

WebUI.click(findTestObject('Object Repository/a_Thick'))

WebUI.click(findTestObject('Object Repository/a_Initiated'))

WebUI.click(findTestObject('Object Repository/a_Response Received'))

WebUI.click(findTestObject('Object Repository/a_--None--'))

WebUI.click(findTestObject('Object Repository/a_Match'))

WebUI.click(findTestObject('Object Repository/span_Save'))

WebUI.click(findTestObject('Object Repository/div_Setup'))

WebUI.click(findTestObject('Object Repository/span_Developer Console'))

WebUI.switchToWindowTitle('Developer Console')

WebUI.setText(findTestObject('Object Repository/textarea'), 'a085D000003bXsvQAE$')

WebUI.click(findTestObject('Object Repository/span_Execute'))

WebUI.switchToWindowTitle('IR-034984 | Salesforce')

WebUI.click(findTestObject('Object Repository/span_Notifications_uiImage'))

WebUI.click(findTestObject('Object Repository/a_Log Out'))

