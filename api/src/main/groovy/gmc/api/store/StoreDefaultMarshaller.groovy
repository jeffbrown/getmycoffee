package gmc.api.store

import gmc.api.marshaller.NamedMarshaller
import org.springframework.stereotype.Component

@Component
class StoreDefaultMarshaller extends NamedMarshaller<Store> {

    StoreDefaultMarshaller() {
        super(Store)
    }

    Map<?,?> render(Store store) {
        return [
            name: store.name,
            address: store.address
        ]
    }

}
