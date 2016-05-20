package Pages;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Utility.CaptureScreenshot;

public class GemsPage 
{
	WebDriver driver;
	ExtentTest logger;  
	ExtentReports report;	
	public static String firstGemsAmount1 = "525";
	public static String secondGemsAmount1 = "1,075";
	public static String secondGemsAmount2 = "1075";
	public static String thirdGemsAmount1 = "2,150";
	public static String thirdGemsAmount2 = "2150";
	public static String fourthGemsAmount1 = "4,400";
	public static String fourthGemsAmount2 = "4400";
	public static String fifthGemsAmount1 = "6,600";
	public static String fifthGemsAmount2 = "6600";
	public static String sixthGemsAmount1 = "11,500";
	public static String sixthGemsAmount2 = "11500";	
	String firstGemsPrice1 = "$4.99";
	String secondGemsPrice1 = "$9.99";
	String thirdGemsPrice1 = "$19.99";
	String fourthGemsPrice1 = "$39.99";
	String fifthGemsPrice1 = "$59.99";
	String sixthGemsPrice1 = "$99.99";	
	String firstGemsPrice2 = "$ 4.99 USD";
	String secondGemsPrice2 = "$ 9.99 USD";
	String thirdGemsPrice2 = "$ 19.99 USD";
	String fourthGemsPrice2 = "$ 39.99 USD";
	String fifthGemsPrice2 = "$ 59.99 USD";
	String sixthGemsPrice2 = "$ 99.99 USD";	
	String selectPaymentMethodDBFirstGemsText = firstGemsAmount1+" Gems for "+firstGemsPrice1;
	String selectPaymentMethodDBSecondGemsText = secondGemsAmount2+" Gems for "+secondGemsPrice1;
	String selectPaymentMethodDBThirdGemsText = thirdGemsAmount2+" Gems for "+thirdGemsPrice1;
	String selectPaymentMethodDBFourthGemsText = fourthGemsAmount2+" Gems for "+fourthGemsPrice1;
	String selectPaymentMethodDBFifthGemsText = fifthGemsAmount2+" Gems for "+fifthGemsPrice1;
	String selectPaymentMethodDBSixthGemsText = sixthGemsAmount2+" Gems for "+sixthGemsPrice1;	
	
	public GemsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@id='ctl00_mcp_btnGems'][.='Gems']")
	public WebElement gemsTab;	
	
	@FindBy(xpath="//div[@id='gemsBox']/a[3]/div[@class='gems-option medium-amount']")
	WebElement firstGemsOption;
	@FindBy(xpath="//div[@id='gemsBox']/a[3]/div/div[1][@class='gems-amount'][contains(text(),'525')]")
	WebElement firstGemsAmount;
	@FindBy(xpath="//div[@id='gemsBox']/a[3]/div/div[2][@class='gems-name'][.='Gems']")
	WebElement firstGemsText;
	@FindBy(xpath="//div[@id='gemsBox']/a[3]/div/div[3][@class='gems-price'][contains(text(),'$4.99')]")
	WebElement firstGemsPrice;
	
	@FindBy(xpath="//div[@id='gemsBox']/a[4]/div[@class='gems-option medium-amount']")
	WebElement secondGemsOption;
	@FindBy(xpath="//div[@id='gemsBox']/a[4]/div/div[1][@class='gems-amount'][contains(text(),'1,075')]")
	WebElement secondGemsAmount;
	@FindBy(xpath="//div[@id='gemsBox']/a[4]/div/div[2][@class='gems-name'][.='Gems']")
	WebElement secondGemsText;
	@FindBy(xpath="//div[@id='gemsBox']/a[4]/div/div[3][@class='gems-price'][contains(text(),'$9.99')]")
	WebElement secondGemsPrice;
	
	@FindBy(xpath="//div[@id='gemsBox']/a[5]/div[@class='gems-option largest-amount']")
	WebElement thirdGemsOption;
	@FindBy(xpath="//div[@id='gemsBox']/a[5]/div/div[1][@class='most-popular-gem-burst']")
	WebElement thirdGemsMostPopular;
	@FindBy(xpath="//div[@id='gemsBox']/a[5]/div/div[2][@class='gems-amount'][contains(text(),'2,150')]")
	WebElement thirdGemsAmount;
	@FindBy(xpath="//div[@id='gemsBox']/a[5]/div/div[3][@class='gems-name'][.='Gems']")
	WebElement thirdGemsText;
	@FindBy(xpath="//div[@id='gemsBox']/a[5]/div/div[4][@class='gems-price'][contains(text(),'$19.99')]")
	WebElement thirdGemsPrice;
	
	@FindBy(xpath="//div[@id='gemsBox']/a[6]/div[@class='gems-option medium-amount']")
	WebElement fourthGemsOption;
	@FindBy(xpath="//div[@id='gemsBox']/a[6]/div/div[1][@class='gems-amount'][contains(text(),'4,400')]")
	WebElement fourthGemsAmount;
	@FindBy(xpath="//div[@id='gemsBox']/a[6]/div/div[2][@class='gems-name'][.='Gems']")
	WebElement fourthGemsText;
	@FindBy(xpath="//div[@id='gemsBox']/a[6]/div/div[3][@class='gems-price'][contains(text(),'$39.99')]")
	WebElement fourthGemsPrice;
	
	@FindBy(xpath="//div[@id='gemsBox']/a[7]/div[@class='gems-option large-amount']")
	WebElement fifthGemsOption;
	@FindBy(xpath="//div[@id='gemsBox']/a[7]/div/div[1][@class='gems-amount'][contains(text(),'6,600')]")
	WebElement fifthGemsAmount;
	@FindBy(xpath="//div[@id='gemsBox']/a[7]/div/div[2][@class='gems-name'][.='Gems']")
	WebElement fifthGemsText;
	@FindBy(xpath="//div[@id='gemsBox']/a[7]/div/div[3][@class='gems-price'][contains(text(),'$59.99')]")
	WebElement fifthGemsPrice;
	
	@FindBy(xpath="//div[@id='gemsBox']/a[8]/div[@class='gems-option large-amount largest-adjust']")
	WebElement sixthGemsOption;
	@FindBy(xpath="//div[@id='gemsBox']/a[8]/div/div[1][@class='gems-amount'][contains(text(),'11,500')]")
	WebElement sixthGemsAmount;
	@FindBy(xpath="//div[@id='gemsBox']/a[8]/div/div[2][@class='gems-name'][.='Gems']")
	WebElement sixthGemsText;
	@FindBy(xpath="//div[@id='gemsBox']/a[8]/div/div[3][@class='gems-price'][contains(text(),'$99.99')]")
	WebElement sixthGemsPrice;	
	
	String[] elements = {	
	"//table[@id='tblGemsFeatures']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[1][contains(text(),'Participate in a multitude of interactive quests')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[4]/td[1][contains(text(),'Earn coins to buy essential Viking gear from the store')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[5]/td[1][contains(text(),'Choose and raise your lifelong dragon companion')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[6]/td[1][contains(text(),'Customize your avatar')][contains(text(),'s look from head to toe')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[7]/td[1][contains(text(),'Access exclusive avatar parts: including clothing and accessories')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[8]/td[1][contains(text(),'Ability to purchase unique dragon accessories')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[9]/td[1][contains(text(),'High quality tools increase efficiency & speed when fishing and farming')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[10]/td[1][contains(text(),'Get BIG Discounts on Hero Levels')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[11]/td[1][contains(text(),'Ability to purchase coins using gems')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[12]/td[1][contains(text(),'Receive a higher amount of coins for completed tasks')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[13]/td[1][contains(text(),'Access rare levels reserved exclusively for members')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[14]/td[1][contains(text(),'No game entry fee using gems')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[15]/td[1][contains(text(),'500 FREE gems monthly')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[16]/td[1][contains(text(),'20% off ALL items in the store')]",
	"//table[@id='tblGemsFeatures']/tbody/tr[2]/td[3]/div[@class='chart-title chart-members-title'][contains(text(),'Members')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[4]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[5]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[6]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[7]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[8]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[9]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[10]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[11]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[12]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[13]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[14]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[15]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[16]/td[3]/div[@class='checkmarks']/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-members.png']",
	"//table[@id='tblGemsFeatures']/tbody/tr[2]/td[4]/div[@class='chart-title chart-gems-title'][contains(text(),'Gems')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[4]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",
	"//table[@id='tblGemsFeatures']/tbody/tr[5]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[6]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[7]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[8]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[9]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[10]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[11]/td[4]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-gems.png']",
	"//table[@id='tblGemsFeatures']/tbody/tr[2]/td[5]/div[@class='chart-title chart-freeplayers-title'][contains(text(),'Free Players')]",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[5]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-freeplayers.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[5]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-freeplayers.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[5]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-freeplayers.png']",	
	"//table[@id='tblGemsFeatures']/tbody/tr[3]/td[5]/div/img[@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-freeplayers.png']",	
	};
	
