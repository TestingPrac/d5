Feature: Authenticator

  Scenario Outline:Copy the winAuth code to my atos portal
    Given I launched the winAuth application and enter "<winAuthPassword>" and click on ok button
    When I navigate to winAuth homepage and copy the authenticator code
    And I launched myAtos portal and enter "<DASID>" "<DASPassword>" and authenticator code and click on OK button
    Then I navigate to my atos portal

    Examples:
      | winAuthPassword | DASID | DASPassword |
      |                 |       |             |





