package gmc.api.marshaller

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired

import javax.annotation.PostConstruct

@Component
class NamedMarshallerLoader {

    @Autowired
    List<NamedMarshaller> marshallerList

    @PostConstruct
    void initializeMarshallerList() {
        marshallerList*.init()
    }

}
