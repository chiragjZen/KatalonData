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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://pos--uat.lightning.force.com/lightning/r/Customer__c/a085D000003bdWSQAY/view')

WebUI.setText(findTestObject('Page_Login  FOS Community/input_Username_username'), 'yogesh.jamgaonkar@bajajfinserv.in.uat')

WebUI.setEncryptedText(findTestObject('Page_Login  FOS Community/input_Password_pw'), 'xbEUYNQNhZ9KKDnUvGvtqA==')

WebUI.click(findTestObject('Page_Login  FOS Community/input_Password_Login'))

WebUI.delay(5)

CustomerID = WebUI.getUrl()

CustomerID = CustomKeywords.'CustomKeyword.StoreSplitString'(CustomerID, 'Customer__c/', 1)

CustomerID = CustomKeywords.'CustomKeyword.StoreSplitString'(CustomerID, '/view', 0)

WebUI.delay(6)

not_run: WebUI.waitForElementVisible(findTestObject('div_Setup'), 60)

WebUI.click(findTestObject('div_Setup'))

WebUI.click(findTestObject('span_Developer Console'))

WebUI.delay(6)

WebUI.switchToWindowTitle('Developer Console')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, 'e'))

WebUI.waitForAlert(10)

WebUI.click(findTestObject('afterDevConsole'))

WebUI.switchToWindowTitle('Execute Anonymous')

WebUI.delay(10)

WebUI.doubleClick(findTestObject('devconsole_div'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

not_run: WebUI.sendKeys(findTestObject('devconsole_div'), Keys.chord(Keys.LEFT_CONTROL, 'a'))

CustomKeywords.'CustomKeyword.press_ctrl_A'()

not_run: WebUI.sendKeys(null, Keys.chord(Keys.ENTER, 'a'))

WebUI.delay(10)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.BACK_SPACE))

not_run: url = WebUI.getUrl()

not_run: CustomKeywords.'CustomKeyword.StoreDataToClipboard'(url)

not_run: CustomerID = CustomKeywords.'CustomKeyword.StoreSplitString'('//pos--uat.lightning.force.com/lightning/r/Customer__c/a085D000003bdWSQAY/view', 
    'Customer__c/', 1)

not_run: CustomerID = CustomKeywords.'CustomKeyword.StoreSplitString'(CustomerID, '/view', 0)

not_run: CustomKeywords.'CustomKeyword.StoreDataToClipboard'('List<Dedupe__e> events = new List<Dedupe__e>();')

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER, 'v'))

not_run: CustomKeywords.'CustomKeyword.StoreDataToClipboard'(CustomerID)

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER, 'v'))

not_run: CustomKeywords.'CustomKeyword.StoreDataToClipboard'('));')

not_run: WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER, 'v'))

not_run: CustomKeywords.'CustomKeyword.StoreDataToClipboard'('EventBus.publish(events);')

