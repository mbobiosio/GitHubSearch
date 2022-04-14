package com.mbobiosio.githubsearch.core.utils

class Constant {

    object Services {
        const val FIRST_PAGE = 1
        const val PER_PAGE = 20
        const val SORT = "created"
        const val DIRECTION = "desc"
    }

    enum class DetailProfile { PROFILE, REPOSITORY }

    object DateFormat {
        const val FORMAT_DATE_TIMEZONE = "yyyy-MM-dd'T'HH:mm:ss"
        const val FORMAT_DATE_MMM_DD_YYYY = "MMM dd, yyyy"
    }
}