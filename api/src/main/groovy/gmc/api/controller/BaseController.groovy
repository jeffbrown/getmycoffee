package gmc.api.controller

import grails.converters.JSON

class BaseController {

    def renderson(Object o) {
        render o as JSON
    }

}
