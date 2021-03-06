package model

abstract class Animal {
  def name: String
}

case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal
