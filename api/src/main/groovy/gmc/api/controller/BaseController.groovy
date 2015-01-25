package gmc.api.controller

import grails.converters.JSON
import gmc.api.marshaller.NamedMarshaller

class BaseController {

    def renderson(Object o, String view) {
        JSON.use(view ?: NamedMarshaller.DEFAULT) {
            respond o
        }
    }

}
