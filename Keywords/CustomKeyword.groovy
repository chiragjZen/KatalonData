import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DF
import internal.GlobalVariable


import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.junit.After
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement
public class CustomKeyword {
	@Keyword
	def StoreDataToClipboard(String value){
		StringSelection selection = new StringSelection(value);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		println 'copied to clipboard '+value
	}

	@Keyword
	def String StoreSplitString(String inputstr,String delimeter,int instance){
		String[] strarr=inputstr.split(delimeter);
		String result=strarr[instance];
		println 'splitted string is '+result
		return result;
	}

	@Keyword
	def press_ctrl_A(){
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_HOME);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_HOME);
		println 'Keys pressed'
	}

	@Keyword
	def SetAttribute(TestObject to , String value) {	
		def driver = DF.getWebDriver();
			WebElement element = WebUI.findWebElement(to);
						((JavascriptExecutor)driver).executeScript(
					"var ele=arguments[0]; ele.innerHTML = '"+value+"';", element);

			
		
	}
}