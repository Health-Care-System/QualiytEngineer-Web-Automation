Feature: manage patient
  As a user
  I want to manage article

	@failedmanagepatient
  Scenario: Failed edit data patient with empty diagnosa
    Given I am on manage patient page
    When I click button edit patient
    And I edit patient detail and status with invalid format
    Then I cant click button simpan

  @successfulmanagepatient
  Scenario: Successful edit patient data
    Given I am on manage patient page
    When I click button edit patient
    And I edit patient detail and status with valid format
    Then Patient data is updated

  @searchpatient
  Scenario: successful search patient data with name
    Given I am on manage patient page
    When I search patient name in search bar
    Then I can see patient data
    
  @failedsearchpatient
  Scenario: successful search patient data with invalid name
    Given I am on manage patient page
    When I search patient invalid name in search bar
    Then I can alert cant find data by keyword