/* Payment Methods */
	
	@FindBy(xpath="//div[@id='dvPayPlusInner']/div")
	WebElement selectAPaymentMethodDB;
	
	@FindBy(xpath="//div[@id='dvPayPlus']/a[@id='close-btn']")
	public WebElement selectAPaymentMethodDBCloseButton;
	
	@FindBy(xpath="//form[@id='cashin-form']/div[3]/div[1]/h3[.='Select A Payment Method']")
	WebElement selectAPaymentMethodText;
	
	@FindBy(xpath="//form[@id='cashin-form']/div[2]/div[1]/div/label/div[1][@class='offer-description']")
	WebElement selectAPaymentMethodPrice;
	
	@FindBy(xpath="//div[@id='payment-method-1456']/label/span[1]/span[1]/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-paypal.png']")
	WebElement selectPaymentMethodPayPal;
	
	@FindBy(xpath="//div[@id='payment-method-687']/label/span[1]/span[1]/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-visa.png']")
	public WebElement selectPaymentMethodVisa;
	
	@FindBy(xpath="//div[@id='payment-method-688']/label/span[1]/span[1]/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-mastercard.png']")
	public	WebElement selectPaymentMethodMasterCard;
	
	@FindBy(xpath="//div[@id='payment-method-1517']/label/span[1]/span[1]/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-rixty-mol.png']")
	WebElement selectPaymentMethidMolPoints;
	
	@FindBy(xpath="//iframe[@id='paywallFrame'][@class='payWallFrame'][@src='/Membership/paywall.aspx?subscription=Monthly&method=VISA'][@name='paywallFrame']")
	public WebElement visaPayWalliframe;
	
	/* payment method fields */
	
	@FindBy(id="offer-to-description")
	WebElement formGemsAmount;
	
	@FindBy(id="offer-from-description")
	WebElement formGemsPrice;
	
	@FindBy(xpath=".//*[@id='country']")
	public WebElement indiaFlag;
	
	@FindBy(xpath=".//*[@id='field-firstName']/label[@class='rqd'][@for='input-firstName'][contains(text(),'First Name')]")
	public WebElement firstNameTextPaymentMethodDB; 
	
	@FindBy(xpath=".//*[@id='input-firstName'][@class='form-element text sub-field small-field first'][@type='text'][@name='firstName']")
	public WebElement firstNameTextInputFieldPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-lastName']/label[@class='rqd'][@for='input-lastName'][contains(text(),'Last Name')]")
	public WebElement lastNameTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-lastName'][@class='form-element text sub-field small-field last'][@type='text'][@name='lastName']")
	public WebElement lastNameTextInputFieldPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-cardNumber']/label[@class='rqd'][@for='input-cardNumber'][contains(text(),'Card Number')]")
	public WebElement creditCardNumberTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-cardNumber'][@class='form-element text '][@type='text'][@title='Please enter a valid card number with no spaces or hyphens'][@name='cardNumber']")
	public WebElement creditCardNumberInputPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-expMonth']/label[@class='rqd'][@for='input-expMonth'][contains(text(),'Month')]")
	public WebElement monthTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-expMonth'][@class='form-element sub-field small-field first'][@name='expMonth']")
	public WebElement monthSelectPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-expYear']/label[@class='rqd'][@for='input-expYear'][contains(text(),'Year')]")
	public WebElement yearTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-expYear'][@class='form-element sub-field small-field last'][@name='expYear']")
	public WebElement yearSelectPaymentMethodDB;   
	
	@FindBy(xpath=".//*[@id='field-cvv']/label[@class='rqd'][@for='input-cvv'][contains(text(),'Security Code')]")
	public WebElement securityCodeTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-cvv'][@class='form-element text small-field'][@type='text'][@name='cvv']")
	public WebElement securityCodeInputPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-storeCard'][@class='form-element checkbox'][@type='checkbox'][@name='storeCard']")
	public WebElement checkBoxPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-storeCard']/label[@for='input-storeCard'][contains(text(),'Remember credit card for future purchases')]")
	public WebElement checkBoxTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-stateProvince']/label[@for='input-stateProvince'][contains(text(),'Province')]")
	public WebElement provinceTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-stateProvince'][@class='form-element text dynamic'][@type='text'][@name='stateProvince']")
	public WebElement provinceInputPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-city']/label[@for='input-city'][contains(text(),'City')]")
	public WebElement cityTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-city'][@class='form-element text dynamic'][@type='text'][@name='city']")
	public WebElement cityInputPaymentMethodDB;	
	
	@FindBy(xpath=".//*[@id='field-address']/label[@for='input-address'][contains(text(),'Address')]")
	public WebElement addressTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-address'][@class='form-element text dynamic'][@type='text'][@name='address']")
	public WebElement addressInputPaymentMethodDB;	
	
	@FindBy(xpath=".//*[@id='field-postalCode']/label[@for='input-postalCode'][contains(text(),'Postal Code')]")
	public WebElement postalCodeTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-postalCode'][@class='form-element text dynamic'][@type='text'][@name='postalCode']")
	public WebElement postalCodeInputPaymentMethodDB;	
	
	@FindBy(xpath=".//*[@id='form-footer']/div[2]/span[1]/a[@class='back'][@href='https://payplus.lgelements.com/paywall-payplus2.0/payplusprod/cashin/public/error'][.='Back']")
	public WebElement backButtonPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='buy-button'][@type='submit'][.='Buy']")
	public WebElement buyButtonPaymentMethodDB;	
	
	/* PayPal Page Fields */
	
	@FindBy(xpath="//div[@id='header']/div/span[contains(text(),'Knowledge Holdings, Inc')]")	                  
	public WebElement payPalPageCompanyText;
	
	@FindBy(xpath="//span[@id='transactionCart']/span[2]/format-currency/span")
	WebElement payPalPageSelectedPrice;	
	
	/* MolPoints Page Fields */
	@FindBy(xpath="//div[@id='progressbar']/ul/li[2]/span/div/span[1]")
	WebElement MolPointsPageGemsAmount;
	
	@FindBy(xpath="//div[@id='progressbar']/ul/li[2]/span/div/span[2]/span")
	WebElement MolPointsPageGemsPrice;

	
	public void gemsTabClick()
	{
		Assert.assertTrue(gemsTab!=null);
		Assert.assertTrue(gemsTab.isDisplayed());
		gemsTab.click();
	}
	public void verifyAllGemsOptionsandFeatures(ExtentTest logger) throws Throwable
	{
		firstGemsOptions();
		logger.log(LogStatus.INFO, "Verified the first Gems Options contents");	
		String firstGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "firstGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, firstGemsOptionScreenshot);
		
		secondGemsOptions();
		logger.log(LogStatus.INFO, "Verified the second gems option contents");		
		String secondGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "secondGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, secondGemsOptionScreenshot);
		
		thirdGemsOptions();
		logger.log(LogStatus.INFO, "Verified the third gems option contents");
		String thirdGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "thirdGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, thirdGemsOptionScreenshot);
		
		fourthGemsOptions();
		logger.log(LogStatus.INFO, "Verified the fourth gems option contents");	
		String fourthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fourthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fourthGemsOptionScreenshot);
		
		fifthGemsOptions();
		logger.log(LogStatus.INFO, "Verified the fifth gems option contents");
		String fifthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fifthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fifthGemsOptionScreenshot);
		
		sixthGemsOptions();
		logger.log(LogStatus.INFO, "Verified the sixth gems option contents");		
		String sixthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, sixthGemsOptionScreenshot);
		
		verifyGemsFeatures();
		logger.log(LogStatus.INFO, "Verified the Gems Features contents");		
		String gemsFeaturesOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "gemsFeaturesOptionScreenshot"));
		logger.log(LogStatus.INFO, gemsFeaturesOptionScreenshot);
	}
	
	public void firstGemsOptions()
	{
		Assert.assertTrue(firstGemsOption!=null);
		Assert.assertTrue(firstGemsOption.isDisplayed());
		Assert.assertTrue(firstGemsAmount!=null);
		Assert.assertTrue(firstGemsAmount.isDisplayed());
		Assert.assertTrue(firstGemsText!=null);
		Assert.assertTrue(firstGemsText.isDisplayed());
		Assert.assertTrue(firstGemsPrice!=null);
		Assert.assertTrue(firstGemsPrice.isDisplayed());
	}
	
	public void secondGemsOptions()
	{
		Assert.assertTrue(secondGemsOption!=null);
		Assert.assertTrue(secondGemsOption.isDisplayed());
		Assert.assertTrue(secondGemsAmount!=null);
		Assert.assertTrue(secondGemsAmount.isDisplayed());
		Assert.assertTrue(secondGemsText!=null);
		Assert.assertTrue(secondGemsText.isDisplayed());
		Assert.assertTrue(secondGemsPrice!=null);
		Assert.assertTrue(secondGemsPrice.isDisplayed());
	}
	
	public void thirdGemsOptions()
	{
		Assert.assertTrue(thirdGemsOption!=null);
		Assert.assertTrue(thirdGemsOption.isDisplayed());
		Assert.assertTrue(thirdGemsMostPopular!=null);
		Assert.assertTrue(thirdGemsMostPopular.isDisplayed());
		Assert.assertTrue(thirdGemsAmount!=null);
		Assert.assertTrue(thirdGemsAmount.isDisplayed());
		Assert.assertTrue(thirdGemsText!=null);
		Assert.assertTrue(thirdGemsText.isDisplayed());
		Assert.assertTrue(thirdGemsPrice!=null);
		Assert.assertTrue(thirdGemsPrice.isDisplayed());
	}
	
	public void fourthGemsOptions()
	{
		Assert.assertTrue(fourthGemsOption!=null);
		Assert.assertTrue(fourthGemsOption.isDisplayed());
		Assert.assertTrue(fourthGemsAmount!=null);
		Assert.assertTrue(fourthGemsAmount.isDisplayed());
		Assert.assertTrue(fourthGemsText!=null);
		Assert.assertTrue(fourthGemsText.isDisplayed());
		Assert.assertTrue(fourthGemsPrice!=null);
		Assert.assertTrue(fourthGemsPrice.isDisplayed());		
	}
	
	public void fifthGemsOptions()
	{
		Assert.assertTrue(fifthGemsOption!=null);
		Assert.assertTrue(fifthGemsOption.isDisplayed());
		Assert.assertTrue(fifthGemsAmount!=null);
		Assert.assertTrue(fifthGemsAmount.isDisplayed());
		Assert.assertTrue(fifthGemsText!=null);
		Assert.assertTrue(fifthGemsText.isDisplayed());
		Assert.assertTrue(fifthGemsPrice!=null);
		Assert.assertTrue(fifthGemsPrice.isDisplayed());	
	}
	
	public void sixthGemsOptions()
	{
		Assert.assertTrue(sixthGemsOption!=null);
		Assert.assertTrue(sixthGemsOption.isDisplayed());
		Assert.assertTrue(sixthGemsAmount!=null);
		Assert.assertTrue(sixthGemsAmount.isDisplayed());
		Assert.assertTrue(sixthGemsText!=null);
		Assert.assertTrue(sixthGemsText.isDisplayed());
		Assert.assertTrue(sixthGemsPrice!=null);
		Assert.assertTrue(sixthGemsPrice.isDisplayed());	
	}
	
	public void verifyGemsFeatures()
	{
		for(int i=0;i<elements.length;i++)
		{
			WebElement fetureCheck = driver.findElement(By.xpath(elements[i]));
			Assert.assertTrue(fetureCheck!=null);
			Assert.assertTrue(fetureCheck.isDisplayed());
		}
	}
	
	public void verifySelectPaymentMethodDBandPaymentVisaFormGeneral(WebElement element,String gemsAmount, String gemsPrice,String selectAPaymentMethodPrice,String payPalPagePrice,String membershipType,ExtentTest logger) throws Throwable
	{
		Thread.sleep(5000);	
		element.click();
		logger.log(LogStatus.INFO, "Clicked the "+membershipType);
		Thread.sleep(5000);		
	    verifySelectAPaymentMethodDB(selectAPaymentMethodPrice);
	    logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);	   
		String selectAPaymentMethodDBVisaScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBVisaScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBVisaScreenshot);
	    Thread.sleep(5000);		    
	    selectPaymentMethodVisa.click();
	    logger.log(LogStatus.INFO, "Selected Visa as payment Method for "+membershipType);
	    verifyVisaForm(gemsAmount,gemsPrice);	    
	    logger.log(LogStatus.INFO, "Verified the Visa form for : "+membershipType);	   
		String visaFormScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "visaFormScreenshot"));
		logger.log(LogStatus.INFO, visaFormScreenshot);
	    driver.switchTo().defaultContent();
	    selectAPaymentMethodDBCloseButton.click();
	    logger.log(LogStatus.INFO,"Closing the form after verifying Visa form for : "+membershipType);
	}
	
	public void verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(WebElement element,String gemsAmount, String gemsPrice,String selectAPaymentMethodPrice,String payPalPagePrice,String membershipType,ExtentTest logger) throws Throwable
	{
	    Thread.sleep(5000);	
	    element.click();
	    logger.log(LogStatus.INFO, "Clicked the "+membershipType);
	    Thread.sleep(5000);	
	    verifySelectAPaymentMethodDB(selectAPaymentMethodPrice);
	    logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);	   
		String selectAPaymentMethodDBMasterCardScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBMasterCardScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBMasterCardScreenshot);
	    Thread.sleep(5000);	
	    selectPaymentMethodMasterCard.click();	   
	    logger.log(LogStatus.INFO, "Selected MasterCard as payment Method for "+membershipType);
	    verifyVisaForm(gemsAmount,gemsPrice);
	    logger.log(LogStatus.INFO, "Verified the MasterCard form for : "+membershipType);	   
		String masterCardFormScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "masterCardFormScreenshot"));
		logger.log(LogStatus.INFO, masterCardFormScreenshot);
	    driver.switchTo().defaultContent();
	    selectAPaymentMethodDBCloseButton.click();
	    logger.log(LogStatus.INFO,"Closing the form after verifying MasterCard form for : "+membershipType);
	}	
	
	public void verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(WebElement element,String gemsAmount, String gemsPrice,String selectAPaymentMethodPrice,String payPalPagePrice,String membershipType,ExtentTest logger) throws Throwable
	{
		Thread.sleep(5000);	
	    element.click();
	    logger.log(LogStatus.INFO, "Clicked the "+membershipType);
	    Thread.sleep(5000);	
	    verifySelectAPaymentMethodDB(selectAPaymentMethodPrice);
	    logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);	   
		String selectAPaymentMethodDBPayPalScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBPayPalScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBPayPalScreenshot);
	    Thread.sleep(5000);	
	    verifyPayPalPage(element,selectPaymentMethodPayPal,payPalPagePrice,logger,membershipType);
	    selectAPaymentMethodDBCloseButton.click();
	    logger.log(LogStatus.INFO,"Closing the form after verifying PayPal form for : "+membershipType);
	}
	
	public void verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(WebElement element,String gemsAmount, String gemsPrice,String selectAPaymentMethodPrice,String payPalPagePrice,String membershipType,ExtentTest logger) throws Throwable
	{
	    Thread.sleep(5000);	
	    element.click();
	    logger.log(LogStatus.INFO, "Clicked the "+membershipType);
	    Thread.sleep(5000);	
	    verifySelectAPaymentMethodDB(selectAPaymentMethodPrice);
	    logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);	   
		String selectAPaymentMethodDBMolPointsScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBMolPointsScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBMolPointsScreenshot);
	    Thread.sleep(5000);	
	    verifyMolPointsPage(selectPaymentMethidMolPoints,gemsAmount,gemsPrice,logger,membershipType);
	    selectAPaymentMethodDBCloseButton.click();	    
	    logger.log(LogStatus.INFO,"Closing the form after verifying MolPoints form for : "+membershipType);	
	}	
	
	public void verifyVisaForm(String gemsAmount,String gemsPrice)
	{
		Assert.assertTrue(formGemsAmount!=null);
		Assert.assertTrue(formGemsAmount.isDisplayed());
		Assert.assertTrue(formGemsAmount.getText().contains(gemsAmount));
		Assert.assertTrue(formGemsPrice!=null);
		Assert.assertTrue(formGemsPrice.isDisplayed());		
		Assert.assertTrue(formGemsPrice.getText().contains(gemsPrice));
		Assert.assertTrue(indiaFlag!=null);
		Assert.assertTrue(indiaFlag.isDisplayed());
		Assert.assertTrue(firstNameTextPaymentMethodDB!=null);
		Assert.assertTrue(firstNameTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(firstNameTextInputFieldPaymentMethodDB!=null);
		Assert.assertTrue(firstNameTextInputFieldPaymentMethodDB.isDisplayed());
		Assert.assertTrue(lastNameTextPaymentMethodDB!=null);
		Assert.assertTrue(lastNameTextPaymentMethodDB.isDisplayed());	
		Assert.assertTrue(lastNameTextInputFieldPaymentMethodDB!=null);
		Assert.assertTrue(lastNameTextInputFieldPaymentMethodDB.isDisplayed());
		Assert.assertTrue(creditCardNumberTextPaymentMethodDB!=null);
		Assert.assertTrue(creditCardNumberTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(creditCardNumberInputPaymentMethodDB!=null);
		Assert.assertTrue(creditCardNumberInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(monthTextPaymentMethodDB!=null);
		Assert.assertTrue(monthTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(monthSelectPaymentMethodDB!=null);
		Assert.assertTrue(monthSelectPaymentMethodDB.isDisplayed());
		Assert.assertTrue(yearTextPaymentMethodDB!=null);
		Assert.assertTrue(yearTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(yearSelectPaymentMethodDB!=null);
		Assert.assertTrue(yearSelectPaymentMethodDB.isDisplayed());
		Assert.assertTrue(securityCodeTextPaymentMethodDB!=null);
		Assert.assertTrue(securityCodeTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(securityCodeInputPaymentMethodDB!=null);
		Assert.assertTrue(securityCodeInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(checkBoxPaymentMethodDB!=null);
		Assert.assertTrue(checkBoxPaymentMethodDB.isDisplayed());
		Assert.assertTrue(checkBoxTextPaymentMethodDB!=null);
		Assert.assertTrue(checkBoxTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(provinceTextPaymentMethodDB!=null);
		Assert.assertTrue(provinceTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(provinceInputPaymentMethodDB!=null);
		Assert.assertTrue(provinceInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(cityTextPaymentMethodDB!=null);
		Assert.assertTrue(cityTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(cityInputPaymentMethodDB!=null);
		Assert.assertTrue(cityInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(addressTextPaymentMethodDB!=null);
		Assert.assertTrue(addressTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(addressInputPaymentMethodDB!=null);
		Assert.assertTrue(addressInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(postalCodeTextPaymentMethodDB!=null);
		Assert.assertTrue(postalCodeTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(postalCodeInputPaymentMethodDB!=null);
		Assert.assertTrue(postalCodeInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(backButtonPaymentMethodDB!=null);
		Assert.assertTrue(backButtonPaymentMethodDB.isDisplayed());
		Assert.assertTrue(buyButtonPaymentMethodDB!=null);
		Assert.assertTrue(buyButtonPaymentMethodDB.isDisplayed());		
	}
	
	public void verifyPayPalPage(WebElement gemOption, WebElement element, String expectedPrice, ExtentTest logger,String membershipType)
	{	
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window		
		element.click();		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		logger.log(LogStatus.INFO, "Selected PayPal as payment Method for "+membershipType);
		Set<String> handles = driver.getWindowHandles(); // get all window handles	
		System.out.println(handles.size());
		Assert.assertEquals(handles.size(), 2);
//		int count=0;
//		if(handles.size()!=2)			
//		{
//			driver.switchTo().defaultContent();
//			selectAPaymentMethodDBCloseButton.click();
//			Thread.sleep(5000);	
//			while(handles.size()==2)
//			{
//					Thread.sleep(5000);	
//					gemOption.click();			    
//				    Thread.sleep(5000);		
//				    driver.switchTo().frame(driver.findElement(By.id("paywallFrame")));
//				    element.click();		
//					Thread.sleep(15000);
//					handles = driver.getWindowHandles();
//					count=count+1;
//					if(count==3)
//					{						
//						break;
//					}
//			}
//			Assert.assertEquals(handles.size(),2);
//		}
//		else
//		{
//			System.out.println("There are 2 Windows"); 			
//		}	
//		System.out.println(handles.size());

		for(String currentWindowHandler : handles)
		{		
			if (!currentWindowHandler.equals(parentWindowHandler))  
			{				
				driver.switchTo().window(currentWindowHandler);
				driver.manage().window().maximize();				
				Assert.assertTrue(driver.getCurrentUrl().contains("https://www.paypal.com"));
				Assert.assertTrue(payPalPageCompanyText!=null);
				Assert.assertTrue(payPalPageCompanyText.isDisplayed());				
				Assert.assertTrue(payPalPageSelectedPrice!=null);
				Assert.assertTrue(payPalPageSelectedPrice.isDisplayed());
				System.out.println(payPalPageSelectedPrice.getText());
				System.out.println(expectedPrice);
				Assert.assertTrue(payPalPageSelectedPrice.getText().contains(expectedPrice));
				logger.log(LogStatus.INFO, "Verified the PayPal Page contents");		
				String payPalPageScreenshot;
				try {
					payPalPageScreenshot = logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "payPalPageScreenshot"));
					logger.log(LogStatus.INFO, payPalPageScreenshot);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				driver.close();
				break;
			}
			else
			{
				System.out.println("No Window Found");
			}
		}
		driver.switchTo().window(parentWindowHandler);		
	}
	
	public void verifyMolPointsPage(WebElement element, String expectedAmount, String expectedPrice,ExtentTest logger,String membershipType) throws Throwable
	{	
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window		
		element.click();
		Thread.sleep(15000);
		logger.log(LogStatus.INFO, "Selected MolPoints as payment Method for "+membershipType);
		Set<String> handles = driver.getWindowHandles(); // get all window handles	
		
		for(String currentWindowHandler : handles)
		{
			if (!currentWindowHandler.equals(parentWindowHandler)) 
			{
				driver.switchTo().window(currentWindowHandler);
				driver.manage().window().maximize();				
				Assert.assertTrue(driver.getCurrentUrl().contains("https://www.rixty.com"));
				Assert.assertTrue(MolPointsPageGemsAmount!=null);
				Assert.assertTrue(MolPointsPageGemsAmount.isDisplayed());	
				Assert.assertTrue(MolPointsPageGemsAmount.getText().contains(expectedAmount));
				Assert.assertTrue(MolPointsPageGemsPrice!=null);
				Assert.assertTrue(MolPointsPageGemsPrice.isDisplayed());
				Assert.assertTrue(MolPointsPageGemsPrice.getText().contains(expectedPrice));
				logger.log(LogStatus.INFO, "Verified the MolPoints Page contents");		
				String molPointsPageScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "molPointsPageScreenshot"));
				logger.log(LogStatus.INFO, molPointsPageScreenshot);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandler);		
	}
	
	public void verifySelectAPaymentMethodDB(String selectAPaymentMethodActualPrice) throws Throwable
	{
		Assert.assertTrue(selectAPaymentMethodDB!=null);
		Assert.assertTrue(selectAPaymentMethodDB.isDisplayed());
		Thread.sleep(5000);
		Assert.assertTrue(selectAPaymentMethodDBCloseButton!=null);
		Assert.assertTrue(selectAPaymentMethodDBCloseButton.isDisplayed());		
		driver.switchTo().frame(driver.findElement(By.id("paywallFrame")));
		 System.out.println(driver.getWindowHandle());
		Assert.assertTrue(selectAPaymentMethodPrice!=null);
		Assert.assertTrue(selectAPaymentMethodPrice.isDisplayed());
		String selectAPaymentMethodExpectedPrice = selectAPaymentMethodPrice.getText();
		Assert.assertEquals(selectAPaymentMethodExpectedPrice, selectAPaymentMethodActualPrice);
		Assert.assertTrue(selectAPaymentMethodText!=null);
		Assert.assertTrue(selectAPaymentMethodText.isDisplayed());			
		Assert.assertTrue(selectPaymentMethodVisa!=null);
		Assert.assertTrue(selectPaymentMethodVisa.isDisplayed());	
		Assert.assertTrue(selectPaymentMethodMasterCard!=null);
		Assert.assertTrue(selectPaymentMethodMasterCard.isDisplayed());
		Assert.assertTrue(selectPaymentMethodPayPal!=null);
		Assert.assertTrue(selectPaymentMethodPayPal.isDisplayed());
		Assert.assertTrue(selectPaymentMethidMolPoints!=null);
		Assert.assertTrue(selectPaymentMethidMolPoints.isDisplayed());	
		//driver.switchTo().defaultContent();
		 
	}
	
	
	
	public void verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{		
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and Visa Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+firstGemsAmount1+" Gems option");						
		String firstGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "firstGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, firstGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentVisaFormGeneral(firstGemsOption,firstGemsAmount1,firstGemsPrice1,selectPaymentMethodDBFirstGemsText,firstGemsPrice2,"First Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{		
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and MasterCard Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+firstGemsAmount1+" Gems option");						
		String firstGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "firstGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, firstGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(firstGemsOption,firstGemsAmount1,firstGemsPrice1,selectPaymentMethodDBFirstGemsText,firstGemsPrice2,"First Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{		
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and MolPoints Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+firstGemsAmount1+" Gems option");						
		String firstGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "firstGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, firstGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(firstGemsOption,firstGemsAmount1,firstGemsPrice1,selectPaymentMethodDBFirstGemsText,firstGemsPrice2,"First Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{		
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and PayPal Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+firstGemsAmount1+" Gems option");						
		String firstGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "firstGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, firstGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(firstGemsOption,firstGemsAmount1,firstGemsPrice1,selectPaymentMethodDBFirstGemsText,firstGemsPrice2,"First Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+firstGemsAmount1+" Gems Option Payment Method DB and Payment Form done</b>");
	}


	
	public void verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+secondGemsAmount1+" Gems Option Payment Method DB and Visa Payment Form</font></b>");		
		secondGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+secondGemsAmount1+" Gems option");						
		String secondGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "secondGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, secondGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentVisaFormGeneral(secondGemsOption,secondGemsAmount2,secondGemsPrice1,selectPaymentMethodDBSecondGemsText,secondGemsPrice2,"Second Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+secondGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+secondGemsAmount1+" Gems Option Payment Method DB and MasterCard Payment Form</font></b>");		
		secondGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+secondGemsAmount1+" Gems option");						
		String secondGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "secondGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, secondGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(secondGemsOption,secondGemsAmount2,secondGemsPrice1,selectPaymentMethodDBSecondGemsText,secondGemsPrice2,"Second Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+secondGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+secondGemsAmount1+" Gems Option Payment Method DB and MolPoints Payment Form</font></b>");		
		secondGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+secondGemsAmount1+" Gems option");						
		String secondGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "secondGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, secondGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(secondGemsOption,secondGemsAmount2,secondGemsPrice1,selectPaymentMethodDBSecondGemsText,secondGemsPrice2,"Second Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+secondGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+secondGemsAmount1+" Gems Option Payment Method DB and PayPal Payment Form</font></b>");		
		secondGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+secondGemsAmount1+" Gems option");						
		String secondGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "secondGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, secondGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(secondGemsOption,secondGemsAmount2,secondGemsPrice1,selectPaymentMethodDBSecondGemsText,secondGemsPrice2,"Second Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+secondGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	
	public void verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+thirdGemsAmount1+" Gems Option Payment Method DB and Visa Payment Form</font></b>");		
		thirdGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+thirdGemsAmount1+" Gems option");						
		String thirdGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "thirdGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, thirdGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentVisaFormGeneral(thirdGemsOption,thirdGemsAmount2,thirdGemsPrice1,selectPaymentMethodDBThirdGemsText,thirdGemsPrice2,"Third Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+thirdGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+thirdGemsAmount1+" Gems Option Payment Method DB and MasterCard Payment Form</font></b>");		
		thirdGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+thirdGemsAmount1+" Gems option");						
		String thirdGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "thirdGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, thirdGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(thirdGemsOption,thirdGemsAmount2,thirdGemsPrice1,selectPaymentMethodDBThirdGemsText,thirdGemsPrice2,"Third Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+thirdGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+thirdGemsAmount1+" Gems Option Payment Method DB and MolPoints Payment Form</font></b>");		
		thirdGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+thirdGemsAmount1+" Gems option");						
		String thirdGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "thirdGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, thirdGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(thirdGemsOption,thirdGemsAmount2,thirdGemsPrice1,selectPaymentMethodDBThirdGemsText,thirdGemsPrice2,"Third Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+thirdGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+thirdGemsAmount1+" Gems Option Payment Method DB and PayPal Payment Form</font></b>");		
		thirdGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+thirdGemsAmount1+" Gems option");						
		String thirdGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "thirdGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, thirdGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(thirdGemsOption,thirdGemsAmount2,thirdGemsPrice1,selectPaymentMethodDBThirdGemsText,thirdGemsPrice2,"Third Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+thirdGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	

	public void verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fourthGemsAmount1+" Gems Option Payment Method DB and Visa Payment Form</font></b>");		
		firstGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+fourthGemsAmount1+" Gems option");						
		String fourthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fourthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fourthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentVisaFormGeneral(fourthGemsOption,fourthGemsAmount2,fourthGemsPrice1,selectPaymentMethodDBFourthGemsText,fourthGemsPrice2,"Fourth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fourthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fourthGemsAmount1+" Gems Option Payment Method DB and MasterCard Payment Form</font></b>");		
		firstGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+fourthGemsAmount1+" Gems option");						
		String fourthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fourthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fourthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(fourthGemsOption,fourthGemsAmount2,fourthGemsPrice1,selectPaymentMethodDBFourthGemsText,fourthGemsPrice2,"Fourth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fourthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fourthGemsAmount1+" Gems Option Payment Method DB and MolPoints Payment Form</font></b>");		
		firstGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+fourthGemsAmount1+" Gems option");						
		String fourthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fourthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fourthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(fourthGemsOption,fourthGemsAmount2,fourthGemsPrice1,selectPaymentMethodDBFourthGemsText,fourthGemsPrice2,"Fourth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fourthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fourthGemsAmount1+" Gems Option Payment Method DB and PayPal Payment Form</font></b>");		
		firstGemsOption.isDisplayed();		
		logger.log(LogStatus.INFO, "Clicked the "+fourthGemsAmount1+" Gems option");						
		String fourthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fourthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fourthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(fourthGemsOption,fourthGemsAmount2,fourthGemsPrice1,selectPaymentMethodDBFourthGemsText,fourthGemsPrice2,"Fourth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fourthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	
	public void verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fifthGemsAmount1+" Gems Option Payment Method DB and Visa Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+fifthGemsAmount1+" Gems option");						
		String fifthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fifthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fifthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentVisaFormGeneral(fifthGemsOption,fifthGemsAmount2,fifthGemsPrice1,selectPaymentMethodDBFifthGemsText,fifthGemsPrice2,"Fifth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fifthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fifthGemsAmount1+" Gems Option Payment Method DB and MasterCard Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+fifthGemsAmount1+" Gems option");						
		String fifthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fifthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fifthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(fifthGemsOption,fifthGemsAmount2,fifthGemsPrice1,selectPaymentMethodDBFifthGemsText,fifthGemsPrice2,"Fifth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fifthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fifthGemsAmount1+" Gems Option Payment Method DB and MolPoints Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+fifthGemsAmount1+" Gems option");						
		String fifthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fifthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fifthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(fifthGemsOption,fifthGemsAmount2,fifthGemsPrice1,selectPaymentMethodDBFifthGemsText,fifthGemsPrice2,"Fifth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fifthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+fifthGemsAmount1+" Gems Option Payment Method DB and PayPal Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+fifthGemsAmount1+" Gems option");						
		String fifthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "fifthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, fifthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(fifthGemsOption,fifthGemsAmount2,fifthGemsPrice1,selectPaymentMethodDBFifthGemsText,fifthGemsPrice2,"Fifth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+fifthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	

	
	public void verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+sixthGemsAmount1+" Gems Option Payment Method DB and Visa Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+sixthGemsAmount1+" Gems option");						
		String sixthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, sixthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentVisaFormGeneral(sixthGemsOption,sixthGemsAmount2,sixthGemsPrice1,selectPaymentMethodDBSixthGemsText,sixthGemsPrice2,"Sixth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+sixthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+sixthGemsAmount1+" Gems Option Payment Method DB and MasterCard Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+sixthGemsAmount1+" Gems option");						
		String sixthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, sixthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMasterCardFormGeneral(sixthGemsOption,sixthGemsAmount2,sixthGemsPrice1,selectPaymentMethodDBSixthGemsText,sixthGemsPrice2,"Sixth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+sixthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+sixthGemsAmount1+" Gems Option Payment Method DB and MolPoints Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+sixthGemsAmount1+" Gems option");						
		String sixthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, sixthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentMolPointsFormGeneral(sixthGemsOption,sixthGemsAmount2,sixthGemsPrice1,selectPaymentMethodDBSixthGemsText,sixthGemsPrice2,"Sixth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+sixthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	public void verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify "+sixthGemsAmount1+" Gems Option Payment Method DB and PayPal Payment Form</font></b>");		
		firstGemsOption.isDisplayed();			
		logger.log(LogStatus.INFO, "Clicked the "+sixthGemsAmount1+" Gems option");						
		String sixthGemsOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixthGemsOptionScreenshot"));
		logger.log(LogStatus.INFO, sixthGemsOptionScreenshot);		
		verifySelectPaymentMethodDBandPaymentPayPalFormGeneral(sixthGemsOption,sixthGemsAmount2,sixthGemsPrice1,selectPaymentMethodDBSixthGemsText,sixthGemsPrice2,"Sixth Gems Option",logger);
		logger.log(LogStatus.INFO,"<b>Verify "+sixthGemsAmount1+" Gems option Payment Method DB and Payment Form done</b>");
	}
	
	
	public void verifySelectPaymentMethodDBandPaymentFormVisa(ExtentTest logger) throws Throwable
	{
		verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormVisa(logger);
		verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormVisa(logger);
		verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormVisa(logger);
		verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormVisa(logger);
		verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormVisa(logger);
		verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormVisa(logger);
	}
	
	public void verifySelectPaymentMethodDBandPaymentFormMasterCard(ExtentTest logger) throws Throwable
	{
		verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(logger);
		verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(logger);
		verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(logger);
		verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(logger);
		verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(logger);
		verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormMasterCard(logger);
	}
	
	public void verifySelectPaymentMethodDBandPaymentFormMolPoints(ExtentTest logger) throws Throwable
	{
		verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(logger);
		verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(logger);
		verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(logger);
		verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(logger);
		verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(logger);
		verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormMolPoints(logger);
	} 
	
	public void verifySelectPaymentMethodDBandPaymentFormPayPal(ExtentTest logger) throws Throwable
	{
		verifyFirstGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(logger);
		verifySecondGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(logger);
		verifyThirdGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(logger);
		verifyFourthGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(logger);
		verifyFifthGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(logger);
		verifySixthGemsOptionSelectPaymentMethodDBandPaymentFormPayPal(logger);
	} 

}
