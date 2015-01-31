package gmc.api.util

import groovy.transform.CompileStatic

@CompileStatic
class PagedResult<T> {
    Integer totalCount
    List<T> resultList
}
