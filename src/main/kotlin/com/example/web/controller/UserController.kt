package com.example.web.controller


import com.example.web.model.entity.UserEntity
import com.example.web.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/user")
class UserResource(val userService: UserService){

    @GetMapping("/{nickname}/profile")
    fun getUserProfile(@PathVariable nickname: String): ResponseEntity<UserEntity>{
        val user = userService.getUserByNickname(nickname)

        return ResponseEntity(user, HttpStatus.OK)
    }

    @PostMapping("/create")
    fun createNewUser(@RequestBody user: UserEntity): ResponseEntity<UserEntity>{
        userService.create(user)

        return ResponseEntity(user, HttpStatus.CREATED)
    }

    @PutMapping("/{nickname}/profile")
    fun updateUserProfile(@RequestBody user: UserEntity, @PathVariable nickname: String): ResponseEntity<UserEntity>{
        userService.updateProfile(user, nickname)

        return ResponseEntity(userService.getUserByNickname(nickname), HttpStatus.OK)
    }
}