package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.CaptureScreenshot;
import Utility.HighLighter;

public class MembershipPage 
{
	
    WebDriver driver;
    String oneMonthExpectedPrice = "$9.99";    
    String oneMonthExpectedOldPrice = "$9.99";
    String threeMonthsExpectedPrice = "$24.99";
    String threeMonthsExpectedOldPrice = "$24.99";
    String threeMonthsExpectedSavings = "Save $4.98!"; 
    String sixMonthsExpectedPrice = "$47.99";
    String sixMonthsExpectedOldPrice = "$47.99";
    String sixMonthsExpectedSavings = "Save $11.94!"; 
    String twelveMonthsExpectedPrice = "$84.99";
    String twelveMonthsExpectedOldPrice = "$84.99";
    String twelveMonthsExpectedSavings = "Save $34.92!"; 
    ExtentTest logger;   
    
    public MembershipPage(WebDriver driver)
	{
		this.driver = driver;
	}
    
	@FindBy(xpath="//a[@id='ctl00_mcp_btnMemberShip'][.='Membership']")
	WebElement memebershipPurchaseTab;	
	
	/* Monthly */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']")
	WebElement oneMonthMembershipOption;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-option'][.='Monthly']")
	WebElement monthlyText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-price']")
	WebElement monthlyPrice;
	
