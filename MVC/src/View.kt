

class View {

fun mainView(){
    println("******************************************")
    println("******************************************")
    println("** Wellcome to your first kotlin project**")
    println("**        Choose to Do some shit        **")
    println("**            1:To Write                **")
    println("**            2:To Read                 **")
    println("******************************************")
    println("******************************************")
    var choice:String = readLine() as String

    when(choice){
        "1"->writeView()
        "2"->readView()

    }
}
    fun writeView(){
        val controller:Controller = Controller()
        println("You can Write here now:")
        var theShit:String = readLine() as String
        controller.write(theShit)
        println("file writen successfuly....")
        mainView()
    }
    fun readView(){
        val controller:Controller = Controller()     
        var message:String=controller.read()
        println(message)
        mainView()

    }

}