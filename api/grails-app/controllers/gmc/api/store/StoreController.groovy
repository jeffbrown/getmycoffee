package gmc.api.store

import grails.converters.JSON
import gmc.api.controller.BaseController

class StoreController extends BaseController {

    def index() {
        Store store = new Store(name: 'starbucks', address: 'somewhere in time 22')

        renderson store,'default'
    }

}
