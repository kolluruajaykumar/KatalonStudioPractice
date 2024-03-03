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

WebUI.callTestCase(findTestCase('TC_19_UserSignIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/img'))

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES')

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/a_RP-LI-02'))

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/a_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/input_Ship to different address_shippingAdd_0f9b79'))

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/input_Ship to different address_newOrder'))

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/input_Ship to different address_newOrder'))

WebUI.click(findTestObject('Object Repository/PurchaseReptilesObjRep/a_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/PurchaseReptilesObjRep/li_Thank you, your order has been submitted'), 
    'Thank you, your order has been submitted.')

WebUI.closeBrowser()

