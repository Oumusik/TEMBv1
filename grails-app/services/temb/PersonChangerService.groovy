package temb

import grails.gorm.transactions.Transactional

import java.time.LocalDate
import java.time.LocalDateTime

@Transactional
class PersonChangerService {

    Person newPerson(String name, String surname,String lastName, String email, String phoneNumber, String city, String address, Date birthDate, String password){
        def currentDate = LocalDate.now()
        Double age = Double.parseDouble(currentDate.year.toString()) - Double.parseDouble(birthDate.getYear())

        return Person.findOrSaveWhere(name: name,
                                     surname: surname,
                                      lastName: lastName,
                                     email: email,
                                     phoneNumber: phoneNumber,
                                     city: city,
                                     address: address,
                                     birthDate: birthDate,
                                     age: age,
                                     password: password)
    }

    def serviceMethod() {

    }
}
