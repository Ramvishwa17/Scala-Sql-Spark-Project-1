package learning

import org.apache.spark.sql.SparkSession
import org.apache.log4j._

object test {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Simple Spark Scala Project")
      .master("local[*]")
      .getOrCreate()

    Logger.getLogger("org").setLevel(Level.ERROR)

    // Your Spark code here
    println("hey")
  }
  
  }

