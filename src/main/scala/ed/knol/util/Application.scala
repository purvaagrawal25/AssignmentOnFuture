package ed.knol.util

import java.io.File

import scala.annotation.tailrec
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


object Application {

  def listOfFiles(path: String): Future[List[File]] = Future {
    val file = new File(path)

    @tailrec
    def listOfAllFiles(files: List[File], result: List[File]): List[File] = files match {
      case Nil => result
      case head :: tail if head.isDirectory =>
        listOfAllFiles(Option(head.listFiles).map(_.toList ::: tail).getOrElse(tail), result)
      case head :: tail if head.isFile =>
        listOfAllFiles(tail, head :: result)
    }

    listOfAllFiles(List(file), Nil)
  }

  def main(args: Array[String]) {

    val files = listOfFiles("C:\\Users\\POORVA\\Desktop\\Folder1")

    Thread.sleep(2000)
    println(files)
  }
}
