import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.googlecode.javacv.cpp.opencv_ml.CvSVMSolver.GetRow as GetRow
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.ModifyObjectPropertyKeyword as ModifyObjectPropertyKeyword
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.amazon.com/')

WebUI.navigateToUrl('https://www.amazon.com/')

//WebUI.setText(findTestObject('Page_Customer Chirag/Page_Amazon.com Online Shopping for/SearchInput'), Input)
for (def rownum = 1; rownum <= findTestData('First Test/1st').getRowNumbers(); rownum++) {
    WebUI.setText(findTestObject('Page_Customer Chirag/Page_Amazon.com Online Shopping for/SearchInput'), findTestData('First Test/1st').getValue(
            1, rownum))

    Thread.sleep(200)
}

WebUI.click(findTestObject('Page_Customer Chirag/Page_Amazon.com alexa/SearchIcon'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.click(findTestObject('Page_Customer Chirag/Page_Amazon.com alexa/ProductToClick'))
itemlink = WebUI.modifyObjectProperty(findTestObject('Page_Customer Chirag/Page_Amazon.com alexa/ProductToClick'), 'data-attribute', 
    'equals', findTestData('First Test/1st').getValue(2, 1), true)

WebUI.click(itemlink)

WebUI.delay(5)

WebUI.clearText(findTestObject(null))

WebUI.closeBrowser()

