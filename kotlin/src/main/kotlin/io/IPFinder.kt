package io

import java.io.File

fun main(args: Array<String>) {

    val file = File("src/main/kotlin/60.ips.txt")
    val ipMap = mutableMapOf<String, Int>()
    file.forEachLine {
        ipMap.put(it, ipMap.getOrDefault(it, 0)+1)
    }

    var maxIP = ipMap.keys.first()
    var maxCount = 0

    for ((ip, count) in ipMap.entries) {
        if (count > maxCount) {
            maxIP = ip
            maxCount = count
        }
    }

    val (maxxIp, maxxCount) = ipMap.entries.maxByOrNull { it.value }!!

    println("IP Address: $maxIP hits: $maxCount" )

    println("IP Address: $maxxIp hits: $maxxCount" )
}