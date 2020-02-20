package core_APIs;

import org.json.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import groovy.json.JsonOutput;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.markuputils.MarkupHelper;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;

public class Create_Customer {

	@Test
	@Parameters({"username", "password", "mvno_value", "externalReference", "channel", "comments"})
	public static void create_Customer(String username, String password, String mvno_value, String externalReference, String channel, String comments) throws Exception {
		String authorizationValue = username + ":" + password;
		authorizationValue = "Basic " + Base64.getUrlEncoder().encodeToString(authorizationValue.getBytes());
		
		ExtentHtmlReporter log = new ExtentHtmlReporter("C:\\Users\\Naga Sai\\Desktop\\COREAPI\\execute.html");
		ExtentReports test = new ExtentReports();
		test.attachReporter(log);
		
		final String custId= mvno.random_number();
		final String email = mvno.random_String();
	    String url = "C:\\Users\\Naga Sai\\Desktop\\Automation\\CustomerDetails.xlsx";
		
	    final List<String> customerData = Excel_Functions.readExcel(url, "CustomerData", 2);
		
		final Map<String, Object> address1 = new LinkedHashMap<String, Object>();
		address1.put("ExternalAddressId", customerData.get(1));
		address1.put("Address", customerData.get(11));
		address1.put("City", customerData.get(12));
		address1.put("CountryId", customerData.get(13));
		address1.put("HouseExtension", customerData.get(14));
		address1.put("HouseNo", customerData.get(15));
		address1.put("State", customerData.get(16));
		address1.put("ZipCode", customerData.get(17));

		final Map<String, Object> address2 = new LinkedHashMap<String, Object>();
		address2.put("ExternalAddressId", customerData.get(18));
		address2.put("Address", customerData.get(19));
		address2.put("City", customerData.get(20));
		address2.put("CountryId", customerData.get(21));
		address2.put("HouseExtension", customerData.get(22));
		address2.put("HouseNo", customerData.get(23));
		address2.put("State", customerData.get(24));
		address2.put("ZipCode", customerData.get(25));
		
		Map<String, Object> customer = new LinkedHashMap<String, Object>();
		customer.put("CustomerData", (new LinkedHashMap<String, Object>() {
			{
				put("ExternalCustomerId", custId);
				put("Gender", customerData.get(1));
				put("FirstName", customerData.get(2));
				put("LastName", customerData.get(3));
				put("LastName2", customerData.get(4));
				put("CustomerDocumentType", customerData.get(5));
				put("DocumentNumber", customerData.get(6));
				put("Telephone", customerData.get(7));
				put("Email", email);
				put("Mobile", customerData.get(9));
				put("LanguageName", customerData.get(10));
				put("FiscalAddress", address1);
				put("CustomerAddress", address2);
				put("Nationality", customerData.get(26));
				put("Company", customerData.get(27));
			}
		}));
		customer.put("externalReference", externalReference);
		customer.put("channel", channel);
		customer.put("comments", comments);
		
		JSONObject json = new JSONObject(customer); 
		System.out.println(json.toString(4));	
		RestAssured.baseURI = "http://sandbox.apigw.pareteum.cloud/core/2.5.1";
	
		Response res = given()
					   .queryParam("MVNO", mvno_value)
					   .header("Authorization", authorizationValue)
				       .contentType("application/json")
				       .body(customer)
				       .when()
				       .post("/customers");
		int statusCode = res.getStatusCode();
		// sh.getRow(i).getCell(7).setCellValue(statusCode);
		System.out.println(statusCode);
	
		String response= res.getBody().asString();
		test.createTest("Blocks");
//		test.log(LogStatus.INFO, "REST Request: " + json.toString(4));
//		test.log(LogStatus.INFO, "REST Response: " + JsonOutput.prettyPrint(response));
		
		log.flush();
	}
}