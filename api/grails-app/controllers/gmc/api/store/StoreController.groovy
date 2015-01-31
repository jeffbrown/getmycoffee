package gmc.api.store

import grails.compiler.GrailsCompileStatic
import gmc.api.controller.BaseController

@GrailsCompileStatic
class StoreController extends BaseController {

    StoreBusinessService storeBusinessService

    def index() {
        renderson storeBusinessService.list(pagination)
    }

}
