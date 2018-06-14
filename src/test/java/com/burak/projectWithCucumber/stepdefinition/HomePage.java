package com.burak.projectWithCucumber.stepdefinition;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.burak.projectWithCucumber.test.CucumberRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {

	@When("^Click Plus button and import the one picture$")
	public void importOnePicture() throws InterruptedException {
		WebElement element = CucumberRunner.driver.findElement(By.className("topbar__addImageBtn"));
		WebElement plusButton = element.findElement(By.tagName("input"));
		Thread.sleep(2000);
		File file = new File("src/main/resource/1.png");
		String path = file.getAbsolutePath();
		plusButton.sendKeys(path);
		Thread.sleep(2000);
	}
	
	@Then("^Check that there is one image$")
	public void checkOneImageExist() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> imageElements = CucumberRunner.driver.findElements(By.cssSelector(".thumbnails-list__item.js-thumb-link.mod-portrait"));
		Thread.sleep(1000);
		Assert.assertTrue(imageElements.size() == 1, "No found imported image..!");
	}
	
	@When("^Click Plus button and import three pictures$")
	public void importMultiplePicture() throws InterruptedException {
		WebElement element = CucumberRunner.driver.findElement(By.className("topbar__addImageBtn"));
		WebElement plusButton = element.findElement(By.tagName("input"));
		Thread.sleep(2000);
		File file1 = new File("src/main/resource/1.png");
		String path1 = file1.getAbsolutePath();
		plusButton.sendKeys(path1);
		Thread.sleep(1000);
		File file2 = new File("src/main/resource/2.png");
		String path2 = file2.getAbsolutePath();
		plusButton.sendKeys(path2);
		Thread.sleep(1000);
		File file3 = new File("src/main/resource/3.png");
		String path3 = file3.getAbsolutePath();
		plusButton.sendKeys(path3);
		Thread.sleep(1000);
	}
	
	@Then("^Check that there are three images$")
	public void checkMultipleImagesExist() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> imageElements = CucumberRunner.driver.findElements(By.cssSelector(".thumbnails-list__item.js-thumb-link.mod-portrait"));
		Thread.sleep(1000);
		Assert.assertTrue(imageElements.size() == 3, "No found 3 imported images..!");
	}
	
	@When("^Click first imported image and preview it$")
	public void clickFirstImportedImage() throws InterruptedException {
		WebElement firstImage = CucumberRunner.driver.findElements(By.cssSelector(".thumbnails-list__item.js-thumb-link.mod-portrait")).get(0);
		firstImage.click();
		Thread.sleep(1000);
	}
	
	@And("^Click delete button and delete image$")
	public void deleteImage() {
		WebElement deleteBtn = CucumberRunner.driver.findElement(By.className("viewImageModal__deleteBtn"));
		deleteBtn.click();
		CucumberRunner.driver.switchTo().alert().accept();
	}
	
	@Then("^Check that the image is deleted$")
	public void checkTwoImageExist() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> imageElements = CucumberRunner.driver.findElements(By.cssSelector(".thumbnails-list__item.js-thumb-link.mod-portrait"));
		Thread.sleep(1000);
		Assert.assertTrue(imageElements.size() == 5, "No found 5 imported images..!");
		CucumberRunner.driver.quit();
	}
}
