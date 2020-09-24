package com.example.androidworkshop12.repository

import java.util.*
import kotlin.random.Random

class RandomNumberRepository : NumberRepository {
    override val number = Random.nextInt(1000)
}
