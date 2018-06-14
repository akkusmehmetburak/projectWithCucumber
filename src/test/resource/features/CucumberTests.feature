Feature: Image Galery Functionality

	Scenario: Import One Image Successfully
		When Click Plus button and import the one picture
		Then Check that there is one image
		
	Scenario: Import Multiple Images Successfully
		When Click Plus button and import three pictures
		Then Check that there are three images
		
	Scenario: Delete one Image Successfully
		Given Click Plus button and import three pictures
		When Click first imported image and preview it
		And Click delete button and delete image
		Then Check that the image is deleted