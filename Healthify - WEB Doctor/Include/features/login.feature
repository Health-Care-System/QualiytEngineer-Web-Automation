Feature: Login
  I a user
  I want to successfully login
  So i can access doctor dasboard

  @SuccessLogin
  Scenario: Verify doctor success login and logout
	  Given I am on the login page
	  When I input valid email and password
	  And I click button masuk
	  And I am on the dashboard
	  Then I click logout button
	  
	@LoginEmptyEmail
  Scenario: Verify admin failed login with empty email
	  Given I am on the login page
	  When I input valid password
	  And I click button masuk
	  Then I can see alert email must be fill
	  
  @LinkLupaKataSandi
  Scenario: Verify functionality of lupa kata sandi
  	Given I am on the login page
  	When I click lupa kata sandi button
  	Then I am on the lupa kata sandi page