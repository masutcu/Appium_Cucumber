@Drag
Feature: Drag and drop

  Scenario:
    Given kullanici ana ekranda
    And kullanici API Demos butununa tikladi
    Then kullanici API Demos ekraninda
    And kullanici views buttonuna tiklar
    Then kullanici views ekraninda
    And kulanici drag and drop buttonuna tikladi
    When kullanici birinci topu ikici topun ustune brakti
    Then kullanici dorduncu top gorecek
    Then screenshot al
