$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazon.feature");
formatter.feature({
  "line": 2,
  "name": "Validate all details for data catalog in Book department",
  "description": "",
  "id": "validate-all-details-for-data-catalog-in-book-department",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Validate all product related details for data catalog",
  "description": "",
  "id": "validate-all-details-for-data-catalog-in-book-department;validate-all-product-related-details-for-data-catalog",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@data_catalog"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in home page of Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I choose Book in department dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I search for data catalog in book department",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be in product listing page for data catalog",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on the first product available in the product listing page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should be in the product page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should be able to validate all possible records",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepdef.i_am_in_home_page_of_Amazon()"
});
formatter.result({
  "duration": 48706372173,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.i_choose_Book_in_department_dropdown()"
});
formatter.result({
  "duration": 17914341356,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.i_search_for_data_catalog_in_book_department()"
});
formatter.result({
  "duration": 9626527679,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStepdef.i_should_be_in_product_listing_page_for_data_catalog()"
});
formatter.result({
  "duration": 12373826404,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStepdef.i_click_on_the_first_product_available_in_the_product_listing_page()"
});
formatter.result({
  "duration": 14069268180,
  "status": "passed"
});
formatter.match({
  "location": "ProductDisplayPageStepDef.i_should_be_in_the_product_page()"
});
formatter.result({
  "duration": 8954530234,
  "status": "passed"
});
formatter.match({
  "location": "ProductDisplayPageStepDef.i_should_be_able_to_validate_all_possible_records()"
});
formatter.result({
  "duration": 3849209705,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"productTitle\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027SUKUMAR\u0027, ip: \u0027192.168.43.22\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 9f7f3a58a8a59e2ea1a8896d75632b14\n*** Element info: {Using\u003did, value\u003dproductTitle}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat com.alation.pages.ProductDisplayPage.verifyProductName(ProductDisplayPage.java:21)\r\n\tat com.alation.stepdef.ProductDisplayPageStepDef.i_should_be_able_to_validate_all_possible_records(ProductDisplayPageStepDef.java:17)\r\n\tat ✽.And I should be able to validate all possible records(amazon.feature:12)\r\n",
  "status": "failed"
});
});