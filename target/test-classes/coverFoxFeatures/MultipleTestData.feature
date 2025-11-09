Feature:  Multiple data test for coverfox health insurance
Scenario Outline: TC01: Validate coverfox health insurance for single person with multiple test data
Given I am home page
When I click on get started button
And I click on next button
And I provide age as "<age>" and click on next button
And I provide pincode as "<pincode>" , mobNum as "<mobNum>" and click on continue button
Then matching Health Insurance Plans should be displayed as "<results>"
Examples:
|age|pincode|mobNum|results|
|24|414106|9876543210|90|
|20|411058|8787878787|40|
|90|411038|6767676767|0|