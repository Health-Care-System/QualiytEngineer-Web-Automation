Feature: Dashboard
  As a user
  I want to access dashboard
  So that I can use all feature
  
  
  @LihatSemuaButton
  Scenario: Verify functionality of Lihat Semua button
  	Given I am on the dashboard page
  	When I click lihat semua button at patient table
  	And I click lihat semua button at medicine table
  	And I click lihat semua button at doctor table
  	Then I am on the doctor page

