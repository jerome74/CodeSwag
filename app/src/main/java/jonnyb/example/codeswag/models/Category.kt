package jonnyb.example.codeswag.models

class Category constructor(val title : String, val image : String){
    override fun toString(): String {
        return title
    }
}
