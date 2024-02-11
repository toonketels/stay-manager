package dev.iz

import zio._

object Boot extends ZIOAppDefault:

  override def run = Console.printLine("Hello, World!")
