package ElementLocators;

import org.openqa.selenium.By;

public class ElementsLoc 
{
/*	public static By RegisterLink=By.linkText("Register");
	public static By LinkText=By.linkText("REGISTER");*/
	public static By FirstName=By.xpath("//input[@name='txtFN']");
	public static By LastName=By.xpath("//input[@name='txtLN']");
	public static By Email=By.xpath("//input[@name='Email']");
	public static By MobileNo=By.xpath("//input[@name='Phone']");
	public static By Address=By.xpath("//textarea[@ rows='5']");
	public static By City=By.xpath("//select[@ name='city']");
	public static By State=By.xpath("//select[@ name='state']");
	public static By NoGuest=By.xpath("//select[@ name='persons']");
	public static By NoRoom=By.id("rooms");
	public static By CardName=By.xpath("//input[@ id='txtCardholderName']");
	public static By CardNo=By.xpath("//input[@ id='txtDebit']");
	public static By Cvv=By.id("txtCvv");
	public static By ExpireMonth=By.id("txtMonth");
	public static By ExpireYear=By.id("txtYear");
	public static By Submit=By.id("btnPayment");
	
	
	/*public static By UserName=By.name("userName");
	public static By Password=By.name("userPwd");
	public static By Login=By();*/
	
}
