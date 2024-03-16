Feature: Search and Place the order for Products

@Placeorder
Scenario: Search Experience for product search in both home and offers page

Given User is on Mart Landing Page
When user searched with <Name> in Landing page and extracted actual name of product
And Added "3" items of the selected product in cart
Then user proceeds to Checkout Page and validate the <Name> items in checkout Page
And verify user has ability to enter promo code and place order

Examples:
|Name|
|Tom|

