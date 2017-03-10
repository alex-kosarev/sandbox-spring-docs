org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/person'
        headers {
            header('Accept', 'application/vnd.person.v1+json')
        }
    }
    response {
        status 200
        headers {
            header('Content-type', 'application/vnd.person.v1+json;charset=UTF-8')
        }
        body ("""
            [
                {"id": 1, "name": "John Doe", "email": "john.doe@example.com"},
                {"id": 2, "name": "Jim Beam", "email": "jim.beam@example.com"}
            ]
        """)
    }
}
