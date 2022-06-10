package temb

class Person {
    String name
    String surname
    String lastName
    String email
    String phoneNumber
    String city
    String address
    Date birthDate
    Double age
    String password


    static constraints = {
        name blank: false
        surname blank: false
        lastName blank: false
        email email:true, unique: true
        phoneNumber size: 10, blank:false
        city blank: false
        address blank: false
        password blank: false, min: 6, nullable: false, password
    }
}
