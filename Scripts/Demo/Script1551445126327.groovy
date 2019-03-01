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

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Login  FOS Community/input_Username_username'), 'cdprimedealer_fos@bfl.in')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), '3zsWnKN+YWTTdAG8/sekZA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/a_Search'))

WebUI.setText(findTestObject('Page_Search Customer/input_Mobile Number (New Custo'), '8201032019')

WebUI.setText(findTestObject('input_First Name (New Customer'), 'CDPrime')

WebUI.click(findTestObject('Object Repository/span_Confirm'))

WebUI.click(findTestObject('button_Proceed as NTB'))

WebUI.click(findTestObject('Object Repository/a_Show more actions'))

WebUI.focus(findTestObject('a_C KYC'))

WebUI.click(findTestObject('Object Repository/a_C KYC'))

WebUI.click(findTestObject('Object Repository/a_No Vehicle'))

WebUI.click(findTestObject('a_No Vehicle Option'))

//WebUI.setText(findTestObject('FatherName_SpouseName'), 'ABC')


for (int i = 0; i < size; i++){
    element = WebUI.modifyObjectProperty(findTestObject('FatherName_SpouseName'), 'xpath', 'equals', ('(//label//span[text()= "' + 
        (Header[i])) + '"]//following::input)[1]', true)

    WebUI.setText(element, value[i])
}

//WebUI.setText(findTestObject('MotherName'), 'XYZ')
not_run: WebUI.setText(findTestObject('Office Address Line 1'), 'Sangamwadi')

not_run: WebUI.setText(findTestObject('Office Address Line 2'), 'Kennedy road')

WebUI.setText(findTestObject('Office AreaLocality'), 'Pune station')

WebUI.click(findTestObject('Office Pincode'))

