class Controller {
    val model:Model = Model()
    val view:View = View()
    fun starter(){
        view.mainView()
    }
    fun write(value:String){
    model.writer(value)
    }
    fun read():String{
    return model.reader()

    }
}