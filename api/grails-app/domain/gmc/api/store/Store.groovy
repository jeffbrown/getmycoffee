package gmc.api.store

import org.bson.types.ObjectId

class Store {

    ObjectId id

    String name
    String brand

    List location

    static mapping = {
        database 'test'
        collection 'stores'

        location geoIndex: '2d'
    }

}
