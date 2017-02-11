package com.nossin

import com.rockymadden.stringmetric.similarity._

object Main extends App {

	println("hello Michel")
	val metricCalc = NGramMetric(1).compare("night","nacht")
	println(s"some test val:   $metricCalc")

}