package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "restaurants")
data class User(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null,

        var username: String? = null,

        var password: String? = null,
        @Temporal(TemporalType.TIMESTAMP)
        private var createDate: java.util.Date? = null,

        @Temporal(TemporalType.TIMESTAMP)
        private var modifyDate: java.util.Date? = null

)