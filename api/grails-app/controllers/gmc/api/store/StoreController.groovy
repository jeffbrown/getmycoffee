package gmc.api.store

import grails.compiler.GrailsCompileStatic
import gmc.api.controller.BaseController

@GrailsCompileStatic
class StoreController extends BaseController {

    StoreBusinessService storeBusinessService

    def list() {
        renderson storeBusinessService.list(pagination)
    }

    def show(String storeId) {
        renderson storeBusinessService.show(storeId)
    }

}
