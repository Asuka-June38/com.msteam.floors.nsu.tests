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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.msteam.floors.nsu')

Mobile.tap(findTestObject('testcases/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('testcases/android.support.v7.widget.LinearLayoutCompat1 (1)'), 0)

Mobile.tap(findTestObject('testcases/android.widget.EditText0 - Search'), 0)

Random random = new Random()

Mobile.setText(findTestObject('testcases/android.widget.EditText0 - Search'), findTestData('nsuAssetsLocal').getValue(4, 
        random.nextInt(312) + 1), 0)

Mobile.tap(findTestObject('testcases/android.widget.LinearLayout5'), 0)

Mobile.tap(findTestObject('testcases/android.widget.Button0 - ROUTE TO'), 0)

Mobile.tap(findTestObject('testcases/android.widget.EditText1 (1)'), 0)

Mobile.setText(findTestObject('testcases/android.widget.EditText1'), findTestData('nsuAssetsLocal').getValue(4, random.nextInt(
            312) + 1), 0)

Mobile.tap(findTestObject('testcases/android.widget.FrameLayout9'), 0)

Mobile.tap(findTestObject('testcases/android.widget.ImageButton8'), 0)

@com.kms.katalon.core.annotation.TearDown
def cl_csh() {
	try {
		Runtime.getRuntime().exec(".\\platform-tools\\adb.exe shell pm clear com.msteam.floors.nsu")
	} catch (Exception e) {
			System.err.print("RunTimeException")
		}
	try {
		Runtime.getRuntime().exec("./platform-tools/adb.exe shell pm clear com.msteam.floors.nsu")
	} catch (Exception e) {
			System.err.print("RunTimeException")
		}
}
