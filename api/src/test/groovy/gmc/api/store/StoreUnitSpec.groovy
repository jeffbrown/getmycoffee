package gmc.api.store

import grails.test.mixin.Mock
import gmc.api.test.BaseUnitSpec

@Mock(Store)
class StoreUnitSpec extends BaseUnitSpec {

    void 'saving a store'() {
        when: 'setting store fields'
        Store store =
            new Store(
                name: storeName,
                brand: brandName
            )
        and: 'saving the instance'
        store.save()
        then: 'we should get what we expected'
        store.hasErrors() == !saved
        where: 'possible parameters are'
        storeName          |brandName    |saved
        'grailscoffeestore'|'groovycoffe'|true
    }

}
