object FileUtil {
  def readRaw(filename: String): List[List[String]] =
    scala.io.Source.fromFile(filename).getLines.map(_.split(",").toList).toList
}
