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

WebUI.navigateToUrl('https://uat-pos--uat.cs72.force.com/FOS/login')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Login  FOS Community/input_Username_username'), 'cdprimedealer_fos@bfl.in')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), '3zsWnKN+YWTTdAG8/sekZA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/a_Search'))

WebUI.setText(findTestObject('Page_Search Customer/input_Mobile Number (New Custo'), Mobile_Number)

WebUI.setText(findTestObject('input_First Name (New Customer'), Customer_name)

WebUI.click(findTestObject('Object Repository/span_Confirm'))

WebUI.click(findTestObject('button_Proceed to Cart'))

WebUI.click(findTestObject('Object Repository/a_Show more actions'))

WebUI.focus(findTestObject('a_C KYC'))

WebUI.click(findTestObject('Object Repository/a_C KYC'))

WebUI.click(findTestObject('Object Repository/a_No Vehicle'))

WebUI.click(findTestObject('a_No Vehicle Option'))

for (int i = 0; i < size; i++) {
    element = WebUI.modifyObjectProperty(findTestObject('FatherName_SpouseName'), 'xpath', 'equals', ('(//label//span[text()= "' + 
        (Header[i])) + '"]//following::input)[1]', true)

    WebUI.setText(element, value[i])
}

/*WebUI.setText(findTestObject('FatherName_SpouseName'), 'ABC')

element = WebUI.modifyObjectProperty(findTestObject('FatherName_SpouseName'), 'text', 'equals', 'Mother\'s Name', true)

WebUI.setText(element, 'ABC')

WebUI.setText(findTestObject('MotherName'), 'XYZ')

WebUI.setText(findTestObject('Office Address Line 1'), 'Sangamwadi')

WebUI.setText(findTestObject('Office Address Line 2'), 'Kennedy road')*/
WebUI.setText(findTestObject('Office AreaLocality'), 'Pune station')

WebUI.click(findTestObject('Office Pincode'))

WebUI.click(findTestObject('443001Buldhana'))

WebUI.click(findTestObject('Preferred Mailing Address'))

WebUI.click(findTestObject('a_Residence'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Office_Phone_Num'), '020232505')

WebUI.setText(findTestObject('NameOnCard'), 'Sonu')

WebUI.setText(findTestObject('Alternate_number'), '9801032019')

WebUI.click(findTestObject('span_Save2'))

WebUI.click(findTestObject('OpportunityName'))

not_run: WebUI.click(findTestObject('Object Repository/a_HINDI'))

not_run: WebUI.setText(findTestObject('Object Repository/input__85530'), 'AlishaN')

not_run: WebUI.setText(findTestObject('Object Repository/input__85800'), '8601032019')

WebUI.click(findTestObject('span_Save'))

WebUI.click(findTestObject('OpportunityName'))

WebUI.click(findTestObject('Show 7 more actions'))

WebUI.delay(5)

WebUI.focus(findTestObject('div_Edit2'), FailureHandling.STOP_ON_FAILURE)

WebUI.clickOffset(findTestObject('div_Edit2'), 10, 10)

WebUI.click(findTestObject('Object Repository/input_Bypass Extended Warranty'))

WebUI.click(findTestObject('span_Save'))

WebUI.waitForElementVisible(findTestObject('button_Mark Stage as Complete'), 10)

WebUI.click(findTestObject('Object Repository/button_Mark Stage as Complete'))

WebUI.click(findTestObject('div_Edit'))

WebUI.scrollToElement(findTestObject('span_BankDetails'), 0)

WebUI.click(findTestObject('Object Repository/input_Change ECS Option_282680'))

WebUI.click(findTestObject('Account_Type'))

WebUI.click(findTestObject('Object Repository/a_Savings'))

WebUI.setText(findTestObject('Object Repository/input_Bank Name_283340'), 'HDFC')

WebUI.click(findTestObject('Object Repository/div_HDFC0000007 HDFC'))

WebUI.setText(findTestObject('Object Repository/input_Bank Account Number_2841'), '456798765423')

WebUI.click(findTestObject('span_Save'))

WebUI.waitForElementVisible(findTestObject('span_Document Lib'), 10)

WebUI.click(findTestObject('Object Repository/span_Document Lib'))

WebUI.click(findTestObject('CustomerPhoto'))

not_run: WebUI.click(findTestObject('Object Repository/span_Upload Files'))

WebUI.uploadFile(findTestObject('span_Upload Files'), 'E:\\demopic.jpg')

WebUI.click(findTestObject('Page_Customer Chirag/span_Save'))

WebUI.click(findTestObject('button_Mark Stage as Complete'))

WebUI.click(findTestObject('img_Notifications_profileIcon'))

WebUI.click(findTestObject('a_Logout'))

