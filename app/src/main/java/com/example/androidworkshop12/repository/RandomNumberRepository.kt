package com.example.androidworkshop12.repository

import javax.inject.Inject
import kotlin.random.Random

class RandomNumberRepository @Inject constructor() : NumberRepository {
    override val number = Random.nextInt(1000)
}
