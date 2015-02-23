package gmc.api.store

import org.bson.types.ObjectId

class Store {

    ObjectId id

    String name
    String brand

    static mapping = {
        database 'test'
        collection 'stores'
    }

}
