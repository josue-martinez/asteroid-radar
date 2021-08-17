package com.udacity.asteroidradar.network

import com.squareup.moshi.JsonClass
import com.udacity.asteroidradar.Asteroid
//
//
///**
// * DataTransferObjects go in this file. These are responsible for parsing responses from the server
// * or formatting objects to send to the server. You should convert these to domain objects before
// * using them.
// */
//
//@JsonClass(generateAdapter = true)
//data class NetworkAsteroidContainer(val asteroids: List<NetworkAsteroid>)
//
///**
// * Videos represent a devbyte that can be played.
// */
//@JsonClass(generateAdapter = true)
//data class NetworkAsteroid(
//    val id: Long,
//    val codename: String,
//    val closeApproachDate: String,
//    val absoluteMagnitude: Double,
//    val estimatedDiameter: Double,
//    val relativeVelocity: Double,
//    val distanceFromEarth: Double,
//    val isPotentiallyHazardous: Boolean
//    )
//
///**
// * Convert Network results to database objects
// */
//fun NetworkAsteroidContainer.asDomainModel(): List<Asteroid> {
//    return asteroids.map {
//        Asteroid(
//            id = it.id,
//            codename = it.codename,
//            closeApproachDate = it.closeApproachDate,
//            absoluteMagnitude = it.absoluteMagnitude,
//            estimatedDiameter = it.estimatedDiameter,
//            relativeVelocity = it.relativeVelocity,
//            distanceFromEarth = it.distanceFromEarth,
//            isPotentiallyHazardous = it.isPotentiallyHazardous
//        )
//    }
//}