package gmc.api.marshaller

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired

import groovy.transform.CompileStatic
import javax.annotation.PostConstruct

@Component
@CompileStatic
class JSONMarshallerLoader {

    @Autowired
    List<JSONMarshaller> marshallerList

    @PostConstruct
    void initializeMarshallerList() {
        marshallerList*.init()
    }

}
