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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BaseURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('WEB/Page_Home - Site Institucional/button_Negar'))

WebUI.click(findTestObject('WEB/Page_Home - Site Institucional/a_ACESSO RPIDO'))

WebUI.click(findTestObject('WEB/Page_Home - Site Institucional/div_Unimed mais prximaEncontre a Unimed mais perto de voc (1)'))

WebUI.selectOptionByValue(findTestObject('WEB/Page_Unimed mais prxima - Site Institucional (1)/select_Estado'), 'SP', false)

WebUI.selectOptionByIndex(findTestObject('WEB/Page_Unimed mais prxima - Site Institucional (1)/select_Selecione a cidade'), 
    10)

String nome = WebUI.getText(findTestObject('WEB/Page_Unimed mais prxima - Site Institucional (1)/span_nome'))

String fone = WebUI.getText(findTestObject('WEB/Page_Unimed mais prxima - Site Institucional (1)/span_telefone'))

String endereco = WebUI.getText(findTestObject('WEB/Page_Unimed mais prxima - Site Institucional (1)/span_endereco'))

f = new File('C:\\Users\\Windows 10\\Documents\\unidade_mais_proxima.txt')

f.append(nome + '\n')

f.append(fone + '\n')

f.append(endereco)

WebUI.takeScreenshot('unimed.png')

WebUI.closeBrowser()

