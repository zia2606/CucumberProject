Feature: Search and Place the order for Products

@OffersPage
Scenario: Search Experience for product search in both home and offers page

Given User is on Mart Landing Page
When user searched with <Name> in Landing page and extracted actual name of product
Then user searched with <Name> in offers Page and extracted actual name of product
And user verifies Landing Page and offers Page product name value

Examples:
|Name|
|Tom|
|Beet|
