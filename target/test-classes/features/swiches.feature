@kara
Feature:Switch Test

  Background:
    Given kullanici ana ekranda
    And kullanici API Demos butununa tikladi
    Then kullanici API Demos ekraninda
    And kullanici Preference butununa tikladi
    Then kullanici Preference ekraninda
    And kullanici swich buttonuna tiklar

  Scenario:Check boxs kontrol
    Then kullanici checkboxin tikli olup olmadigina bakar tikli degil ise tiklar
    And screenshot al

  Scenario: 1. swich kontrol
    And kullanici swich buttonuna kapaliysa acar
    And screenshot al

  Scenario: 2. swich kontrol
    And kullanici swich buttonuna aciksa kapatir
    And screenshot al

