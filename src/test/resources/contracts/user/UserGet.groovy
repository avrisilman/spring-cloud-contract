package contracts.user

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
    description "Get a User"
    request {
        url "/users"
        method HttpMethod.GET.toString()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
            accept(MediaType.APPLICATION_JSON_VALUE)
        }
    }
    response {
        status OK()
        body("Hel")
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
    }
}



