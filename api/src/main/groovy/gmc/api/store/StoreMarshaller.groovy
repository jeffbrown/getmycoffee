package gmc.api.store

import gmc.api.marshaller.JSONMarshaller
import org.springframework.stereotype.Component

@Component
class StoreMarshaller extends JSONMarshaller<Store> {

    StoreMarshaller() {
        super(Store)
    }

    Map<?,?> render(Store store) {
        return [
            id: store.id,
            brand: store.brand,
            name: store.name
        ]
    }

}
