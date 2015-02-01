class UrlMappings {

    static mappings = {

        group "/store", {
            "/"(controller: 'store', action: 'list')
            "/$storeId"(controller: 'store', action: 'show')
        }

        "/"(view:"/index")
        "500"(view:'/error')

    }

}
