package coolcsv

object Main {
  def main(args: Array[String]): Unit = {
    println(FileUtil.readRaw("test.csv"))
  }
}