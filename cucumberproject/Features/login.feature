Feature:  login feature
Scenario: valid login
Given  user opens chrome browser
Then  user enters the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" 
Then user enters email "admin@yourstore.com" and password "admin"
And  user click on login button
Then  user login to the dashboard pagetitle should be "Dashboard / nopCommerce administration"
And  user click logout
Then pagetitle should be "Your store. Login"
Then close browser




