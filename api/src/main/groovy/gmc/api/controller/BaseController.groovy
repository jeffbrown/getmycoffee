package gmc.api.controller

import grails.converters.JSON
import groovy.transform.CompileStatic

import gmc.api.util.Pagination

@CompileStatic
class BaseController {

    static final Integer DEFAULT_LIMIT = 10
    static final Integer DEFAULT_OFFSET = 0
    static final Map<?,?> FORMATS_PARAMETER = [formats:['json','xml']]

    Pagination getPagination() {
        return new Pagination(
            max: "${params.max ?: DEFAULT_LIMIT}"?.toInteger(),
            offset: "${params.offset?: DEFAULT_OFFSET}"?.toInteger()
        )
    }

    def renderson(Object o) {
        respond o, FORMATS_PARAMETER
    }

}
