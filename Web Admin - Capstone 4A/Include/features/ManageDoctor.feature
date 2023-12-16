Feature: Manage Doctor
  As a user
  I want to access doctor page
  So that I can manage doctor data
  
	@CreateDoctor
	Scenario: Create doctor with empty name
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty doctor name
		Then I can see alert name is empty
		
	@CreateDoctor	
	Scenario: Create doctor with empty gender 
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty gender
		Then I can see alert gender is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty email
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty email
		Then I can see alert email is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty password
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty password
		Then I can see alert password is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty medical speciality
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty medical speciality
		Then I can see alert medical speciality is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty experiences
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty experiences
		Then I can see alert experiences is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty alumnus
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty alumnus
		Then I can see alert alumunus is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty STR
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty STR
		Then I can see alert STR is empty
		
	@CreateDoctor
	Scenario: Create doctor with empty profile picture
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with empty profile picture
		Then I can see alert profile picture is empty
		
	@CreateDoctor
	Scenario: Create doctor with invalid email format
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with invalid email format
		Then I can see alert doctor email format is invalid
		
	@CreateDoctor
	Scenario: Create doctor with numeric doctor name
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with numeric doctor name
		Then I can see alert doctor name is invalid
		
	@CreateDoctor
	Scenario: Create doctor with numeric doctor email
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click simpan with numeric doctor email
		Then I can see alert doctor email is cant be numeric
		
		
	@CreateDoctor
	Scenario: Verify functionality of batal button for create doctor
		Given I am on the manage doctor page
		When I click tambah dokter button
		And I click batal button for create doctor
		Then I am navigated back to doctor page
		
	@EditDoctor
	Scenario: Edit doctor with valid data
		Given I am on the manage doctor page
		When I open doctor details
		And I click edit button
		And I update doctor with valid data 
		And I click simpan doctors update button 
		Then I can see notification success update doctor data
		
	@EditDoctor
	Scenario: Edit doctor with numeric name
		Given I am on the manage doctor page
		When I open doctor details
		And I click edit button
		And I update doctor with numeric name
		And I click simpan doctors update button
		Then I can see alert doctor name is invalid at edit page
		
	@EditDoctor
	Scenario: Edit doctor with numeric email
		Given I am on the manage doctor page
		When I open doctor details
		And I click edit button
		And I update doctor with numeric email
		And I click simpan doctors update button
		Then I can see alert doctor email is cant be numeric at edit page
		
	@EditDoctor
	Scenario: Verify functionality of batal button for edit doctor
		Given I am on the manage doctor page
		When I open doctor details
		And I click edit button
		And I click batal button for edit doctor
		Then I am navigated back to doctor page
		
#	@EditDoctor
#	Scenario: Verify functionality of tidak button for delete doctor
#		Given I am on the manage doctor page
#		When I open doctor details
#		And I click hapus dokter button
#		And I click tidak button for delete doctor
#		Then Pop up delete confirmation is closed
		
		
	
		
		
		
	