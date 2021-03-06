package cs.com.kotlinTest.demo3

class User(val id:Int,val name:String,val address:String)

fun saveUser(user :User){
    if (user.name.isEmpty()){
        throw IllegalArgumentException(
                "Can't save user ${user.id} empty Name"

        )
    }
    if (user.address.isEmpty()){
        throw IllegalArgumentException(
              "Can't save user ${user.address} empty $"
        )
    }
}

fun validate(user: User,
             value:String,
             fieldName:String){
    if (value.isEmpty()){
        throw IllegalArgumentException(
            "Can't save user ${user.id} empty $fieldName"
            )
    }

}

fun main(args: Array<String>) {
    saveUser(User(1,"",""))
}