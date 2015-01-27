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
            name: store.name,
            address: store.address
        ]
    }

}
