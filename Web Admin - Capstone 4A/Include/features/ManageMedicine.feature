Feature: Manage Medicine
  As a user
  I want to access medicine page
  SO that I can manage medicine data


	@NegatifCreateMedicine
	Scenario: Create medicine with empty brand
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty brand
		Then I can see alert brand is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with empty category
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty category
		Then I can see alert category is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with empty code
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty code
		Then I can see alert code is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with empty price
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty price
		Then I can see alert price is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with empty product name
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty product name
		Then I can see alert product name is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with empty stock
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty stock
		Then I can see alert stock is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with empty type
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with empty type
		Then I can see alert type is empty
		
	@NegatifCreateMedicine
	Scenario: Create medicine with numeric type
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with numeric type
		Then I can see alert type is invalid
		
		@NegatifCreateMedicine
	Scenario: Create medicine with numeric name
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with numeric name
		Then I can see alert name is invalid			
		
	@NegatifCreateMedicine
	Scenario: Create medicine with numeric category
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with numeric category
		Then I can see alert category is invalid
		
	@NegatifCreateMedicine
	Scenario: Create medicine with numeric brand
		Given I am on the medicine page
		When I click Tambah Produk button
		And I click simpan with numeric brand
		Then I can see alert brand is invalid
		
		
	@NegatifEditMedicine
	Scenario: Edit medicine with numeric type
		Given I am on the medicine page
		When I open medicine details
		And I update type field with numeric value
		Then I can see alert type is invalid
		
	@NegatifEditMedicine
	Scenario: Edit medicine with numeric name
		Given I am on the medicine page
		When I open medicine details
		And I update name field with numeric value
		Then I can see alert name is invalid
		
		@NegatifEditMedicine
	Scenario: Edit medicine with numeric category
		Given I am on the medicine page
		When I open medicine details
		And I update category field with numeric value
		Then I can see alert category is invalid
		
	@NegatifEditMedicine
	Scenario: Edit medicine with numeric brand
		Given I am on the medicine page
		When I open medicine details
		And I update brand field with numeric value
		Then I can see alert brand is invalid
		
	@PositifEditMedicine
	Scenario: Edit medicine with valid data
		Given I am on the medicine page
		When I open medicine details
		And I update medicine with valid data 
		And I click simpan product button
		Then I should be successfully edit medicine data