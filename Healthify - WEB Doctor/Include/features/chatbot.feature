Feature: Chatbot
	As a user
  I want ask recomendation to chatbot

  @chatbot
  Scenario: Asking recomendation to chatbot
    Given I click chatbot icon
   	When I send a question to chatbot
    Then I can delete the answer