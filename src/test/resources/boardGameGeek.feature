Feature: Selection of The Top Game

Scenario: Navigate to the page of the
most top game with increasing rank
Given home page is opened

  When we click on the menu button
  Then list of games appears in opened window

  When we are selecting game with increasing rank
  Then  the browser navigates to the page with the description of the selected game


