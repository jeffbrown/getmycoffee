package gmc.api.util

import groovy.transform.Immutable
import groovy.transform.CompileStatic

@Immutable
@CompileStatic
class Pagination {
    Integer max
    Integer offset
}
