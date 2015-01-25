class UrlMappings {

    static mappings = {
        "/store"(controller: 'store')

        "/"(view:"/index")
        "500"(view:'/error')
    }

}
