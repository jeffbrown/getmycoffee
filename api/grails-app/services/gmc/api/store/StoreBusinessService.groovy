package gmc.api.store

import grails.compiler.GrailsCompileStatic

import gmc.api.util.Pagination
import gmc.api.util.PagedResult

import org.bson.types.ObjectId

@GrailsCompileStatic
class StoreBusinessService {

    PagedResult<Store> list(Pagination pagination) {
        if(!Store.count()) {
            5.times {
                new Store(name: "Name $it", brand: "Brand $it").save()
            }
        }
        return new PagedResult<Store>(
            resultList: Store.list(pagination.properties),
            totalCount: Store.count()
        )
    }

    Store show(String id) {
        return Store.get(new ObjectId(id))
    }

}
