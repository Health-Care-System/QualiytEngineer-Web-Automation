Feature: manage article
  As a user
  I want to manage article

  @failedCreateArticle
  Scenario: Successful Create article
    Given I am on kelola artikel page
    When I click tambah article
    And I write article with empty tittle
    Then I click posting button
    Then I can see article alert successful create
  
  @sucessfulCreateArticle
  Scenario: Successful Create article
    Given I am on kelola artikel page
    When I click tambah article
    And I write article with valid format
    Then I click posting button
    Then I can see article alert successful create

	@sucessfulEditArticle
  Scenario: Successful edit article
    Given I am on kelola artikel page
    When I click edit article button
    And I update article with valid format
    And I click posting button
    Then I can see article alert successful edited
    
  @sucessfulDeleteArticle  
  Scenario: Successful delete article
    Given I am on kelola artikel page
    When I click delete article button
    Then I can see article alert successful deleted