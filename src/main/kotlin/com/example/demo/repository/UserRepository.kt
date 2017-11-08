package com.example.demo.repository

import org.apache.catalina.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface UserRepository : JpaRepository<User, Long> {
    fun findUserByusername(username: String): User
}


