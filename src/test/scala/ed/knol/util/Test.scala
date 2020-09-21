
package ed.knol.util

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class Test extends AnyFlatSpec with Matchers {
  "A Application ListOfFiles method" should "return Future[List[File]]" in {
    Application.listOfFiles("C:\\Users\\POORVA\\Desktop\\Folder1") shouldBe "Future(Success(List(C:\\Users\\POORVA\\Desktop\\Folder1\\Folder3\\File3.txt, C:\\Users\\POORVA\\Desktop\\Folder1\\Folder3\\File2.txt, C:\\Users\\POORVA\\Desktop\\Folder1\\File1.txt)))"
  }
  "A Application ListOfAllFiles method" should "return Future[List[File]]" in {
    Application.listOfAllFiles(List[files], result) shouldBe "Future(Success(List(C:\\Users\\POORVA\\Desktop\\Folder1\\Folder3\\File3.txt, C:\\Users\\POORVA\\Desktop\\Folder1\\Folder3\\File2.txt, C:\\Users\\POORVA\\Desktop\\Folder1\\File1.txt)))"
  }


}