	@FindBy(xpath="//*[@id='ctl00_mcp_memberShipDiv']/div[2]/div[1]/div[2]/span/span[2]/span")
	WebElement monthlyOldPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-gemsmo monthlygems'][.='500 Gems/Mo.']")
	WebElement monthlyGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-value'][.='($5 Value)']")
	WebElement monthlyValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='buy-mem-now-btn']")
	public WebElement monthlyBuyNowButton;
	
	/* 3 Months */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']")	                 
	WebElement threeMonthMembershipOption;
	
	@FindBy(xpath="//*[@id='ctl00_mcp_memberShipDiv']/div[2]/div[2]/div[1][@class='most-popular-mem-burst']")
	WebElement threeMonthsMostPopularIcon;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-option'][.='3 Months']")
	WebElement threeMonthsText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-price']")
	WebElement threeMonthsPrice;
	
	@FindBy(xpath="//*[@id='ctl00_mcp_memberShipDiv']/div[2]/div[2]/div[3]/span/span[2]/span")
	WebElement threeeMonthsOldPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-savings']")
	WebElement threeMonthsSavings;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-gemsmo'][.='500 Gems/Mo.']")
	WebElement threeMonthsGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-value'][.='($15 Value)']")
	WebElement threeMonthsValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='buy-mem-now-btn']")
	WebElement threeMonthsBuyNowButton;	
	
	/* 6 months */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']")	                 
	WebElement sixMonthsMembershipOption;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-option'][.='6 Months']")
	WebElement sixMonthsText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-price']")
	WebElement sixMonthsPrice;
	
	@FindBy(xpath="//*[@id='ctl00_mcp_memberShipDiv']/div[2]/div[3]/div[2]/span/span[2]/span")
	WebElement sixMonthsOldPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-savings']")
	WebElement sixMonthsSavings;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-gemsmo'][.='500 Gems/Mo.']")
	WebElement sixMonthsGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-value'][.='($30 Value)']")
	WebElement sixMonthsValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='buy-mem-now-btn']")
	WebElement sixMonthsBuyNowButton;	
	
	/* 12 Months */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']")	                 
	WebElement twelveMonthsMembershipOption;
	
	@FindBy(xpath="//*[@id='ctl00_mcp_memberShipDiv']/div[2]/div[4]/div[1][@class='best-value-burst']")
	WebElement twelveMonthsBestValueIcon;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-option'][.='12 Months']")
	WebElement twelveMonthsText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-price']")
	WebElement twelveMonthsPrice;
	
	@FindBy(xpath="//*[@id='ctl00_mcp_memberShipDiv']/div[2]/div[4]/div[3]/span/span[2]/span")
	WebElement twelveMonthsOldPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-savings']")
	WebElement twelveMonthsSavings;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-gemsmo'][.='500 Gems/Mo.']")
	WebElement twelveMonthsGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-value'][.='($60 Value)']")
	WebElement twelveMonthsValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='buy-mem-now-btn']")
	WebElement twelveMonthsBuyNowButton;	
	
	/* Membership Features */	
	
	@FindBy(xpath="//table[@id='tblMembershipFeatures']")
	WebElement membershipFeatures;
	
	  
	String[] elements = { 
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[1][.='Access to Icestorm Island Expansion Pack ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[2]/a[@id='btn21'][@class='features-playbtn'][@href='javascript:showFeature(21);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[1][.='500 Free Gems monthly! ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[2]/a[@id='btn13'][@class='features-playbtn'][@href='javascript:showFeature(22);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[1][.='Mystery Box of Dragon Eggs Monthly ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[2]/a[@id='btn20'][@class='features-playbtn'][@href='javascript:showFeature(20);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[1][.='All Flight Club Dragons ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[2]/a[@id='btn8'][@class='features-playbtn'][@href='javascript:showFeature(23);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[1][.='Increased Activity Rewards ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[2]/a[@id='btn2'][@class='features-playbtn'][@href='javascript:showFeature(24);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[1][.='20% off in the Store ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[2]/a[@id='btn14'][@class='features-playbtn'][@href='javascript:showFeature(25);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[1][.='Double player energy ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[2]/a[@id='btn16'][@class='features-playbtn'][@href='javascript:showFeature(16);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[1][contains(text(),'Hiccup')][contains(text(),'s Flight Suit ')]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[2]/a[@id='btn17'][@class='features-playbtn'][@href='javascript:showFeature(17);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[1][.='No Ads ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[2]/a[@id='btn15'][@class='features-playbtn'][@href='javascript:showFeature(15);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[1][.='Your very own Toothless ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[2]/a[@id='btn18'][@class='features-playbtn'][@href='javascript:showFeature(18);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[3]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[1][contains(text(),'Free ')][contains(text(),'Boulder Class')][contains(text(),'Stable ')]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[2]/a[@id='btn19'][@class='features-playbtn'][@href='javascript:showFeature(19);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[3]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
	};
	
	/* Payment Methods */
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']")
	WebElement selectAPaymentMethodDB;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/a[@id='close-btn'][@class='close'][@onclick='closecurrentPurchaseOverlay()']")
	public WebElement selectAPaymentMethodDBCloseButton;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/div/h3[.='Select a payment method:']")
	WebElement selectAPaymentMethodText;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='PAYPAL'][@class='paymentMethodItem']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-paypal.png']")
	WebElement selectPaymentMethodPayPal;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='VISA'][@class='paymentMethodItem']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-visa.png']")
	public WebElement selectPaymentMethodVisa;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='MASTERCARD'][@class='paymentMethodItem']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-mastercard.png']")
	public	WebElement selectPaymentMethodMasterCard;
	
	@FindBy(xpath="//iframe[@id='paywallFrame'][@class='payWallFrame'][@src='/Membership/paywall.aspx?subscription=Monthly&method=VISA'][@name='paywallFrame']")
	public WebElement visaPayWalliframe;
	
	/* payment method fields */
	
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
	
	@FindBy(xpath="//div[@id='header']/h1[.='Knowledge Holdings, Inc']")
	WebElement payPalPageCompanyText;
	
	@FindBy(xpath="//div[@id='header']/div/span[contains(text(),'Knowledge Holdings, Inc')]")
	WebElement payPalPage2CompanyText;
	
	@FindBy(xpath="//li[@id='multiitem1']/ul[1]/li[1]/span[2]")
	WebElement payPalPageSelectedPrice;	
	
	@FindBy(xpath="//span[@id='transactionCart']/span[2]/format-currency/span")
	WebElement payPalPage2SelectedPrice;	
	
	public void verifyMonthly(ExtentTest logger)
	{
		Assert.assertTrue(oneMonthMembershipOption!=null);
		Assert.assertTrue(oneMonthMembershipOption.isDisplayed());
		Assert.assertTrue(monthlyText!=null);
		Assert.assertTrue(monthlyText.isDisplayed());		
		Assert.assertTrue(monthlyPrice!=null);
		Assert.assertTrue(monthlyPrice.isDisplayed());
		String oneMonthActualPrice = monthlyPrice.getText();
		System.out.println(oneMonthActualPrice);	
		Assert.assertEquals(oneMonthActualPrice,oneMonthExpectedPrice);
//		Assert.assertTrue(monthlyOldPrice!=null);
//		Assert.assertTrue(monthlyOldPrice.isDisplayed());
//		String oneMonthActualOldPrice = monthlyOldPrice.getText();
//		System.out.println(oneMonthActualOldPrice);			
//		Assert.assertEquals(oneMonthActualOldPrice,oneMonthExpectedOldPrice);
		Assert.assertTrue(monthlyGems!=null);
		Assert.assertTrue(monthlyGems.isDisplayed());
		Assert.assertTrue(monthlyValue!=null);
		Assert.assertTrue(monthlyValue.isDisplayed());
		Assert.assertTrue(monthlyBuyNowButton!=null);
		Assert.assertTrue(monthlyBuyNowButton.isDisplayed());
	}
	
	public void verifyThreeMonthly(ExtentTest logger)
	{
		Assert.assertTrue(threeMonthMembershipOption!=null);
		Assert.assertTrue(threeMonthMembershipOption.isDisplayed());
		Assert.assertTrue(threeMonthsMostPopularIcon!=null);
		Assert.assertTrue(threeMonthsMostPopularIcon.isDisplayed());
		Assert.assertTrue(threeMonthsText!=null);
		Assert.assertTrue(threeMonthsText.isDisplayed());			
		Assert.assertTrue(threeMonthsPrice!=null);
		Assert.assertTrue(threeMonthsPrice.isDisplayed());
		String threeMonthsActualPrice = threeMonthsPrice.getText();
		System.out.println(threeMonthsActualPrice);		
		Assert.assertEquals(threeMonthsActualPrice, threeMonthsExpectedPrice);	
//		Assert.assertTrue(threeeMonthsOldPrice!=null);
//		Assert.assertTrue(threeeMonthsOldPrice.isDisplayed());
//		String threeMonthsActualOldPrice = threeeMonthsOldPrice.getText();
//		System.out.println(threeMonthsActualOldPrice);		
//		Assert.assertEquals(threeMonthsActualOldPrice, threeMonthsExpectedOldPrice);		
		Assert.assertTrue(threeMonthsSavings!=null);
		Assert.assertTrue(threeMonthsSavings.isDisplayed());
		String threeMonthsActualSavings = threeMonthsSavings.getText();
		System.out.println(threeMonthsActualSavings);		
		Assert.assertEquals(threeMonthsActualSavings,threeMonthsExpectedSavings);		
		Assert.assertTrue(threeMonthsGems!=null);
		Assert.assertTrue(threeMonthsGems.isDisplayed());
		Assert.assertTrue(threeMonthsValue!=null);
		Assert.assertTrue(threeMonthsValue.isDisplayed());
		Assert.assertTrue(threeMonthsBuyNowButton!=null);
		Assert.assertTrue(threeMonthsBuyNowButton.isDisplayed());
	}
	
	public void verifySixMonthly(ExtentTest logger)
	{
		Assert.assertTrue(sixMonthsMembershipOption!=null);
		Assert.assertTrue(sixMonthsMembershipOption.isDisplayed());
		Assert.assertTrue(sixMonthsText!=null);
		Assert.assertTrue(sixMonthsText.isDisplayed());			
		Assert.assertTrue(sixMonthsPrice!=null);
		Assert.assertTrue(sixMonthsPrice.isDisplayed());
		String sixMonthsActualPrice = sixMonthsPrice.getText();
		System.out.println(sixMonthsActualPrice);		
		Assert.assertEquals(sixMonthsActualPrice, sixMonthsExpectedPrice);
//		Assert.assertTrue(sixMonthsOldPrice!=null);
//		Assert.assertTrue(sixMonthsOldPrice.isDisplayed());
//		String sixMonthsActualOldPrice = sixMonthsOldPrice.getText();
//		System.out.println(sixMonthsActualOldPrice);		
//		Assert.assertEquals(sixMonthsActualOldPrice, sixMonthsExpectedOldPrice);
		Assert.assertTrue(sixMonthsSavings!=null);
		Assert.assertTrue(sixMonthsSavings.isDisplayed());
		String sixMonthActualSavings = sixMonthsSavings.getText();
		System.out.println(sixMonthActualSavings);		
		Assert.assertEquals(sixMonthActualSavings,sixMonthsExpectedSavings);		
		Assert.assertTrue(sixMonthsGems!=null);
		Assert.assertTrue(sixMonthsGems.isDisplayed());
		Assert.assertTrue(sixMonthsValue!=null);
		Assert.assertTrue(sixMonthsValue.isDisplayed());
		Assert.assertTrue(sixMonthsBuyNowButton!=null);
		Assert.assertTrue(sixMonthsBuyNowButton.isDisplayed());
	}
	
	public void verifyTwelveMonths(ExtentTest logger)
	{
		Assert.assertTrue(twelveMonthsMembershipOption!=null);
		Assert.assertTrue(twelveMonthsMembershipOption.isDisplayed());
		Assert.assertTrue(twelveMonthsBestValueIcon!=null);
		Assert.assertTrue(twelveMonthsBestValueIcon.isDisplayed());
		Assert.assertTrue(twelveMonthsText!=null);
		Assert.assertTrue(twelveMonthsText.isDisplayed());			
		Assert.assertTrue(twelveMonthsPrice!=null);
		Assert.assertTrue(twelveMonthsPrice.isDisplayed());
		String twelveMonthsActualPrice = twelveMonthsPrice.getText();
		System.out.println(twelveMonthsActualPrice);		
		Assert.assertEquals(twelveMonthsActualPrice, twelveMonthsExpectedPrice);
//		Assert.assertTrue(twelveMonthsOldPrice!=null);
//		Assert.assertTrue(twelveMonthsOldPrice.isDisplayed());
//		String twelveMonthsActualOldPrice = twelveMonthsOldPrice.getText();
//		System.out.println(twelveMonthsActualOldPrice);		
//		Assert.assertEquals(twelveMonthsActualOldPrice, twelveMonthsExpectedOldPrice);		
		Assert.assertTrue(twelveMonthsSavings!=null);
		Assert.assertTrue(twelveMonthsSavings.isDisplayed());
		String TwelveMonthsActualSavings = twelveMonthsSavings.getText();
		System.out.println(TwelveMonthsActualSavings);		
		Assert.assertEquals(TwelveMonthsActualSavings,twelveMonthsExpectedSavings);			
		Assert.assertTrue(twelveMonthsGems!=null);
		Assert.assertTrue(twelveMonthsGems.isDisplayed());
		Assert.assertTrue(twelveMonthsValue!=null);
		Assert.assertTrue(twelveMonthsValue.isDisplayed());
		Assert.assertTrue(twelveMonthsBuyNowButton!=null);
		Assert.assertTrue(twelveMonthsBuyNowButton.isDisplayed());
	}
	
	public void verifyMembershipFeatures(ExtentTest logger)
	{
		for(int i=0;i<elements.length;i++)
		{
			WebElement fetureCheck = driver.findElement(By.xpath(elements[i]));
			Assert.assertTrue(fetureCheck!=null);
			Assert.assertTrue(fetureCheck.isDisplayed());
		}
	}
	
	public void verifySelectAPaymentMethodDB()
	{
		Assert.assertTrue(selectAPaymentMethodDB!=null);
		Assert.assertTrue(selectAPaymentMethodDB.isDisplayed());
		Assert.assertTrue(selectAPaymentMethodDBCloseButton!=null);		
		Assert.assertTrue(selectAPaymentMethodDBCloseButton.isDisplayed());
		Assert.assertTrue(selectAPaymentMethodText!=null);
		Assert.assertTrue(selectAPaymentMethodText.isDisplayed());		
		Assert.assertTrue(selectPaymentMethodPayPal!=null);
		Assert.assertTrue(selectPaymentMethodPayPal.isDisplayed());
		Assert.assertTrue(selectPaymentMethodVisa!=null);
		Assert.assertTrue(selectPaymentMethodVisa.isDisplayed());	
		Assert.assertTrue(selectPaymentMethodMasterCard!=null);
		Assert.assertTrue(selectPaymentMethodMasterCard.isDisplayed());
	}
	
	public void verifyPayPalPage(String expectedPrice)
	{			
		if(payPalPageCompanyText==null)
		{
			System.out.println("Element null");
			Assert.assertTrue(payPalPage2CompanyText!=null);
		}				
		
		try
		{
			Assert.assertTrue(payPalPageCompanyText.isDisplayed());
		}
		catch(Exception e)
		{
			System.out.println("First element not found");	
			try
			{
				Assert.assertTrue(payPalPage2CompanyText.isDisplayed());	
			}								
			catch(Exception ee)
			{
				System.out.println("Second element not found");	
			}
		}		
		
		if(payPalPageSelectedPrice==null)
		{
			System.out.println("Element null");
			Assert.assertTrue(payPalPage2SelectedPrice!=null);
		}			
		
		try
		{
			Assert.assertTrue(payPalPageSelectedPrice.isDisplayed());
		}
		catch(Exception e)
		{
			System.out.println("First element not found");
			try
			{
				Assert.assertTrue(payPalPage2SelectedPrice.isDisplayed());	
			}
			catch(Exception ee)
			{
				System.out.println("Second element not found");
			}						
		}		
	}
	
	public void verifyVisaForm()
	{
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
	
	public void verifyAllMembersipOptionsAndFeatures(ExtentTest logger) throws Throwable
	{
		verifyMonthly(logger);
		logger.log(LogStatus.INFO, "Verified the monthly Membership option contents");	
		HighLighter.elementHighLight(driver, oneMonthMembershipOption);
		String oneMonthMembershipOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "oneMonthMembershipOptionScreenshot"));
		logger.log(LogStatus.INFO, oneMonthMembershipOptionScreenshot);
		
		verifyThreeMonthly(logger);
		logger.log(LogStatus.INFO, "Verified the 3 Months Membership option contents");	
		HighLighter.elementHighLight(driver, threeMonthMembershipOption);
		String threeMonthMembershipOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "threeMonthMembershipOptionScreenshot"));
		logger.log(LogStatus.INFO, threeMonthMembershipOptionScreenshot);
		
		verifySixMonthly(logger);
		logger.log(LogStatus.INFO, "Verified the 6 Months Membership option contents");	
		HighLighter.elementHighLight(driver, sixMonthsMembershipOption);
		String sixMonthsMembershipOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixMonthsMembershipOptionScreenshot"));
		logger.log(LogStatus.INFO, sixMonthsMembershipOptionScreenshot);
		
		verifyTwelveMonths(logger);
		logger.log(LogStatus.INFO, "Verified the 12 Months Membership option contents");	
		HighLighter.elementHighLight(driver, twelveMonthsMembershipOption);
		String twelveMonthsMembershipOptionScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "twelveMonthsMembershipOptionScreenshot"));
		logger.log(LogStatus.INFO, twelveMonthsMembershipOptionScreenshot);
				
		verifyMembershipFeatures(logger);
		logger.log(LogStatus.INFO, "Verified the Membership features contents");
		HighLighter.elementHighLight(driver, membershipFeatures);
		String MembershipFeaturesScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "MembershipFeaturesScreenshot"));
		logger.log(LogStatus.INFO, MembershipFeaturesScreenshot);
	}
	
	public void verifySelectPaymentMethodDBandPaymentFormGeneral(WebElement element,String price, String membershipType,ExtentTest logger) throws Throwable
	{
		Thread.sleep(5000);	
		element.click();
		logger.log(LogStatus.INFO, "Clicked the Buy now button for : "+membershipType+"to verify the PayPal Page");
		Thread.sleep(10000);			
	    verifySelectAPaymentMethodDB();
	    logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);
	  
		String selectAPaymentMethodDBPayPalScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBPayPalScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBPayPalScreenshot);
	    Thread.sleep(5000);
		selectPaymentMethodPayPal.click();
		logger.log(LogStatus.INFO, "Selecting Payment method as PayPal for : "+membershipType);
		
		String selectPaymentMethodPayPalScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectPaymentMethodPayPalScreenshot"));
		logger.log(LogStatus.INFO, selectPaymentMethodPayPalScreenshot);
		Thread.sleep(5000);	
		String currentURL = driver.getCurrentUrl();		
		Assert.assertTrue(currentURL.contains("https://www.paypal.com"));	
		logger.log(LogStatus.INFO, "Verifying PayPal page URL for : "+membershipType);
		logger.log(LogStatus.INFO, "checking PayPal page started for : "+membershipType);
		verifyPayPalPage(price);		
		logger.log(LogStatus.INFO, "checking PayPal page done for : "+membershipType);
		
		String payPalPageScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "payPalPageScreenshot"));
		logger.log(LogStatus.INFO, payPalPageScreenshot);
		driver.get("https://www.schoolofdragons.com/Membership/Membership.aspx");
		logger.log(LogStatus.INFO, "Going back to Membership page after PayPal page verification is done for : "+membershipType);		
		Thread.sleep(5000);	
		element.click();
		logger.log(LogStatus.INFO, "Clicked the Buy now button for : "+membershipType+"to verify the Visa form");
		Thread.sleep(5000);			
	    verifySelectAPaymentMethodDB();
	    logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);
	   
		String selectAPaymentMethodDBVisaScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBVisaScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBVisaScreenshot);
	    Thread.sleep(5000);
		selectPaymentMethodVisa.click();	
		logger.log(LogStatus.INFO, "Selecting Payment method as Visa for : "+membershipType);
		
		String selectPaymentMethodVisaScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectPaymentMethodVisaScreenshot"));
		logger.log(LogStatus.INFO, selectPaymentMethodVisaScreenshot);
		Thread.sleep(5000);			
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		logger.log(LogStatus.INFO,"Switching to Visa form frame for : "+membershipType);
		Thread.sleep(10000);			
		logger.log(LogStatus.INFO,"checking Visa form for : "+membershipType);
		verifyVisaForm();
		logger.log(LogStatus.INFO,"checking Visa form done for : "+membershipType);		
		String visaFormScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "visaFormScreenshot"));
		logger.log(LogStatus.INFO, visaFormScreenshot);
		driver.switchTo().defaultContent();
		logger.log(LogStatus.INFO,"Switching back to default content after verifying visa form for : "+membershipType);
		selectAPaymentMethodDBCloseButton.click();	
		logger.log(LogStatus.INFO,"Closing the form after verifying Visa form for : "+membershipType);		
		Thread.sleep(5000);	
		element.click();
		logger.log(LogStatus.INFO, "Clicked the Buy now button for : "+membershipType+"to verify the MasterCard form");
		Thread.sleep(5000);			
		verifySelectAPaymentMethodDB();
		logger.log(LogStatus.INFO, "Verified the select a Payment DB for : "+membershipType);
	   
		String selectAPaymentMethodDBMasterCardScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectAPaymentMethodDBMasterCardScreenshot"));
		logger.log(LogStatus.INFO, selectAPaymentMethodDBMasterCardScreenshot);
		Thread.sleep(5000);			
		selectPaymentMethodMasterCard.click();
		logger.log(LogStatus.INFO, "Selecting Payment method as Visa for : "+membershipType);
		
		String selectPaymentMethodMasterCardScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "selectPaymentMethodMasterCardScreenshot"));
		logger.log(LogStatus.INFO, selectPaymentMethodMasterCardScreenshot);
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		logger.log(LogStatus.INFO,"Switching to Master Card form frame for : "+membershipType);
		Thread.sleep(10000);			
		logger.log(LogStatus.INFO,"checking Master Card form for : "+membershipType);
		verifyVisaForm();
		logger.log(LogStatus.INFO,"checking Master Card form done for : "+membershipType);	
		String masterCardFormScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "masterCardFormScreenshot"));
		logger.log(LogStatus.INFO, masterCardFormScreenshot);
		driver.switchTo().defaultContent();
		logger.log(LogStatus.INFO,"Switching back to default content after verifying MasterCard form for : "+membershipType);
		selectAPaymentMethodDBCloseButton.click();
		logger.log(LogStatus.INFO,"Closing the form after verifying MasterCard form for : "+membershipType);
	}
	
	public void verifyMonthlySelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify monthly PaymentMethodDBandPaymentForm</font></b>");		
		monthlyBuyNowButton.isDisplayed();
		HighLighter.elementHighLight(driver, monthlyBuyNowButton);	
		logger.log(LogStatus.INFO, "Clicked the buy now button for the monthly membership option");						
		String monthlyBuyNowButtonScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "monthlyBuyNowButtonScreenshot"));
		logger.log(LogStatus.INFO, monthlyBuyNowButtonScreenshot);		
		verifySelectPaymentMethodDBandPaymentFormGeneral(monthlyBuyNowButton,oneMonthExpectedPrice,"monthly",logger);
		logger.log(LogStatus.INFO,"<b>Verify monthly PaymentMethodDBandPaymentForm done</b>");
	}
	
	public void verifyThreeMonthsSelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify three months PaymentMethodDBandPaymentForm</font></b>");
		threeMonthsBuyNowButton.isDisplayed();
		HighLighter.elementHighLight(driver, threeMonthsBuyNowButton);	
		logger.log(LogStatus.INFO, "Clicked the buy now button for the 3 months membership option");						
		String threeMonthsBuyNowButtonScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "threeMonthsBuyNowButtonScreenshot"));
		logger.log(LogStatus.INFO,threeMonthsBuyNowButtonScreenshot);		
		verifySelectPaymentMethodDBandPaymentFormGeneral(threeMonthsBuyNowButton,threeMonthsExpectedPrice,"3 Months",logger);
		logger.log(LogStatus.INFO,"<b>Verify three months PaymentMethodDBandPaymentForm done</b>");
	}
	
	public void verifySixMonthsSelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify six months PaymentMethodDBandPaymentForm</font></b>");	
		sixMonthsBuyNowButton.isDisplayed();
		HighLighter.elementHighLight(driver, sixMonthsBuyNowButton);	
		logger.log(LogStatus.INFO, "Clicked the buy now button for the 6 months membership option");						
		String sixMonthsBuyNowButtonScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "sixMonthsBuyNowButtonScreenshot"));
		logger.log(LogStatus.INFO,sixMonthsBuyNowButtonScreenshot);		
		verifySelectPaymentMethodDBandPaymentFormGeneral(sixMonthsBuyNowButton,sixMonthsExpectedPrice,"6 Months",logger);
		logger.log(LogStatus.INFO,"<b>Verify six months PaymentMethodDBandPaymentForm</b>");
	}
	
	public void verifyTwelveMonthsSelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		logger.log(LogStatus.INFO,"<b><font size='5'>Verify twelve months PaymentMethodDBandPaymentForm</font><b>");
		twelveMonthsBuyNowButton.isDisplayed();
		HighLighter.elementHighLight(driver, twelveMonthsBuyNowButton);	
		logger.log(LogStatus.INFO, "Clicked the buy now button for the 12 months membership option");						
		String twelveMonthsBuyNowButtonScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "twelveMonthsBuyNowButtonScreenshot"));
		logger.log(LogStatus.INFO,twelveMonthsBuyNowButtonScreenshot);		
		verifySelectPaymentMethodDBandPaymentFormGeneral(twelveMonthsBuyNowButton,twelveMonthsExpectedPrice,"12 Months",logger);
		logger.log(LogStatus.INFO,"<b>Verify twelve Months PaymentMethodDBandPaymentForm</b>");
	}
	
	public void verifySelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		verifyMonthlySelectPaymentMethodDBandPaymentForm(logger);
		verifyThreeMonthsSelectPaymentMethodDBandPaymentForm(logger);
		verifySixMonthsSelectPaymentMethodDBandPaymentForm(logger);
		verifyTwelveMonthsSelectPaymentMethodDBandPaymentForm(logger);
	}	
}