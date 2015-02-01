package gmc.api.store

class Store {

    String id

    String name
    String brand

    static mapping = {
        database 'test'
        collection 'stores'
    }

}
