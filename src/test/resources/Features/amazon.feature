@amazon 
Feature: Validate all details for data catalog in Book department 

@data_catalog 
Scenario: Validate all product related details for data catalog 
	Given I am in home page of Amazon 
	When I choose Book in department dropdown 
	And I search for data catalog in book department 
	Then I should be in product listing page for data catalog 
	When I click on the first product available in the product listing page 
	Then I should be in the product page 
	And I should be able to validate all possible records 
	