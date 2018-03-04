package com.dnb.aas.mediaalerts

import org.apache.spark.sql.SparkSession

trait SparkSessionTestWrapper {

  lazy val spark: SparkSession = {
    // Create a spark session
    SparkSession.builder().master("local").appName("spark session").getOrCreate()
  }

}
