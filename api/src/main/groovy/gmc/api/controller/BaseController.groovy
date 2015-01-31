package gmc.api.controller

import grails.converters.JSON
import groovy.transform.CompileStatic

import gmc.api.util.Pagination

@CompileStatic
class BaseController {

    static final Integer DEFAULT_LIMIT = 10
    static final Integer DEFAULT_OFFSET = 0

    Pagination getPagination() {
        return new Pagination(
            max: params.max ?: DEFAULT_LIMIT,
            offset: params.offset ?: DEFAULT_OFFSET
        )
    }

    def renderson(Object o) {
        render o as JSON
    }

}
