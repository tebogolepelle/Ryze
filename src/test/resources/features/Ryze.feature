@ryze
Feature: Ryze Assessment

  Scenario Outline: TC1
    Given I am on the landing page
    When I login into the application using "<username>" and "<password>"
    And I am on the Repository tab
    And I confirm the options on the Tech Study menu
    And Enter the tech test study view
    And Enter the Data acquisition asset group view
    And Select to view Forms
    And Select to view the Medical History form
    And Add a "<description>" property to the form
    And Confirm the user update has been preserved on the property panel "<description>"
    Then Logout of the application

    Examples:
      |username     | password     | description|
      |testteamtechtest | Ryz3T3st!x | Test     |

