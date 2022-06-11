package temb

class PersonController {

    PersonChangerService personChangerService

    def index() { }

    def createNewPerson(){
        render view: 'personForm'
    }

    def saveNewPerson(){
        personChangerService.newPerson()
    }
}
