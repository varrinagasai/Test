package core_Swagger;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Swagger_Doc {
	@Test(priority = 0)
	public void getCustomersAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Customers']";
        String api_method = "//div[starts-with(@id,'operations-Customers')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Customers')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Customers')]/div[1]/div";
        execute("Customers", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 1)
	public void getAccountsAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Accounts']";
        String api_method = "//div[starts-with(@id,'operations-Accounts')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Accounts')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Accounts')]/div[1]/div";
        execute("Accounts", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 2)
	public void getSubscriptionsAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Subscriptions']";
        String api_method = "//div[starts-with(@id,'operations-Subscriptions')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Subscriptions')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Subscriptions')]/div[1]/div";
        execute("Subscriptions", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 3)
	public void getServicesAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Services']";
        String api_method = "//div[starts-with(@id,'operations-Services')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Services')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Services')]/div[1]/div";
        execute("Services", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 4)
	public void getTroubleTicketAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-TroubleTickets']";
        String api_method = "//div[starts-with(@id,'operations-TroubleTickets')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-TroubleTickets')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-TroubleTickets')]/div[1]/div";
        execute("TroubleTickets", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 5)
	public void getMsisdnsAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Msisdns']";
        String api_method = "//div[starts-with(@id,'operations-Msisdns')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Msisdns')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Msisdns')]/div[1]/div";
        execute("Msisdns", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 6)
	public void getDealersAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Dealers']";
        String api_method = "//div[starts-with(@id,'operations-Dealers')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Dealers')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Dealers')]/div[1]/div";
        execute("Dealers", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 7)
	public void getAddressesAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Addresses']";
        String api_method = "//div[starts-with(@id,'operations-Addresses')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Addresses')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Addresses')]/div[1]/div";
        execute("Addresses", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 8)
	public void getTopupAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Topup']";
        String api_method = "//div[starts-with(@id,'operations-Topup')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Topup')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Topup')]/div[1]/div";
        execute("Topup", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 9)
	public void getSIMAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Sims']";
        String api_method = "//div[starts-with(@id,'operations-Sims')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Sims')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Sims')]/div[1]/div";
        execute("SIMS", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 10)
	public void getSMSAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-SMS']";
        String api_method = "//div[starts-with(@id,'operations-SMS')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-SMS')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-SMS')]/div[1]/div";
        execute("SMS", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 11)
	public void getNotificationsAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Notifications']";
        String api_method = "//div[starts-with(@id,'operations-Notifications')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Notifications')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Notifications')]/div[1]/div";
        execute("Notifications", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 12)
	public void getDunningAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Dunning_Cases']";
        String api_method = "//div[starts-with(@id,'operations-Dunning Cases')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Dunning Cases')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Dunning Cases')]/div[1]/div";
        execute("Dunning Cases", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 12)
	public void getVouchersAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Vouchers']";
        String api_method = "//div[starts-with(@id,'operations-Vouchers')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Vouchers')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Vouchers')]/div[1]/div";
        execute("Vouchers", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 13)
	public void getBalanceAdjustmentsAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Balance_Adjustments']";
        String api_method = "//div[starts-with(@id,'operations-Balance Adjustments')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Balance Adjustments')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Balance Adjustments')]/div[1]/div";
        execute("Balance Adjustments", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 14)
	public void getDatabalanceTransferAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Data_Balance_Transfer']";
        String api_method = "//div[starts-with(@id,'operations-Data Balance Transfer')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Data Balance Transfer')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Data Balance Transfer')]/div[1]/div";
        execute("Data Balance Transfer", apis_value,api_method,api_signatures,api_description);
	}
	@Test(priority = 15)
	public void getDocumentsAPI() throws Exception {
        String apis_value = "//*[@id='operations-tag-Documents']";
        String api_method = "//div[starts-with(@id,'operations-Documents')]/div[1]/span[1]";
        String api_signatures = "//div[starts-with(@id,'operations-Documents')]/div[1]/span[2]";
        String api_description = "//div[starts-with(@id,'operations-Documents')]/div[1]/div";
        execute("Documents", apis_value,api_method,api_signatures,api_description);
	}
	public void execute(String sheetname, String apis_value, String api_method, String api_signatures, String api_description) throws Exception {
		Swagger.getDriver().findElement(By.xpath(apis_value));
		// API Methods
		List<WebElement> fun = Swagger.getElement()
				.findElements(By.xpath(api_method));
		int apis = fun.size();
		System.out.println(sheetname+" API: " + apis);
		Excel_Functions.createExcel(sheetname, "API Methods", apis, fun);

		List<WebElement> path = Swagger.getElement()
				.findElements(By.xpath(api_signatures));
		int num = path.size();
		int col_num = 1;
		Excel_Functions.updateExcel(sheetname, col_num, "API Signatures", num, path);
		
		List<WebElement> desc = Swagger.getElement()
				.findElements(By.xpath(api_description));
		int desc_num = path.size();
		col_num++;
		Excel_Functions.updateExcel(sheetname, col_num, "API Description", desc_num, desc);
	}
}