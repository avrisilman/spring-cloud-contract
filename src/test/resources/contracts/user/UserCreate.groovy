package contracts.user

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
    description "Create a User"
    request {
        url "/users"
        method HttpMethod.POST.toString()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
            accept(MediaType.APPLICATION_JSON_VALUE)
        }
        body("""
          {
                "username":"admin",
                "password":"123456"
           }
       """)
    }
    response {
        status CREATED()
        body("""
         {
            "username": "admin",
            "password": "123456"
         }   
       """)
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
    }
}

