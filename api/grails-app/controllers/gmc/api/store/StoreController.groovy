package gmc.api.store

import gmc.api.controller.BaseController

class StoreController extends BaseController {

    StoreBusinessService storeBusinessService

    def index() {
        render storeBusinessService.list(pagination) as grails.converters.JSON
    }

}
