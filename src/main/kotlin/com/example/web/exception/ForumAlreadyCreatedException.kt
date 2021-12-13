package com.example.web.exception

import com.example.web.model.entity.ForumsEntity


class ForumAlreadyCreatedException(val forumsModel: ForumsEntity) : RuntimeException() {
}
