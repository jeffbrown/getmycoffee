package gmc.api.store

class StoreInfo {
    String id
    Store store
    Double distance

    static mapping = {
        collection 'stores'
        database "test"
    }
}
