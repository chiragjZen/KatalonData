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

WebUI.delay(5)

WebUI.navigateToUrl('https://pos--uat.cs72.my.salesforce.com/')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Login  FOS Community/input_Username_username'), 'yogesh.jamgaonkar@bajajfinserv.in.uat')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), 'xbEUYNQNhZ9KKDnUvGvtqA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.setText(findTestObject('input_Select an object to limi'), Mobile_Number)

WebUI.click(findTestObject('Object Repository/span_8226022019 in Customers'))

not_run: WebUI.setText(findTestObject('input_Select an object to limi'), '7827022019')

customerName = WebUI.modifyObjectProperty(findTestObject('Object Repository/a_Vanashri'), 'title', 'equals', Customer_name, 
    true)

WebUI.click(customerName)

CustomerID = WebUI.getUrl()

not_run: CustomerID = CustomKeywords.'CustomKeyword.StoreSplitString'(CustomerID, 'Customer__c/', 1)

not_run: CustomerID = CustomKeywords.'CustomKeyword.StoreSplitString'(CustomerID, '/view', 0)

WebUI.waitForElementClickable(findTestObject('span_Related'), 10)

WebUI.click(findTestObject('span_Related'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.waitForElementPresent(findTestObject('Integrated Response'), 60)

WebUI.focus(findTestObject('Integrated Response'))

WebUI.click(findTestObject('Integrated Response'))

WebUI.waitForElementVisible(findTestObject('div_Edit2'), 60)

WebUI.clickOffset(findTestObject('div_Edit2'), 100, 100)

WebUI.click(findTestObject('CIBIL Match'))

WebUI.click(findTestObject('a_Match'))

WebUI.click(findTestObject('ThickThin'))

WebUI.click(findTestObject('a_Thick'))

WebUI.click(findTestObject('Status'))

WebUI.click(findTestObject('a_Response Received'))

WebUI.click(findTestObject('CIBIL Status'))

WebUI.click(findTestObject('CIBIL_StatusMatch'))

WebUI.click(findTestObject('span_Save2'))

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('div_Setup'), 60)

WebUI.click(findTestObject('div_Setup'))

WebUI.click(findTestObject('span_Developer Console'))

WebUI.delay(6)

WebUI.switchToWindowTitle('Developer Console')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, 'e'))

WebUI.click(findTestObject('Page_Developer Console/span_OK'))

WebUI.click(findTestObject('Page_Developer Console/span_a085D000003bXsvQAE'))

WebUI.setText(findTestObject('Page_Developer Console/textarea'), 'a085D000003baFlQAI$')

WebUI.click(findTestObject('Page_Developer Console/span_Execute'))

WebUI.switchToWindowTitle('IR-035021 | Salesforce')

WebUI.waitForElementVisible(findTestObject('span_Notifications_uiImage'), 60)

WebUI.click(findTestObject('span_Notifications_uiImage'))

WebUI.click(findTestObject('a_Log Out'))

