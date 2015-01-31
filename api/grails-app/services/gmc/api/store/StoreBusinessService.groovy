package gmc.api.store

import groovy.transform.CompileStatic

import gmc.api.util.Pagination
import gmc.api.util.PagedResult

@CompileStatic
class StoreBusinessService {

    PagedResult<Store> list(Pagination pagination) {
        return new PagedResult<Store>(
            resultList: Store.list(pagination.properties),
            totalCount: Store.count()
        )
    }

}
