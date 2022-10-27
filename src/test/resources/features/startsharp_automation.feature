#Autor: Joel Rochel

@stories
Feature: StartSharp
  As a user, I want to create a business unit and schedule a meeting with it

  Background:
    Given Joel wants to create a business unit and a meeting with it
      | strUsername | strPassword |
      | admin       | serenity    |

  @scenario1
  Scenario: creation of a business unit and a meeting with it
    When Enter the information for the creation of a business unit
      | strNameBusinessUnit | strParentUnit  |
      | Exito               | Administration |
    And enter the information to create a meeting
      | strMeetingName | strMeetingType | strMeetingNumber | strStartDate | strStartHour | strEndDate | strEndHour | strLocation | strUnit | strOrganizedBy | strReporter  | strAttendeeList |
      | Reunion 1      | General        | 1234567          | 05/03/2022   | 14:00        | 05/03/2022 | 15:00      |  HQ-01      | Exito   | Alexis Lopez   | Anna Simmons | Lillian Cooper  |
    Then Verify that the process is complete
      | strConfirmButton |
      | New Meeting      |

  @scenario2
  Scenario: Check the required fields in the creation of a business unit
    When complete only the required fields
      | strNameBusinessUnit |
      | Local               |
    Then verify the creation of the business unit
      | strConfirmButton  |
      | New Business Unit |