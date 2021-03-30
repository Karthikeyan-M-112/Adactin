Feature: Hotel booking functionality for adactin application

Scenario: User enter username and password
    Given User launch the application
    When User enters "Karthikeyan112" as username
    And Users enters "71X7NG" as password
    Then User verify the valid username and valid password
    
 Scenario: User search the hotel
     When  User select  "London" as location
     And   User select  "Hotel Sunshine" as Hotels
     And   User select   "Standard" as Room Type
     And   User select  "1 - One" as Number of rooms
     And   User enters "25/02/2021" as Check In Date
     And   User enters  "27/02/2021" as Check Out Date
     And   User select  "2 - Two" as Adults per room
     And   User select "3 - Three" as Children per room
     Then  User verify the selected hotel details
     
Scenario: User select hotel from searched
   When User select from searched hotel
   Then User verify the details
   
 Scenario: User book a selected hotel
     When User enters "Karthikeyan" as firstname
     And  User enters "M" as lastname 
     And  User enters "7/4,New york,New York main road" as Billing Address
     And  User enters "3647234783992134" as credit card no
     And  User enters "VISA" as credit card type
     And  User select "June" as Month of Expiry Date
     And  User select  "2020" as Year of Expiry Date
     And  User enters  "323" as CVV number
     Then User verify details and book hotel
     
  Scenario: User view a booked itinerary details
  When  User click the booked itinerary and view the details
  And   User select a Hotel to cancel 
  Then  User verify and cancel a hotel
     