package gmc.api.store

import gmc.api.marshaller.JSONMarshaller

import groovy.transform.CompileStatic
import org.springframework.stereotype.Component

@Component
@CompileStatic
class StoreMarshaller extends JSONMarshaller<Store> {

    StoreMarshaller() {
        super(Store)
    }

    Map<?,?> render(Store store) {
        return [
            id: store.id.toString(),
            brand: store.brand,
            name: store.name,
            location: store.location
        ]
    }

}
