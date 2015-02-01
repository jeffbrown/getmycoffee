package gmc.api.marshaller

import grails.converters.JSON
import groovy.transform.CompileStatic

@CompileStatic
abstract class JSONMarshaller<T> {

    Class<?> marshallerClazz

    JSONMarshaller(Class<?> clazz) {
        this.marshallerClazz = clazz
    }

    void init() {
        JSON.registerObjectMarshaller(marshallerClazz, this.&render)
    }

    abstract Map<?,?> render(T instance)

}
