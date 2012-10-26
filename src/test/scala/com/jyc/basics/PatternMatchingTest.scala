package com.jyc.basics

import org.scalatest.FunSuite

class PatternMatchingTest extends FunSuite {

  private val matcher = new PatternMatching

  test("Patterns match on strings") {
    assert("Chirp" === matcher.petsSay("Bird"))
    assert("Meow" === matcher.petsSay("Cat"))
    assert("Woof" === matcher.petsSay("Dog"))
    assert("Whoops" === matcher.petsSay("Snake"))
  }

  test("Patterns match on types") {
    assert("Chirp" === matcher.petTypesSay(new Bird))
    assert("Meow" === matcher.petTypesSay(new Cat))
    assert("Woof" === matcher.petTypesSay(new Dog))
    assert("Whoops" === matcher.petTypesSay(new Snake))
  }

  test("Case classes are more fun") {
    assert("Polly says Chirp" === matcher.petCasesSay(CaseBird("Polly")))
    assert("Garfield says Meow" === matcher.petCasesSay(CaseCat("Garfield")))
    assert("Lassie says Woof" === matcher.petCasesSay(CaseDog("Lassie")))
    assert("Kaa says Hiss" === matcher.petCasesSay(CaseSnake("Kaa")))
  }

}
