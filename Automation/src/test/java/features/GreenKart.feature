Feature: Search and Place the order for Products
@OffersPage
Scenario: Search Experience for product search in both home and Offers page

Given User is on GreenCart Landing page
When user searched with Shortname "tom" and extracted actual name of product
Then user searched for shortname  "tom" in offers page
And  validate product name in offers page matches with Landing Page




