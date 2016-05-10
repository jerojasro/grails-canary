package canary

class TestController {

    def create() {
        def b = new Book(value: 15)
        b.save()
        render "Last ID: ${b.id}. There are ${Book.count()} Books"
    }

    def increase() {
        def b = Book.get(params.id)
        b.value = b.value + 1
        b.save()
        render "ID: ${b.id}. New Value: ${b.value}"
    }

    def sudoIncreaseOrElse() {
        def b = Book.get(params.id)
        b.value = b.value + 1
        b.save(flush: true)
        render "ID: ${b.id}. New Value: ${b.value}"
    }

}
