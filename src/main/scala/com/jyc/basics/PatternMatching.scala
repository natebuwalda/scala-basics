package com.jyc.basics


class PatternMatching {

  def petsSay(pet: String): String = {
    pet match {
      case "Dog" => "Woof"
      case "Cat" => "Meow"
      case "Bird" => "Chirp"
      case _ => "Whoops"
    }
  }

  def petTypesSay(pet: Any): String = {
    pet match {
      case p: Dog => "Woof"
      case p: Cat => "Meow"
      case p: Bird => "Chirp"
      case _ => "Whoops"
    }
  }

  def petCasesSay(pet: NamedPet): String = {
    pet match {
      case CaseBird(name) => "%s says Chirp".format(name)
      case CaseCat(name) => "%s says Meow".format(name)
      case CaseDog(name) => "%s says Woof".format(name)
      case CaseSnake(name) => "%s says Hiss".format(name)
    }
  }
}

class Bird
class Dog
class Cat
class Snake

sealed trait NamedPet
case class CaseBird(name: String) extends NamedPet
case class CaseDog(name: String) extends NamedPet
case class CaseCat(name: String) extends NamedPet
case class CaseSnake(name: String) extends NamedPet
