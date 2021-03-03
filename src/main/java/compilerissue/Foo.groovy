package compilerissue

import org.apache.spark.sql.SparkSession
import javax.inject.Singleton

@Singleton
class Foo {
  Foo(SparkSession s) {}
}
