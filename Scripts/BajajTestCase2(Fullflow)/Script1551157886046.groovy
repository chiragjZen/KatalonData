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

WebUI.setText(findTestObject('input_Mobile Number (New Custo'), '8226022018')

WebUI.setText(findTestObject('input_First Name (New Customer'), 'Vana')

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

WebUI.setText(findTestObject('Object Repository/input__30740'), 'Saswadkar')

WebUI.click(findTestObject('DateofBirth'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_19191920192119221923192'), '1990', true)

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

not_run: WebUI.delay(2)

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

WebUI.click(findTestObject('Object Repository/img_Notifications_profileIcon'))

WebUI.click(findTestObject('Object Repository/a_Logout'))

WebUI.navigateToUrl('https://pos--uat.cs72.my.salesforce.com/')

WebUI.setText(findTestObject('Page_Login  Salesforce/input_Username_username'), 'yogesh.jamgaonkar@bajajfinserv.in.uat')

WebUI.setEncryptedText(findTestObject('Page_Login  Salesforce/input_Password_pw'), 'xbEUYNQNhZ9KKDnUvGvtqA==')

WebUI.click(findTestObject('Page_Login  Salesforce/input_Password_Login'))

WebUI.setText(findTestObject('input_Select an object to limi'), '8226022019')

WebUI.click(findTestObject('Object Repository/span_8226022019 in Customers'))

WebUI.setText(findTestObject('input_Select an object to limi'), '8226022019')

WebUI.click(findTestObject('Object Repository/a_Vanashri'))

WebUI.getUrl()

WebUI.click(findTestObject('span_Related'))

WebUI.click(findTestObject('Object Repository/a_IR-035021'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/div_Edit'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_--None--'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_Match'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_--None--'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_Thick'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_Initiated'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_Response Received'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_--None--'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_Match'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/button_Save'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/div_Setup'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/span_Developer Console'))

WebUI.switchToWindowTitle('Developer Console')

WebUI.click(findTestObject('Page_Developer Console/span_OK'))

WebUI.click(findTestObject('Page_Developer Console/span_a085D000003bXsvQAE'))

WebUI.setText(findTestObject('Page_Developer Console/textarea'), 'a085D000003baFlQAI$')

WebUI.click(findTestObject('Page_Developer Console/span_Execute'))

WebUI.switchToWindowTitle('IR-035021 | Salesforce')

WebUI.click(findTestObject('Page_IR-035021  Salesforce/span_Notifications_uiImage'))

WebUI.click(findTestObject('Page_IR-035021  Salesforce/a_Log Out'))

WebUI.navigateToUrl('https://uat-pos--uat.cs72.force.com/FOS/login')

WebUI.setText(findTestObject('Page_Login  FOS Community/input_Username_username'), 'AutomationFOS@bfl.com')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), '3zsWnKN+YWTTdAG8/sekZA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/a_Search'))

WebUI.setText(findTestObject('input_First Name (New Customer'), '8226022019')

WebUI.setText(findTestObject('input_First Name (New Customer'), 'Vanashri')

WebUI.click(findTestObject('Object Repository/span_Confirm'))

WebUI.click(findTestObject('button_Proceed to Cart'))

WebUI.click(findTestObject('Object Repository/a_Show more actions'))

WebUI.click(findTestObject('Object Repository/a_C KYC'))

WebUI.click(findTestObject('Object Repository/a_No Vehicle'))

WebUI.click(findTestObject('a_No Vehicle'))

WebUI.setText(findTestObject('Object Repository/input__82430'), 'ABC')

WebUI.setText(findTestObject('Object Repository/input__82600'), 'XYZ')

WebUI.setText(findTestObject('Object Repository/input__82810'), 'Sangamwadi')

WebUI.setText(findTestObject('Object Repository/input__82980'), 'Kennedy road')

WebUI.setText(findTestObject('Object Repository/input_Office Address Line 3_83'), 'Pune station')

WebUI.setText(findTestObject('Object Repository/input__83360'), 'Pune station')

WebUI.click(findTestObject('Object Repository/a_443001 BULDHANA'))

WebUI.click(findTestObject('a_--None--'))

WebUI.click(findTestObject('Object Repository/a_Residence'))

WebUI.setText(findTestObject('Object Repository/input__84850'), '020232505')

WebUI.click(findTestObject('span_Save'))

WebUI.click(findTestObject('Object Repository/a_HINDI'))

WebUI.setText(findTestObject('Object Repository/input__85530'), 'VanashriS')

WebUI.setText(findTestObject('Object Repository/input__85800'), '7741975512')

WebUI.click(findTestObject('span_Save'))

WebUI.click(findTestObject('Object Repository/a_B0203903'))

WebUI.click(findTestObject('a_Show more actions'))

WebUI.click(findTestObject('Object Repository/a_Edit'))

WebUI.click(findTestObject('Object Repository/input_Bypass Extended Warranty'))

WebUI.click(findTestObject('span_Save'))

WebUI.click(findTestObject('Object Repository/button_Mark Stage as Complete'))

WebUI.click(findTestObject('div_Edit'))

WebUI.click(findTestObject('Object Repository/input_Change ECS Option_282680'))

WebUI.click(findTestObject('a_--None--'))

WebUI.click(findTestObject('Object Repository/a_Savings'))

WebUI.setText(findTestObject('Object Repository/input_Bank Name_283340'), 'HDFC')

WebUI.click(findTestObject('Object Repository/div_HDFC0000007 HDFC'))

WebUI.setText(findTestObject('Object Repository/input_Bank Account Number_2841'), '456798765423')

WebUI.click(findTestObject('span_Save'))

WebUI.click(findTestObject('Object Repository/span_Document Lib'))

WebUI.click(findTestObject('Object Repository/input_Contact_1113641a'))

WebUI.click(findTestObject('Object Repository/span_Upload Files'))

WebUI.click(findTestObject('button_Save'))

WebUI.click(findTestObject('Object Repository/span_Mark Stage as Complete'))

WebUI.click(findTestObject('img_Notifications_profileIcon'))

WebUI.click(findTestObject('a_Logout'))

