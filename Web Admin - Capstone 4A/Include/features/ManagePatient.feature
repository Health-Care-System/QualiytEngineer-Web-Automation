@tag
Feature: Manage Patient
  As a user
  I want to access patient page
  So that I can manage patient data
  
  @VerifySearchBar
  Scenario: Verify functionality of search bar
  	Given I am on the manage patient page
  	When I search doc trans ID 
  	And I search med trans ID
  	Then I successfully searched
  	
  @VerifySearchBarDataPasien
  Scenario: Verify functionality of search bar at data pasien
  	Given I am on the manage patient page
  	When I click data pasien 
  	And I search patient ID
  	Then I successfully searched patient
  	
  @VerifyAccDocTrans
  Scenario: Admin acc payment confirmation doc trans
  	Given I am on the manage patient page
  	When I click terima doc trans button
  	Then I successfully acc doc trans

	@VerifyAccMedTrans
  Scenario: Admin acc payment confirmation med trans
  	Given I am on the manage patient page
  	When I click terima med trans button
  	Then I successfully acc med trans
  	
  @VerifyRejectDocTrans
  Scenario: Admin reject payment confirmation doc trans
  	Given I am on the manage patient page
  	When I click tolak doc trans button
  	Then I successfully reject doc trans
  	
  @VerifyAccMedTrans
  Scenario: Admin reject payment confirmation med trans
  	Given I am on the manage patient page
  	When I click tolak med trans button
  	Then I successfully reject med trans
  	
  @VerifyPaymentConfirmationLink
  Scenario: Admin view payment confirmation
  	Given I am on the manage patient page
  	When I click link payment confirmation doc trans
  	And I Open med trans detail
  	Then I click payment confirmation med trans
