package com.example.web.exception

import com.example.web.model.entity.ThreadsEntity


class ThreadAlreadyCreatedException(val existedThread: ThreadsEntity) : RuntimeException()
