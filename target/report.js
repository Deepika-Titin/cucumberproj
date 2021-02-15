$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@End_To_End_Testing"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login functionality with valid username and Invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End_To_End_Testing"
    }
  ]
});
formatter.step({
  "name": "user has to enter the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Groot",
        "12345"
      ]
    },
    {
      "cells": [
        "Deepika",
        "12345"
      ]
    },
    {
      "cells": [
        "Udesh",
        "12345"
      ]
    },
    {
      "cells": [
        "Shanmu",
        "12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_the_login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#u_0_b\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.43.249\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57478}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 04c76705d2747c27c914f1b015ee89b7\n*** Element info: {Using\u003did, value\u003du_0_b}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat org.base.BaseClass.btnclick(BaseClass.java:29)\r\n\tat org.stepdefinition.LoginPageSteps.click_the_login_button(LoginPageSteps.java:51)\r\n\tat ✽.click the login button(file:src/test/resources/login.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user unable to enter the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_unable_to_enter_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Forgot password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End_To_End_Testing"
    }
  ]
});
formatter.step({
  "name": "user has to click the forgtton password link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_click_the_forgtton_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to be redirected to the OTP page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_be_redirected_to_the_OTP_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/loginAMZ.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check for the product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch chrome and hit the Amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginAZ.user_has_to_launch_chrome_and_hit_the_Amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the keyword in searchbox",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "Groot"
      ]
    },
    {
      "cells": [
        "Deepika"
      ]
    },
    {
      "cells": [
        "Udesh"
      ]
    },
    {
      "cells": [
        "Shanmu"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginAZ.user_has_to_enter_the_keyword_in_searchbox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginAZ.click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user unable to enter the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_unable_to_enter_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});