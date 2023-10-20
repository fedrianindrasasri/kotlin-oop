package data

class User(var userName:String, var password:String) {

    override fun toString(): String {
        return "User with username=$userName"
    }

}