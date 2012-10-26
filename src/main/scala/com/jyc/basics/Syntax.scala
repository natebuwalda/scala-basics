package com.jyc.basics

import annotation.tailrec

class Syntax {

  val publicValue: Int = 1
  protected val protectedValue: Int = 2
  private val privateValue: Int = 3

  var publicVariable = 4

  def publicDefinition = 5

  def helloWorld(): Unit = println("Hello World!")

  def addTwo(x: Int, y: Int): Int = x + y

  val addTwoAsAFunction: (Int, Int) => Int = (x, y) => x + y

  val simplerAddTwo = (x: Int, y: Int) => x + y

  def isGreaterThan(x: Int, y: Int) = if (x > y) x else y

  def loopForAwhile(message: String, times: Int) {
    (1 to times).foreach(x => println(message + " " + x.toString()))
  }

  def anotherLoop(message: String, times: Int) {
    var accumulator = 0
    while(accumulator < times) {
      println(message)
      accumulator += 1
    }
  }

  def recursiveLoop(message: String, times: Int) {
    @tailrec
    def iter(message: String, times: Int, accumulator: Int = 0) {
      if (accumulator < times) {
        println(message)
        iter(message, times, accumulator + 1)
      }
    }

    iter(message, times)
  }

  def listsAndWildcard(words: List[String]) {
    words.foreach(println(_))
  }

  def forExpressions(words: List[String]) {
    val bigWords: List[String] = for {word <- words if (word.length > 4)} yield word
    listsAndWildcard(bigWords)
  }
}

object SyntaxRunner extends App {

  val syntaxExample = new Syntax

  syntaxExample.loopForAwhile("Looping for awhile", 5)

  syntaxExample.anotherLoop("Now we're in a while loop!", 5)

  syntaxExample.recursiveLoop("Did we get a stack overflow?", 5)

  syntaxExample.listsAndWildcard(List("cat", "dog", "bird"))

  syntaxExample.forExpressions(List("ipad", "xbox", "computer", "nintendo"))
}
