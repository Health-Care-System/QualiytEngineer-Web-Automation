Feature: Dasboard
  I want to use this template for my feature file

  @lihatsemua
  Scenario: 
    Given I am on the dashboard page
    When I click lihat semua on article
    Then I navigated article page
    
  @editpasien
  Scenario: 
    Given I am on the dashboard page
    When I click edit on daftar pasien
    Then I can see pop up edit patient
    
  @mulaikonsultasi
  Scenario: 
    Given I am on the dashboard page
    When I click mulai konsultasi
    Then I navigated to chat pasien