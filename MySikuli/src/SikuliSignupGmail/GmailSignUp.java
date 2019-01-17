package SikuliSignupGmail;

import org.sikuli.script.Screen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class GmailSignUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Screen screen = new Screen();
		String GmailLogo= "E:\\Focused Learning\\Sikuli\\ImageRepo\\GmailLogo.PNG";
		String ClickGmailAcc= "E:\\Focused Learning\\Sikuli\\ImageRepo\\MyGmailAcc.PNG";
		String MainPage= "E:\\Focused Learning\\Sikuli\\ImageRepo\\MainPageVerify.PNG";
		String EnterPwd= "E:\\Focused Learning\\Sikuli\\ImageRepo\\EnterPwd.PNG";
		String Next= "E:\\Focused Learning\\Sikuli\\ImageRepo\\Next.PNG";
		
		Pattern Gmail = new Pattern(GmailLogo);
		Pattern ClickGmailAccount = new Pattern(ClickGmailAcc);
		Pattern MainPageVerify = new Pattern(MainPage);
		Pattern EnterPassword = new Pattern(EnterPwd);
		Pattern ClickNext = new Pattern(Next);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Focused Learning\\Selenium Practice\\Main Project\\Browsers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.co.in");
		try
		{
		screen.wait(Gmail, 10);
		screen.click(Gmail);
		//screen.click(ClickGmailAccount);
		screen.wait(EnterPassword,10);
		screen.type(EnterPassword, "orkul1990");
		screen.click(ClickNext);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
