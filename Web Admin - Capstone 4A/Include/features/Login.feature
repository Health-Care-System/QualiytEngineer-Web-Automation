Feature: Login
  As a user
  I want to successfully login
  So that I can access my dashboard
  
  @SuccessLogin
  Scenario: Verify admin success login and logout
	  Given I am on the login page
	  When I input valid email and password
	  And I click button masuk
	  And I am on the dashboard
	  Then I click logout button
	  
	  @LoginInvalidEmail
  Scenario: Verify admin failed login with invalid email
	  Given I am on the login page
	  When I input invalid email and valid password
	  And I click button masuk
	  Then I can see alert invalid email
	  
	@LoginInvalidEmailFormat
  Scenario: Verify admin failed login with invalid email format
	  Given I am on the login page
	  When I input invalid email format and valid password
	  And I click button masuk
	  Then I should be failed to login
	  
  @LinkLupaKataSandi
  Scenario: Verify functionality of lupa kata sandi
  	Given I am on the login page
  	When I click lupa kata sandi button
  	Then I am on the lupa kata sandi page
  	