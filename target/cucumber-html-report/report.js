$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberTests.feature");
formatter.feature({
  "line": 1,
  "name": "Image Galery Functionality",
  "description": "",
  "id": "image-galery-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Import One Image Successfully",
  "description": "",
  "id": "image-galery-functionality;import-one-image-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Click Plus button and import the one picture",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Check does the one image exist",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.importOnePicture()"
});
formatter.result({
  "duration": 4266344933,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.checkOneImageExist()"
});
formatter.result({
  "duration": 2039514672,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Import Multiple Image Successfully",
  "description": "",
  "id": "image-galery-functionality;import-multiple-image-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Click Plus button and import three pictures",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Check does the multiple images exist",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.importMultiplePicture()"
});
formatter.result({
  "duration": 5099799465,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.checkMultipleImagesExist()"
});
formatter.result({
  "duration": 2024003804,
  "status": "passed"
});
});