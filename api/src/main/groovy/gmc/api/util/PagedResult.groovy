package gmc.api.util

import groovy.transform.Immutable
import groovy.transform.CompileStatic

@Immutable
@CompileStatic
class PagedResult<T> {
    Integer totalCount
    List<T> resultList
}
