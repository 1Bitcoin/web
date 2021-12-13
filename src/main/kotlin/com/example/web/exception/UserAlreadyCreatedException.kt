package com.example.web.exception

import com.example.web.model.entity.UserEntity


class UserAlreadyCreatedException(val userModel: UserEntity?) : RuntimeException() {
}
