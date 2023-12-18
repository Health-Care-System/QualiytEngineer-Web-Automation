Feature: Landing Page
  I a user
  I want to see healthify landing page
  
  
  Scenario: Verify functionality of link Beranda
  	Given I am on the healthify landing page
	  When I click text beranda
	  Then I navigated to home section
  
  Scenario: Verify functionality of link Tentang Kami
  	Given I am on the healthify landing page
	  When I click text tentang kami
	  Then I navigated to about section
  
  Scenario: Verify functionality of link Layanan
 		Given I am on the healthify landing page
	  When I click text layanan
	  Then I navigated to service section
  
  Scenario: Verify functionality of link FAQ
  	Given I am on the healthify landing page
	  When I click text FAQ
	  Then I navigated to FAQ section
  
  Scenario: Verify functionality of dropdown FAQ Apa itu Healthify?
  	Given I am on the healthify landing page
	  When I click text FAQ
	  And I click FAQ Apa itu Healthify
	  Then I can see answer of the question
  
  Scenario: Verify functionality of get application in google play button
  	Given I am on the healthify landing page
	  When I click get application button
	  Then I navigated to google play