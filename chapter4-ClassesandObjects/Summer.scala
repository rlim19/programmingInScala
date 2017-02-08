import ChecksumAccumulator.calculate

// object Summer {
//   def main(args: Array[String]) {
//     for (arg <- args) {
//       println(arg + ": " + calculate(arg))
//     }
//   }
// }

object Summer extends App {
  for (arg <- args) {
    println(arg + ": " + calculate(arg))
  }
}