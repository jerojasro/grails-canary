Start the app as usual

    grails run-app

then create one object, by visiting `http://localhost:8080/grails-canary/test/create`

To replicate the issue, visit the following URL:

    http://localhost:8080/grails-canary/test/increase?id=1

that should increase **and persist** the changes made to the object just created.

But, visiting `http://localhost:8080/grails-canary/test/increase?id=1` again
yields the same result, showing that the changes are not being persisted.

OTOH, saving data with `flush: true` does persist the changes, as demonstrated
in, e.g., `http://localhost:8080/grails-canary/test/sudoIncreaseOrElse?id=1`


## Grails version used: 2.4.5
