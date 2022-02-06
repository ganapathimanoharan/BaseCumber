Feature: Validate the adactin hotel page

  Background: 
    Given user is on adacting page
    When user enter username and password
    And user click on login button

@smoke
  Scenario: User filling the important fields
    Given user enter the select page details location, no of room, check in date, check out date,adults per room
    Then user click on search button
    And user filling the select hotel page select hotel
    And user click on select hotel button
    When user filling the Book hotel page firstname, lastname, address, cardno, cardtype,expairymonth, expairyyear, cvvno
    And user click the booknow button
@sanity
  Scenario: user filling the not important fields
    Given user enter the details hotel, roomtype,childperroom
    And user click the book now button
@reg
  Scenario: user book and cancel ticket
    When user enter the details in search hote page location, hotels, roomtype, roomnos, adultroom,childroom
    And user click the search button
    Then user check select hotel page visible or not
    And user select the hotel and click the search button
    And user check booking page visible or not
    When user enter the details in booking page firstName,lastName,address,cardno,cardtype,expmonth,expyear,cvvno
    And user click the booking button
    And user cancel the booking

